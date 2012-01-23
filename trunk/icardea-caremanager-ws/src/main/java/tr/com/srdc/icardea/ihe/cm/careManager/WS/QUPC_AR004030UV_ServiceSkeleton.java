/**
 * QUPC_AR004030UV_ServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
package tr.com.srdc.icardea.ihe.cm.careManager.WS;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.ResourceBundle;

import javax.mail.internet.MimeUtility;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hl7.v3.ANY;
import org.hl7.v3.CD;
import org.hl7.v3.CE;
import org.hl7.v3.COCTMT050000UVPatient;
import org.hl7.v3.ED;
import org.hl7.v3.EnFamily;
import org.hl7.v3.EnGiven;
import org.hl7.v3.II;
import org.hl7.v3.IVLTS;
import org.hl7.v3.IVXBTS;
import org.hl7.v3.MCCIMT000300UV01Sender;
import org.hl7.v3.PN;
import org.hl7.v3.POCDMT000040Act;
import org.hl7.v3.POCDMT000040Encounter;
import org.hl7.v3.POCDMT000040EntryRelationship;
import org.hl7.v3.POCDMT000040LabeledDrug;
import org.hl7.v3.POCDMT000040Observation;
import org.hl7.v3.POCDMT000040ObservationMedia;
import org.hl7.v3.POCDMT000040PlayingEntity;
import org.hl7.v3.POCDMT000040Procedure;
import org.hl7.v3.POCDMT000040SubstanceAdministration;
import org.hl7.v3.PQ;
import org.hl7.v3.QUPCIN043200UV01MFMIMT700712UV01ControlActProcess;
import org.hl7.v3.REPCMT004000UV01CareProvisionEvent;
import org.hl7.v3.REPCMT004000UV01PertinentInformation5;
import org.hl7.v3.SXCMTS;
import org.orm.PersistentTransaction;

import tr.com.srdc.icardea.hibernate.Concern;
import tr.com.srdc.icardea.hibernate.EHRPHRData;
import tr.com.srdc.icardea.hibernate.EHRPHRDataCriteria;
import tr.com.srdc.icardea.hibernate.Encounter;
import tr.com.srdc.icardea.hibernate.ICardeaPersistentManager;
import tr.com.srdc.icardea.hibernate.ImagingResult;
import tr.com.srdc.icardea.hibernate.Medication;
import tr.com.srdc.icardea.hibernate.MedicationCriteria;
import tr.com.srdc.icardea.hibernate.Patient;
import tr.com.srdc.icardea.hibernate.PatientCriteria;
import tr.com.srdc.icardea.hibernate.Person;
import tr.com.srdc.icardea.hibernate.PersonCriteria;
import tr.com.srdc.icardea.hibernate.Problem;
import tr.com.srdc.icardea.hibernate.ProblemCriteria;
import tr.com.srdc.icardea.hibernate.Procedure;
import tr.com.srdc.icardea.hibernate.VitalSign;
import tr.com.srdc.icardea.atnalog.client.Audit;

/**
 *  QUPC_AR004030UV_ServiceSkeleton java skeleton for the axisService
 */
public class QUPC_AR004030UV_ServiceSkeleton {

	/**
	 * Auto generated method signature
	 *
	 * @param qUPC_IN043200UV01
	 */
	public org.hl7.v3.MCCIIN000002UV01 qUPC_AR004030UV_QUPC_IN043200UV(
		org.hl7.v3.QUPCIN043200UV01 pcc10) throws Exception {
		
		boolean atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		boolean atnalog = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.log")).booleanValue();
		
		QUPCIN043200UV01MFMIMT700712UV01ControlActProcess controlAct = pcc10.getControlActProcess();
		// Newly added to identify the sender of the message
		String senderName = "PHR";
		MCCIMT000300UV01Sender sender = pcc10.getSender();
		List<II> senderID = sender.getDevice().getId();
		if (senderID.size() > 0 && senderID.get(0).getExtension() != null && !senderID.get(0).getExtension().trim().equals("")) {
			senderName = senderID.get(0).getExtension().trim();
		}
		REPCMT004000UV01CareProvisionEvent careProvisionEvent = controlAct.getSubject().get(0).getRegistrationEvent().getSubject2().getCareProvisionEvent();
		COCTMT050000UVPatient patient = careProvisionEvent.getRecordTarget().getValue().getPatient().getValue();

		PersistentTransaction transaction = null;
		transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();

		String pcc9QueryID = controlAct.getQueryAck().getQueryId().getExtension();
		String patientID = patient.getId().get(0).getExtension();

		// log the message
		DateFormat dateFormatForLog = new SimpleDateFormat("yyyyMMddHHmmss");
		Date dateForLog = new Date();
		String fileName = "logs/"+senderName + "-" + patientID +"-"+ dateFormatForLog.format(dateForLog)+".xml" ;
		Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " Marshalling to file "+fileName);	
		javax.xml.bind.JAXBContext jc = javax.xml.bind.JAXBContext.newInstance("org.hl7.v3");
            	javax.xml.bind.Marshaller marsh = jc.createMarshaller();
	        marsh.marshal( pcc10, new FileOutputStream(fileName) );
		//

		// TODO: patient database'de var mi yok mu once onu kontrol et. Yani HISPatientService'e bak, id'sini bul ve ona gore islem yap
		// TODO: gelen id'nin ciednumber'i degilde citizenship number oldugu assume ediliyor...
		// TODO: Ilk sirada gelen given name olmayabilir. Bu durumda kontrol et...
		PN name = patient.getPatientPerson().getValue().getName().get(0);
		String patientName = ((EnGiven) ((JAXBElement) name.getContent().get(0)).getValue()).getContent();
		String patientSurname = ((EnFamily) ((JAXBElement) name.getContent().get(1)).getValue()).getContent();
		

