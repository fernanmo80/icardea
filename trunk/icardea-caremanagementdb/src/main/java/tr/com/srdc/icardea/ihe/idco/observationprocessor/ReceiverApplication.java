package tr.com.srdc.icardea.ihe.idco.observationprocessor;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javax.mail.internet.MimeUtility;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.xerces.parsers.DOMParser;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import tr.com.srdc.icardea.atnalog.client.Audit;

import tr.com.srdc.icardea.hibernate.CIEDData;
import tr.com.srdc.icardea.hibernate.ICardeaPersistentManager;
import tr.com.srdc.icardea.hibernate.Observation;
import tr.com.srdc.icardea.hibernate.Patient;
import tr.com.srdc.icardea.hibernate.PatientCriteria;
import tr.com.srdc.icardea.hibernate.Person;
import tr.com.srdc.icardea.hibernate.PersonCriteria;
import tr.com.srdc.icardea.ihe.cm.careManager.CareManager;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v25.datatype.CX;
import ca.uhn.hl7v2.model.v25.datatype.XTN;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v25.message.ADT_A01;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.NTE;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.PipeParser;

public class ReceiverApplication extends Thread {

	private Socket socket;
	private boolean inXML = true;
	private static final byte SB = 0x0b;
	private static final byte ACK = 0x06;
	private static final byte EB = 0x1c;
	private static final byte CR = 0x0d;
	private String base64String = null;
	private boolean atnatls;
	private boolean atnalog;

	private void processMSH(ORU_R01 oru, CIEDData ciedData) {
		MSH msh = oru.getMSH();
		String sendingApplication = msh.getSendingApplication()
				.getNamespaceID().getValue();
		String sendingFacility = msh.getSendingFacility().getNamespaceID()
				.getValue();
		String receivingApplication = msh.getReceivingApplication()
				.getNamespaceID().getValue();
		String receivingFacility = msh.getReceivingFacility().getNamespaceID()
				.getValue();
		String messageTime = msh.getDateTimeOfMessage().getTime().getValue();

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		ciedData.setReceivedTime(dateFormat.format(new Date()));

		ciedData.setSendingApplication(sendingApplication);
		ciedData.setSendingFacility(sendingFacility);
		ciedData.setReceivingApplication(receivingApplication);
		ciedData.setReceivingFacility(receivingFacility);
		ciedData.setMessageTime(messageTime);

	}

