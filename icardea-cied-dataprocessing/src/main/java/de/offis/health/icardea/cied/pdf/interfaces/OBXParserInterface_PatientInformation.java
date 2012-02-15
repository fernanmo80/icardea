package de.offis.health.icardea.cied.pdf.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse the content of a OBX Segment under the title "Patient Information" in PDF.
 * 
 * @author MYang
 */
public interface OBXParserInterface_PatientInformation {
	public String getMDC_IDC_LEAD_MODEL(int lead_index) throws PropertyNotFoundException;
	public String getMDC_IDC_LEAD_SERIAL(int lead_index) throws PropertyNotFoundException;
	public String getMDC_IDC_LEAD_MFG(int lead_index) throws PropertyNotFoundException;
	public String getMDC_IDC_LEAD_IMPLANT_DT(int lead_index) throws PropertyNotFoundException;
	public String getMDC_IDC_LEAD_LOCATION(int lead_index) throws PropertyNotFoundException;
	//MDC_IDC_LEAD_LOCATION
	//public String getMDC_IDC_LEAD_LOCATION_DETAIL_1() throws PropertyNotFoundException;
	//public String getMDC_IDC_LEAD_LOCATION_DETAIL_2() throws PropertyNotFoundException;
	//public String getMDC_IDC_LEAD_LOCATION_DETAIL_3() throws PropertyNotFoundException;
}