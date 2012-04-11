"""The icardea-PHCCIS bridge
It is both a producer and consumer of clinical information
...
"""
__author__ = "Stelios Sfakianakis <ssfak@ics.forth.gr>"
import sys
import lxml
from lxml import etree
import bottle
from optparse import OptionParser
import bottle
from bottle import request, response
from bottle import jinja2_view as view, jinja2_template as template
import pyodbc
import socket

# We monkey patch socket in the followinf lines and the c-ares
# implementation of DNS in gevent 1.0 does not give the fqdn
MYIP = socket.gethostbyname_ex(socket.gethostname())[2][0]

import threading
import gevent
from gevent import pywsgi
from gevent import Greenlet
from gevent import monkey; monkey.patch_socket()
from gevent.threadpool import ThreadPool
from gevent.coros import Semaphore
import time
import urllib2
import re
import uuid
import base64
import requests
import email.parser
import logging

logging.basicConfig(level=logging.INFO, format='[%(thread)d] %(asctime)s - %(levelname)s - %(message)s')

class DB():
    thread_local_storage = threading.local()
    tp = ThreadPool(5)
    @classmethod
    def _connect(cls):
        if 'conn' not in cls.thread_local_storage.__dict__:
            conn = pyodbc.connect('DRIVER={SQL Server};SERVER=ajax;DATABASE=WEB_PHCCIS_iCARDEA;uid=phccis-user;PWD=phccis-user')
            conn.cursor().execute('SET DATEFORMAT dmy')
            cls.thread_local_storage.conn = conn
        return cls.thread_local_storage.conn

    @classmethod
    def query(cls, sql, *args):
        def task(sql, *args):
            logging.debug('[%d] querying...' % (threading.current_thread().ident, ))
            conn = None
            try:
                conn = cls._connect()
                cur = conn.cursor()
                cur.execute(sql, *args)
                l = cur.fetchall()
            except:
                e = sys.exc_info()
                logging.error('DB error %s', e[1], exc_info=True)
                if conn:
                    conn.rollback()
                l = []
            else:
                conn.commit()
            return l
        return cls.tp.spawn(task, sql, *args).get()
    @classmethod
    def execute(cls, sql, *args):
        def task(sql, *args):
            logging.debug('[%d] executing...' % (threading.current_thread().ident, ))
            conn = None
            try:
                conn = cls._connect()
                cur = conn.cursor()
                cur.execute(sql, *args)
                c = cur.rowcount
            except:
                e = sys.exc_info()
                logging.error('DB error %s', e[1], exc_info=True)
                if conn:
                    conn.rollback()
                c = 0
            else:
                conn.commit()
            return c
        return cls.tp.spawn(task, sql, *args).get()
    @classmethod
    def execute_async(cls, sql, *args):
        def task(sql, *args):
            logging.debug('[%d] executing...' % (threading.current_thread().ident, ))
            conn = None
            try:
                conn = cls._connect()
                cur = conn.cursor()
                cur.execute(sql, *args)
            except:
                e = sys.exc_info()
                logging.error('DB error %s', e[1], exc_info=True)
                if conn:
                    conn.rollback()
            else:
                conn.commit()
        cls.tp.spawn(task, sql, *args)

gvisit_lock = Semaphore(1)
gvisit_id = 1

PCC10_PATH = '/pcc10/'
LISTEN_PORT = 8088
CHK_TIMEOUT = 30
MYENDPOINT = 'http://%s:%s%s' % (MYIP, LISTEN_PORT, PCC10_PATH)

NS = {"soap":"http://www.w3.org/2003/05/soap-envelope", 
      "wsa":"http://www.w3.org/2005/08/addressing",
      'wsnt': 'http://docs.oasis-open.org/wsn/b-2',
      'hl7': 'urn:hl7-org:v3'
      }
PCC9_ACTION = 'urn:hl7-org:v3:QUPC_IN043100UV01'
PNR_ACTION = 'urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b'
PCC10_ACK_ACTION = 'urn:hl7-org:v3:MCCI_IN000002UV01'
CARE_PROVISION_CODE = 'MEDLIST'

SERVER = '95.9.71.171:7070'
XDS_ENDPOINT = "http://%s/ehrif/xds/" % SERVER
PCC_ENDPOINT = "http://%s/ehrif/pcc/" % SERVER

PATIENT_ROOT = '1.2.826.0.1.3680043.2.44.248240.1'