	// Citizenship number aslinda iCARDEA Id'si
	private void processPID(ORU_R01 oru, CIEDData ciedData) throws HL7Exception {
		Patient patient = null;
		Person person = null;
		PID pidSegment = oru.getPATIENT_RESULT().getPATIENT().getPID();
		String citizenshipID, givenName, familyName;

		String patientID = pidSegment.getPid3_PatientIdentifierList(0)
				.getCx1_IDNumber().getValue();
		if (pidSegment.getPid3_PatientIdentifierList().length > 1) {
			citizenshipID = pidSegment.getPid3_PatientIdentifierList(1)
					.getCx1_IDNumber().getValue();

			PatientCriteria patientCriteria = null;
			PersonCriteria personCriteria = null;
			try {
				patientCriteria = new PatientCriteria();
				personCriteria = new PersonCriteria();
			} catch (PersistentException ex) {
			}
			patientCriteria.citizenshipNumber.eq(citizenshipID);
			personCriteria.identifier.eq(citizenshipID);
			Patient[] patientList = Patient
					.listPatientByCriteria(patientCriteria);
			Person[] personList = Person.listPersonByCriteria(personCriteria);
			if (patientList != null && patientList.length > 0) {
				patient = patientList[0];
				person = personList[0];
			} else {
				patient = Patient.createPatient();
				patient.setCitizenshipNumber(citizenshipID);
				person = Person.createPerson();
				person.setIdentifier(citizenshipID);

			}
		} else {
			patient = Patient.createPatient();
			person = Person.createPerson();
		}
		patient.setPatientIdentifier(patientID);

		String assigningAuthority = pidSegment.getPid3_PatientIdentifierList(0)
				.getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(); // TODO:
																				// Validate
																				// from
																				// list:
																				// Table
																				// A.1
		String dateTimeOfBirth = pidSegment.getDateTimeOfBirth().getTime()
				.getValue();
		String administrativeSex = pidSegment.getAdministrativeSex().getValue();

		patient.setPatientIdentifier(patientID);
		patient.setAssigningAuthority(assigningAuthority);
		patient.setDateTimeOfBirth(dateTimeOfBirth);
		patient.setAdministrativeSex(administrativeSex);

		if (pidSegment.getPatientID().getIdentifierTypeCode() != null) {
			String identifierTypeCode = pidSegment.getPatientID()
					.getIdentifierTypeCode().getValue(); // OPTIONAL, Table 203
			patient.setIdentifierTypeCode(patientID);
		}
		if (pidSegment.getPatientName(0) != null) {
			if (pidSegment.getPatientName(0).getGivenName() != null) {
				givenName = pidSegment.getPatientName(0).getGivenName()
						.getValue(); // OPTIONAL
				patient.setGivenName(givenName);
				person.setName(givenName);
			}
			if (pidSegment.getPatientName(0).getFamilyName() != null) {
				familyName = pidSegment.getPatientName(0).getFamilyName()
						.getSurname().getValue(); // OPTIONAL
				patient.setFamilyName(familyName);
				person.setSurname(familyName);
			}
			if (pidSegment.getPatientName(0)
					.getSecondAndFurtherGivenNamesOrInitialsThereof() != null) {
				String secondName = pidSegment.getPatientName(0)
						.getSecondAndFurtherGivenNamesOrInitialsThereof()
						.getValue(); // OPTIONAL
				patient.setSecondName(secondName);
				person.setMiddleName(secondName);
			}
		}
		if (pidSegment.getPatientAddress(0) != null) {
			if (pidSegment.getPatientAddress(0).getStreetAddress() != null
					&& pidSegment.getPatientAddress(0).getStreetAddress()
							.getStreetName() != null) {
				String street = pidSegment.getPatientAddress(0)
						.getStreetAddress().getStreetName().getValue(); // OPTIONAL
				patient.setStreet(street);
			}
			if (pidSegment.getPatientAddress(0).getCity() != null) {
				String city = pidSegment.getPatientAddress(0).getCity()
						.getValue(); // OPTIONAL
				patient.setCity(city);
			}
			if (pidSegment.getPatientAddress(0).getZipOrPostalCode() != null) {
				String postalCode = pidSegment.getPatientAddress(0)
						.getZipOrPostalCode().getValue(); // OPTIONAL
				patient.setPostalCode(postalCode);
			}
			if (pidSegment.getPatientAddress(0).getCountry() != null) {
				String country = pidSegment.getPatientAddress(0).getCountry()
						.getValue(); // OPTIONAL
				patient.setCountry(country);
			}
		}

		Logger.getLogger(ReceiverApplication.class).log(
				Level.INFO,
				" *** Patient:\n" + " patientID = " + patientID
						+ " assigningAuthority = " + assigningAuthority
						+ " dateTimeOfBirth = " + dateTimeOfBirth
						+ " administrativeSex = " + administrativeSex);
		person.setRole("Patient");
		person.save();
		patient.cIEDData1.add(ciedData);

		// TODO: ATNA - DONE
		// Send ATNA Message: CIED Message is received for "+citizenshipID+"
		// "+givenName+" "+familyName from CIEDDataExposureService
		if (atnalog) {
			ResourceBundle properties = ResourceBundle.getBundle("icardea");
			String atnalogServer = properties.getString("atna.log.server");
			
			String xml = Audit.createMessage("PCD-9", patientID, "", "");
			Audit a = null;
			try {
				a = new Audit(atnalogServer, 2861);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            a.send_udp( a.create_syslog_xml("caremanager", xml) );
		}		
	}
	

	private void processPV1(ORU_R01 oru, CIEDData ciedData) throws HL7Exception {
		// PV1 Segment: Segment is OPTIONAL
		PV1 pv1Segment = oru.getPATIENT_RESULT().getPATIENT().getVISIT()
				.getPV1();
		if (pv1Segment != null) {
			Observation observation = Observation.createObservation();
			String patientClass = pv1Segment.getPatientClass().getValue();
			if (pv1Segment.getVisitNumber() != null
					&& pv1Segment.getVisitNumber().getIDNumber() != null) {
				String visitID = pv1Segment.getVisitNumber().getIDNumber()
						.getValue();
				observation.setVisitID(visitID);
			}
			observation.setPatientClass(patientClass);

			if (pv1Segment.getAttendingDoctor(0) != null
					&& pv1Segment.getAttendingDoctor(0).getIDNumber() != null) {
				String attendingDoctorID = pv1Segment.getAttendingDoctor(0)
						.getIDNumber().getValue(); // OPTIONAL
				observation.setAttendingDoctorID(attendingDoctorID);
			}
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					" *** Visit:\n" + " patientClass = " + patientClass);

			ciedData.setObservationfillerOrderNumber(observation);
		}
	}

