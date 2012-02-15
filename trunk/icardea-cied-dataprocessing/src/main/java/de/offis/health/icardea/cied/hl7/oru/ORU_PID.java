package de.offis.health.icardea.cied.hl7.oru;

public class ORU_PID {
	//PID Segment  IHE_PCD_TF_Rev1-2_Vol2_TI_2010-09-30.pdf page 45
	public String setID="";
	public String patientIdentifierList_idNumber="";
	public String patientIdentifierList_assigningAuthority="";
	public String patientIdentifierList_patientIdentifierTypeCode="";
	public String patientIdentifierList_idNumber2="";
	public String patientIdentifierList_assigningAuthority2="";
	public String patientIdentifierList_patientIdentifierTypeCode2="";
	
	public String patientName_familyName="";
	public String patientName_givenName="";
	public String patientName_secondName="";
	public String patientName_suffix="";
	public String data_timeOfBorth_dataofbirth="";
	public String administrativeSex="";
	public String patientAddress_street="";
	public String patientAddress_city="";
	public String patientAddress_postalCode="";
	public String patientAddress_country="";
	public String patientAddress_state_province="";
	/**
	 * @return the setID
	 */
	public String getSetID() {
		return setID;
	}
	/**
	 * @param setID the setID to set
	 */
	public void setSetID(String setID) {
		this.setID = setID;
	}
	/**
	 * @return the patientIdentifierList_idNumber
	 */
	public String getPatientIdentifierList_idNumber() {
		return patientIdentifierList_idNumber;
	}
	/**
	 * @param patientIdentifierListIdNumber the patientIdentifierList_idNumber to set
	 */
	public void setPatientIdentifierList_idNumber(
			String patientIdentifierListIdNumber) {
		patientIdentifierList_idNumber = patientIdentifierListIdNumber;
	}
	/**
	 * @return the patientIdentifierList_assigningAuthority
	 */
	public String getPatientIdentifierList_assigningAuthority() {
		return patientIdentifierList_assigningAuthority;
	}
	/**
	 * @param patientIdentifierListAssigningAuthority the patientIdentifierList_assigningAuthority to set
	 */
	public void setPatientIdentifierList_assigningAuthority(
			String patientIdentifierListAssigningAuthority) {
		patientIdentifierList_assigningAuthority = patientIdentifierListAssigningAuthority;
	}
	/**
	 * @return the patientIdentifierList_patientIdentifierTypeCode
	 */
	public String getPatientIdentifierList_patientIdentifierTypeCode() {
		return patientIdentifierList_patientIdentifierTypeCode;
	}
	/**
	 * @param patientIdentifierListPatientIdentifierTypeCode the patientIdentifierList_patientIdentifierTypeCode to set
	 */
	public void setPatientIdentifierList_patientIdentifierTypeCode(
			String patientIdentifierListPatientIdentifierTypeCode) {
		patientIdentifierList_patientIdentifierTypeCode = patientIdentifierListPatientIdentifierTypeCode;
	}
	/**
	 * @return the patientIdentifierList_idNumber2
	 */
	public String getPatientIdentifierList_idNumber2() {
		return patientIdentifierList_idNumber2;
	}
	/**
	 * @param patientIdentifierListIdNumber2 the patientIdentifierList_idNumber2 to set
	 */
	public void setPatientIdentifierList_idNumber2(
			String patientIdentifierListIdNumber2) {
		patientIdentifierList_idNumber2 = patientIdentifierListIdNumber2;
	}
	/**
	 * @return the patientIdentifierList_assigningAuthority2
	 */
	public String getPatientIdentifierList_assigningAuthority2() {
		return patientIdentifierList_assigningAuthority2;
	}
	/**
	 * @param patientIdentifierListAssigningAuthority2 the patientIdentifierList_assigningAuthority2 to set
	 */
	public void setPatientIdentifierList_assigningAuthority2(
			String patientIdentifierListAssigningAuthority2) {
		patientIdentifierList_assigningAuthority2 = patientIdentifierListAssigningAuthority2;
	}
	/**
	 * @return the patientIdentifierList_patientIdentifierTypeCode2
	 */
	public String getPatientIdentifierList_patientIdentifierTypeCode2() {
		return patientIdentifierList_patientIdentifierTypeCode2;
	}
	/**
	 * @param patientIdentifierListPatientIdentifierTypeCode2 the patientIdentifierList_patientIdentifierTypeCode2 to set
	 */
	public void setPatientIdentifierList_patientIdentifierTypeCode2(
			String patientIdentifierListPatientIdentifierTypeCode2) {
		patientIdentifierList_patientIdentifierTypeCode2 = patientIdentifierListPatientIdentifierTypeCode2;
	}
	/**
	 * @return the patientName_familyName
	 */
	public String getPatientName_familyName() {
		return patientName_familyName;
	}
	/**
	 * @param patientNameFamilyName the patientName_familyName to set
	 */
	public void setPatientName_familyName(String patientNameFamilyName) {
		patientName_familyName = patientNameFamilyName;
	}
	/**
	 * @return the patientName_givenName
	 */
	public String getPatientName_givenName() {
		return patientName_givenName;
	}
	/**
	 * @param patientNameGivenName the patientName_givenName to set
	 */
	public void setPatientName_givenName(String patientNameGivenName) {
		patientName_givenName = patientNameGivenName;
	}
	/**
	 * @return the patientName_secondName
	 */
	public String getPatientName_secondName() {
		return patientName_secondName;
	}
	/**
	 * @param patientNameSecondName the patientName_secondName to set
	 */
	public void setPatientName_secondName(String patientNameSecondName) {
		patientName_secondName = patientNameSecondName;
	}
	/**
	 * @return the patientName_suffix
	 */
	public String getPatientName_suffix() {
		return patientName_suffix;
	}
	/**
	 * @param patientNameSuffix the patientName_suffix to set
	 */
	public void setPatientName_suffix(String patientNameSuffix) {
		patientName_suffix = patientNameSuffix;
	}
	/**
	 * @return the data_timeOfBorth_dataofbirth
	 */
	public String getData_timeOfBorth_dataofbirth() {
		return data_timeOfBorth_dataofbirth;
	}
	/**
	 * @param dataTimeOfBorthDataofbirth the data_timeOfBorth_dataofbirth to set
	 */
	public void setData_timeOfBorth_dataofbirth(String dataTimeOfBorthDataofbirth) {
		data_timeOfBorth_dataofbirth = dataTimeOfBorthDataofbirth;
	}
	/**
	 * @return the administrativeSex
	 */
	public String getAdministrativeSex() {
		return administrativeSex;
	}
	/**
	 * @param administrativeSex the administrativeSex to set
	 */
	public void setAdministrativeSex(String administrativeSex) {
		this.administrativeSex = administrativeSex;
	}
	/**
	 * @return the patientAddress_street
	 */
	public String getPatientAddress_street() {
		return patientAddress_street;
	}
	/**
	 * @param patientAddressStreet the patientAddress_street to set
	 */
	public void setPatientAddress_street(String patientAddressStreet) {
		patientAddress_street = patientAddressStreet;
	}
	/**
	 * @return the patientAddress_city
	 */
	public String getPatientAddress_city() {
		return patientAddress_city;
	}
	/**
	 * @param patientAddressCity the patientAddress_city to set
	 */
	public void setPatientAddress_city(String patientAddressCity) {
		patientAddress_city = patientAddressCity;
	}
	/**
	 * @return the patientAddress_postalCode
	 */
	public String getPatientAddress_postalCode() {
		return patientAddress_postalCode;
	}
	/**
	 * @param patientAddressPostalCode the patientAddress_postalCode to set
	 */
	public void setPatientAddress_postalCode(String patientAddressPostalCode) {
		patientAddress_postalCode = patientAddressPostalCode;
	}
	/**
	 * @return the patientAddress_country
	 */
	public String getPatientAddress_country() {
		return patientAddress_country;
	}
	/**
	 * @param patientAddressCountry the patientAddress_country to set
	 */
	public void setPatientAddress_country(String patientAddressCountry) {
		patientAddress_country = patientAddressCountry;
	}
	/**
	 * @return the patientAddress_state_province
	 */
	public String getPatientAddress_state_province() {
		return patientAddress_state_province;
	}
	/**
	 * @param patientAddressStateProvince the patientAddress_state_province to set
	 */
	public void setPatientAddress_state_province(String patientAddressStateProvince) {
		patientAddress_state_province = patientAddressStateProvince;
	}
	
	}