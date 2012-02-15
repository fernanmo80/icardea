/**
 * 
 */
package de.offis.health.icardea.cied.pdf.interfaces;

import java.util.List;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse the content of a PDF file.
 * 
 *
 */
public interface PDFParser {
	/**
	 * The separator used to simply list some items (e.g. the names of month
	 * to be processed by the implemented parser classes).
	 */
	public final static String SEPARATOR_SIMPLE_LIST = ",";
	
	/**
	 * Property key constant for the main categories (one or more pages) in
	 * a generated PDF report file to be used in the properties file to
	 * store the configuration value.
	 */
	public final static String PROPERTY_KEY_MAIN_CATEGORIES = "PDFPARSER_MAIN_CATEGORIES";
	
	/**
	 * Property key constant for the sub categories (one or more pages)
	 * in a generated PDF report file to be used in the properties file to
	 * store the configuration value.
	 */
	public final static String PROPERTY_KEY_SUB_CATEGORIES = "PDFPARSER_SUB_CATEGORIES";
	
	/**
	 * Property key constant for the sub categories (one or more pages)
	 * in a generated PDF report file to be used in the properties file to
	 * store the configuration value.
	 */
	public final static String PROPERTY_KEY_LANGUAGE_SETTING = "PDFPARSER_LANGUAGE_SETTING";
	
	/**
	 * This method will access the property storage to return
	 * the setting for the given key.
	 * 
	 * @param key The key to get from the property storage.
	 * @return Returns the value for the given key or null of the setting can't be found.
	 * @throws PropertyNotFoundException
	 */
	public String getProperty(String key) throws PropertyNotFoundException;
	
	/**
	 * This method allows to store a new PDF content the parser can process.
	 * 
	 * @param pdfContent The PDF content to store.
	 */
	public void setPdfContent(String pdfContent);
	
	/**
	 * This method will return the stored PDF content from the parser.
	 * 
	 * @return The stored PDF content.
	 */
	public String getPdfContent();
	
	/**
	 * This method will returns a list of supported device names.
	 * 
	 * @return Returns a list of supported device names.
	 */
	public List<String> getSupportedDeviceList();
	
	/**
	 * This method will parse the extracted content of the PDF and
	 * returns the name of the CIED device.
	 * 
	 * @return The name of the CIED device.
	 * @throws PropertyNotFoundException
	 */
	public String getDeviceName() throws PropertyNotFoundException;
	
	/**
	 * This method will parse the extracted content of the PDF and
	 * returns the serial number of the CIED device.
	 * 
	 * @return Returns the serial number of the CIED device.
	 * @throws PropertyNotFoundException
	 */
	public String getDeviceSerial() throws PropertyNotFoundException;
	
	/**
	 * This method will parse the extracted content of the PDF and
	 * returns the interrogation date of the CIED device.
	 * 
	 * @return Returns the device interrogation date of the CIED device.
	 * @throws PropertyNotFoundException
	 */
	public String getDeviceInterrogationDate() throws PropertyNotFoundException;
	
	/**
	 * This method is called when the object is destroyed.
	 * To help the garbage collector removing no longer used
	 * references it does help to close so far unclosed references
	 * manually and set other objects to null.
	 */
	public void dispose();
	
	/**
	 * 
	 * @return
	 */
	//MSH
	/*
	public String getMSH_fieldSeparator() throws PropertyNotFoundException;
	public String getMSH_encodingCharacters() throws PropertyNotFoundException;
	public String getMSH_sendingApplication() throws PropertyNotFoundException;
	public String getMSH_sendingFacility() throws PropertyNotFoundException;
	public String getMSH_receivingApplication() throws PropertyNotFoundException;
	public String getMSH_receivingFacility() throws PropertyNotFoundException;
	public String getMSH_messageType_messagecode() throws PropertyNotFoundException;
	public String getMSH_messageType_triggerevent() throws PropertyNotFoundException;
	public String getMSH_messageType_message_structure_id() throws PropertyNotFoundException;
	public String getMSH_messageControlID() throws PropertyNotFoundException;
	public String getMSH_processingID() throws PropertyNotFoundException;
	public String getMSH_versionID() throws PropertyNotFoundException;
	*/
	//PID
	/*
	public String getPID_setID() throws PropertyNotFoundException;
	public String getPID_patientIdentifierList_idNumber() throws PropertyNotFoundException;
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
	*/
	//OBR
	
	/*
	public String getOBR_setID() throws PropertyNotFoundException;
	public String getOBR_placerOrderNumber_entityIdentifier() throws PropertyNotFoundException;
	public String getOBR_fillerOrderNumber_entityIdentifier() throws PropertyNotFoundException;
	public String getOBR_universalServiceIdentifier_identifier() throws PropertyNotFoundException;
	public String getOBR_universalServiceIdentifier_text() throws PropertyNotFoundException;
	public String getOBR_observationData_Time_time() throws PropertyNotFoundException;
	public String getOBR_observationEndData_Time_time() throws PropertyNotFoundException;
	public String getOBR_resultsRptStatusChngDate_Time_time() throws PropertyNotFoundException;
	public String getOBR_resultStatus() throws PropertyNotFoundException;
	
	//PV1
	public String getPV1_set_id() throws PropertyNotFoundException;
	public String getPV1_patient_class() throws PropertyNotFoundException;
	public String getPV1_attendingDoctor_id_number() throws PropertyNotFoundException;
	public String getPV1_attendingDoctor_family_name() throws PropertyNotFoundException;
	public String getPV1_attendingDoctor_given_name() throws PropertyNotFoundException;
	public String getPV1_attendingDoctor_further_given_name() throws PropertyNotFoundException;
	public String getPV1_attendingDoctor_suffix() throws PropertyNotFoundException;
	public String getPV1_attendingDoctor_prefix() throws PropertyNotFoundException;
	public String getPV1_visitNumber_id_number() throws PropertyNotFoundException;

	//ORX Device+AF+VT
	//Device
	public String getMDC_IDC_MSMT_BATTERY_VOLTAGE() throws PropertyNotFoundException;
	public String getMDC_IDC_MSMT_LEADHVCHNL_STATUS() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE() throws PropertyNotFoundException;
	public String getMDC_IDC_LEAD_CONNECTION_STATUS() throws PropertyNotFoundException;
	
	//AF
	public String getMDC_IDC_EPISODE_DURATION_AF() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_TYPE_AF() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_TYPE_SVT() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_TYPE_VT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT() throws PropertyNotFoundException;
	
	public String getMDC_IDC_PG_TYPE() throws PropertyNotFoundException;
	public String getMDC_IDC_PG_MODEL() throws PropertyNotFoundException;
	public String getMDC_IDC_PG_SERIAL() throws PropertyNotFoundException;
	public String getMDC_IDC_PG_MFG() throws PropertyNotFoundException;
	public String getMDC_IDC_SESS_DTM() throws PropertyNotFoundException;
	public String getMDC_IDC_SESS_TYPE() throws PropertyNotFoundException;
	*/
}