	private void processOBR(ORU_R01 oru, CIEDData ciedData) {
		ORU_R01_ORDER_OBSERVATION orderObservation = oru.getPATIENT_RESULT()
				.getORDER_OBSERVATION();
		OBR obr = orderObservation.getOBR();
		String fillerOrderNumber = obr.getFillerOrderNumber()
				.getEntityIdentifier().getValue(); // session identifier
		String universalServiceIdentifier = obr.getUniversalServiceIdentifier()
				.getIdentifier().getValue(); // TODO: Values: Table 4.12-7
		String observationDateTime = obr.getObservationDateTime().getTime()
				.getValue();

		Observation observation = ciedData.getObservationfillerOrderNumber();
		if (observation == null) {
			observation = Observation.createObservation();
		}
		observation.setFillerOrderNumber(fillerOrderNumber);
		observation.setUniversalServiceIdentifier(universalServiceIdentifier);
		observation.setObservationDateTime(observationDateTime);

		if (obr.getObservationEndDateTime() != null
				&& obr.getObservationEndDateTime().getTime() != null) {
			String observationEndDateTime = obr.getObservationEndDateTime()
					.getTime().getValue(); // OPTIONAL
			observation.setObservationEndDataTime(observationEndDateTime);
		}
		String resultRptStatusChangeDateTime = obr
				.getResultsRptStatusChngDateTime().getTime().getValue();
		String resultStatus = obr.getResultStatus().getValue(); // TODO: Values:
																// Table
																// 3.Y.4.1.2-8
		observation
				.setResultRptStatusChangeDateTime(resultRptStatusChangeDateTime);
		observation.setResultStatus(resultStatus);
		ciedData.setObservationfillerOrderNumber(observation);
		Logger.getLogger(ReceiverApplication.class).log(
				Level.INFO,
				" *** oBSERVATION:\n" + " fillerOrderNumber = "
						+ fillerOrderNumber + " universalServiceIdentifier = "
						+ universalServiceIdentifier
						+ " observationDateTime = " + observationDateTime
						+ " resultRptStatusChangeDateTime = "
						+ resultRptStatusChangeDateTime + " resultStatus = "
						+ resultStatus);
	}

	private void processOBX(ORU_R01 oru, CIEDData ciedData) throws HL7Exception {
		OBXHandler obxHandler = new OBXHandler(oru, ciedData, base64String,
				inXML);
		obxHandler.run();
	}

	private void processNTE(ORU_R01 oru, CIEDData ciedData) throws HL7Exception {
		NTE nteSegment = oru.getPATIENT_RESULT().getORDER_OBSERVATION()
				.getNTE();
		if (nteSegment != null) {
			String comment = nteSegment.getComment(0).getValue();
			ciedData.setComment(comment);
		}
	}

