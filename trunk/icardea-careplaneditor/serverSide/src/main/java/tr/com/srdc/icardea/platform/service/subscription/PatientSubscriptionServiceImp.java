package tr.com.srdc.icardea.platform.service.subscription;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Security;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import tr.com.srdc.icardea.hibernate.ICardeaPersistentManager;
import tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate;
import tr.com.srdc.icardea.hibernate.MedicalCareplanTemplateCriteria;
import tr.com.srdc.icardea.hibernate.PatientCriteria;
import tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment;
import tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignmentCriteria;
import tr.com.srdc.icardea.hibernate.PersonCriteria;
import tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan;
import tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanCriteria;
import tr.com.srdc.icardea.platform.model.Contact;
import tr.com.srdc.icardea.platform.model.Patient;
import tr.com.srdc.icardea.platform.model.Person;
import tr.com.srdc.icardea.platform.model.careplan.MedicalCareplan;
import org.orm.PersistentTransaction;
import org.orm.PersistentException;

public class PatientSubscriptionServiceImp implements
	PatientSubscriptionService {

	private void sslSetup() {
		boolean atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		if (atnatls) {
			// Properties for SSL Security Provider
			System.out.println(" $$$$ SECURE COMMUNICATION .....");
			String protocolProp = "java.protocol.handler.pkgs";
			String sunSSLProtocol = "com.sun.net.ssl.internal.www.protocol";
			String sslStoreProp = "javax.net.ssl.trustStore";
			String certPath = ResourceBundle.getBundle("icardea").getString("icardea.home") + "/icardea-caremanager-ws/src/test/resources/jssecacerts";

			// Enable SSL communication
			System.setProperty(protocolProp, sunSSLProtocol);
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			System.setProperty(sslStoreProp, certPath);
			System.setProperty("javax.net.ssl.trustStorePassword", "srdcpass");
		}
	}
	@Override
	public synchronized void registerPatient(Patient patient) {
		// Patient
		sslSetup();
		try {
			System.out.println(" $$$ Registering patrient:" + patient.getName());
			tr.com.srdc.icardea.hibernate.Patient patientInDB = addPatient(
				patient.getPersonID(), patient.getName(),
				patient.getSurname(), patient.getDateOfBirth(),
				patient.getGender());

			tr.com.srdc.icardea.hibernate.Person personInDB = addPerson(
				patient.getPersonID(), patient.getName(),
				patient.getSurname());

			Contact contact = patient.getContact();
			if (contact != null) {
				addContact(personInDB, contact);
			}

			List<MedicalCareplan> assignedCareplans = patient.getAssignedCareplans();
			System.out.println(" $$$ Assigned careplans size from GUI:"
				+ assignedCareplans.size() + " for patient:"
				+ patient.getPersonID());
			PersonalizedMedicalCareplan[] careplansInDB = null;
			if (assignedCareplans != null) {
				careplansInDB = assignCareplan2Patient(assignedCareplans,
					patient.getPersonID());
			}
			// Delete non-existent ones
			if (careplansInDB != null) {
				for (int i = 0; i < careplansInDB.length; i++) {
					PersonalizedMedicalCareplan personalizedCareplanInDB = careplansInDB[i];

					String careplanInDBID = personalizedCareplanInDB.getMedicalCareplanTemplate().getIdentifier();
					System.out.println(" $$$ Processing personalized care plan:"
						+ personalizedCareplanInDB.getIdentifier()
						+ " (MCT ID: "
						+ careplanInDBID
						+ " ) to check whether it shall be deleted or not. The assigned careplans size from GUI is:" + assignedCareplans.size());
					boolean found = false;

					for (int j = 0; j < assignedCareplans.size(); j++) {
						String assignedCareplanID = assignedCareplans.get(j).getId();
						System.out.println(" $$$ Check assigned careplan Id from GUI:"
							+ assignedCareplanID);
						if (assignedCareplanID.equals(careplanInDBID)) {
							found = true;
							break;
						}
					}
					if (!found) {
						System.out.println(" $$$ Deleting careplan:"
							+ personalizedCareplanInDB.getName()
							+ " for patient:" + patient.getPersonID());
						personalizedCareplanInDB.delete();

					}
				}
			}

			// Add caregivers
			List<Person> caregivers = patient.getCaregivers();
			if (caregivers != null) {
				for (int i = 0; i < caregivers.size(); i++) {
					Person caregiver = caregivers.get(i);
					System.out.println(" $$$ Adding caregiver:"
						+ caregiver.getIdentifier() + " for patient:"
						+ patient.getPersonID());
					tr.com.srdc.icardea.hibernate.Person caregiverInDB = addPerson(
						caregiver.getIdentifier(), caregiver.getName(),
						caregiver.getSurname());

					contact = caregiver.getContact();
					if (contact != null) {
						System.out.println(" $$$ Adding contact for caregiver:"
							+ caregiver.getIdentifier());
						addContact(caregiverInDB, contact);
					}

					PatientHealthcareActorAssignment assignment = null;
					PatientHealthcareActorAssignmentCriteria assignmentCriteria = new PatientHealthcareActorAssignmentCriteria();
					assignmentCriteria.healthcareActorIdentifier.eq(caregiver.getIdentifier());
					assignmentCriteria.patientIdentifier.eq(patient.getPersonID());
					PatientHealthcareActorAssignment[] assignments = PatientHealthcareActorAssignment.listPatientHealthcareActorAssignmentByCriteria(assignmentCriteria);
					if (assignments.length == 0) {
						PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
						assignment = new PatientHealthcareActorAssignment();
						assignment.setHealthcareActorIdentifier(caregiver.getIdentifier());
						assignment.setPatientIdentifier(patient.getPersonID());
						System.out.println(" $$$ Assigned caregiver:"
							+ caregiver.getIdentifier() + " to patient:"
							+ patient.getPersonID());
						assignment.save();
						transaction.commit();
					}
				}
			}
			// Delete non-existent ones

			PatientHealthcareActorAssignmentCriteria assignmentCriteria = new PatientHealthcareActorAssignmentCriteria();
			assignmentCriteria.patientIdentifier.eq(patient.getPersonID());
			PatientHealthcareActorAssignment[] assignments = PatientHealthcareActorAssignment.listPatientHealthcareActorAssignmentByCriteria(assignmentCriteria);

			for (int i = 0; i < assignments.length; i++) {
				PatientHealthcareActorAssignment assignment = assignments[i];
				boolean found = false;
				if (caregivers != null) {
					for (int j = 0; j < caregivers.size(); j++) {
						Person caregiver = caregivers.get(j);
						if (assignment.getHealthcareActorIdentifier().equals(
							caregiver.getIdentifier())) {
							found = true;
						}
					}
				}
				if (!found) {
					PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
					assignment.delete();
					System.out.println(" $$$ Deleted caregiver:"
						+ assignment.getHealthcareActorIdentifier()
						+ " for patient:" + patient.getPersonID());
					transaction.commit();
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public tr.com.srdc.icardea.hibernate.Patient addPatient(String pid,
		String name, String surname, String birthDate, String gender)
		throws Exception {
		

		/*if (birthDate.indexOf("-") < 0) {
		String[] parts = birthDate.split("/");
		birthDate = parts[2] + "-" + parts[1] + "-" + parts[0];
		}*/
		tr.com.srdc.icardea.hibernate.Patient patient = null;
		PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
		PatientCriteria criteria = null;
		try {
			criteria = new PatientCriteria();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		criteria.citizenshipNumber.eq(pid);
		tr.com.srdc.icardea.hibernate.Patient[] patients = tr.com.srdc.icardea.hibernate.Patient.listPatientByCriteria(criteria);
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
				String jdbcDriver = properties.getString("jdbc.driverClassName");
				String jdbcURL = "jdbc:mysql://" + url + "/final_icardea";

				Class.forName(jdbcDriver).newInstance();

				Connection conn = DriverManager.getConnection(jdbcURL,
					username, password);
				Statement s = conn.createStatement();
				ResultSet resultSet = s.executeQuery("select patientcode from patient where patientcode = "
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
		
		PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
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
		tr.com.srdc.icardea.hibernate.Person[] persons = tr.com.srdc.icardea.hibernate.Person.listPersonByCriteria(personCriteria);
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

	public synchronized PersonalizedMedicalCareplan[] assignCareplan2Patient(
		List<MedicalCareplan> assignedCareplans, String patientId) {
		sslSetup();
		try {
			PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
			PersonalizedMedicalCareplanCriteria careplanCriteria = new PersonalizedMedicalCareplanCriteria();
			careplanCriteria.patientIdentifier.eq(patientId);
			PersonalizedMedicalCareplan[] careplansInDB = PersonalizedMedicalCareplan.listPersonalizedMedicalCareplanByCriteria(careplanCriteria);
			System.out.println(" $$$ Assignment process started for patient:"
				+ patientId);
			System.out.println(" $$$ Already assigned careplans size in DB:"
				+ careplansInDB.length);
			// Add newly added Personalized Careplans
			for (int i = 0; i < assignedCareplans.size(); i++) {
				MedicalCareplan careplan = assignedCareplans.get(i);
				System.out.println(" $$$ Processing careplan:"
					+ careplan.getId());
				PersonalizedMedicalCareplan personalizedCareplan = null;
				MedicalCareplanTemplate medicalCareplanTemplate = null;
				boolean found = false;
				for (int j = 0; j < careplansInDB.length; j++) {
					PersonalizedMedicalCareplan personalizedCareplanInDB = careplansInDB[j];
					if (personalizedCareplanInDB.getMedicalCareplanTemplate().getIdentifier().equals(careplan.getId())) {
						personalizedCareplan = personalizedCareplanInDB;
						medicalCareplanTemplate = personalizedCareplanInDB.getMedicalCareplanTemplate();
						System.out.println(" $$$ Found the careplan from GUI in the DB:"
							+ careplan.getId());
						found = true;
						break;
					}
				}

				if (!found) {
					System.out.println(" $$$ Could not find the careplan from GUI in the DB therefore creating a new one:"
						+ careplan.getId());
					personalizedCareplan = new PersonalizedMedicalCareplan();
					MedicalCareplanTemplateCriteria mcriteria = new MedicalCareplanTemplateCriteria();
					mcriteria.identifier.eq(careplan.getId());
					MedicalCareplanTemplate[] mctList = MedicalCareplanTemplate.listMedicalCareplanTemplateByCriteria(mcriteria);
					while (mctList.length < 1) {
						Thread.sleep(5000);
						System.out.println(" ### Waiting careplans to be stored to the database...");
					}
					medicalCareplanTemplate = mctList[0];
				}

				
				personalizedCareplan.setPatientIdentifier(patientId);
				personalizedCareplan.setIdentifier(careplan.getId());
				System.out.println(" $$$ Assigning careplan:"
					+ careplan.getId() + " to patient" + patientId);

				String[] st;
				String content = medicalCareplanTemplate.getContent();
				
				if(content != null){
					st = content.split("owl");	
					String cname = st[0]+"cp";
					String dname = st[0]+"dgr";
					
					boolean salkUsage = new Boolean(ResourceBundle.getBundle("icardea")
							.getString("salk.usage")).booleanValue();
					if(salkUsage == true){
						cname = cname.replace("https", "http");
						cname = cname.replace("8443", "8080");
						dname = dname.replace("https", "http");
						dname = dname.replace("8443", "8080"); 
					}
					
					URL url;
					try {
						System.out.println("cname: "+cname);
						url = new URL(cname);
						BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
						String inputLine = "";
						String cp = "";
						  while ((inputLine = in.readLine()) != null)
						  {
							  cp = cp +inputLine;	
							  
						  }
						  careplan.setCareplan(cp);
						  medicalCareplanTemplate.setCareplan(cp);
						  in.close();
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
					try {
						url = new URL(dname);
						BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
						String inputLine = "";
						String cp = "";
						  while ((inputLine = in.readLine()) != null)
						  {
							  cp = cp + inputLine;							  
						  }
						  careplan.setDiagram(cp);
						  medicalCareplanTemplate.setDiagram(cp);
						  in.close();
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				personalizedCareplan.setMedicalCareplanTemplate(medicalCareplanTemplate);
				personalizedCareplan.save();
				// TODO: Delete in the future
				ResourceBundle properties = ResourceBundle.getBundle("icardea");
				String username = properties.getString("mysql.username");
				String password = properties.getString("mysql.password");
				String url = properties.getString("mysql.host");
				String jdbcDriver = properties.getString("jdbc.driverClassName");
				String jdbcURL = "jdbc:mysql://" + url
					+ "/final_icardea_repository";
				Class.forName(jdbcDriver).newInstance();
				Connection conn = DriverManager.getConnection(jdbcURL,
					username, password);
				Statement s = conn.createStatement();
				ResultSet resultSet = s.executeQuery("select id from assignment where id = (select max(id) from  assignment)");
				int id = 1;
				if (resultSet.next()) {
					id = resultSet.getInt(1);
					id++;
				}
				s.close();

				s = conn.createStatement();
				resultSet = s.executeQuery("select pid, gid from assignment where pid = "
					+ patientId + " and gid=" + careplan.getId());

				if (!resultSet.next()) {
					Statement s1 = conn.createStatement();

					s1.executeUpdate("INSERT INTO assignment VALUES ("
						+ id
						+ ","
						+ patientId
						+ ","
						+ careplan.getId()
						+ ",2,'yildiray','yildiray','2010-05-08 01:01:01','2010-05-10 01:01:01',NULL,"
						+ "'" + careplan.getUrl() + "','true')");
					s1.close();
				}
				s.close();
				conn.close();

				// TODO
			}
			transaction.commit();
			return careplansInDB;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private Patient patientFromDB(tr.com.srdc.icardea.hibernate.Patient patient) {
		
		Patient patientToBeFilled = new Patient();
		patientToBeFilled.setGender(patient.getAdministrativeSex());
		patientToBeFilled.setPersonID(patient.getCitizenshipNumber());
		patientToBeFilled.setDateOfBirth(patient.getDateTimeOfBirth());
		patientToBeFilled.setSurname(patient.getFamilyName());
		patientToBeFilled.setName(patient.getGivenName());
		return patientToBeFilled;
	}

	private Contact contactFromDB(
		tr.com.srdc.icardea.hibernate.Contact contactInDB) {
		
		Contact contact = new Contact();
		contact.setEmail(contactInDB.getEmail());
		contact.setMobileNumber(contactInDB.getMobileNumber());
		contact.setPhoneNumber(contactInDB.getPhoneNumber());
		contact.setAddressLine(contactInDB.getAddressLine());
		contact.setFaxNumber(contactInDB.getFaxNumber());
		contact.setGtalk(contactInDB.getGTalk());
		return contact;
	}

	public tr.com.srdc.icardea.hibernate.Contact addContact(
		tr.com.srdc.icardea.hibernate.Person personInDB, Contact contact)
		throws Exception {
		
		System.out.println(" $$$ Adding contact for:"
			+ personInDB.getIdentifier());
		PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
		tr.com.srdc.icardea.hibernate.Contact contactInDB = personInDB.getContact();
		if (contactInDB == null) {
			contactInDB = new tr.com.srdc.icardea.hibernate.Contact();
		}
		contactInDB.setEmail(contact.getEmail());
		contactInDB.setMobileNumber(contact.getMobileNumber());
		contactInDB.setPhoneNumber(contact.getPhoneNumber());
		contactInDB.setAddressLine(contact.getAddressLine());
		contactInDB.setFaxNumber(contact.getFaxNumber());
		contactInDB.setGTalk(contact.getGtalk());
		if (contact != null) {
			System.out.println("Mobile no:" + contact.getMobileNumber()
				+ " Email:" + contact.getEmail() + " Phone:"
				+ contact.getPhoneNumber());
		} else {
			System.out.println("Contact is null!");
		}
		contactInDB.save();
		personInDB.setContact(contactInDB);
		personInDB.save();
		transaction.commit();
		return contactInDB;
	}

	@Override
	public synchronized List<Patient> listRegisteredPatients() {
		sslSetup();
		tr.com.srdc.icardea.hibernate.Patient[] patients = null;
		try {
			patients = tr.com.srdc.icardea.hibernate.Patient.listPatientByQuery(null, null);

			System.out.println(" $$$ Patients size:" + patients.length);
			// TODO: Delete in the future
//			if (patients.length == 0) {
//				patients = new tr.com.srdc.icardea.hibernate.Patient[2];
//				System.out.println(" $$$ Adding demo data");
//				patients[0] = addPatient("190", "Andreas", "Schmidt",
//					"1953-01-04", "M");
//				patients[1] = addPatient("191", "Suzie", "Mayr", "1973-04-22",
//					"F");
//
//				addPerson("190", "Andreas", "Schmidt");
//				tr.com.srdc.icardea.hibernate.Person jane = addPerson("191", "Suzie", "Mayr");
//				Contact contact = new Contact();
//				contact.setEmail("eliferylmz@gmail.com");
//				contact.setMobileNumber("00905058668960");
//				contact.setPhoneNumber("00905058668960");
//				addContact(jane, contact);
//
//				MedicalCareplan mc = new MedicalCareplan();
//				mc.setId("1");
//				List<MedicalCareplan> list = new ArrayList();
//				list.add(mc);
//				assignCareplan2Patient(list, "190");
//				mc = new MedicalCareplan();
//				mc.setId("2");
//				list = new ArrayList();
//				list.add(mc);
//				assignCareplan2Patient(list, "191");
//
//				/*mc = new MedicalCareplan();
//				mc.setId("3");
//				list = new ArrayList();
//				list.add(mc);
//				assignCareplan2Patient(list, "191");*/
//			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println(" $$$ Patients size new:" + patients.length);

		List<Patient> patientsToBeFilled = new ArrayList();
		for (int i = 0; i < patients.length; i++) {
			tr.com.srdc.icardea.hibernate.Patient patient = patients[i];
			Patient patientToBeFilled = patientFromDB(patient);

			// Fill the assigned careplans
			ArrayList<MedicalCareplan> medicalCareplans = listGuidelines(patientToBeFilled);
			if (medicalCareplans != null) {
				System.out.println(" $$$ # of careplans for patient:"
					+ patient.getCitizenshipNumber() + " is "
					+ medicalCareplans.size());
			} else {
				System.out.println(" $$$ # of careplans for patient:"
					+ patient.getCitizenshipNumber() + " is zero");
			}
			patientToBeFilled.setAssignedCareplans(medicalCareplans);

			// Fill the contact part
			PersonCriteria personCriteria = null;
			try {
				personCriteria = new PersonCriteria();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			personCriteria.identifier.eq(patient.getCitizenshipNumber());
			// TODO: Her patient eklediginde mutlaka person'da ekle
			tr.com.srdc.icardea.hibernate.Person person = tr.com.srdc.icardea.hibernate.Person.listPersonByCriteria(personCriteria)[0];
			tr.com.srdc.icardea.hibernate.Contact contactInDB = person.getContact();
			if (contactInDB != null) {
				patientToBeFilled.setContact(contactFromDB(contactInDB));
			}

			// Fill the caregivers
			PatientHealthcareActorAssignmentCriteria caregiverAssignmentCriteria = null;
			try {
				caregiverAssignmentCriteria = new PatientHealthcareActorAssignmentCriteria();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			caregiverAssignmentCriteria.patientIdentifier.eq(patient.getCitizenshipNumber());
			PatientHealthcareActorAssignment[] assignments = PatientHealthcareActorAssignment.listPatientHealthcareActorAssignmentByCriteria(caregiverAssignmentCriteria);

			for (int j = 0; j < assignments.length; j++) {
				PatientHealthcareActorAssignment assignment = assignments[j];
				String careGiverID = assignment.getHealthcareActorIdentifier();

				personCriteria = null;
				try {
					personCriteria = new PersonCriteria();
				} catch (PersistentException e) {
					e.printStackTrace();
				}
				personCriteria.identifier.eq(careGiverID);

				tr.com.srdc.icardea.hibernate.Person[] careGivers = tr.com.srdc.icardea.hibernate.Person.listPersonByCriteria(personCriteria);
				if (careGivers.length > 0) {
					Person careGiver = new Person();
					tr.com.srdc.icardea.hibernate.Person careGiverInDB = careGivers[0];
					careGiver.setIdentifier(careGiverInDB.getIdentifier());
					careGiver.setName(careGiverInDB.getName());
					careGiver.setSurname(careGiverInDB.getSurname());

					System.out.println(" $$$ Caregiver:"
						+ careGiverInDB.getIdentifier() + " for patient:"
						+ patient.getCitizenshipNumber());
					tr.com.srdc.icardea.hibernate.Contact careGiverContactInDB = careGiverInDB.getContact();
					if (careGiverContactInDB != null) {
						careGiver.setContact(contactFromDB(careGiverContactInDB));
					}
				}
			}
			patientsToBeFilled.add(patientToBeFilled);
		}

		return patientsToBeFilled;
	}

	@Override
	public synchronized void setSubscriptions(Patient p) {
		
		System.out.println("*****PATIENT SUBSCRIPTIONS*****");
		System.out.println("Patient id(iCARDEA id): " + p.getPersonID());
		System.out.println("EHR Subscriptions: " + p.getEhrSubscriptions());
		System.out.println("PHR Subscriptions: " + p.getPhrSubscriptions());
		System.out.println("*******************************");

	}

	@Override
	public synchronized void setPatientInfo(Patient p) {
		registerPatient(p);
	}

	// @Override
	// public ArrayList<MedicalCareplan> listGuidelines(Patient p) {
	// System.out.println(p.getAssignedCareplans());
	// return p.getAssignedCareplans();
	//
	// }
	@Override
	public synchronized List<Patient> createPatient(Patient patient) {
		// String id = patient.getPersonID();
		// if (patients.containsKey(id)) {
		// throw new IllegalArgumentException("Duplicate key" + id);
		// } else {
		// patients.put(id, patient);
		// }
		registerPatient(patient);
		return listPatients();
	}

	@Override
	public synchronized List<Patient> updatePatient(Patient patient) {
		// String id = patient.getPersonID();
		// if (patients.containsKey(id)) {
		// patients.put(id, patient);
		// } else {
		// throw new IllegalArgumentException("Key does not exist" + id);
		// }
		registerPatient(patient);
		return listPatients();
	}

	@Override
	public synchronized List<Patient> deletePatient(Patient patient) {
		// String id = patient.getPersonID();
		// if (patients.containsKey(id)) {
		// patients.remove(id);
		// } else {
		// throw new IllegalArgumentException("Key does not exist" + id);
		// }
		
		try {
			System.out.println(" $$$ Deleting patient:" + patient.getPersonID());
			PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
			tr.com.srdc.icardea.hibernate.Patient patientInDB = null;
			PatientCriteria criteria = new PatientCriteria();
			criteria.citizenshipNumber.eq(patient.getPersonID());
			tr.com.srdc.icardea.hibernate.Patient[] patients = tr.com.srdc.icardea.hibernate.Patient.listPatientByCriteria(criteria);
			if (patients.length > 0) {
				patientInDB = patients[0];
				patientInDB.delete();
			}


			PatientHealthcareActorAssignmentCriteria assignmentCriteria = new PatientHealthcareActorAssignmentCriteria();
			assignmentCriteria.patientIdentifier.eq(patient.getPersonID());
			PatientHealthcareActorAssignment[] assignments = PatientHealthcareActorAssignment.listPatientHealthcareActorAssignmentByCriteria(assignmentCriteria);
			System.out.println(" $$$ Deleting the care giver assignments for patient:" + patient.getPersonID());
			System.out.println(" $$$ Number of care giver assignments for patient is:" + assignments.length);
			for (int i = 0; i < assignments.length; i++) {
				PatientHealthcareActorAssignment assignment = assignments[i];
				assignment.delete();
			}

			PersonalizedMedicalCareplanCriteria careplanCriteria = new PersonalizedMedicalCareplanCriteria();
			careplanCriteria.patientIdentifier.eq(patient.getPersonID());
			PersonalizedMedicalCareplan[] careplansInDB = PersonalizedMedicalCareplan.listPersonalizedMedicalCareplanByCriteria(careplanCriteria);
			System.out.println(" $$$ Deleting the care giver assignments for patient:" + patient.getPersonID());
			System.out.println(" $$$ Number of care giver assignments for patient is:" + assignments.length);
			for (int j = 0; j < careplansInDB.length; j++) {
				careplansInDB[j].delete();
			}
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listPatients();
	}

	@Override
	public synchronized ArrayList<MedicalCareplan> listGuidelines(Patient p) {
		// TODO Auto-generated method stub
		sslSetup();
		try {
			System.out.println(" $$$ Listing careplans for patient:"
				+ p.getPersonID());
			ArrayList<MedicalCareplan> careplans = new ArrayList();

			// Fill the assigned careplans
			PersonalizedMedicalCareplanCriteria careplanCriteria = new PersonalizedMedicalCareplanCriteria();
			careplanCriteria.patientIdentifier.eq(p.getPersonID());
			PersonalizedMedicalCareplan[] careplansInDB = PersonalizedMedicalCareplan.listPersonalizedMedicalCareplanByCriteria(careplanCriteria);
			String[] st;
			for (int j = 0; j < careplansInDB.length; j++) {
				MedicalCareplanTemplate medicalCareplanTemplate = careplansInDB[j].getMedicalCareplanTemplate();
				MedicalCareplan medicalCareplan = new MedicalCareplan();
				System.out.println(" $$$ Careplan:"
					+ medicalCareplanTemplate.getIdentifier());
				medicalCareplan.setId(medicalCareplanTemplate.getIdentifier());
				medicalCareplan.setName(medicalCareplanTemplate.getName());
				medicalCareplan.setUrl(medicalCareplanTemplate.getContent());
				
				String content = medicalCareplanTemplate.getContent();
				
				if(content != null){
					st = content.split("owl");	
					String cname = st[0]+"cp";
					String dname = st[0]+"dgr";
					boolean salkUsage = new Boolean(ResourceBundle.getBundle("icardea")
							.getString("salk.usage")).booleanValue();
					if(salkUsage == true){
						cname = cname.replace("https", "http");
						cname = cname.replace("8443", "8080");
						dname = dname.replace("https", "http");
						dname = dname.replace("8443", "8080"); 
					}
					URL url;
					try {
						//System.out.println("cname: "+cname);
						//System.out.println("dname: "+dname);
						url = new URL(cname);
						BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
						String inputLine = "";
						String cp = "";
						  while ((inputLine = in.readLine()) != null)
						  {
							  cp = cp +inputLine;	
							  
						  }
						  medicalCareplan.setCareplan(cp);
						  medicalCareplanTemplate.setCareplan(cp);
						  in.close();
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
					try {
						url = new URL(dname);
						BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
						String inputLine = "";
						String cp = "";
						  while ((inputLine = in.readLine()) != null)
						  {
							  cp = cp + inputLine;							  
						  }
						  medicalCareplan.setDiagram(cp);
						  medicalCareplanTemplate.setDiagram(cp);
						  in.close();
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				
				careplans.add(medicalCareplan);
			}
			return careplans;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public synchronized List<Patient> listPatients() {
		// TODO Auto-generated method stub
		return listRegisteredPatients();
	}

	@Override
	public synchronized List<Person> listCaregivers(Patient patient) {
		// ////////Patient in caregiverslarini listeleyecek
		// ////////patient.getCaregivers();
		// Fill the caregivers
		
		System.out.println(" Listing the caregivers..." + patient);
		List<Person> caregiversToBeFilled = new ArrayList();
		System.out.println(" Listing the caregivers for patient:" + patient.getPersonID());
		PatientHealthcareActorAssignmentCriteria caregiverAssignmentCriteria = null;
		try {
			caregiverAssignmentCriteria = new PatientHealthcareActorAssignmentCriteria();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		caregiverAssignmentCriteria.patientIdentifier.eq(patient.getPersonID());
		PatientHealthcareActorAssignment[] assignments = PatientHealthcareActorAssignment.listPatientHealthcareActorAssignmentByCriteria(caregiverAssignmentCriteria);

		System.out.println(" Number of caregivers is:" + assignments.length);
		for (int j = 0; j < assignments.length; j++) {
			PatientHealthcareActorAssignment assignment = assignments[j];
			String careGiverID = assignment.getHealthcareActorIdentifier();

			PersonCriteria personCriteria = null;
			try {
				personCriteria = new PersonCriteria();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			personCriteria.identifier.eq(careGiverID);

			tr.com.srdc.icardea.hibernate.Person[] careGivers = tr.com.srdc.icardea.hibernate.Person.listPersonByCriteria(personCriteria);
			if (careGivers.length > 0) {
				Person careGiver = new Person();
				tr.com.srdc.icardea.hibernate.Person careGiverInDB = careGivers[0];
				careGiver.setIdentifier(careGiverInDB.getIdentifier());
				careGiver.setName(careGiverInDB.getName());
				careGiver.setSurname(careGiverInDB.getSurname());

				System.out.println(" $$$ Caregiver:"
					+ careGiverInDB.getIdentifier() + " for patient:"
					+ patient.getPersonID());
				tr.com.srdc.icardea.hibernate.Contact careGiverContactInDB = careGiverInDB.getContact();
				if (careGiverContactInDB != null) {
					careGiver.setContact(contactFromDB(careGiverContactInDB));
				}
				caregiversToBeFilled.add(careGiver);
			}
		}

		// TODO Auto-generated method stub
		return caregiversToBeFilled;
	}

	@Override
	public synchronized List<Person> createCaregiver(Patient patient,
		Person caregiver) {
		// ////////Yeni caregiver, patient in caregivers larina eklenecek
		// ////////Normalde bu caregiver patient da bulunmuyor
		
		System.out.println(" $$$ Caregivers length:" + patient.getCaregivers().size());
		patient.getCaregivers().add(caregiver);
		registerPatient(patient);
		// TODO Auto-generated method stub
		return listCaregivers(patient);
	}

	@Override
	public synchronized List<Person> updateCaregiver(Patient patient,
		Person caregiver) {
		// ////////Caregiver update edilecek
		// ////////Normalde bu caregiver patient da bulunuyor
		
		ArrayList<Person> caregivers = patient.getCaregivers();
		for (int i = 0; i < caregivers.size(); i++) {
			Person currCareGiver = caregivers.get(i);
			if (currCareGiver.getIdentifier().equals(caregiver.getIdentifier())) {
				caregivers.remove(i);
				caregivers.add(caregiver);
				patient.setCaregivers(caregivers);
				registerPatient(patient);
				break;
			}
		}

		// TODO Auto-generated method stub
		return listCaregivers(patient);
	}

	@Override
	public synchronized List<Person> deleteCaregiver(Patient patient,
		Person caregiver) {
		// ////////Caregiver delete edilecek
		// ////////Normalde bu caregiver patient da bulunuyor
		
		ArrayList<Person> caregivers = patient.getCaregivers();
		System.out.println("Patient caregiver size: " + patient.getCaregivers().size());
		for (int i = 0; i < caregivers.size(); i++) {
			Person currCareGiver = caregivers.get(i);
			if (currCareGiver.getIdentifier().equals(caregiver.getIdentifier())) {
				System.out.println("Caregiver : " + currCareGiver.getIdentifier());
				caregivers.remove(i);
				System.out.println("Patient caregiver size after : " + patient.getCaregivers().size());
				patient.setCaregivers(caregivers);
				System.out.println("Patient caregiver size after after : " + patient.getCaregivers().size());
				registerPatient(patient);
				System.out.println("Patient caregiver size after after after: " + patient.getCaregivers().size());
				break;
			}
		}
		// TODO Auto-generated method stub
		return listCaregivers(patient);
	}
}