		PatientCriteria patientCriteria = new PatientCriteria();
		patientCriteria.citizenshipNumber.eq(patientID);
		Patient[] patientList = Patient.listPatientByCriteria(patientCriteria);
		
		PersonCriteria personCriteria = new PersonCriteria();
		personCriteria.identifier.eq(patientID);
		Person[] personList = Person.listPersonByCriteria(personCriteria);
		
		Patient patientDB;
		Person personDB;
		if (patientList != null && patientList.length == 0) {
			patientDB = Patient.createPatient();
			patientDB.setCitizenshipNumber(patientID);
			patientDB.setGivenName(patientName);
			patientDB.setFamilyName(patientSurname);
			
			personDB = Person.createPerson();
			personDB.setIdentifier(patientID);
			personDB.setName(patientName);
			personDB.setSurname(patientSurname);
			personDB.setRole("Patient");
		} else {
			patientDB = patientList[0];
			personDB = personList[0];
		}

		Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, "QueryID: " + pcc9QueryID + " PatientID: " + patientID
			+ " PatientName: " + patientName + " PatientSurname: " + patientSurname);
		// TODO: pcc9QueryID'yi kullanarak DB'de ne istedigine bak ve burada onu cek.
		String careProvisionCode = identifyCareProvisionCode(pcc9QueryID);

		// TODO: ATNA - DONE
		// Send ATNA Message: Medical information (PCC-10) is received from "+senderName+" for "+patientID+"
		// "+patientName+" "+patientSurname. And the information type is careProvisionCode.
		if (atnalog) {
			ResourceBundle properties = ResourceBundle.getBundle("icardea");
			String atnalogServer = properties.getString("atna.log.server");
			
			String xml = Audit.createMessage("PCC-10", patientID, careProvisionCode, "");
			Audit a = null;
			try {
				a = new Audit(atnalogServer, 2861);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            a.send_udp( a.create_syslog_xml("caremanager", xml) );
		}
		
		List<REPCMT004000UV01PertinentInformation5> pertinentInformationList = careProvisionEvent.getPertinentInformation3();

		for (int i = 0; i < pertinentInformationList.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pertinentInformation = pertinentInformationList.get(i);

			EHRPHRData ehrPhrData = EHRPHRData.createEHRPHRData();
			if (senderName.equals("PHR")) {
				ehrPhrData.setIsEHR(0);
			} else {
				ehrPhrData.setIsEHR(1);
			}

			ehrPhrData.setPcc9QueryId(pcc9QueryID);
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

			Date date = new Date();

			// TODO: Burayi configurable yapacagiz
			ResourceBundle properties = ResourceBundle.getBundle("icardea");
			String configuredDate = properties.getString("current.date");
			if (!configuredDate.equals("system")) {
				date = new SimpleDateFormat("yyyyMMdd").parse(configuredDate);
			}

			ehrPhrData.setMessageDateTime(dateFormat.format(date));
			patientDB.eHRPHRData.add(ehrPhrData);

			if (careProvisionCode.equals("9279-1") || careProvisionCode.equals("8867-4") || careProvisionCode.equals("2710-2")
				|| careProvisionCode.equals("8480-6") || careProvisionCode.equals("8462-4") || careProvisionCode.equals("8310-5")
				|| careProvisionCode.equals("8302-2") || careProvisionCode.equals("8306-3") || careProvisionCode.equals("8287-5")
				|| careProvisionCode.equals("3141-9")) {
				POCDMT000040Observation observation = pertinentInformation.getObservation().getValue();
				String vitalSignCode = observation.getCode().getCode();
				if (!vitalSignCode.equals(careProvisionCode)) {
					throw new Exception("The query was sent for " + careProvisionCode + ", but the result is return for " + vitalSignCode);
				}
				PQ valuePQ = (PQ) observation.getValue().get(0);
				String effectiveTime = observation.getEffectiveTime().getValue();
				String unit = valuePQ.getUnit();
				String value = valuePQ.getValue();

				VitalSign vitalSign = VitalSign.createVitalSign();
				vitalSign.setCareProvisionCode(careProvisionCode);
				vitalSign.setEffectiveTime(effectiveTime);
				vitalSign.setUnit(unit);
				vitalSign.setValue(value);
				ehrPhrData.setVitalSign(vitalSign);

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Vital Sign: "
					+ "vitalSignCode:" + vitalSignCode
					+ " effectiveTime:" + effectiveTime + " unit:" + unit + " value:" + value);
			} else if (careProvisionCode.equals("COBSCAT")) {
				POCDMT000040Observation observation = pertinentInformation.getObservation().getValue();
				String vitalSignCode = observation.getCode().getCode();
				if (!(vitalSignCode.equals("9279-1") || vitalSignCode.equals("8867-4") || vitalSignCode.equals("2710-2")
					|| vitalSignCode.equals("8480-6") || vitalSignCode.equals("8462-4") || vitalSignCode.equals("8310-5")
					|| vitalSignCode.equals("8302-2") || vitalSignCode.equals("8306-3") || vitalSignCode.equals("8287-5")
					|| vitalSignCode.equals("3141-9"))) {
					throw new Exception("Wrong vital code " + vitalSignCode);
				}
				PQ valuePQ = (PQ) observation.getValue().get(0);
				String effectiveTime = observation.getEffectiveTime().getValue();
				String unit = valuePQ.getUnit();
				String value = valuePQ.getValue();

				VitalSign vitalSign = VitalSign.createVitalSign();
				vitalSign.setEffectiveTime(effectiveTime);
				vitalSign.setUnit(unit);
				vitalSign.setValue(value);
				vitalSign.setCareProvisionCode(vitalSignCode);
				ehrPhrData.setVitalSign(vitalSign);

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Vital Sign: "
					+ " vitalSignCode:" + vitalSignCode
					+ " effectiveTime:" + effectiveTime + " unit:" + unit + " value:" + value);
			} else if (careProvisionCode.equals("MEDCCAT")) {
				POCDMT000040Observation observation = pertinentInformation.getObservation().getValue();
				String problemCode = observation.getCode().getCode();
				String problemText = "";
				if(observation.getText() != null)
					problemText = observation.getText().getContent();
				String effectiveTimeLow = ((IVXBTS) observation.getEffectiveTime().getRest().get(0).getValue()).getValue();
				String effectiveTimeHigh = " ";
				if (observation.getEffectiveTime().getRest().size() > 1) {
					effectiveTimeHigh = ((IVXBTS) observation.getEffectiveTime().getRest().get(1).getValue()).getValue();
				}
				CD valueCD = (CD) observation.getValue().get(0);
				String problemValue = valueCD.getCode();
				String problemValueCodeSystem = valueCD.getCodeSystem();
				String problemValueCodeSystemName = valueCD.getCodeSystemName();
				String problemValueOriginalText = valueCD.getDisplayName();

				problemValue = translateCode(problemValue, problemValueCodeSystem, problemValueCodeSystemName);

				// It is assumed that all the codes in the CareManagementDB should be in UMLS

				String severity = "M";
				if (observation.getEntryRelationship() != null && observation.getEntryRelationship().size() > 0) {
					POCDMT000040EntryRelationship entryRelationShip = observation.getEntryRelationship().get(0);
					POCDMT000040Observation observation1 = entryRelationShip.getObservation();
					String code = observation1.getCode().getCode();
					String value = ((CD) observation1.getValue().get(0)).getCode();
					if (code.equals("SEV")) {
						severity = value;
					}
				}

				ProblemCriteria criteria = new ProblemCriteria();
				criteria.problemValue.eq(problemValue);
				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (senderName.equals("PHR")) {
					ehrPhrDataCriteria.isEHR.eq(0);
				} else {
					ehrPhrDataCriteria.isEHR.eq(1);
				}
				PatientCriteria patientCriteriaNew = ehrPhrDataCriteria.createPatientCriteria();
				patientCriteriaNew.citizenshipNumber.eq(patientID);
				Problem[] problems = Problem.listProblemByCriteria(criteria);
				Problem problem = null;
				// If the high effective time of the problem is empty then update it. Otherwise create a new problem.
				boolean found = false;
				for (int m = 0; m < problems.length; m++) {
					Problem problemDB = problems[m];
					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).
						log(Level.INFO, " $$$ Effective Time:" + problemDB.getEffectiveTimeHigh() + ":");
					String effectiveTimeHighDB = problemDB.getEffectiveTimeHigh();
					if (effectiveTimeHighDB == null
						|| effectiveTimeHighDB.trim().equals("")
						|| effectiveTimeHighDB.trim().equals(" ")) {
						problem = problemDB;
						found = true;
						break;
					} else {
						dateFormat = new SimpleDateFormat("yyyyMMdd");
						Date currentDate = date;
						//String currentDateString = dateFormat.format(currentDate);
						effectiveTimeHighDB = effectiveTimeHighDB.substring(0, 8);
						Date effectiveTimeHighDate = dateFormat.parse(effectiveTimeHighDB);
						int results = effectiveTimeHighDate.compareTo(currentDate);
						if (results >= 1) {
							problem = problemDB;
							found = true;
							break;
						}
					}
				}

				if (!found) {
					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Create a new problem...");
					problem = Problem.createProblem();
				} else {
					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Use existing problem...");
				}

				/*if (problems.length > 0) {
				if (problems[0].getEffectiveTimeHigh() != null
				&& !problems[0].getEffectiveTimeHigh().trim().equals("")
				&& !problems[0].getEffectiveTimeHigh().trim().equals(" ")) {
				problem = Problem.createProblem();
				} else {
				problem = problems[0];
				}
				} else {
				problem = Problem.createProblem();
				}*/
				problem.setCareProvisionCode(careProvisionCode);
				problem.setEffectiveTimeHigh(effectiveTimeHigh);
				problem.setEffectiveTimeLow(effectiveTimeLow);
				problem.setProblemCode(problemCode);
				problem.setProblemText(problemText);
				problem.setProblemValue(problemValue);
				//problem.setProblemValueCodeSystem(problemValueCodeSystem);
				problem.setProblemValueCodeSystem("UMLS");
				problem.setProblemValueOriginalText(problemValueOriginalText);
				problem.setSeverity(severity);
				ehrPhrData.setProblem(problem);

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Problem Entry: "
					+ " problemCode:" + problemCode + " problemText:" + problemText + " effectiveTimeLow:" + effectiveTimeLow
					+ " effectiveTimeHigh:" + effectiveTimeHigh + " problemValue:" + problemValue + " problemValueCodeSystem:" + problemValueCodeSystem
					+ " problemValueOriginalText:" + problemValueOriginalText);
			} else if (careProvisionCode.equals("CONDLIST") || careProvisionCode.equals("RISKLIST")) {
				// TODO: Gelen careProvisionCode'a gore CONDLIST'mi yoksa RISKLIST'mi kontrol et ve ilgili tabloya at
				POCDMT000040Act act = pertinentInformation.getAct().getValue();
				String concernStatusCode = act.getStatusCode().getCode();

				String effectiveTimeLow = ((IVXBTS) act.getEffectiveTime().getRest().get(0).getValue()).getValue();
				String effectiveTimeHigh = ((IVXBTS) act.getEffectiveTime().getRest().get(1).getValue()).getValue();

				Concern concern = Concern.createConcern();
				concern.setCareProvisionCode(careProvisionCode);
				concern.setConcernStatusCode(concernStatusCode);
				concern.setEffectiveTimeHigh(effectiveTimeHigh);
				concern.setEffectiveTimeLow(effectiveTimeLow);
				ehrPhrData.setConcern(concern);

				POCDMT000040EntryRelationship entryRelationShip = act.getEntryRelationship().get(0);
				POCDMT000040Observation tempObservation = entryRelationShip.getObservation();
				String tempObservationCodeSystemName = tempObservation.getCode().getCodeSystemName();

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ " + careProvisionCode
					+ " Concern Entry: Status Code:" + concernStatusCode
					+ " EffectiveTimeLow: " + effectiveTimeLow + " EffectiveTimeHigh: " + effectiveTimeHigh);
				if (tempObservationCodeSystemName.equals("ObservationIntoleranceType")) { // then it is allergy
					String allergyCode = tempObservation.getCode().getCode();
					String allergyValue = ((CD) tempObservation.getValue().get(0)).getCode();
					String allergyValueCodeSystem = ((CD) tempObservation.getValue().get(0)).getCodeSystem();
					String allergyValueCodeSystemName = ((CD) tempObservation.getValue().get(0)).getCodeSystemName();
					allergyValue = translateCode(allergyValue, allergyValueCodeSystem, allergyValueCodeSystemName);
					POCDMT000040PlayingEntity playingEntity = tempObservation.getParticipant().get(0).getParticipantRole().getPlayingEntity();
					CE ce = playingEntity.getCode();
					String allergySubstanceCode = ce.getCode();
					String allergySubstanceCodeSystem = ce.getCodeSystem();
					String allergySubstanceCodeSystemName = ce.getCodeSystemName();
					allergySubstanceCode = translateCode(allergySubstanceCode, allergySubstanceCodeSystem, allergySubstanceCodeSystemName);
					String allergyOriginalText = ce.getDisplayName();

					concern.setAllergyCode(allergyCode);
					concern.setAllergyValue(allergyValue);
					concern.setAllergyValueCodeSystem("UMLS");
					//concern.setAllergyValueCodeSystem(allergyValueCodeSystem);
					concern.setAllergySubstanceCode(allergySubstanceCode);
					//concern.setAllergySubstanceCodeSystem(allergySubstanceCodeSystem);
					concern.setAllergySubstanceCodeSystem("UMLS");
					concern.setAllergyOriginalText(allergyOriginalText);

					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " --> Allergy: allergyCode:" + allergyCode
						+ " allergyValue:" + allergyValue + " allergyValueCodeSystem:" + allergyValueCodeSystem + " allergySubstanceCode:" + allergySubstanceCode
						+ " allergySubstanceCodeSystem:" + allergySubstanceCodeSystem + " allergyOriginalText:" + allergyOriginalText);
				} else { // then it is problem entry
					String problemCode = tempObservation.getCode().getCode();
					String problemText = tempObservation.getText().getContent();
					String concernEffectiveTimeLow = ((IVXBTS) tempObservation.getEffectiveTime().getRest().get(0).getValue()).getValue();
					String concernEffectiveTimeHigh = ((IVXBTS) tempObservation.getEffectiveTime().getRest().get(1).getValue()).getValue();
					CD valueCD = (CD) tempObservation.getValue().get(0);
					String problemValue = valueCD.getCode();
					String problemValueCodeSystem = valueCD.getCodeSystem();
					String problemValueCodeSystemName = valueCD.getCodeSystemName();
					problemValue = translateCode(problemValue, problemValueCodeSystem, problemValueCodeSystemName);
					String problemValueOriginalText = valueCD.getDisplayName();

					Problem problem = Problem.createProblem();
					problem.setCareProvisionCode(careProvisionCode);
					problem.setEffectiveTimeHigh(effectiveTimeHigh);
					problem.setEffectiveTimeLow(effectiveTimeLow);
					problem.setProblemCode(problemCode);
					problem.setProblemText(problemText);
					problem.setProblemValue(problemValue);
					//problem.setProblemValueCodeSystem(problemValueCodeSystem);
					problem.setProblemValueCodeSystem("UMLS");
					problem.setProblemValueOriginalText(problemValueOriginalText);
					concern.setProblem(problem);

					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " --> Problem Entry: "
						+ " problemCode:" + problemCode + " problemText:" + problemText + " effectiveTimeLow:" + effectiveTimeLow
						+ " effectiveTimeHigh:" + effectiveTimeHigh + " problemValue:" + problemValue + " problemValueCodeSystem:" + problemValueCodeSystem
						+ " problemValueOriginalText:" + problemValueOriginalText);
				}
			} else if (careProvisionCode.equals("PROBLIST")) {
				POCDMT000040Act act = pertinentInformation.getAct().getValue();
				String concernStatusCode = act.getStatusCode().getCode();

				String effectiveTimeLow = ((IVXBTS) act.getEffectiveTime().getRest().get(0).getValue()).getValue();
				String effectiveTimeHigh = ((IVXBTS) act.getEffectiveTime().getRest().get(1).getValue()).getValue();

				POCDMT000040EntryRelationship entryRelationShip = act.getEntryRelationship().get(0);
				POCDMT000040Observation tempObservation = entryRelationShip.getObservation();
				String tempObservationCodeSystemName = tempObservation.getCode().getCodeSystemName();

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Problem Concern: Status Code:" + concernStatusCode
					+ " EffectiveTimeLow: " + effectiveTimeLow + " EffectiveTimeHigh: " + effectiveTimeHigh);

				String problemCode = tempObservation.getCode().getCode();
				String problemText = tempObservation.getText().getContent();
				String concernEffectiveTimeLow = ((IVXBTS) tempObservation.getEffectiveTime().getRest().get(0).getValue()).getValue();
				String concernEffectiveTimeHigh = ((IVXBTS) tempObservation.getEffectiveTime().getRest().get(1).getValue()).getValue();
				CD valueCD = (CD) tempObservation.getValue().get(0);
				String problemValue = valueCD.getCode();
				String problemValueCodeSystem = valueCD.getCodeSystem();
				String problemValueCodeSystemName = valueCD.getCodeSystemName();
				problemValue = translateCode(problemValue, problemValueCodeSystem, problemValueCodeSystemName);
				String problemValueOriginalText = valueCD.getDisplayName();

				Problem problem = Problem.createProblem();
				problem.setCareProvisionCode(careProvisionCode);
				problem.setEffectiveTimeHigh(effectiveTimeHigh);
				problem.setEffectiveTimeLow(effectiveTimeLow);
				problem.setProblemCode(problemCode);
				problem.setProblemText(problemText);
				problem.setProblemValue(problemValue);
				//problem.setProblemValueCodeSystem(problemValueCodeSystem);
				problem.setProblemValueCodeSystem("UMLS");
				problem.setProblemValueOriginalText(problemValueOriginalText);
				ehrPhrData.setProblem(problem);

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " --> Problem Entry: "
					+ " problemCode:" + problemCode + " problemText:" + problemText + " effectiveTimeLow:" + effectiveTimeLow
					+ " effectiveTimeHigh:" + effectiveTimeHigh + " problemValue:" + problemValue + " problemValueCodeSystem:" + problemValueCodeSystem
					+ " problemValueOriginalText:" + problemValueOriginalText);

			} else if (careProvisionCode.equals("INTOLIST")) {
				POCDMT000040Act act = pertinentInformation.getAct().getValue();
				String concernStatusCode = act.getStatusCode().getCode();

				String effectiveTimeLow = ((IVXBTS) act.getEffectiveTime().getRest().get(0).getValue()).getValue();
				String effectiveTimeHigh = ((IVXBTS) act.getEffectiveTime().getRest().get(1).getValue()).getValue();

				POCDMT000040EntryRelationship entryRelationShip = act.getEntryRelationship().get(0);
				POCDMT000040Observation tempObservation = entryRelationShip.getObservation();
				String tempObservationCodeSystemName = tempObservation.getCode().getCodeSystemName();

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Allergy and Intolerance Concern: Status Code:" + concernStatusCode
					+ " EffectiveTimeLow: " + effectiveTimeLow + " EffectiveTimeHigh: " + effectiveTimeHigh);

				String allergyCode = tempObservation.getCode().getCode();
				String allergyValue = ((CD) tempObservation.getValue().get(0)).getCode();
				String allergyValueCodeSystem = ((CD) tempObservation.getValue().get(0)).getCodeSystem();
				String allergyValueCodeSystemName = ((CD) tempObservation.getValue().get(0)).getCodeSystemName();
				allergyValue = translateCode(allergyValue, allergyValueCodeSystem, allergyValueCodeSystemName);
				POCDMT000040PlayingEntity playingEntity = tempObservation.getParticipant().get(0).getParticipantRole().getPlayingEntity();
				CE ce = playingEntity.getCode();
				String allergySubstanceCode = ce.getCode();
				String allergySubstanceCodeSystem = ce.getCodeSystem();
				String allergySubstanceCodeSystemName = ce.getCodeSystemName();
				allergySubstanceCode = translateCode(allergySubstanceCode, allergySubstanceCodeSystem, allergySubstanceCodeSystemName);
				String allergyOriginalText = ce.getDisplayName();

				Concern concern = Concern.createConcern();
				concern.setCareProvisionCode(careProvisionCode);
				concern.setConcernStatusCode(concernStatusCode);
				concern.setEffectiveTimeHigh(effectiveTimeHigh);
				concern.setEffectiveTimeLow(effectiveTimeLow);
				concern.setAllergyCode(allergyCode);
				concern.setAllergyValue(allergyValue);
				//concern.setAllergyValueCodeSystem(allergyValueCodeSystem);
				concern.setAllergyValueCodeSystem("UMLS");
				concern.setAllergySubstanceCode(allergySubstanceCode);
				//concern.setAllergySubstanceCodeSystem(allergySubstanceCodeSystem);
				concern.setAllergySubstanceCodeSystem("UMLS");
				concern.setAllergyOriginalText(allergyOriginalText);
				ehrPhrData.setConcern(concern);

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " --> Allergy: allergyCode:" + allergyCode
					+ " allergyValue:" + allergyValue + " allergyValueCodeSystem:" + allergyValueCodeSystem + " allergySubstanceCode:" + allergySubstanceCode
					+ " allergySubstanceCodeSystem:" + allergySubstanceCodeSystem + " allergyOriginalText:" + allergyOriginalText);
			} else if (careProvisionCode.equals("LABCAT") || careProvisionCode.equals("DICAT")) {
				POCDMT000040Observation observation = pertinentInformation.getObservation().getValue();
				String labResultCode = observation.getCode().getCode();
				String labResultText = observation.getText().getContent();
				String effectiveTime = observation.getEffectiveTime().getValue();

				ImagingResult imagingResult = ImagingResult.createImagingResult();
				imagingResult.setCareProvisionCode(careProvisionCode);
				ehrPhrData.setImagingResult(imagingResult);

				ANY any = observation.getValue().get(0);
				String labResultValue = "", labResultValueCodeSystem = "", labResultValueCodeSystemName = "";

				if (any instanceof CD) {
					CD cd = (CD) any;
					labResultValue = cd.getCode();
					labResultValueCodeSystem = cd.getCodeSystem();
					labResultValueCodeSystemName = cd.getCodeSystemName();
					labResultValue = translateCode(labResultValue, labResultValueCodeSystem, labResultValueCodeSystemName);
				} else if (any instanceof CE) {
					CE cd = (CE) any;
					labResultValue = cd.getCode();
					labResultValueCodeSystem = cd.getCodeSystem();
					labResultValueCodeSystemName = cd.getCodeSystemName();
					labResultValue = translateCode(labResultValue, labResultValueCodeSystem, labResultValueCodeSystemName);
				}/* FORTH-START-necessary*/ else if (any instanceof PQ) {
					PQ cd = (PQ) any;
					labResultValue = cd.getValue();
					labResultValueCodeSystem = cd.getUnit();
					//String unit = valuePQ.getUnit();
					//String value = valuePQ.getValue();
				}
				/* FORTH-END */
				String base64Encoded = "";
				if (careProvisionCode.equals("DICAT")) {
					POCDMT000040ObservationMedia observationMedia = observation.getEntryRelationship().get(0).getObservationMedia();
					ED ed = observationMedia.getValue();
					String mediaType = ed.getMediaType();
					base64Encoded = ed.getContent();
					imagingResult.setMediaType(mediaType);
					imagingResult.setBase64Encoded(base64Encoded);
					byte[] fileContent = decode(base64Encoded.getBytes());
					FileOutputStream fos = new FileOutputStream("resources/a.pdf");
					fos.write(fileContent);
					fos.close();
				}

				imagingResult.setLabResultCode(labResultCode);
				imagingResult.setLabResultText(labResultText);
				imagingResult.setEffectiveTime(effectiveTime);
				imagingResult.setLabResultValue(labResultValue);
				//imagingResult.setLabResultValueCodeSystem(labResultValueCodeSystem);
				imagingResult.setLabResultValueCodeSystem("UMLS");

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Lab Results: " + careProvisionCode
					+ " labResultCode:" + labResultCode + " labResultText:" + labResultText + " effectiveTime:" + effectiveTime
					+ " labResultValue:" + labResultValue + " labResultValueCodeSystem:" + labResultValueCodeSystem + "" + base64Encoded);
			} else if (careProvisionCode.equals("RXCAT") || careProvisionCode.equals("MEDLIST") || careProvisionCode.equals("CURMEDLIST")
				|| careProvisionCode.equals("DISCHMEDLIST") || careProvisionCode.equals("HISTMEDLIST") || careProvisionCode.equals("IMMUCAT")) {
				POCDMT000040SubstanceAdministration substanceAdm = pertinentInformation.getSubstanceAdministration().getValue();
				String text = "";
				if(substanceAdm.getText() != null)
					text = substanceAdm.getText().getContent();
				//String effectiveTime = substanceAdm.getEffectiveTime().get(0).getValue();
				//String effectiveTime = substanceAdm.getEffectiveTime().get(0).getValue();
				//String effectiveTimeHigh = substanceAdm.getEffectiveTime().get(1).getValue();
				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Size:" + substanceAdm.getEffectiveTime().size());
				SXCMTS effectiveTimeSXCMTS = substanceAdm.getEffectiveTime().get(0);
				IVLTS effectiveTime = (IVLTS) effectiveTimeSXCMTS;
				String effectiveTimeLow = ((IVXBTS) effectiveTime.getRest().get(0).getValue()).getValue();
				String effectiveTimeHigh = ((IVXBTS) effectiveTime.getRest().get(1).getValue()).getValue();
				String routeCode = "";
				if(substanceAdm != null && substanceAdm.getRouteCode() != null)
					routeCode = substanceAdm.getRouteCode().getCode();
				//String approachSiteCode = substanceAdm.getApproachSiteCode().get(0).getCode();
				String approachSiteCode = "";
				String doseQuantity = substanceAdm.getDoseQuantity().getValue();
				String doseQuantityUnit = substanceAdm.getDoseQuantity().getUnit();
				POCDMT000040LabeledDrug drug = substanceAdm.getConsumable().getManufacturedProduct().getManufacturedLabeledDrug();
				String drugCode = drug.getCode().getCode();
				String drugCodeSystem = drug.getCode().getCodeSystem();
				String drugCodeSystemName = drug.getCode().getCodeSystemName();
				drugCode = translateCode(drugCode, drugCodeSystem, drugCodeSystemName);
				if(drug.getCode() != null && drug.getCode().getOriginalText() != null)
					text = drug.getCode().getOriginalText().getContent();

				MedicationCriteria criteria = new MedicationCriteria();
				criteria.drugCode.eq(drugCode);
				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (senderName.equals("PHR")) {
					ehrPhrDataCriteria.isEHR.eq(0);
				} else {
					ehrPhrDataCriteria.isEHR.eq(1);
				}
				PatientCriteria patientCriteriaNew = ehrPhrDataCriteria.createPatientCriteria();
				patientCriteriaNew.citizenshipNumber.eq(patientID);
				Medication[] medications = Medication.listMedicationByCriteria(criteria);
				Medication medication = null;
				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Length:" + medications.length
					+ " $$$ Drug Code:" + drugCode + " PatientID:" + patientID);
				// Medication icin varsayimim su: Eger effectiveTimeHigh(DB) gelecegi gosteriyor 
				// ise (ya da bos ise) bu record'u update edecegim.
				// Yok degilse yenisini yaratacagim. Active MEdication'larida, effectiveTimeHigh'i bos olanlar
				// veya zaman olarak gelecekte olanlardan belirleyecegim..

				boolean found = false;
				for (int m = 0; m < medications.length; m++) {
					Medication medicationDB = medications[m];
					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).
						log(Level.INFO, " $$$ Effective Time:" + medicationDB.getEffectiveTimeHigh() + ":");
					String effectiveTimeHighDB = medicationDB.getEffectiveTimeHigh();
					if (effectiveTimeHighDB == null
						|| effectiveTimeHighDB.trim().equals("")
						|| effectiveTimeHighDB.trim().equals(" ")) {
						medication = medicationDB;
						found = true;
						break;
					} else {
						dateFormat = new SimpleDateFormat("yyyyMMdd");
						Date currentDate = date;
						String currentDateString = dateFormat.format(currentDate);
						effectiveTimeHighDB = effectiveTimeHighDB.substring(0, 8);
						Date effectiveTimeHighDate = dateFormat.parse(effectiveTimeHighDB);
						int results = effectiveTimeHighDate.compareTo(currentDate);
						Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO,
							"Current date:" + currentDateString + " Effective Time High:" + effectiveTimeHighDB + " Results:" + results);
						if (results >= 1) {
							medication = medicationDB;
							found = true;
							break;
						}
					}
				}

				if (!found) {
					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Create a new medication...");
					medication = Medication.createMedication();
				} else {
					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, " $$$ Use existing medication record...");
				}

				medication.setCareProvisionCode(careProvisionCode);
				medication.setApproachSiteCode(approachSiteCode);
				medication.setDoseQuantity(doseQuantity);
				medication.setDrugCode(drugCode);
				//medication.setDrugCodeSystem(drugCodeSystem);
				medication.setDrugCodeSystem("UMLS");
				medication.setEffectiveTime(effectiveTimeLow);
				medication.setEffectiveTimeHigh(effectiveTimeHigh);
				medication.setRouteCode(routeCode);
				medication.setText(text);
				ehrPhrData.setMedication(medication);

				Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, careProvisionCode
					+ " Medication: text:" + text
					+ " doseQuantity:" + doseQuantity + " routeCode:" + routeCode + " approachSiteCode:" + approachSiteCode
					+ " doseQuantityUnit:" + doseQuantityUnit + " drugCode:" + drugCode
					+ " drugCodeSystem:" + drugCodeSystem + " effectiveTime:" + effectiveTimeLow + " effectiveTimeHigh:" + effectiveTimeHigh);
			} else if (careProvisionCode.equals("PSVCCAT")) {
				JAXBElement<POCDMT000040Procedure> procedureJE = pertinentInformation.getProcedure();
				if (procedureJE == null) {
					POCDMT000040Encounter encounter = pertinentInformation.getEncounter().getValue();
					String encounterCode = encounter.getCode().getCode();
					String effectiveTimeLow = ((IVXBTS) encounter.getEffectiveTime().getRest().get(0).getValue()).getValue();
					String effectiveTimeHigh = ((IVXBTS) encounter.getEffectiveTime().getRest().get(1).getValue()).getValue();
					String encounterText = encounter.getText().getContent();
					String doctorID = encounter.getPerformer().get(0).getAssignedEntity().getId().get(0).getExtension();
					String organizationID = encounter.getParticipant().get(0).getParticipantRole().getId().get(0).getExtension();

					Encounter encounterDB = Encounter.createEncounter();
					encounterDB.setCareProvisionCode(careProvisionCode);
					encounterDB.setEncounterCode(encounterCode);
					encounterDB.setDoctorID(doctorID);
					encounterDB.setEffectiveTimeHigh(effectiveTimeHigh);
					encounterDB.setEffectiveTimeLow(effectiveTimeLow);
					encounterDB.setOrganizationID(organizationID);
					encounterDB.setEncounterText(encounterText);
					ehrPhrData.setEncounter(encounterDB);

					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, careProvisionCode
						+ " Encounter: encounterCode:" + encounterCode
						+ " effectiveTimeLow:" + effectiveTimeLow + " effectiveTimeHigh:" + effectiveTimeHigh
						+ " encounterText:" + encounterText
						+ " doctorID:" + doctorID + " organizationID:" + organizationID);
				} else {
					POCDMT000040Procedure procedure = pertinentInformation.getProcedure().getValue();
					String procedureCode = procedure.getCode().getCode();
					String procedureCodeSystem = procedure.getCode().getCodeSystem();
					String procedureCodeSystemName = procedure.getCode().getCodeSystemName();
					procedureCode = translateCode(procedureCode, procedureCodeSystem, procedureCodeSystemName);
					String procedureText = procedure.getText().getContent();
					String statusCode = procedure.getStatusCode().getCode();
					String effectiveTimeLow = ((IVXBTS) procedure.getEffectiveTime().getRest().get(0).getValue()).getValue();
					String effectiveTimeHigh = ((IVXBTS) procedure.getEffectiveTime().getRest().get(1).getValue()).getValue();

					Procedure procedureDB = Procedure.createProcedure();
					procedureDB.setCareProvisionCode(careProvisionCode);
					procedureDB.setEffectiveTimeHigh(effectiveTimeHigh);
					procedureDB.setEffectiveTimeLow(effectiveTimeLow);
					procedureDB.setProcedureCode(procedureCode);
					//procedureDB.setProcedureCodeSystem(procedureCodeSystem);
					procedureDB.setProcedureCodeSystem("UMLS");
					procedureDB.setStatusCode(statusCode);
					ehrPhrData.setProcedure(procedureDB);

					Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, careProvisionCode
						+ " Procedure: procedureCode:" + procedureCode
						+ " effectiveTimeLow:" + effectiveTimeLow + " effectiveTimeHigh:" + effectiveTimeHigh
						+ " procedureText:" + procedureText
						+ " statusCode:" + statusCode);
				}
			}
		}
		patientDB.save();
		personDB.save();
		transaction.commit();

		StringBuffer response = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		response.append("<v3:MCCI_IN000002UV01 ITSVersion=\"XML_1.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:v3=\"urn:hl7-org:v3\">");
		response.append("response)<v3:id/>");
		response.append("response)<v3:creationTime/>");
		response.append("response)<v3:interactionId/>");
		response.append("response)<v3:processingCode/>");
		response.append("response)<v3:processingModeCode/>");
		response.append("response)<v3:acceptAckCode/>");
		response.append("response)<v3:receiver>");
		response.append("response)<v3:device classCode=\"DEV\" determinerCode=\"INSTANCE\">");
		response.append("response)<v3:id/>");
		response.append("response)</v3:device>");
		response.append("response)</v3:receiver>");
		response.append("response)<v3:sender>");
		response.append("response)<v3:device classCode=\"DEV\" determinerCode=\"INSTANCE\">");
		response.append("response)<v3:id/>");
		response.append("response)</v3:device>");
		response.append("response)</v3:sender>");
		response.append("response)<v3:acknowledgement typeCode=\"AA\">");
		response.append("response)<v3:targetMessage>");
		response.append("response)<v3:id root=\"0\" extension=\"a\"/>");
		response.append("response)</v3:targetMessage>");
		response.append("response)<v3:acknowledgementDetail typeCode=\"E\">");
		response.append("response)<v3:code code=\"!\" displayName=\"a\" codeSystemVersion=\"a\" codeSystem=\"0\" codeSystemName=\"a\" />");
		response.append("response)</v3:acknowledgementDetail>");
		response.append("response)</v3:acknowledgement>");
		response.append("response)</v3:MCCI_IN000002UV01>");
		org.hl7.v3.MCCIIN000002UV01 ack = null;
		try {
			JAXBContext context = JAXBContext.newInstance(org.hl7.v3.MCCIIN000002UV01.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			ack = (org.hl7.v3.MCCIIN000002UV01) unmarshaller.unmarshal(new StreamSource(new StringReader(response.toString())));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ack;
	}

	public static byte[] decode(byte[] b) throws Exception {
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		InputStream b64is = MimeUtility.decode(bais, "base64");
		byte[] tmp = new byte[b.length];
		int n = b64is.read(tmp);
		byte[] res = new byte[n];
		System.arraycopy(tmp, 0, res, 0, n);
		return res;
	}

	private String identifyCareProvisionCode(String pcc9QueryID) {
		Hashtable queryTypes = new Hashtable();
		queryTypes.put("1", "9279-1");
		queryTypes.put("2", "COBSCAT");
		queryTypes.put("3", "MEDCCAT");
		queryTypes.put("4", "CONDLIST");
		queryTypes.put("5", "PROBLIST");
		queryTypes.put("6", "INTOLIST");
		queryTypes.put("7", "RISKLIST");
		queryTypes.put("8", "LABCAT");
		queryTypes.put("9", "DICAT");
		queryTypes.put("10", "RXCAT");
		queryTypes.put("11", "MEDLIST");
		queryTypes.put("12", "CURMEDLIST");
		queryTypes.put("13", "DISCHMEDLIST");
		queryTypes.put("14", "HISTMEDLIST");
		queryTypes.put("15", "IMMUCAT");
		queryTypes.put("16", "PSVCCAT");
		return (String) queryTypes.get(pcc9QueryID);
	}

	private String translateCode(String code, String codeSystem, String codeSystemName) {
		try {
			if (codeSystem == null) {
				return code;
			}
			if (codeSystem.trim().equals("") || codeSystem.trim().equals(" ")) {
				return code;
			}
			if (codeSystemName.indexOf("UMLS") != -1 || codeSystem.indexOf("UMLS") != -1) {
				return code;
			}
			if (codeSystem.equals("2.16.840.1.113883.6.86")) {
				return code;
			}

			codeSystemName = codeSystemName.toUpperCase().replaceAll(" ", "");
			String umlsCode = tr.com.srdc.icardea.cts.CTSInvoker.getInstance().translateCode(codeSystemName, code, "UMLS");
			Logger.getLogger(QUPC_AR004030UV_ServiceSkeleton.class).log(Level.INFO, "Converted " + codeSystem
				+ "-" + codeSystemName + ":[Code]"
				+ code + " to UMLS:[Code]" + umlsCode);
			if (umlsCode == null || umlsCode.trim().equals("")) {
				return code;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return code;
		}
		return code;
	}
}
