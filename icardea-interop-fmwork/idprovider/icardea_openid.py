#!/usr/bin/python
"""The iCARDEA OpenID Provider"""

__author__ = 'Stelios Sfakianakis'
__version__ = '0.2'
__license__ = 'MIT'

from hashlib import sha256
import win32security
import json

import bottle
from bottle import (get, post, route, request, response, redirect,
        static_file, abort,
        jinja2_template as template, 
        jinja2_view as view)
from bottle.ext import sqlite
import openid
import json
from openid.server import server
from openid.store.filestore import FileOpenIDStore
from beaker.middleware import SessionMiddleware
from openid.extensions import sreg
from openid.extensions import ax
import active_directory as ad
import os

# from sqlalchemy import 
APP_HOME = os.path.dirname(__file__)

# If set to True then no MS Windows Domain controler and active
# directory communication will be performed
STANDALONE = False

bottle.TEMPLATE_PATH.append(os.path.join(APP_HOME, 'views'))

#### Audit messages for Login / Logout
import time
import socket
import codecs
from xml.sax.saxutils import escape
AUDIT_HOST = "127.0.0.1"
AUDIT_PORT = 2861

def __timestamp():
    return time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())

def __udp_send(host, port, data):
    s = socket.socket(family=socket.AF_INET, type=socket.SOCK_DGRAM)
    return s.sendto(data, (host, port))

def __syslog_msg(msg, appname = "OpenIDServer"):
    """This creates a Syslog formatted message (RFC 5424)
      
      SYSLOG-MSG      = HEADER SP STRUCTURED-DATA [SP MSG]

      PRI             = "<" PRIVAL ">"
    """
    def header():
        ## The PRI field shall be set using the facility value of 10
        ## (security/authorization messages).  Most messages should have the
        ## severity value of 5 (normal but significant), although applications
        ## may choose values of 4 (Warning condition) if that is appropriate to
        ## the more detailed information in the audit message. This means
        ## that for most audit messages the PRI field will contain the value
        ## "<85>". Audit repositories shall be prepared to deal appropriately
        ## with any incoming PRI value.
        ## 
        facility = 10
        severity = 5
        pri = "<%s>" % (facility * 8 + severity,)
        version = '1'
        tm = __timestamp()
        hostname = socket.gethostbyname(socket.gethostname())
        procid = str ( os.getpid() )
        msgid = "IHE+RFC-3881"
        # HEADER          = PRI VERSION SP TIMESTAMP SP HOSTNAME
        #                   SP APP-NAME SP PROCID SP MSGID
        return pri + version + ' ' + tm + ' ' + hostname + ' ' + appname + ' ' + procid + ' ' + msgid
    structured_data = "-"
    BOM = codecs.BOM_UTF8
    return header() + ' ' + structured_data + ' ' + BOM + msg.encode("utf8")

def __audit_action(usr, action):
    from datetime import datetime
    now = datetime.utcnow().isoformat() + 'Z'
    dst_ip = socket.gethostbyname(socket.gethostname())
    msg = """<AuditMessage>
   <EventIdentification EventDateTime="%(now)s" 
      EventOutcomeIndicator="0" 
      EventActionCode="E">
      <EventID code="110114" codeSystemName="DCM" 
         displayName="UserAuthenticated" />
      <EventTypeCode code="110122" codeSystemName="DCM" 
         displayName="%(act)s" />
	</EventIdentification>
   <ActiveParticipant UserID="OpenIDServer" 
      UserIsRequestor="true" 
      NetworkAccessPointTypeCode="1" 
      NetworkAccessPointID="%(dst)s">
      <RoleIDCode code="110150" codeSystemName="DCM" 
         displayName="Application" />
   </ActiveParticipant>
   <ActiveParticipant UserID="%(usr)s" UserIsRequestor="true"/>
   <AuditSourceIdentification AuditEnterpriseSiteID="End User" 
      AuditSourceID="%(usr)s">
      <AuditSourceTypeCode code="1" />
   </AuditSourceIdentification>
</AuditMessage>""" % {'now':now, 'act': action, 'usr':escape(usr), 'dst':dst_ip}
    s = __udp_send(AUDIT_HOST, AUDIT_PORT, __syslog_msg(msg))
    return s

def audit_login(usr):
    return __audit_action(usr, "Login")
def audit_logout(usr):
    return __audit_action(usr, "Logout")
