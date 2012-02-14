package gr.forth.ics.icardea.pid;
import gr.forth.ics.icardea.mllp.HL7MLLPClient;
import gr.forth.ics.icardea.mllp.HL7MLLPServer;
import gr.forth.ics.icardea.mllp.HL7RequestContext;
import gr.forth.ics.icardea.pid.iCARDEA_Patient.ID;

import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.text.StrSubstitutor;
import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.app.DefaultApplication;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Segment;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.primitive.CommonTS;
import ca.uhn.hl7v2.model.v231.segment.MRG;
import ca.uhn.hl7v2.model.v231.segment.MSH;
import ca.uhn.hl7v2.model.v231.segment.PID;
import ca.uhn.hl7v2.model.v231.datatype.CX;
import ca.uhn.hl7v2.model.v231.message.ACK;
import ca.uhn.hl7v2.model.v231.message.ADT_A39;
import ca.uhn.hl7v2.util.Terser;

/**
 * Patient Identity Feed Handler (ITI TF-2a / 3.8)
 *  
 * This is for the Patient Identity Management - Admit/Register or Update
 * Patient. The following events from a Patient Identity Source Actor will
 * trigger one of the Admit/Register or Update messages:
 *  - A01 - Admission of an in-patient into a facility
 *  - A04 - Registration of an outpatient for a visit of the facility
 *  - A05 - Pre-admission of an in-patient (i.e., registration of patient
 * information ahead of actual admission).
 * 
 * Changes to patient demographics (e.g., change in patient name, patient
 * address, etc.) shall trigger the following Admit/Register or Update message:
 *  - A08 - Update Patient Information
 *  
 * The Patient Identity Feed transaction is conducted by the HL7 ADT message.
 */
final class PatientIdentityFeedHandler extends DefaultApplication {
	static Logger logger = Logger.getLogger(PatientIdentityFeedHandler.class);
	public static String[] trigEvents = new String[] {"A01", "A04", "A05", "A08", "A40"};
	private HL7MLLPClient forwarder_;

	public static String ITI_8_LOGMSG = "<?xml version='1.0' encoding='UTF-8'?>" +
	"<AuditMessage>" +
	"  <EventIdentification EventOutcomeIndicator='${evtInd}' EventDateTime='${timeStamp}' EventActionCode='${evtActionCode}'>" +
	"        <EventID codeSystemName='DCM' displayName='Patient Record' code='110110'/>" +
	"        <EventTypeCode codeSystemName='IHE Transactions' displayName='Patient Identity Feed' code='ITI-8'/>" +
	"    </EventIdentification>" +
	" <ActiveParticipant NetworkAccessPointTypeCode='"+Audit.NetworkAccessPointTypeCode.IP_ADDRESS+"' NetworkAccessPointID='${clntIPaddr}' UserIsRequestor='true' UserID='${clntApp}'>" +
	"        <RoleIDCode codeSystemName='DCM' displayName='Source' code='110153'/>" +
	"  </ActiveParticipant>" +
	"  <ActiveParticipant NetworkAccessPointTypeCode='"+Audit.NetworkAccessPointTypeCode.IP_ADDRESS+"' NetworkAccessPointID='${srvIPaddr}' UserIsRequestor='false' AlternativeUserID='0' UserID='${srvApp}'>" +
	"        <RoleIDCode codeSystemName='DCM' displayName='Destination' code='110152'/>" +
	"    </ActiveParticipant>    " +
	"  <AuditSourceIdentification AuditEnterpriseSiteID='"+ Audit.AUDIT_ENTERPRISE_ID +"' AuditSourceID='" + Audit.AUDIT_SOURCE_ID + "'>" +
	"		<AuditSourceTypeCode code='" + Audit.AuditSourceTypeCode.APP_SRV_PROC + "'/>" +
	"	</AuditSourceIdentification>" +
	"  <ParticipantObjectIdentification ParticipantObjectTypeCodeRole='"+Audit.ParticipantObjectTypeCodeRole.PATIENT + 
	"' ParticipantObjectTypeCode='"+Audit.ParticipantObjectTypeCode.PERSON +"' ParticipantObjectID='${patId}'>" +
	"        <ParticipantObjectIDTypeCode code='"+Audit.ParticipantObjectIDTypeCode.PATIENT_NBR+"' codeSystemName='RFC-3881' displayName='Patient Number'/>" +
	"        <ParticipantObjectName>${patName}</ParticipantObjectName>" +
	"        <ParticipantObjectDetail value='${msh10B64}' type='MSH-10'/>" +
	"    </ParticipantObjectIdentification>" +
	"</AuditMessage>";
	