def send_pcc9(provisionCode, patientId):
    global options
    server_url = options.pcc_endpoint
    callback_url = MYENDPOINT
    ts = time.strftime('%Y%m%d%H%M%S', time.gmtime())
    soap = template('pcc9.xml', wsaAction = PCC9_ACTION,
                    wsaReplyTo = callback_url,
                    careProvisionCode = provisionCode,
                    patId = {'pid':patientId, 'root':PATIENT_ROOT},
                    hl7MsgTime = ts)
    req = urllib2.Request(server_url)
    req.add_header('content-type',
                   'application/soap+xml;charset=utf-8;action="%s"' % (PCC9_ACTION,))
    req.add_data(soap)
    # print 'SUBMITTED PCC-9:\n',soap
    try:
        fp = urllib2.urlopen(req)
        response = fp.read()
        # print 'SUBMITTED PCC-9 AND GOT\n',response
        x = etree.fromstring(response)        
        l = x.xpath("/soap:Envelope/soap:Header/wsnt:SubscriptionReference/wsa:Address",
                    namespaces=NS)
        if not l:
            return None
        return l[0].text
    except urllib2.HTTPError, ex:
        msg = ex.read()
        print "PCC9 Error: %s %s" % (ex.code, msg)
        raise ex
    except urllib2.URLError, ex:
        print "PCC9 Error: %s " % (ex.reason)
    except:
        print "PCC9 Unexpected error:", sys.exc_info()[0]
        raise

def subscribe_for_patient(p):
        l = send_pcc9('MEDLIST', p)
        if l is not None:
            DB.execute_async(
            """UPDATE icardea_monitor SET subscription_ref = ? WHERE icardea_patid=?""",
               l, p)

UMLS_TO_ATC = {
        'C0032952': 'H02AB04', # Prednisone, http://www.whocc.no/atc_ddd_index/?code=H02AB04
        'C0081876': 'A02BC02',
        'C0110591': 'C07AB07',
        'C0012010': 'N05BA02',
        'C0591288': 'N03AG01',
        'C0025677': 'L01BA01',
        'C0016410': 'B03BB01',
        'C0024467': 'A12CC05'
        }

ATC_TO_UMLS = dict([(a, u) for u, a in UMLS_TO_ATC.iteritems()])

def hl7dt2dmy(s):
    return "%s/%s/%s" % ( s[6:8],s[4:6],s[0:4] )

def store_history_info(pcc10):
    x = etree.fromstring(pcc10)        
    d = x.xpath('//hl7:QUPC_IN043200UV01', namespaces=NS)[0]
    p = d.xpath('//hl7:subject2/hl7:careProvisionEvent/hl7:recordTarget/hl7:patient/hl7:id/@extension', namespaces=NS)[0]
    pid = DB.query('SELECT PATIENTID FROM PATIENT WHERE iCARDEAID=?', p)[0][0]
    l = d.xpath("//hl7:pertinentInformation3/hl7:substanceAdministration", namespaces=NS)
    for drug in l:
        umls_code = drug.xpath('hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedLabeledDrug/hl7:code/@code',
                namespaces=NS)[0]
        if not umls_code:
            continue
        atc_code = UMLS_TO_ATC.get(umls_code, None)
        if atc_code is None:
            logging.warning("Couldn't find ATC for UMLS '%s'" % umls_code)
        row = DB.query('SELECT DRUGID FROM DRUG WHERE ATC=?',
                atc_code)
        if not row:
            logging.warning('ATC code %s not found in the database!!', atc_code)
            continue
        drugid = row[0][0]
        dq = drug.find('hl7:doseQuantity', namespaces=NS).attrib
        sd = drug.xpath('hl7:effectiveTime/hl7:low/@value',
                namespaces=NS)[0]
        ed = drug.xpath('hl7:effectiveTime/hl7:high/@value',
                namespaces=NS)[0]
        DB.execute_async("""INSERT INTO DRUG_OF_MEDICAL_HISTORY(
                PATIENTID, DRUGID, DRUGCOMMENTS, STARTTIME, ENDTIME)
                VALUES(?,?,?,?,?)""",
                pid, drugid, "%s %s" % (dq.get("value"), dq.get("unit")), 
                hl7dt2dmy(sd), hl7dt2dmy(ed));

@bottle.post('/newpatient')
def new_patient():
    pats = [p.strip() for p in request.body.readlines()]
    def real_subscribe(pats):
        workers = [ gevent.spawn(subscribe_for_patient, p) for p
                in pats]
        gevent.joinall(workers)
    gevent.spawn_later(1, real_subscribe, pats)
    return 'ok'