#####

def check_win_user(uid, pwd):
    try:
        hdl = win32security.LogonUser(uid, ad.root().dc, pwd,
                win32security.LOGON32_LOGON_NETWORK,
                win32security.LOGON32_PROVIDER_DEFAULT
                )
    except win32security.error:
        return False;
    else:
        hdl.close()
        return True;

def user_prof(db, uid):
    c = db.execute('SELECT prof from users where uid=?', (uid,)).fetchone()
    if not c:
        return {}
    return json.loads(c['prof'])

def flash(categ, msg):
    """Keeps the flash messages in a cookie so that the html page in
       the browser reads them via javascript and displays them"""
    c = {}
    c[categ] = msg
    response.set_cookie('icardea_op_flash', json.dumps(c))

bottle.default_app.push()

@get('/')
@get('/home')
@view('about.html')
def index():
    return {'userid': user(), 
            'identity': identity_url(),
            'op_server_url': server_base_url+'/openidserver'}

@get('/signup')
def signup():
    data = {'op_server_url': server_base_url+'/openidserver'}
    if STANDALONE is True:
        return template('signup_nowin.html', data)
    return template('signup.html', data)

@post('/signup')
def do_signup(db):
    params = request.forms
    uid = params.get('user').lower()
    pwd = params.get('pwd')
    # Check if there's already another iCARDEA user registered with the
    # same user name
    c = db.execute ('SELECT * FROM users WHERE uid=?', (uid,)).fetchone()
    if c:
        flash('errors', 'Please choose another username')
        redirect('signup')
    if 'hospital_user' not in params:
        if not STANDALONE:
            # Check if there's already a Hospital user with the same name
            # Hospital users will reuse their user name so we d better
            # check!!
            for p in ad.search(objectCategory='Person', objectClass='user', sAMAccountName=uid):
                flash('errors', 'Please choose another username')
                redirect('signup')
        if pwd != params.get('pwd2'):
            flash('errors', 'Not correct password')
            redirect('signup')
        prof = {'nickname': uid, 'givenName': params.get('given'),
                'fullName': "%s %s" % (params.get('given'), params.get('surname')) }
        db.execute('INSERT INTO users(uid, prof) values(?,?)', (uid,json.dumps(prof)))
        db.execute('INSERT INTO auth(uid, pwd) values(?,?)', (uid,
            sha256(pwd).hexdigest()))
        db.commit()
    else:
        if check_win_user(uid, pwd):
            # Get the profile from the Windows Domain Controller
            prof = {'nickname': uid}
            for p in ad.search(objectCategory='Person', objectClass='user', sAMAccountName=uid):
                prof['fullName'] = p.displayName
                prof['givenName'] = p.givenName
                prof['groups'] = [g.cn for g in p.memberOf]
                break
            db.execute('INSERT INTO users(uid,prof) values(?,?)', (uid,json.dumps(prof)))
            db.commit()
        else:
            flash('errors', 'Wrong username and/or password for a hospital user!')
            redirect('signup')
    flash('success', 'Sign up was successful. Please log in!')
    redirect('login')



@get('/login')
@view('login.html')
def login():
    session = request.environ['beaker.session']
    next = session.get('continue', '')
    if next != '':
        exp_user = session.get('expected_user', '')
        return {'userid': user(), 'continue': next, 'expected_user': exp_user}
    if user() is not None:
        redirect('u='+user())
    return {'userid': user()}

@post('/login')
def do_login(db):
    uid = request.forms['user'].lower()
    pwd = request.forms['pwd']
    c = db.execute ('SELECT * FROM users WHERE uid=?', (uid,))
    if not c:
        flash('errors', 'Incorrect username/password')
        redirect('login')
    c = db.execute ('SELECT * FROM auth WHERE uid=? and pwd=?',
            (uid,sha256(pwd).hexdigest())).fetchone()
    if c or check_win_user(uid, pwd):
        audit_login(uid)
        set_user(uid)
        where = request.forms['continue']
        if where == '':
            where = 'home'
        redirect(where)
    flash('errors', 'Incorrect username/password')
    redirect('login')

@post('/logout')
def do_logout():
    session = request.environ['beaker.session']
    audit_logout(user())
    session.delete()
    redirect('home')

@get('/yadis')
@view('serveryadis.xml')
def server_yadis():
    response.content_type = 'application/xrds+xml'
    return {'op_server_url': server_base_url+'/openidserver'}