	public void register(HL7MLLPServer s, HL7MLLPClient forwarder) {
		for (String ev: trigEvents)
			s.registerApplication("ADT", ev, this);
		this.forwarder_ = forwarder;
	}

	public boolean canProcess(Message msg) {
		Terser t = new Terser(msg);
		try {
			Segment s = t.getSegment("/PID");
			if (!(s instanceof PID))
				return false;
			String trigEvent = t.get("/MSH-9-2");
			for (String ev: trigEvents)
				if (ev.equals(trigEvent))
					return true;
			return false;
		} catch (HL7Exception e) {
			return false;
		}
	}
	private String findNamespaceFromCX(CX cx) {
		String namespace = cx.getCx4_AssigningAuthority().getHd1_NamespaceID().getValue();
		if (namespace == null || "".equals(namespace)) {
			String uid = cx.getCx4_AssigningAuthority().getHd2_UniversalID().getValue();
			String uid_type = cx.getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue();
			AssigningAuthority auth = AssigningAuthority.find_by_uid(uid, uid_type);
			if (auth == null)
				return null;
			namespace = auth.namespace;
		}
		return namespace;
	}

	private void auditFeedMsg(MSH msh, Audit.EventOutcomeIndicator evtInd, String pidHL7, String patNameHL7) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("timeStamp", new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ss").format(new Date()));
		map.put("evtInd", evtInd.getCode()+"");
		map.put("evtActionCode", 
				msh.getMsh9_MessageType().getMsg2_TriggerEvent().getValue().equals("A08") ? "U" : "C");
		map.put("clntIPaddr", HL7RequestContext.getRemoteAddress());
		map.put("clntApp", 
				msh.getSendingFacility().getNamespaceID().getValue() + "|" + msh.getSendingApplication().getNamespaceID().getValue());
		map.put("srvApp", PatientIndex.fac_name + "|" + PatientIndex.app_name);
		map.put("srvIPaddr", HL7RequestContext.getLocalAddress());
		map.put("patId", StringEscapeUtils.escapeXml(pidHL7));
		map.put("patName", StringEscapeUtils.escapeXml(patNameHL7));
		String msh10 = msh.getMsh10_MessageControlID().getValue();
		try {
			map.put("msh10B64", Base64.encodeBase64String(msh10.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			// "Every implementation of the Java platform is required to support UTF-8"!!
		}
		
		StrSubstitutor sub = new StrSubstitutor(map);
		String audit_msg = sub.replace(ITI_8_LOGMSG);
		try {
			Audit a = new Audit();
			byte[] sysl_msg = a.create_syslog_xml(PatientIndex.app_name, audit_msg);
			a.send_udp(sysl_msg);
		} catch (UnknownHostException e) {
			logger.info(e.getMessage());
		}
	}
	/**
	 * See ITI-vol2a, 3.10
	 * @throws HL7Exception 
	 */
	static private Message update_notification(iCARDEA_Patient tr) throws HL7Exception {
		ca.uhn.hl7v2.model.v25.message.ADT_A05 b = new ca.uhn.hl7v2.model.v25.message.ADT_A05();

		HL7Utils.createHeader(b.getMSH(), "2.5");
		
		b.getMSH().getMsh9_MessageType().parse("ADT^A31^ADT_05");
		b.getMSH().getReceivingApplication().parse(PatientIndex.app_name+"_update_client"); //XXX
		b.getMSH().getReceivingFacility().parse(PatientIndex.fac_name); // XXX
		b.getMSH().getMessageProfileIdentifier(0).parse("ITI-10^IHE");
		
		GregorianCalendar now = new GregorianCalendar();
		now.setTime(new Date());
		b.getEVN().getRecordedDateTime().parse(CommonTS.toHl7TSFormat(now));
		tr.toPidv25(b.getPID());
		b.getPID().getPid5_PatientName(0).parse(" "); 
		
		b.getPV1().getPatientClass().parse("N");
		return b;
	}
	/**
	 * See ITI-vol2a, 3.8
	 */
	public Message processMessage(Message msg) throws ApplicationException{
		String remoteAddr = HL7RequestContext.getRemoteAddress();
		try {
			logger.debug("Received (from "+ remoteAddr + "): "+msg.encode());
		} catch (HL7Exception e) {
		}
		Terser terser = new Terser(msg);
		ACK a = null;
		MSH msh = null;
		CX patId = null;
		Audit.EventOutcomeIndicator evtInd = Audit.EventOutcomeIndicator.SERIOUS_FAILURE;
		try {

			String trigEvent = terser.get("/MSH-9-2");
			msh = (MSH) terser.getSegment("/MSH");
			a = (ACK) makeACK( msh );
			a.getMSH().getMsh9_MessageType().parse("ACK^"+trigEvent);

			HL7Utils.fillResponseHeader(msh, a.getMSH());

			if ("A40".equals(trigEvent)) {
				ADT_A39 merge = (ADT_A39) msg;

				iCARDEA_Patient.ID surv_id = null;
				PID pid = merge.getPIDPD1MRGPV1().getPID();
				for (CX cx: pid.getPid3_PatientIdentifierList()) {
					String id = cx.getCx1_ID().getValue();	
					String namespace = findNamespaceFromCX(cx);
					if (namespace == null) {
						HL7Exception ex = new HL7Exception("Unsupported authority:"+pid.getField(3, 0).encode(), HL7Exception.UNKNOWN_KEY_IDENTIFIER);
						throw ex;
					}
					surv_id = new ID(namespace, id);
					patId = cx;
					break;					
				}
				// par. 3.8.4.2
				MRG mrg = merge.getPIDPD1MRGPV1().getMRG();
				
				iCARDEA_Patient.ID old_id = null;
				for (CX cx: mrg.getMrg1_PriorPatientIdentifierList()) {
					String id = cx.getCx1_ID().getValue();
					String namespace = findNamespaceFromCX(cx);
					if (namespace == null) {
						HL7Exception ex = new HL7Exception("Unsupported authority:"+pid.getField(3, 0).encode(), HL7Exception.UNKNOWN_KEY_IDENTIFIER);
						throw ex;
					}
					old_id = new ID(namespace, id);
					break;					
				}
				// XXX: Here we use the first (and only?) ID to find what entry to update!
				StorageManager.getInstance().merge_pid(surv_id, old_id);
				evtInd = Audit.EventOutcomeIndicator.SUCCESS;
			}
			else {
				Segment s = terser.getSegment("/PID");
				PID pid = (PID) s;
				patId = pid.getPid3_PatientIdentifierList(0);
				Type[] tt = pid.getField(3);
				for (Type t: tt) {
					AssigningAuthority auth = null;
					String tons = Terser.getPrimitive(t, 4, 1).getValue();
					if (tons == null || "".equals(tons)) {
						String uid = Terser.getPrimitive(t, 4, 2).getValue();
						String uid_type = Terser.getPrimitive(t, 4, 3).getValue();
						auth = AssigningAuthority.find_by_uid(uid, uid_type);
					}
					else
						auth = AssigningAuthority.find(tons);
					if (auth == null) {
						HL7Exception ex = new HL7Exception("Unsupported authority:"+pid.getField(3, 0).encode(), HL7Exception.UNKNOWN_KEY_IDENTIFIER);
						throw ex;
					}
				}

				logger.debug("PID:"+pid.encode());
				iCARDEA_Patient tr = iCARDEA_Patient.create_from_PID(pid);

				if (tr.ids.size() == 0)
					throw new HL7Exception("No identifiers given", HL7Exception.DATA_TYPE_ERROR);
				if ("A08".equals(trigEvent)) {
					// XXX: Here we use the first (and only?) ID to find what entry to update!
					StorageManager.getInstance().update_pid(tr.ids.get(0), tr);
				}
				else {
					for (iCARDEA_Patient.ID id: tr.ids) {
						if (null != StorageManager.getInstance().retrieve(id))
							throw new HL7Exception("Patient exists already!", HL7Exception.DATA_TYPE_ERROR);
					}
					StorageManager.getInstance().insert_pid(tr);
					Message notification = update_notification(tr);
					this.forwarder_.send(notification);
				}
				evtInd = Audit.EventOutcomeIndicator.SUCCESS;
			}
			a.getMSA().getMsa2_MessageControlID().setValue(terser.get("/MSH-10"));
			a.getMSA().getMsa1_AcknowledgementCode().setValue("AA");

		} catch (HL7Exception e) {
			e.printStackTrace();
			try {
				a.getMSA().getMsa1_AcknowledgementCode().setValue("AE");
				// a.getMSA().getMsa3_TextMessage().setValue(e.getMessage());
				// HL7Utils.fillErrHeader(a, e);
			} catch (HL7Exception ex) {
				ex.printStackTrace();
				throw new ApplicationException(ex.getMessage(), ex);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApplicationException(e.getMessage(), e);
		}
		finally {
			try {
				this.auditFeedMsg(msh, evtInd, patId.encode(), "");
			} catch (HL7Exception e) {
			}
		}
		try {
			logger.debug("Sending:"+a.encode());
		} catch (HL7Exception e) {
		}

		return a;
	}
}

