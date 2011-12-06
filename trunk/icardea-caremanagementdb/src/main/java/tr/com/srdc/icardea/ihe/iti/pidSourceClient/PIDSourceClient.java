/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.ihe.iti.pidSourceClient;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Connection;
import ca.uhn.hl7v2.app.ConnectionHub;
import ca.uhn.hl7v2.app.Initiator;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.llp.MinLowerLayerProtocol;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v25.datatype.CX;
import ca.uhn.hl7v2.model.v25.message.RSP_K23;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yildiray
 */
public class PIDSourceClient {

	public static Message pidFeedSinglePID(String pid, String domain, String patientName, String patientSurname, String dob,
		String gender) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String dateString = dateFormat.format(date);
		String a01 = "MSH|^~\\&|iCARDEA_CAREPLANNER|SRDC|PAT_IDENTITY_X_REF_MGR|FORTH|"
			+ dateString + "||ADT^A01^ADT_A01|8686183982575368499|P|2.3.1||20090224104152-0600\r";
		a01 += "EVN|A01|" + dateString + "|||||\r";
		a01 += "PID|||" + pid + "^^^" + domain + "||" + patientSurname + "^" + patientName + "||" + dob + "|" + gender + "\r";
		a01 += "PV1||I";

		Parser p = new GenericParser();
		Message message = p.parse(a01);
		return send(message);
	}

	public static Message pidFeedTriplePID(String[] pids, String[] domains, String patientName, String patientSurname, String dob,
		String gender) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String dateString = dateFormat.format(date);
		String a01 = "MSH|^~\\&|iCARDEA_CAREPLANNER|SRDC|PAT_IDENTITY_X_REF_MGR|FORTH|"
			+ dateString + "||ADT^A01^ADT_A01|8686183982575368499|P|2.3.1||20090224104152-0600\r";
		a01 += "EVN|A01|" + dateString + "|||||\r";
		a01 += "PID|||" + pids[0] + "^^^" + domains[0]
			+ "~" + pids[1] + "^^^" + domains[1]
			+ "~" + pids[2] + "^^^" + domains[2] + "||" + patientSurname + "^" + patientName
			+ "||" + dob + "|" + gender + "\r";
		a01 += "PV1||I";

		Parser p = new GenericParser();
		Message message = p.parse(a01);
		return send(message);
	}

	public static String pixQuery(String pid, String fromDomain, String toDomain) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String dateString = dateFormat.format(date);
		String qpd = "MSH|^~\\&|iCARDEA_CAREPLANNER|SRDC|PAT_IDENTITY_X_REF_MGR|FORTH|"
			+ dateString + "||QBP^Q23|8686183982575368499|P|2.5||||||||\r";
		qpd += "QPD|QRY_1001^Query for Corresponding Identifiers^IHEDEMO|QRY10501108|"
			+ pid + "^^^" + fromDomain + "|^^^" + toDomain + "||||\r";
		qpd += "RCP|I||||||\r";
		Parser p = new GenericParser();
		Message message = p.parse(qpd);
		Message response = send(message);

		RSP_K23 rspk23 = (RSP_K23) response;
		PID pidSegment = rspk23.getQUERY_RESPONSE().getPID();
		CX patientID = pidSegment.getPid3_PatientIdentifierList(0);
		String value = patientID.getCx1_IDNumber().getValue();
		return value;
	}

	public static Message associatePatients(String pidFrom, String fromDomain, String pidTo, String toDomain,
		String patientName, String patientSurname, String dob, String gender) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String dateString = dateFormat.format(date);
		String a40 = "MSH|^~\\&|iCARDEA_CAREPLANNER|SRDC|PAT_IDENTITY_X_REF_MGR|FORTH|"
			+ dateString + "||ADT^A40|8686183982575368499|P|2.3.1||20090224104152-0600\r";
		a40 += "EVN|A01|" + dateString + "|||||\r";
		a40 += "PID|||" + pidFrom + "^^^" + fromDomain + "||" + patientSurname + "^" + patientName + "||" + dob + "|" + gender + "\r";
		a40 += "MRG|" + pidTo + "^^^" + toDomain + "|||" + pidTo + "^^^" + toDomain + "|||" + patientSurname + "^" + patientName + "\r";

		Parser p = new GenericParser();
		Message message = p.parse(a40);
		return send(message);
	}

	public static Message send(Message message, boolean inXML, String host, int port) throws HL7Exception, LLPException, IOException {
		ConnectionHub connectionHub = ConnectionHub.getInstance();
		Connection connection = null;
		if (inXML) {
			connection = connectionHub.attach(host, port, new DefaultXMLParser(), MinLowerLayerProtocol.class);
		} else {
			connection = connectionHub.attach(host, port, new PipeParser(), MinLowerLayerProtocol.class);
		}

		// The initiator is used to transmit unsolicited messages
		Initiator initiator = connection.getInitiator();
		initiator.setTimeoutMillis(1000000);
		Message response = initiator.sendAndReceive(message);
		String responseString = "";
		if (inXML) {
			responseString = (new DefaultXMLParser()).encode(response);
		} else {
			responseString = (new PipeParser()).encode(response);
		}

		connection.close();
		return response;
	}

	public static void sendReviewMeetingDemoData() {
		try {
			String[] pids = {"MODEL:EXCENDR/SERIAL:525113", "PROTOCOL:1111", "PID:2222"};
			String[] domains = {"CIED", "icardea", "ORBIS"};
			String patientName = "ANDREAS";
			String patientSurname = "SCHMIDT";
			String patientGender = "M";
			String patientBirthTime = "195303111010";
			String response = (new PipeParser()).encode(
				pidFeedTriplePID(pids, domains, patientName, patientSurname, patientBirthTime, patientGender));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String argv[]) {
		try {
			//pidFeedSinglePID("PID1387", "ORBIS", "YILDIRAY", "KABAK", "197903111010", "M");
			//pidFeedSinglePID("CIED1387", "CIED", "YILDIRAY", "KABAK", "197903111010", "M");
			//String response = pixQuery("PID1387", "ORBIS", "");

			String[] pids = {"CIED1", "icardea1", "ORBIS1"};
			String[] domains = {"CIED", "icardea", "ORBIS"};
			String response = (new PipeParser()).encode(pidFeedTriplePID(pids, domains, "YILDIRAY", "KABAK", "197903111010", "M"));
			//String response = pixQuery("ORBIS1", "ORBIS", "CIED");
			System.out.println(response);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Message send(Message message) throws Exception {
		return send(message, false, "localhost", 2575);
	}
}
