package tr.com.srdc.icardea.careplanengine.alarmSystem;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers.MessageActionHandler;
import tr.com.srdc.icardea.careplanengine.alarmSystem.alarmOntology.AlarmMessage;
import tr.com.srdc.icardea.careplanengine.alarmSystem.alarmOntology.MessageContent;
import tr.com.srdc.icardea.careplanengine.alarmSystem.alarmOntology.PatientInfo;
import tr.com.srdc.icardea.hibernate.ICardeaPersistentManager;
import tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment;
import tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignmentCriteria;
import tr.com.srdc.icardea.hibernate.PersonCriteria;

//~--- JDK imports ------------------------------------------------------------

import java.sql.Connection;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class HPAAlarmHandlerThread extends Thread {
	private AlarmMessage alarmMessage;
	private Connection connection;
	public static Logger logger = Logger.getLogger(HPAAlarmHandlerThread.class);

	public HPAAlarmHandlerThread(AlarmMessage alarmMessage) {
		this.alarmMessage = alarmMessage;
	}

	public void run() {
		handleAlarmMessage(alarmMessage);
	}

	private void handleAlarmMessage(AlarmMessage alarmMessage) {
		PatientInfo patientInfo = alarmMessage.getPatientInfo();
		MessageContent messageContent = alarmMessage.getMessageContent();
		String assignmentID = patientInfo.getAssignmentID();

		// [itasyurt 22.09.06]form message body and subject here not to do it
		// repeatedly
		// so communciation medium will deal only with transport
		// / Form message subject
		String messageSubject = "iCARDEA Alarm Message";

		// gets the name of the urgency and appends it to the message
		int urgency = messageContent.getUrgency();
		String urgencyName = AlarmDatabaseConnection.getUrgencyName(urgency);

		messageSubject += ": " + urgencyName;

		// Form The Message body
		String messageBody = "";

		// if it is a routed message append the router user's name from the
		// message

		messageBody += patientInfo.toString();
		messageBody += "Urgency:" + urgencyName + ", ";
		messageBody += messageContent.getContent() + ".";

		logger.info(" Message Body:" + messageBody);

		String patientId = patientInfo.getPatientID();

		tr.com.srdc.icardea.hibernate.Person personInDB = null;
		PersonCriteria personCriteria = null;
		try {
			personCriteria = new PersonCriteria();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		personCriteria.identifier.eq(patientId);
		tr.com.srdc.icardea.hibernate.Person[] persons = tr.com.srdc.icardea.hibernate.Person
				.listPersonByCriteria(personCriteria);
		personInDB = persons[0];

		tr.com.srdc.icardea.hibernate.Contact contact = personInDB.getContact();
		String patientEMail = null, patientPhoneNumber = null;
		if (contact != null) {
			patientEMail = contact.getEmail();
			patientPhoneNumber = contact.getPhoneNumber();
		}

		PatientHealthcareActorAssignmentCriteria caregiverAssignmentCriteria = null;
		try {
			caregiverAssignmentCriteria = new PatientHealthcareActorAssignmentCriteria();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		caregiverAssignmentCriteria.patientIdentifier.eq(patientId);
		PatientHealthcareActorAssignment[] assignments = PatientHealthcareActorAssignment
				.listPatientHealthcareActorAssignmentByCriteria(caregiverAssignmentCriteria);

		Vector<String> phoneNumbers = new Vector();
		Vector<String> emails = new Vector();

		if (patientEMail != null)
			emails.addElement(patientEMail);
		if (patientPhoneNumber != null)
			phoneNumbers.addElement(patientPhoneNumber);

		// TODO: Ileride burayi GUI'den yapacagiz ve bu alttarafi kaldiracagiz...
		if (assignments.length == 0) {
			try {
				
				String doctorName = "Michael";
				String doctorSurname = "Jones";
				String doctorID = "1387";
				String doctorEmail = "yildiraykabak@gmail.com";
				String doctorMobile = "00905052319177";
				
				PersistentTransaction transaction = ICardeaPersistentManager
						.instance().getSession().beginTransaction();

				tr.com.srdc.icardea.hibernate.Person careGiver = new tr.com.srdc.icardea.hibernate.Person();
				careGiver.setName(doctorName);
				careGiver.setSurname(doctorSurname);
				careGiver.setIdentifier(doctorID);

				tr.com.srdc.icardea.hibernate.Contact contactInDB = new tr.com.srdc.icardea.hibernate.Contact();

				contactInDB.setEmail(doctorEmail);
				contactInDB.setMobileNumber(doctorMobile);
				contactInDB.setPhoneNumber(doctorMobile);
				contactInDB.save();
				
				careGiver.setContact(contactInDB);
				careGiver.save();
				
				PatientHealthcareActorAssignment assignment = new PatientHealthcareActorAssignment();
				assignment.setHealthcareActorIdentifier(doctorID);
				assignment.setPatientIdentifier(patientId);
				assignment.save();
				
				transaction.commit();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		// YUKARIYI KALDIR....

		for (int j = 0; j < assignments.length; j++) {
			PatientHealthcareActorAssignment assignment = assignments[j];
			String careGiverID = assignment.getHealthcareActorIdentifier();

			PersonCriteria criteria = null;
			try {
				criteria = new PersonCriteria();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			criteria.identifier.eq(careGiverID);

			tr.com.srdc.icardea.hibernate.Person[] careGivers = tr.com.srdc.icardea.hibernate.Person
					.listPersonByCriteria(criteria);
			if (careGivers.length > 0) {
				tr.com.srdc.icardea.hibernate.Person careGiverInDB = careGivers[0];

				logger.info(" $$$ Caregiver:" + careGiverInDB.getIdentifier()
						+ " for patient:" + patientId);
				tr.com.srdc.icardea.hibernate.Contact careGiverContactInDB = careGiverInDB
						.getContact();
				if (careGiverContactInDB != null) {
					phoneNumbers.addElement(careGiverContactInDB
							.getPhoneNumber());
					emails.addElement(careGiverContactInDB.getEmail());
				}
			}
		}
		logger.info(" Sending " + urgencyName + " to " + phoneNumbers.size()
				+ " contacts.");
		for (int i = 0; i < phoneNumbers.size(); i++) {
			String phone = phoneNumbers.elementAt(i);
			String email = emails.elementAt(i);
			switch (urgency) {
			case 1:
				CommunicationMedium.sendInstantMessage("", messageBody);
				break;
			case 2:
				if (email != null) {
					logger.info(" Sending email to:" + email);
					CommunicationMedium.sendEMail(email, messageSubject,
							messageBody);
				}
				break;
			case 3:
				/*
				 * if (email != null) { logger.info(" Sending email to:" +
				 * email); CommunicationMedium.sendEMail(email, messageSubject,
				 * messageBody); }
				 */

				if (phone != null) {
					logger.info(" Sending sms to:" + phone);
					CommunicationMedium.sendSMS(phone, messageBody);
				}
				break;
			}
		}
	}
}

// ~ Formatted by Jindent --- http://www.jindent.com