@get('/u=:user/yadis')
@view('yadis.xml')
def user_yadis(user):
    response.content_type = 'application/xrds+xml'
    return {'op_server_url': server_base_url+'/openidserver',
            'user_url': identity_url(user)}

@get('/u=:u')
def user_homepage(u, db):
    u = u.lower()
    c = db.execute('SELECT * from users WHERE uid=?', (u,)).fetchone()
    if not c:
        abort(404, 'Non existent OpenID')
    data =  {'op_server_url': server_base_url+'/openidserver',
            'userid': u,
            'identity': identity_url(u),
            'user_yadis_url': identity_url(u) + '/yadis'}
    if user() == u:
        data['loggedin'] = True
        data['my_profile'] = json.loads( c['prof'] )
    return template('user.html', data)

def approve_id(identity, req, prof):
    res = req.answer(True, identity=identity)
    # Add (if requested) Simple Registration info
    sreg_req = sreg.SRegRequest.fromOpenIDRequest(req)
    if sreg_req:
        sreg_data = {
                'nickname': prof['nickname'],
                'fullname': prof.get('fullName', '')
                }
        sreg_resp = sreg.SRegResponse.extractResponse(sreg_req, sreg_data)
        res.addExtension(sreg_resp)
    # Check for Attribute Exchange
    ax_req = ax.FetchRequest.fromOpenIDRequest(req)
    if ax_req:
        ax_res = ax.FetchResponse(request=ax_req)
        ### Google uses the schema defined at axschema.org.
        fullname_types = ['http://schema.openid.net/namePerson',
                'http://axschema.org/namePerson']
        for t in fullname_types:
            if t in ax_req:
                ax_res.addValue(t, prof.get('fullName', 'anonymous'))
                break
        firstname_types = ['http://axschema.org/namePerson/first',
                'http://openid.net/schema/namePerson/first']
        for t in firstname_types:
            if t in ax_req:
                ax_res.addValue(t, prof.get('givenName', 'anonymous'))
                break
        nickname_types = ['http://schema.openid.net/namePerson/friendly',
                'http://openid.net/schema/namePerson/friendly', 
                'http://axschema.org/namePerson/friendly']
        for t in nickname_types:
            if t in ax_req:
                ax_res.addValue(t, prof['nickname'])
                break
        role_type = 'http://www.w3.org/2006/vcard/ns#role'
        if role_type in ax_req:
            ax_res.setValues(role_type, prof.get('groups',[]))

        res.addExtension(ax_res)
    return res

@route('/openidserver', method=['GET', 'POST'])
def openid_protocol(db):
    """This implements the OpenID protocol. Some redirection may be
    necessary if the user has not logged in yet"""
    global oserver
    params = request.params
    session = request.environ['beaker.session']
    if params.get('continue') == 'openid_session':
        req = session['openid_request']
        del session['openid_request']
        session.save()
    else:
        try:
            req = oserver.decodeRequest(params)
        except server.ProtocolError, why:
            s = why.response.encodeToKVForm()
            return template('error.html', err=s)
    if req is None:
        return template('about.html')
    if req.mode in ['checkid_immediate', 'checkid_setup']:
        id_url_base = identity_url('')
        expected_user = req.identity[len(id_url_base):].lower()
        if is_authorized(db, req.identity, req.trust_root):
            res = approve_id(req.identity, req, user_prof(db, expected_user))
        elif req.immediate:
            res = req.answer(False)
        else:
            session['openid_request'] = req
            session.save()
            if user() is None or user() != expected_user:
                from urllib import urlencode
                session['continue'] = 'openidserver?continue=openid_session'
                session['expected_user'] = expected_user
                if user() != expected_user:
                    flash('errors', "You need to login as '%s' to continue.." % (expected_user,))
                redirect('login')
            return template('allow.html', 
                    userid=user(),
                    identity=req.identity,
                    trust_root=req.trust_root);
    else:
        res = oserver.handleRequest(req)
    openid_res = oserver.encodeResponse(res)
    return display_openid_response(openid_res)

def user():
    session = request.environ['beaker.session']
    return session.get('user', None)
def set_user(u):
    session = request.environ['beaker.session']
    if u is None:
        del session['user']
    else:
        session['user']=u
    session.save()

