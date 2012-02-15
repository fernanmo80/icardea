package de.offis.health.icardea.cied.pdf.interfaces;

import java.io.File;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public interface PIDParserInterface {
	
	public String getPID_setID() throws PropertyNotFoundException;
	public String getPID_patientIdentifierList_idNumber() throws PropertyNotFoundException;
	public String getPID_patientIdentifierList_idNumber(File txtFile) throws PropertyNotFoundException;
	public String getPID_patientIdentifierList_assigningAuthority() throws PropertyNotFoundException;
	public String getPID_patientIdentifierList_patientIdentifierTypeCode() throws PropertyNotFoundException;
	public String getPID_patientIdentifierList_idNumber2() throws PropertyNotFoundException;
	public String getPID_patientIdentifierList_assigningAuthority2() throws PropertyNotFoundException;
	public String getPID_patientIdentifierList_patientIdentifierTypeCode2() throws PropertyNotFoundException;
	public String getPID_patientName_familyName() throws PropertyNotFoundException;
	public String getPID_patientName_givenName() throws PropertyNotFoundException;
	public String getPID_patientName_secondName() throws PropertyNotFoundException;
	public String getPID_patientName_suffix() throws PropertyNotFoundException;
	public String getPID_data_timeOfBorth_dataofbirth() throws PropertyNotFoundException;
	public String getPID_administrativeSex() throws PropertyNotFoundException;
	public String getPID_patientAddress_street() throws PropertyNotFoundException;
	public String getPID_patientAddress_city() throws PropertyNotFoundException;
	public String getPID_patientAddress_state_province() throws PropertyNotFoundException;
	public String getPID_patientAddress_postalCode() throws PropertyNotFoundException;
	public String getPID_patientAddress_country() throws PropertyNotFoundException;
}
