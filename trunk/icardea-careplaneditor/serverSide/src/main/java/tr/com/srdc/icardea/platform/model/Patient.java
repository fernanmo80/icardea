package tr.com.srdc.icardea.platform.model;

import java.util.ArrayList;

import tr.com.srdc.icardea.platform.model.careplan.MedicalCareplan;


public class Patient {
	private String personID;
	private String name;
	private String surname;
	private String dateOfBirth;
	private String gender;
	private String initialDiagnosis;
	private ArrayList<String> idList = new ArrayList<String>();
	private ArrayList<String> ehrSubscriptions = new ArrayList<String>();
	private ArrayList<String> phrSubscriptions = new ArrayList<String>();
	private ArrayList<MedicalCareplan> assignedCareplans = new ArrayList<MedicalCareplan>();
	private String urgencyLevelForHCactor;
	private ArrayList<Person> caregivers = new ArrayList<Person>();
	private Contact contact = new Contact();
	
	
	public Patient() {
		
	}
	public String getPersonID() {
		return personID;
	}
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInitialDiagnosis() {
		return initialDiagnosis;
	}
	public void setInitialDiagnosis(String initialDiagnosis) {
		this.initialDiagnosis = initialDiagnosis;
	}
	public ArrayList<String> getIdList() {
		return idList;
	}
	public void setIdList(ArrayList<String> idList) {
		this.idList = idList;
	}
//	public Patient(String personID, String name, String surname,
//			String dateOfBirth, String gender, String initialDiagnosis,
//			ArrayList<String> idList) {
//		super();
//		this.personID = personID;
//		this.name = name;
//		this.surname = surname;
//		this.dateOfBirth = dateOfBirth;
//		this.gender = gender;
//		this.initialDiagnosis = initialDiagnosis;
//		this.idList = idList;
//	}
	public void setEhrSubscriptions(ArrayList<String> ehrSubscriptions) {
		this.ehrSubscriptions = ehrSubscriptions;
	}
	public ArrayList<String> getEhrSubscriptions() {
		return ehrSubscriptions;
	}
	public void setPhrSubscriptions(ArrayList<String> phrSubscriptions) {
		this.phrSubscriptions = phrSubscriptions;
	}
	public ArrayList<String> getPhrSubscriptions() {
		return phrSubscriptions;
	}
	public void setAssignedCareplans(ArrayList<MedicalCareplan> assignedCareplans) {
		this.assignedCareplans = assignedCareplans;
	}
	public ArrayList<MedicalCareplan> getAssignedCareplans() {
		return assignedCareplans;
	}
	public void setUrgencyLevelForHCactor(String urgencyLevelForHCactor) {
		this.urgencyLevelForHCactor = urgencyLevelForHCactor;
	}
	public String getUrgencyLevelForHCactor() {
		return urgencyLevelForHCactor;
	}
	public void setCaregivers(ArrayList<Person> caregivers) {
		this.caregivers = caregivers;
	}
	public ArrayList<Person> getCaregivers() {
		return caregivers;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
		
	}