def is_authorized(db, expected_user, trust_root):
    if user() is None:
        return False
    if identity_url() != expected_user:
        return False
    c = db.execute('SELECT * from approvals WHERE uid=? and trust_root=?', 
            (user(), trust_root)).fetchone()
    return c is not None


def display_openid_response(openid_res):
    response.status = openid_res.code
    for k, v in openid_res.headers.iteritems():
        response.headers[k] = v
    return openid_res.body

@post('/allow')
def approve(db):
    if user() is None:
        redirect('login')
    session = request.environ.get('beaker.session')
    openid_req = session['openid_request']
    params = request.params
    if 'yes' in params:
        identity = openid_req.identity
        trust_root = openid_req.trust_root
        if params.get('remember', 'no') == 'yes':
            db.execute('INSERT INTO approvals(uid, trust_root) values(?,?)', 
                    (user(), trust_root))
            db.commit()
        openid_res = approve_id(identity, openid_req, user_prof(db, user()))
    elif 'no' in params:
        openid_res = openid_req.answer(False)
    else:
        abort(404, "non valid request!!")
    openid_wres = oserver.encodeResponse(openid_res)
    return display_openid_response(openid_wres)

@get('/approved')
def show_approvals(db):
    if user() is None:
        redirect('login')
    appr = [r['trust_root'] for r in db.execute('SELECT trust_root FROM approvals WHERE uid=?',
            (user(),)).fetchall()]
    return template('approved.html',
            {'userid': user(), 'approvals': appr,
            'identity': identity_url()})

@post('/approved')
def update_approvals(db):
    if user() is None:
        redirect('login')
    tr = request.forms.get('root', '')
    db.execute('DELETE FROM approvals WHERE uid=? and trust_root=?',
            (user(), tr))
    db.commit()
    redirect('approved')

def identity_url(u = None):
    if u is None:
        u = user()
        if u is None:
            return None
    return server_base_url + '/u=' + u

@route('/static/:filename')
def send_file(filename):
    docroot = os.path.join(APP_HOME, 'static')
    return static_file(filename, root=docroot)


def create_db(db):
    cmds = [ "CREATE TABLE IF NOT EXISTS users(uid text PRIMARY KEY, prof text)", 
            "CREATE TABLE IF NOT EXISTS auth(uid text primary key, pwd text, foreign key (uid) references users(uid))",
            "CREATE TABLE IF NOT EXISTS approvals(uid text, trust_root text, foreign key (uid) references users(uid))"]
    for c in cmds:
        db.execute(c)
    db.commit()

COOKIE_SECRET = "GCiTnook52pyHs qgWbK"

app = bottle.default_app.pop()
sql_plugin = sqlite.Plugin(dbfile=os.path.join(APP_HOME, 'users.db'))
app.install(sql_plugin)

MY_HOST = socket.gethostbyname(socket.gethostname())
try:
    from mod_wsgi import version
    # Running as wsgi application!
    # we assume that this wsgi application has been already "mounted"
    # in the '/idp' sub dir in the Apache configuration file.
    server_base_url = 'http://%s/idp' % (MY_HOST,)
    idp_app = app
except:
    PORT = 4545
    server_base_url = 'http://%s:%s/idp' % (MY_HOST, PORT)
    idp_app = bottle.default_app.push()
    idp_app.mount(app, '/idp')

oserver = server.Server(FileOpenIDStore(os.path.join(APP_HOME, "openid_sessions")), 
        server_base_url + '/openidserver')
session_opts = {
        'session.type': 'dbm',
        'session.cookie_expires': 3600,
        'session.data_dir': os.path.join(APP_HOME, 'sessions'),
        'session.key': 'icardea_idp_sid',
        'session.secret': COOKIE_SECRET,
        'session.auto': True
        }
application = SessionMiddleware(idp_app, session_opts)

def run_standalone_server():
    print """=======================================================
iCARDEA OpenID Provider is about to launch...
It will %s contact the Windows Domain Controller and Active Directory
for authenticating local MS Windows users. Please change the STANDALONE
cariable in the code to alter this behaviour.

You can visit it at http://127.0.0.1:4545/idp/ (don't miss the slash!!)
=======================================================
""" % ("NOT" if STANDALONE else "")
    bottle.debug(True)
    bottle.run(app=application, host='0.0.0.0', port=PORT)

if __name__ == '__main__':
    run_standalone_server()

