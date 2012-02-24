package de.offis.health.icardea.cied.pdf.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse the content of a OBX Segment under the title "Parameters" in PDF.
 * 
 * @author MYang
 */
public interface OBXParserInterface_Parameters {
	
	public String getMDC_IDC_PG_IMPLANT_DT() throws PropertyNotFoundException;
	
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE() throws PropertyNotFoundException;
	
	/*
	 * MDC_IDC_SET_BRADY
	 */
	public String getMDC_IDC_ENUM_BRADY_MODE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_LOWRATE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_MAX_TRACKING_RATE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_MAX_SENSOR_RATE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_SAV_DELAY() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_PAV_DELAY() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_AT_MODE_SWITCH_RATE() throws PropertyNotFoundException;
	
	
	
	//VT VF Zone Information
	/*
	 * OBX|102|CWE|731712^MDC_IDC_SET_ZONE_VENDOR_TYPE^MDC|1|773188^MDC_IDC_ENUM_ZONE_VENDOR_TYPE_STJ-Zone_VT1^MDC||||||F|||20090807053721
	   OBX|103|CWE|731648^MDC_IDC_SET_ZONE_TYPE^MDC|1|754946^MDC_IDC_ENUM_ZONE_TYPE_Zone_VT^MDC||||||F|||20090807053721
	   OBX|104|CWE|731776^MDC_IDC_SET_ZONE_STATUS^MDC|1|755009^MDC_IDC_ENUM_ZONE_STATUS_Active^MDC||||||F|||20090807053721
	   OBX|105|NM|731840^MDC_IDC_SET_ZONE_DETECTION_INTERVAL^MDC|1|430|ms|||||F|||20090807053721
	 */
	public String getMDC_IDC_SET_ZONE_VENDOR_TYPE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_ZONE_TYPE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_ZONE_STATUS() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_ZONE_DETECTION_INTERVAL() throws PropertyNotFoundException;
	
	//Number of Zone
	//public String getICARDEA_IDC_SET_ZONE_NUM() throws PropertyNotFoundException;
	//VT
	//public String getICARDEA_IDC_SET_LIMIT_VT1() throws PropertyNotFoundException;
	//FVT
	//public String getICARDEA_IDC_SET_LIMIT_VT2() throws PropertyNotFoundException;
	//VF
	//public String getICARDEA_IDC_SET_LIMIT_VF() throws PropertyNotFoundException;
	
	/*
	 * Example to show how add new parameters
	 */
	public String getICARDEA_IDC_SET_NCAP() throws PropertyNotFoundException;
}
