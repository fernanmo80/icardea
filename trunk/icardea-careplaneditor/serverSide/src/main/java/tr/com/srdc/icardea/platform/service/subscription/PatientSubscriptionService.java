package tr.com.srdc.icardea.platform.service.subscription;

import java.util.ArrayList;
import java.util.List;

import tr.com.srdc.icardea.platform.model.Patient;
import tr.com.srdc.icardea.platform.model.Person;
import tr.com.srdc.icardea.platform.model.careplan.MedicalCareplan;



public interface PatientSubscriptionService {
	void registerPatient(Patient p);
	List<Patient> listRegisteredPatients();
	ArrayList<MedicalCareplan> listGuidelines(Patient p);
	void setSubscriptions(Patient p);
	void setPatientInfo(Patient p);
	
	List<Patient> listPatients();
	List<Patient> createPatient(Patient patient);
	List<Patient> updatePatient(Patient patient);
	List<Patient> deletePatient(Patient patient);
	
	List<Person> listCaregivers(Patient patient);
	List<Person> createCaregiver(Patient patient, Person caregiver);
	List<Person> updateCaregiver(Patient patient, Person caregiver);
	List<Person> deleteCaregiver(Patient patient, Person caregiver);
	
}
