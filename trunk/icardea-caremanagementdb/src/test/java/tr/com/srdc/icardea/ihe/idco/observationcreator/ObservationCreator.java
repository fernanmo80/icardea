/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.ihe.idco.observationcreator;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javax.mail.MessagingException;
import javax.mail.internet.MimeUtility;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v25.datatype.CE;
import ca.uhn.hl7v2.model.v25.datatype.ED;
import ca.uhn.hl7v2.model.v25.datatype.ST;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.NTE;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.parser.XMLParser;

import com.sun.net.ssl.internal.ssl.Provider;

/**
 * 
 * @author ibrahim
 */
public class ObservationCreator {

	private int port;
	private String host;
	private boolean atnatls;

	public ObservationCreator(String host, int port) {
		this.host = host;
		this.port = port;
		this.atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
	}

	public Object run(boolean sendInXML, boolean fileInXML, String fileName) {
		try {
			Message message = null;
			if (fileName == null) {
				message = createMessage();
			} else {
				System.out.println("fileName:" + fileName);
				InputStream is = this.getClass().getClassLoader()
						.getResourceAsStream(fileName);
				System.out.println("InputStream:" + is);
				BufferedReader bf = new BufferedReader(
						new InputStreamReader(is));
				StringBuilder messageBuffer = new StringBuilder();
				String line = "";
				System.out.println("Reading the message from file...");
				while ((line = bf.readLine()) != null) {
					messageBuffer.append(line).append("\r");
				}
				Parser p = null;
				if (!fileInXML)
					p = new GenericParser();
				else
					p = new DefaultXMLParser();

				System.out.println("Parsing the message...");
				message = p.parse(messageBuffer.toString());
				System.out.println("Message:" + message);

				/*
				 * populateOBXSegment((ORU_R01)message, 292, "ED", "", "", "",
				 * "", "", "", "F", "20070422170125", "", "", "",
				 * "icardea-caremanagementdb/resources/idco/b.pdf", "", "");
				 * populateOBXSegment((ORU_R01)message, 293, "ED", "", "", "",
				 * "", "", "", "F", "20070422170125", "", "", "",
				 * "icardea-caremanagementdb/resources/idco/b.pdf", "", "");
				 */
			}
			/*
			 * String messageString = null; if (!inXML) { messageString =
			 * convertToDelimitedString(message); } else { messageString =
			 * convertToXMLString(message); }
			 * Logger.getLogger(ObservationCreator.class).log(Level.INFO,
			 * messageString);
			 */

			send(message, sendInXML);
			return new Object();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	private Message createMessage() throws DataTypeException, HL7Exception,
			MessagingException, IOException, Exception {
		ORU_R01 oru = new ORU_R01();

		String sendingApplication = "APPNAME";
		String sendingFacility = "VENDOR NAME";
		String receivingApplication = "CLINIC APPLICATION";
		String receivingFacility = "CLINIC ID";
		populateMSHSegment(oru, sendingApplication, sendingFacility,
				receivingApplication, receivingFacility);

		String patientID = "MODEL:xxx/SERIAL:xxx";
		String assigningAuthority = "STJ"; // TODO: Validate from list: Table
											// A.1
		String identifierTypeCode = "U";
		String givenName = "John";
		String familyName = "Doe";
		String secondName = "Adams";
		String dateTimeOfBirth = "197903110920";
		String administrativeSex = "M";
		String street = "Street";
		String city = "City";
		String postalCode = "06531";
		String country = "Country";
		populatePIDSegment(oru, patientID, assigningAuthority,
				identifierTypeCode, givenName, familyName, secondName,
				dateTimeOfBirth, administrativeSex, street, city, postalCode,
				country);

		String patientClass = "R";
		String visitID = "123456";
		String attendingDoctorID = "DoctorID";
		populatePV1Segment(oru, patientClass, visitID, attendingDoctorID);

		String fillerOrderNumber = "123456";
		String universalServiceIdentifier = "Remote Follow-up"; // TODO: Values:
																// Table 4.12-7
		String observationDateTime = "20040328134623";
		String observationEndDateTime = "20040328134623";
		String resultRptStatusChangeDateTime = "20040328134623";
		String resultStatus = "F"; // TODO: Values: Table 4.12-8
		populateOBRSegment(oru, fillerOrderNumber, universalServiceIdentifier,
				observationDateTime, observationEndDateTime,
				resultRptStatusChangeDateTime, resultStatus);

		String valueType = "ST"; // Values: Table 4.12-9
		String observationIdentifier = "257"; // MDC_IDC Nomenclature code value
		String observationIdentifierText = "MDC-IDC_SYSTEM_STATUS"; // MDC_IDC
																	// Nomenclature
																	// reference
																	// id
		String observationIdentifierNameOfCodeSystem = "MDC_IDC";
		String observationValue = "Normal";
		String unitIdentifier = "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		String abnormalFlags = "L"; // Optional, CH07 Table 0078
		String observationResultStatus = "F"; // CH07 HL7 Table 0085
		String dateTimeOfObservation = "20070422170125";
		String observationMethodIdentifier = "LastFU"; // Optional, Table
														// 4.12-10
		String observationMethodText = "Since Last Follow-up Aggregate"; // Optional,
																			// Table
																			// 4.12-10
		String observationSubID = "1";

		populateOBXSegment(oru, 0, valueType, observationIdentifier,
				observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue,
				unitIdentifier, abnormalFlags, observationResultStatus,
				dateTimeOfObservation, observationMethodIdentifier,
				observationMethodText, observationSubID, "", "", "");

		valueType = "ED";
		String fileName = "resources/idco/b.pdf";
		// String fileName =
		// "D:/yildiray/Documents/Projects/iCARDEA/usefuldocs/RemoteCardiacMonitoringinUSA.pdf";
		observationResultStatus = "F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = "20070422170125";
		populateOBXSegment(oru, 1, valueType, "", "", "", "", "", "",
				observationResultStatus, dateTimeOfObservation, "", "", "",
				fileName, "", "");

		valueType = "CE";
		observationIdentifier = "257"; // MDC_IDC Nomenclature code value
		observationIdentifierText = "MDC-IDC_SYSTEM_STATUS"; // MDC_IDC
																// Nomenclature
																// reference id
		observationIdentifierNameOfCodeSystem = "MDC_IDC";
		unitIdentifier = "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags = "L"; // Optional, CH07 Table 0078
		observationResultStatus = "F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = "20070422170125";
		observationMethodIdentifier = "LastFU"; // Optional, Table 4.12-10
		observationMethodText = "Since Last Follow-up Aggregate"; // Optional,
																	// Table
																	// 4.12-10
		observationSubID = "1";
		observationValue = "GALLBLADDER";
		String observationValueIdentifier = "T57000";
		String observationNameOfCodingSystem = "SNM";
		populateOBXSegment(oru, 2, valueType, observationIdentifier,
				observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue,
				unitIdentifier, abnormalFlags, observationResultStatus,
				dateTimeOfObservation, observationMethodIdentifier,
				observationMethodText, observationSubID, "",
				observationValueIdentifier, observationNameOfCodingSystem);

		String comment = "Comment";
		populateNTESegment(oru, comment);

		return oru;
	}

	private void populateNTESegment(ORU_R01 oru, String comment)
			throws HL7Exception {
		NTE nteSegment = oru.getPATIENT_RESULT().getORDER_OBSERVATION()
				.getNTE();
		nteSegment.getSetIDNTE().setValue("1");
		nteSegment.getSourceOfComment().setValue("L");
		nteSegment.getComment(0).setValue(comment);
	}

	private void populateOBXSegment(ORU_R01 oru, int obxNumber,
			String valueType, String observationIdentifier,
			String observationIdentifierText,
			String observationIdentifierNameOfCodeSystem,
			String observationValue, String unitIdentifier,
			String abnormalFlags, String observationResultStatus,
			String dateTimeOfObservation, String observationMethodIdentifier,
			String observationMethodText, String observationSubID,
			String fileName, String observationValueIdentifier,
			String observationNameOfCodingSystem) throws DataTypeException,
			HL7Exception, MessagingException, IOException, Exception {
		int setID = obxNumber + 1;

		if (valueType.equals("ED")) {
			observationIdentifier = "18750-0"; // FIX
			observationIdentifierText = "Cardiac Electrophysiology Report"; // FIX
			observationIdentifierNameOfCodeSystem = "LN"; // FIX

			unitIdentifier = "";
			abnormalFlags = "";
			observationMethodIdentifier = "";
			observationMethodText = "";
			observationSubID = "";
		}

		ORU_R01_ORDER_OBSERVATION orderObservation = oru.getPATIENT_RESULT()
				.getORDER_OBSERVATION();
		OBX obx = orderObservation.getOBSERVATION(obxNumber).getOBX();
		obx.getSetIDOBX().setValue("" + setID);
		obx.getValueType().setValue(valueType);
		obx.getObservationSubID().setValue(observationSubID);
		obx.getUnits().getIdentifier().setValue(unitIdentifier);
		obx.getAbnormalFlags(0).setValue(abnormalFlags);
		obx.getObservationResultStatus().setValue(observationResultStatus);
		obx.getDateTimeOfTheObservation().getTime()
				.setValue(dateTimeOfObservation);
		obx.getObservationMethod(0).getIdentifier()
				.setValue(observationMethodIdentifier);
		obx.getObservationMethod(0).getText().setValue(observationMethodText);

		obx.getObservationIdentifier().getIdentifier()
				.setValue(observationIdentifier);
		obx.getObservationIdentifier().getNameOfCodingSystem()
				.setValue(observationIdentifierNameOfCodeSystem);
		obx.getObservationIdentifier().getText()
				.setValue(observationIdentifierText);

		if (valueType.equals("ED")) {
			// set the value of ED with the String
			ED encapsuledData = new ED(oru);
			encapsuledData.getTypeOfData().setValue("Application");
			encapsuledData.getDataSubtype().setValue("PDF");
			encapsuledData.getEncoding().setValue("Base64");

			/*
			 * MimeMultipart mimeMessage = new MimeMultipart(); MimeBodyPart
			 * bodyPart = new MimeBodyPart();
			 * 
			 * FileDataSource fds = new FileDataSource(fileName);
			 * bodyPart.setDataHandler(new DataHandler(fds));
			 * bodyPart.setHeader("MIME-Version", "1.0");
			 * bodyPart.setHeader("Content-Type", "application/pdf");
			 * bodyPart.setHeader("Content-Transfer-Encoding", "base64");
			 * mimeMessage.addBodyPart(bodyPart);
			 * 
			 * ByteArrayOutputStream byte1 = new ByteArrayOutputStream();
			 * mimeMessage.writeTo(byte1);
			 * encapsuledData.getData().setValue(byte1.toString());
			 */

			File file = new File(fileName);
			FileInputStream fin = new FileInputStream(file);
			byte fileContent[] = new byte[(int) file.length()];
			fin.read(fileContent);
			fin.close();

			encapsuledData.getData().setValue(new String(encode(fileContent)));
			obx.getObservationValue(0).setData(encapsuledData);
		} else if (valueType.equals("ST")) {
			ST st = new ST(oru);
			st.setValue(observationValue);
			Varies value = obx.getObservationValue(0);
			value.setData(st);
		} else if (valueType.equals("CE")) {
			CE ce = new CE(oru);
			ce.getIdentifier().setValue(observationValueIdentifier);
			ce.getText().setValue(observationValue);
			ce.getNameOfCodingSystem().setValue(observationNameOfCodingSystem);
			Varies value = obx.getObservationValue(0);
			value.setData(ce);
		}
	}

	public static byte[] encode(byte[] b) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		OutputStream b64os = MimeUtility.encode(baos, "base64");
		b64os.write(b);
		b64os.close();
		return baos.toByteArray();
	}

	private void populateOBRSegment(ORU_R01 oru, String fillerOrderNumber,
			String universalServiceIdentifier, String observationDateTime,
			String observationEndDateTime,
			String resultRptStatusChangeDateTime, String resultStatus)
			throws DataTypeException, HL7Exception {
		ORU_R01_ORDER_OBSERVATION orderObservation = oru.getPATIENT_RESULT()
				.getORDER_OBSERVATION();
		OBR obr = orderObservation.getOBR();
		obr.getSetIDOBR().setValue("1");
		obr.getFillerOrderNumber().getEntityIdentifier()
				.setValue(fillerOrderNumber);
		obr.getUniversalServiceIdentifier().getIdentifier()
				.setValue(universalServiceIdentifier);
		obr.getObservationDateTime().getTime().setValue(observationDateTime);
		obr.getObservationEndDateTime().getTime()
				.setValue(observationEndDateTime);
		obr.getResultsRptStatusChngDateTime().getTime()
				.setValue(resultRptStatusChangeDateTime);
		obr.getResultStatus().setValue(resultStatus);
	}

	private void populatePV1Segment(ORU_R01 oru, String patientClass,
			String visitID, String attendingDoctorID) throws DataTypeException,
			HL7Exception {
		PV1 pv1Segment = oru.getPATIENT_RESULT().getPATIENT().getVISIT()
				.getPV1();
		pv1Segment.getSetIDPV1().setValue("1");
		pv1Segment.getPatientClass().setValue(patientClass);
		pv1Segment.getAttendingDoctor(0).getIDNumber()
				.setValue(attendingDoctorID);
		pv1Segment.getVisitNumber().getIDNumber().setValue(visitID);
	}

	private void populatePIDSegment(ORU_R01 oru, String patientID,
			String assigningAuthority, String identifierTypeCode,
			String givenName, String familyName, String secondName,
			String dateTimeOfBirth, String administrativeSex, String street,
			String city, String postalCode, String country)
			throws DataTypeException, HL7Exception {
		PID pidSegment = oru.getPATIENT_RESULT().getPATIENT().getPID();
		pidSegment.getPatientID().getIDNumber().setValue(patientID);
		pidSegment.getPatientID().getAssigningAuthority().getNamespaceID()
				.setValue(assigningAuthority);
		pidSegment.getPatientID().getIdentifierTypeCode()
				.setValue(identifierTypeCode);

		pidSegment.getPatientName(0).getGivenName().setValue(givenName);
		pidSegment.getPatientName(0).getFamilyName().getSurname()
				.setValue(familyName);
		pidSegment.getPatientName(0)
				.getSecondAndFurtherGivenNamesOrInitialsThereof()
				.setValue(secondName);

		pidSegment.getDateTimeOfBirth().getTime().setValue(dateTimeOfBirth);
		pidSegment.getAdministrativeSex().setValue(administrativeSex);
		pidSegment.getPatientAddress(0).getStreetAddress().getStreetName()
				.setValue(street);
		pidSegment.getPatientAddress(0).getCity().setValue(city);

		pidSegment.getPatientAddress(0).getZipOrPostalCode()
				.setValue(postalCode);
		pidSegment.getPatientAddress(0).getCountry().setValue(country);

	}

	private void populateMSHSegment(ORU_R01 oru, String sendingApplication,
			String sendingFacility, String receivingApplication,
			String receivingFacility) throws DataTypeException {
		MSH mshSegment = oru.getMSH();

		mshSegment.getSendingApplication().getNamespaceID()
				.setValue(sendingApplication);
		mshSegment.getSendingFacility().getNamespaceID()
				.setValue(sendingFacility);
		mshSegment.getReceivingApplication().getNamespaceID()
				.setValue(receivingApplication);
		mshSegment.getReceivingFacility().getNamespaceID()
				.setValue(receivingFacility);

		mshSegment.getFieldSeparator().setValue("|");
		mshSegment.getEncodingCharacters().setValue("^~\\&");
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		mshSegment.getDateTimeOfMessage().getTime()
				.setValue(dateFormat.format(date));
		mshSegment.getMessageType().getMessageCode().setValue("ORU");
		mshSegment.getMessageType().getTriggerEvent().setValue("R01");
		mshSegment.getMessageControlID().setValue("");
		mshSegment.getProcessingID().getProcessingID().setValue("P");
		mshSegment.getVersionID().getVersionID().setValue("2.5");
		mshSegment.getMessageControlID().setValue("12345");
	}

	private static String convertToDelimitedString(Message message)
			throws HL7Exception {
		Parser parser = new PipeParser();
		return parser.encode(message);
	}

	private static String convertToXMLString(Message message)
			throws HL7Exception {
		XMLParser xmlParser = new DefaultXMLParser();
		return xmlParser.encode(message);
	}

	/*
	 * private void send(Message oru, boolean inXML) throws HL7Exception,
	 * LLPException, IOException { ConnectionHub connectionHub =
	 * ConnectionHub.getInstance(); Connection connection = null; if (inXML) {
	 * connection = connectionHub.attach(host, port, new DefaultXMLParser(),
	 * MinLowerLayerProtocol.class); } else { connection =
	 * connectionHub.attach(host, port, new PipeParser(),
	 * MinLowerLayerProtocol.class); }
	 * 
	 * // The initiator is used to transmit unsolicited messages
	 * System.out.println("Sending the message..."); Initiator initiator =
	 * connection.getInitiator(); initiator.setTimeoutMillis(10000); Message
	 * response = initiator.sendAndReceive(oru); String responseString = ""; if
	 * (inXML) { responseString = (new DefaultXMLParser()).encode(response); }
	 * else { responseString = (new PipeParser()).encode(response); }
	 * Logger.getLogger(ObservationCreator.class).log(Level.INFO,
	 * "Received response:\n" + responseString); connection.close(); }
	 */

	private void send(Message oru, boolean inXML) throws Exception {
		byte SB = 0x0b;
		byte ACK = 0x06;
		byte EB = 0x1c;
		byte CR = 0x0d;

		String messageToSend = "";
		Socket socket = null;

		if (inXML) {
			messageToSend = convertToXMLString(oru);
		} else {
			messageToSend = convertToDelimitedString(oru);
		}

		if (atnatls) {
			Security.addProvider(new Provider());

			// Specifying the Keystore details
			System.setProperty("javax.net.ssl.keyStore", ResourceBundle.getBundle("icardea").getString("icardea.home") + "/icardea-caremanagementdb/src/test/resources/sampleSSL/client.ks");
			System.setProperty("javax.net.ssl.keyStorePassword", "client");
			System.setProperty("javax.net.ssl.trustStore", ResourceBundle.getBundle("icardea").getString("icardea.home") + "/icardea-caremanagementdb/src/test/resources/sampleSSL/client.ts");
			System.setProperty("javax.net.ssl.trustStorePassword", "srdcpass");

			SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory
					.getDefault();
			socket = (SSLSocket) sslsocketfactory.createSocket(
					host, port);
		} else {
			socket = new Socket(host, port);
		}
		OutputStream dos = socket.getOutputStream();

		dos.write(SB);
		dos.write(messageToSend.getBytes());
		dos.write(EB);
		dos.write(CR);
		dos.flush();

		InputStream in = socket.getInputStream();
		StringBuffer sb = new StringBuffer();
		int b = 0;
		while ((b = in.read()) != SB) {
		}
		while ((b = in.read()) != EB) {
			sb.append((char) b);
		}
		String receivedMessage = sb.toString();
		while ((b = in.read()) != CR) {
		}
		in.close();
		socket.close();
	}

	public static void main(String argv[]) {
		ObservationCreator observationCreator = new ObservationCreator(argv[0],
				1011);
		observationCreator.run(true, false, argv[1]);
	}
}