@bottle.post('/newvisit')
def new_visit():
    visits = [p.strip() for p in request.body.readlines()]
    for p in visits:
        print 'Got', p
    return 'ok'

@bottle.post(PCC10_PATH)
@view('pcc10_ack.xml')
def pcc10_handler():
    msg = bottle.request.environ['wsgi.input'].read()
    logging.debug('I got new PCC-10!!')
    # print 'Here it is:',msg
    with open('pcc10_phccis.xml', 'wb') as f:
        f.write(msg)
    store_history_info(msg)
    ts = time.strftime('%Y%m%d%H%M%S',time.gmtime())
    ackId = uuid.uuid4().hex
    typecode = 'AA'
    return dict(wsaAction = PCC10_ACK_ACTION,
                ackId=ackId, hl7MsgTime=ts, ackTypeCode=typecode)

def check_new_patients():
    def real_check_patients():
        logging.info("Checking for new iCARDEA patients")
        pats = DB.query("""select icardea_patid 
            from icardea_monitor 
            where subscription_ref is null""")
        workers = [gevent.spawn(subscribe_for_patient, p.icardea_patid)
                for p in pats]
        gevent.joinall(workers)
        logging.info("Checking patients finished.. rescheduling checking after %d seconds"% options.timeout)
        gevent.spawn_later(options.timeout, real_check_patients)
    gevent.spawn(real_check_patients)

def send_visit_update(rowid, patid, visitid):
    print "sending updates for visit",visitid
    r = DB.query("""SELECT GIVENNAME, FAMILYNAME, BIRTHDATE, GENDERID
                    FROM PATIENT WHERE iCARDEAID=?""", patid)[0]
    pat = {'given': unicode(r.GIVENNAME, "cp1253"), 'family':
        unicode(r.FAMILYNAME, "cp1253")}
    pat['date_of_birth'] = "%04d%02d%02d" % (r.BIRTHDATE.year,
            r.BIRTHDATE.month, r.BIRTHDATE.day)
    if r.GENDERID == 1:
        pat['gender'] = 'M'
    elif r.GENDERID == 2:
        pat['gender'] = 'F'
    else:
        pat['gender'] = 'U'
    #for k,v in pat.iteritems():
        #print k, '=', v
    # Find the medications of the visit
    rows = DB.query("""
        SELECT     DRUG.drugname, DRUG.ATC, DRUG_OF_VISIT.COMMENTS
            , STAFF.STAFF_FNAME, STAFF.STAFF_LNAME
        FROM VISIT INNER JOIN
             ACTIONS_OF_STAFF ON VISIT.VISITID = ACTIONS_OF_STAFF.VISITID INNER JOIN
             DRUG_OF_VISIT ON ACTIONS_OF_STAFF.ACTIONID = DRUG_OF_VISIT.ACTIONID INNER JOIN
             DRUG ON DRUG_OF_VISIT.DRUGID = DRUG.DRUGID LEFT OUTER JOIN
             STAFF ON ACTIONS_OF_STAFF.USERNAME=STAFF.USERNAME
        WHERE     (VISIT.VISITID = ?)""", visitid)
    meds = list()
    doctor = {'given':'', 'family':''}
    for r in rows:
        if not ATC_TO_UMLS.get(r.ATC):
            continue
        med = {'drugname': r.drugname, 'atc': r.ATC, 'umls_drug':
                ATC_TO_UMLS[r.ATC]}
        m=re.search("(\d+)\s*([a-zA-Z]+)", r.COMMENTS)
        if m:
            med["dose_value"] = m.group(1)
            med["dose_unit"] = m.group(2)
        if r.STAFF_FNAME:
            doctor["given"] = unicode(r.STAFF_FNAME, "cp1253")
        if r.STAFF_LNAME:
            doctor["family"] = unicode(r.STAFF_LNAME, "cp1253")
        meds.append(med)
    if not meds:
        return

    cda = template("phccis_medications.xml", 
            medications=meds,
            patient = pat,
            doctor=doctor)
    # print cda
    server_url = options.xds_endpoint
    ts = time.strftime('%Y%m%d%H%M%S', time.gmtime())
    soap = template('phccis_pnr.xml', 
                    xds_endpoint = server_url,
                    doc_creation_time = ts,
                    patient_id = "%s^^^&amp;%s&amp;ISO" % (patid, PATIENT_ROOT),
                    author = "^%(family)s^%(given)s^^^" % doctor,
                    doc_uuid = uuid.uuid4().urn,
                    submission_time = ts,
                    sset_uuid = uuid.uuid4().urn,
                    base64_document = base64.b64encode(cda)
                    )
    # print soap
    from email.utils import make_msgid
    cid = make_msgid()
    mime_boundary = 'MIMEBoundaryurn_uuid_806D8FD2D542EDCC2C1199332890718'
    content_type = 'multipart/related; boundary=%s; type="application/xop+xml"; start="%s"; start-info="application/soap+xml"; action="%s"' % (mime_boundary, cid, PNR_ACTION)
    from cStringIO import StringIO
    out = StringIO()
    out.write("--%s\r\n" % mime_boundary)
    out.write('Content-Type: application/xop+xml; charset=UTF-8; type="application/soap+xml"\r\n')
    out.write('Content-Transfer-Encoding: binary\r\n')
    out.write("Content-ID: %s\r\n\r\n" % cid)
    out.write(soap)
    out.write("\r\n--%s--" % mime_boundary)
    body = out.getvalue()
    out.close()
    logging.info('Sending new CDA (PNR transaction)')
    r = requests.post(server_url, data=body, headers={'content-type': content_type})
    logging.info('PNR STATUS %s ', r.status_code)
    #for k,v in r.headers.iteritems():
    #    print k,'=',v
    # print 'SUBMITTED AND GOT\n',r.content
    # fp = email.parser.FeedParser()
    # fp.feed("Content-type: "+r.headers.get('content-type')+"\r\n")
    # fp.feed("Content-type: multipart/related\r\n")
    # fp.feed(r.content)
    # msg = fp.close()
    # xml = msg.get_payload().get_payload()
    # print
    # print 'XML',xml
    if r.status_code == requests.codes.ok:
        DB.execute_async('DELETE FROM icardea_monitor_visits WHERE id=?', rowid)
    else:
        DB.execute_async('UPDATE icardea_monitor_visits SET worker_id=null WHERE id=?', rowid)