	private void printMessage(Message message) throws HL7Exception {
		String encodedMessage = new PipeParser().encode(message);
		String xmlMessage = new DefaultXMLParser().encode(message);
		Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
				encodedMessage);
		Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
				"ReceiverApplication got the message..." + xmlMessage);
	}

	public ReceiverApplication(Socket socket) {
		this.socket = socket;
		this.atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		this.atnalog = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.log")).booleanValue();
	}

	public void run() {
		String receivedMessage = null;
		try {
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Reading from the socket");
			InputStream in = socket.getInputStream();

			StringBuffer sb = new StringBuffer();
			int b = 0;
			while ((b = in.read()) != SB) {
			}
			while ((b = in.read()) != EB) {
				sb.append((char) b);
			}
			receivedMessage = sb.toString();
			while ((b = in.read()) != CR) {
			}
			OutputStream out = socket.getOutputStream();
			/*
			 * out.write(SB); out.write(ACK); out.write(EB); out.write(CR);
			 * out.flush();
			 */

			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Socket read and closed");
			Message message = null;
			if (receivedMessage.trim().startsWith("MSH")) {
				receivedMessage = receivedMessage.replaceFirst("\\|ADT\\^A31\\^ADT_A31\\|", "\\|ADT\\^A01\\^ADT_A01\\|");
				receivedMessage = receivedMessage.replaceFirst("\\|ADT\\^A31\\^ADT_05\\|", "\\|ADT\\^A01\\^ADT_A01\\|");
				receivedMessage = receivedMessage.replaceFirst("\\|ADT\\^A31\\^ADT_A05\\|", "\\|ADT\\^A01\\^ADT_A01\\|");
				receivedMessage = receivedMessage.replaceFirst("\\|ADT\\^A31\\|", "\\|ADT\\^A01\\|");
				receivedMessage = receivedMessage.replaceFirst("\\|P\\|2.3\\.1", "\\|P\\|2\\.5");
				inXML = false;
				message = new PipeParser().parse(receivedMessage);
			} else {
				inXML = true;
				DOMParser parser = new DOMParser();
				parser.parse(new org.xml.sax.InputSource(
						new java.io.StringReader(receivedMessage)));
				Document document = parser.getDocument();
				Element root = document.getDocumentElement();
				NodeList nodelist = root.getElementsByTagName("ED.5");
				this.base64String = "";
				for (int i = 0; i < nodelist.getLength(); i++) {
					Element element = (Element) nodelist.item(i);
					this.base64String = element.getFirstChild().getNodeValue();
					element.getFirstChild().setNodeValue("empty");
				}

				OutputFormat format = new OutputFormat(document); // Serialize
																	// DOM
				StringWriter stringOut = new StringWriter(); // Writer will be a
																// String
				XMLSerializer serial = new XMLSerializer(stringOut, format);
				serial.asDOMSerializer(); // As a DOM Serializer
				serial.serialize(root);
				receivedMessage = stringOut.toString();
				message = new DefaultXMLParser().parse(receivedMessage);
			}
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Received message:" + receivedMessage);

			String messageID = null;
			if (inXML) {
				messageID = processCIEDMessage(message);
			} else {
				messageID = processADTMessage(message);
			}

			// log the message
			if (messageID != null && !messageID.equals("")) {
				String fileName = messageID + ".hl7.xml";
				FileOutputStream fos = new FileOutputStream("logs/" + fileName);
				fos.write(receivedMessage.getBytes());
				fos.close();
			}
			//
			String ackString = "";
			if (inXML) {
				ackString = createAcknowledgementXML(messageID);
			} else {
				ackString = createAcknowledgement(messageID);
			}

			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Acknowledgement:" + ackString);

			out.write(SB);
			BufferedReader bf = new BufferedReader(new StringReader(new String(
					ackString)));
			StringBuilder messageBuffer = new StringBuilder();
			String line = "";
			while ((line = bf.readLine()) != null) {
				messageBuffer.append(line).append("\r");
			}
			out.write(messageBuffer.toString().getBytes());
			// dos.writeChars(stopCharacter);

			out.write(EB);
			out.write(CR);
			out.flush();

			/*
			 * while ((b = in.read()) != CR) {
			 * Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
			 * " Waiting for CR:"+b); }
			 */
			closeSocket();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private String createAcknowledgement(String messageID) {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String result = "MSH|^~\\&|||||" + dateFormat.format(new Date())
				+ "||ACK|3|P|2.5\n";
		result += "MSA|AA|" + messageID + "\n";
		return result;
	}

	private String createAcknowledgementXML(String messageID) {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String result = "<?xml version=\"1.0\"?>";
		result += "<ACK xmlns=\"urn:hl7-org:v2xml\">";
		result += "<MSH>";
		result += "<MSH.1>|</MSH.1>";
		result += "<MSH.2>^~\\&amp;</MSH.2>";
		result += "<MSH.7>";
		result += "<TS.1>" + dateFormat.format(new Date()) + "</TS.1>";
		result += "</MSH.7>";
		result += "<MSH.9>";
		result += "<MSG.1>ACK</MSG.1>";
		result += "</MSH.9>";
		result += "<MSH.10>5</MSH.10>";
		result += "<MSH.11>";
		result += "<PT.1>P</PT.1>";
		result += "</MSH.11>";
		result += "<MSH.12>";
		result += "<VID.1>2.5</VID.1>";
		result += "</MSH.12>";
		result += "</MSH>";
		result += "<MSA>";
		result += "<MSA.1>AA</MSA.1>";
		result += "<MSA.2>" + messageID + "</MSA.2>";
		result += "</MSA>";
		result += "</ACK>\n";
		return result;
	}

	public void closeSocket() {
		Logger.getLogger(ReceiverApplication.class)
				.log(Level.INFO,
						"Socket over Port: " + socket.getLocalPort()
								+ " is closing...");
		try {
			socket.close();
		} catch (java.io.IOException ex) {
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Problem during closing the Socket...");
			ex.printStackTrace();
		}
	}

	private String processADTMessage(Message message) throws Exception {
		// If it is not ADT_A01 then return
		Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
		"Processing ADT Message... "+ message.getClass().getName());
		if (!(message instanceof ADT_A01)) {
		Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
		"Message is not A05 or A31 message... "+ message.getClass().getName());
			return "";
		}

		ADT_A01 adt = (ADT_A01) message;
		PID pidSegment = adt.getPID();

		Patient patient = null;
		Person person = null;
		CX[] patientIdentifierList = pidSegment.getPid3_PatientIdentifierList();

		String patientID = "";
		String assigningAuthority = "iCARDEA";
		String citizenshipID = "";
		String orbisID = "";
		String email = "";
		String mobilePhone = "";
		String homePhone = "";

		for (int i = 0; i < patientIdentifierList.length; i++) {
			CX patientIdentifier = patientIdentifierList[i];
			String namespace = patientIdentifier.getAssigningAuthority()
					.getNamespaceID().getValue();
			String identifier = patientIdentifier.getIDNumber().getValue();
			if (namespace.equalsIgnoreCase("icardea.pix")) {
				citizenshipID = identifier;
			} else if (namespace.equalsIgnoreCase("orbis")) {
				orbisID = identifier;
			} else if (namespace.equalsIgnoreCase("cied")) {
				patientID = identifier;
			}

		}

		PatientCriteria patientCriteria = null;
		PersonCriteria personCriteria = null;
		try {
			patientCriteria = new PatientCriteria();
			personCriteria = new PersonCriteria();
		} catch (PersistentException ex) {
		}
		patientCriteria.citizenshipNumber.eq(citizenshipID);
		personCriteria.identifier.eq(citizenshipID);
		Patient[] patientList = Patient.listPatientByCriteria(patientCriteria);
		Person[] personList = Person.listPersonByCriteria(personCriteria);
		if (patientList != null && patientList.length > 0) {
			patient = patientList[0];
			person = personList[0];
		} else {
			patient = Patient.createPatient();
			patient.setCitizenshipNumber(citizenshipID);
			person = Person.createPerson();
			person.setIdentifier(citizenshipID);
		}
		patient.setPatientIdentifier(patientID);

		String givenName = "";
		String familyName = "";
		String dateTimeOfBirth = pidSegment.getDateTimeOfBirth().getTime()
				.getValue();
		String administrativeSex = pidSegment.getAdministrativeSex().getValue();

		patient.setPatientIdentifier(patientID);
		patient.setAssigningAuthority(assigningAuthority);
		patient.setDateTimeOfBirth(dateTimeOfBirth);
		patient.setAdministrativeSex(administrativeSex);

		if (pidSegment.getPatientID().getIdentifierTypeCode() != null) {
			String identifierTypeCode = pidSegment.getPatientID()
					.getIdentifierTypeCode().getValue(); // OPTIONAL, Table 203
			patient.setIdentifierTypeCode(patientID);
		}
		if (pidSegment.getPatientName(0) != null) {
			if (pidSegment.getPatientName(0).getGivenName() != null) {
				givenName = pidSegment.getPatientName(0).getGivenName()
						.getValue(); // OPTIONAL
				patient.setGivenName(givenName);
				person.setName(givenName);
			}
			if (pidSegment.getPatientName(0).getFamilyName() != null) {
				familyName = pidSegment.getPatientName(0).getFamilyName()
						.getSurname().getValue(); // OPTIONAL
				patient.setFamilyName(familyName);
				person.setSurname(familyName);
			}
			if (pidSegment.getPatientName(0)
					.getSecondAndFurtherGivenNamesOrInitialsThereof() != null) {
				String secondName = pidSegment.getPatientName(0)
						.getSecondAndFurtherGivenNamesOrInitialsThereof()
						.getValue(); // OPTIONAL
				patient.setSecondName(secondName);
				person.setMiddleName(secondName);
			}
		}
		if (pidSegment.getPatientAddress(0) != null) {
			if (pidSegment.getPatientAddress(0).getStreetAddress() != null
					&& pidSegment.getPatientAddress(0).getStreetAddress()
							.getStreetName() != null) {
				String street = pidSegment.getPatientAddress(0)
						.getStreetAddress().getStreetName().getValue(); // OPTIONAL
				patient.setStreet(street);
			}
			if (pidSegment.getPatientAddress(0).getCity() != null) {
				String city = pidSegment.getPatientAddress(0).getCity()
						.getValue(); // OPTIONAL
				patient.setCity(city);
			}
			if (pidSegment.getPatientAddress(0).getZipOrPostalCode() != null) {
				String postalCode = pidSegment.getPatientAddress(0)
						.getZipOrPostalCode().getValue(); // OPTIONAL
				patient.setPostalCode(postalCode);
			}
			if (pidSegment.getPatientAddress(0).getCountry() != null) {
				String country = pidSegment.getPatientAddress(0).getCountry()
						.getValue(); // OPTIONAL
				patient.setCountry(country);
			}
		}
		XTN[] contactNumbers = pidSegment.getPhoneNumberHome();

		for (int i = 0; i < contactNumbers.length; i++) {
			XTN contactNumber = contactNumbers[i];
			String useCode = contactNumber.getTelecommunicationUseCode()
					.getValue();
			if (useCode.equals("PRN")) {
				homePhone = contactNumber.getTelephoneNumber().getValue();
			} else if (useCode.equals("PRS")) {
				mobilePhone = contactNumber.getTelephoneNumber().getValue();
			} else if (useCode.equals("NET")) {
				email = contactNumber.getTelephoneNumber().getValue();
			}
		}

		Logger.getLogger(ReceiverApplication.class).log(
				Level.INFO,
				" *** Patient:\n" + " patientID = " + patientID
						+ " givenName = " + givenName + " familyName = "
						+ familyName + " email = " + email + " phone = "
						+ homePhone + " mobile = " + mobilePhone
						+ " citizenshipID = " + citizenshipID
						+ " administrativeSex = " + administrativeSex);
		person.setRole("Patient");
		person.save();

		addPatient(citizenshipID, givenName, familyName, dateTimeOfBirth,
				administrativeSex);
		Person newPerson = addPerson(citizenshipID, givenName, familyName);

		addContact(newPerson, email, mobilePhone, homePhone);

		// TODO: ATNA
		// Send ATNA Message: Patient registration message is received for
		// "+citizenshipID+"
		// "+givenName+" "+familyName from Hospital Information System
		if (atnalog) {
			ResourceBundle properties = ResourceBundle.getBundle("icardea");
			String atnalogServer = properties.getString("atna.log.server");
			
			String xml = Audit.createMessage("register", patientID, "", "");//TODO:registration message
			Audit a = null;
			try {
				a = new Audit(atnalogServer, 2861);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            a.send_udp( a.create_syslog_xml("caremanager", xml) );
		}
		
		// subscribe to EHR and PHR Data sources...
		Subscriber subscriber = new Subscriber(citizenshipID, givenName, familyName);
		subscriber.start();

		return adt.getMSH().getMessageControlID().getValue();
	}

	private class Subscriber extends Thread {
		private String patientID;
		private String givenName;
		private String familyName;

		public Subscriber(String patientID, String givenName, String familyName) {
			this.patientID = patientID;
			this.givenName = givenName;
			this.familyName = familyName;
		}

		public void run() {
			try {
				(new CareManager()).subscribeToDataSources(patientID,
						givenName, familyName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public tr.com.srdc.icardea.hibernate.Contact addContact(
			tr.com.srdc.icardea.hibernate.Person personInDB, String email,
			String mobilePhone, String homePhone) throws Exception {
		System.out.println(" $$$ Adding contact for:"
				+ personInDB.getIdentifier());
		PersistentTransaction transaction = ICardeaPersistentManager.instance()
				.getSession().beginTransaction();
		tr.com.srdc.icardea.hibernate.Contact contactInDB = personInDB
				.getContact();
		if (contactInDB == null) {
			contactInDB = new tr.com.srdc.icardea.hibernate.Contact();
		}
		contactInDB.setEmail(email);
		contactInDB.setMobileNumber(mobilePhone);
		contactInDB.setPhoneNumber(homePhone);
		contactInDB.setAddressLine("Address");
		contactInDB.setFaxNumber(homePhone);
		contactInDB.setGTalk("gtalk");

		contactInDB.save();
		personInDB.setContact(contactInDB);
		personInDB.save();
		transaction.commit();
		return contactInDB;
	}

	public tr.com.srdc.icardea.hibernate.Patient addPatient(String pid,
			String name, String surname, String birthDate, String gender)
			throws Exception {

		/*
		 * if (birthDate.indexOf("-") < 0) { String[] parts =
		 * birthDate.split("/"); birthDate = parts[2] + "-" + parts[1] + "-" +
		 * parts[0]; }
		 */
		tr.com.srdc.icardea.hibernate.Patient patient = null;
		PersistentTransaction transaction = ICardeaPersistentManager.instance()
				.getSession().beginTransaction();
		PatientCriteria criteria = null;
		try {
			criteria = new PatientCriteria();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		criteria.citizenshipNumber.eq(pid);
		tr.com.srdc.icardea.hibernate.Patient[] patients = tr.com.srdc.icardea.hibernate.Patient
				.listPatientByCriteria(criteria);
		System.out.println(" $$$ Adding patient:" + name + " " + pid);
		if (patients.length > 0) {
			patient = patients[0];
			System.out.println(" $$$ Patient exist in the DB:" + name);
		} else {
			System.out.println(" $$$ Adding new patient:" + name);
			patient = new tr.com.srdc.icardea.hibernate.Patient();

			// TODO: Delete in the future
			try {
				ResourceBundle properties = ResourceBundle.getBundle("icardea");
				String username = properties.getString("mysql.username");
				String password = properties.getString("mysql.password");
				String url = properties.getString("mysql.host");
				String jdbcDriver = properties
						.getString("jdbc.driverClassName");
				String jdbcURL = "jdbc:mysql://" + url + "/final_icardea";

				Class.forName(jdbcDriver).newInstance();

				Connection conn = DriverManager.getConnection(jdbcURL,
						username, password);
				Statement s = conn.createStatement();
				System.out.println("Query:"+ "select patientcode from patient where patientcode = " + pid);
				ResultSet resultSet = s
						.executeQuery("select patientcode from patient where patientcode = "
								+ pid);

				if (!resultSet.next()) {
					Statement s1 = conn.createStatement();
					s1.executeUpdate("INSERT INTO patient VALUES ('" + pid
							+ "'," + pid + ",'" + name + " " + surname + "','"
							+ birthDate + "','" + gender
							+ "',170,60,'A','Salzburg, Austria',NULL)");
					s1.close();
				}
				s.close();
				conn.close();

			} catch (Exception ex) {
				ex.printStackTrace();
			}
			// TODO
		}
		System.out.println(" $$$ Adding patient:" + name);

		patient.setAdministrativeSex(gender);
		patient.setCitizenshipNumber(pid);
		patient.setCity("Salzburg");
		patient.setCountry("Austria");
		patient.setDateTimeOfBirth(birthDate);
		patient.setFamilyName(surname);
		patient.setGivenName(name);
		patient.save();
		transaction.commit();
		return patient;
	}

	public tr.com.srdc.icardea.hibernate.Person addPerson(String id,
			String name, String surname) throws Exception {
		PersistentTransaction transaction = ICardeaPersistentManager.instance()
			.getSession().beginTransaction();
		System.out.println(" $$$ Adding person:" + name);
		tr.com.srdc.icardea.hibernate.Person personInDB = null;
		PersonCriteria personCriteria = null;
		try {
			personCriteria = new PersonCriteria();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		personCriteria.identifier.eq(id);
		tr.com.srdc.icardea.hibernate.Person[] persons = tr.com.srdc.icardea.hibernate.Person
			.listPersonByCriteria(personCriteria);
		if (persons.length > 0) {
			System.out.println(" $$$ Person already in the DB:" + name);
			personInDB = persons[0];
		} else {
			personInDB = new tr.com.srdc.icardea.hibernate.Person();
			System.out.println(" $$$ Creating new person:" + name);
		}
		personInDB.setIdentifier(id);
		personInDB.setName(name);
		personInDB.setSurname(surname);
		personInDB.save();
		transaction.commit();
		return personInDB;
	}

	public String processCIEDMessage(Message message)
		throws ApplicationException, HL7Exception {
		// printMessage(message);
	// System.out.println("ReceiverApplication got the message..." + new
// DefaultXMLParser().encode(message));
		System.out.println("ReceiverApplication processCIEDMessage");
		Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
				"Receiving the message");
		ORU_R01 oru = (ORU_R01) message;
		Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
				"Message received");
		PersistentTransaction transaction = null;
		try {
			transaction = ICardeaPersistentManager.instance().getSession()
				.beginTransaction();
			CIEDData ciedData = CIEDData.createCIEDData();
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Processing MSH");
			processMSH(oru, ciedData);
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Processing PID");
			processPID(oru, ciedData);
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Processing PV1");
			processPV1(oru, ciedData);
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Processing OBR");
			processOBR(oru, ciedData);
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Processing OBX");
			processOBX(oru, ciedData);
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Processing NTE");
			processNTE(oru, ciedData);

			// Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
			// "CIED Data:\n" + ciedData.toString());
			// System.out.println("CIED Data:\n" +ciedData.toString());
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Saving CIED Data");
			ciedData.getPatient1().save();
			ciedData.save();
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Committing CIED Data");
			transaction.commit();
			Logger.getLogger(ReceiverApplication.class).log(Level.INFO,
					"Committed CIED Data");
		} catch (PersistentException ex) {
			try {
				transaction.rollback();
			} catch (PersistentException ex1) {
				ex1.printStackTrace();
			}
		}
		return oru.getMSH().getMessageControlID().getValue();
	}

	private static byte[] decodeAndWriteToFile(byte[] b, String fileName)
		throws Exception {
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		InputStream b64is = MimeUtility.decode(bais, "base64");
		byte[] tmp = new byte[b.length];
		int n = b64is.read(tmp);
		byte[] res = new byte[n];
		System.arraycopy(tmp, 0, res, 0, n);
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			fos.write(res);
			fos.close();
		} catch (Exception ex) {
		}
		return res;
	}
}