def send_visits_updates():
    def real_send_visits_updates():
        logging.info( "Checking for updates in visits of iCARDEA patients")
        global gvisit_lock, gvisit_id
        gvisit_lock.acquire()
        op_id = gvisit_id
        gvisit_id = gvisit_id + 1
        gvisit_lock.release()
        # op_id = threading.current_thread().ident
        rc = DB.execute("""UPDATE icardea_monitor_visits SET worker_id=? WHERE worker_id is null""", op_id)
        if rc > 0:
             visits = DB.query("""select id, icardea_patid, visitid 
                 from icardea_monitor_visits where worker_id=?""", op_id)
             for v in visits:
                 send_visit_update(v.id, v.icardea_patid, v.visitid)
        logging.info("Checking visits finished.. rescheduling checking after %d seconds" % options.timeout)
        gevent.spawn_later(options.timeout, real_send_visits_updates)
    gevent.spawn_later(2, real_send_visits_updates)

options = None

def parse_options():
    parser = OptionParser(usage = "usage: %prog [options]")
    parser.set_defaults(port = LISTEN_PORT, timeout = CHK_TIMEOUT,
            pcc_endpoint = PCC_ENDPOINT, xds_endpoint = XDS_ENDPOINT)
    parser.add_option("-p", action="store", dest="port", type="int",
                      help='The TCP port to listen to for the HTTP interface. Default: %s'% LISTEN_PORT)
    parser.add_option("-x", action="store", dest="xds_endpoint", 
                      help='The server endpoint for sending the XDS (Provide & Register) messages. Default: %s'% XDS_ENDPOINT)
    parser.add_option("-c", action="store", dest="pcc_endpoint", 
                      help='The server endpoint for sending the PCC-9 messages. Default: %s'% PCC_ENDPOINT)
    parser.add_option("-t", action="store", dest="timeout", type="int",
                      help='Timeout in seconds to be used for the periodic check. Default: %s (i.e. %s minutes).  Minimum: 5 seconds.'%
                      (CHK_TIMEOUT, CHK_TIMEOUT/60))
    (options, args) = parser.parse_args()
    if options.timeout < 5:
        options.timeout = 5
    return options

def main():
    global options
    options = parse_options()
    bottle.debug(True)
    s = pywsgi.WSGIServer(('', options.port), bottle.default_app())
    s.start()
    logging.info('Admin/monitor interface at http://%s:%s/' % (MYIP, options.port))
    check_new_patients()
    send_visits_updates()
    try:
        s.serve_forever()
    except KeyboardInterrupt:
        logging.info('Exiting...')
        s.stop()

if __name__ == "__main__":
    main()

