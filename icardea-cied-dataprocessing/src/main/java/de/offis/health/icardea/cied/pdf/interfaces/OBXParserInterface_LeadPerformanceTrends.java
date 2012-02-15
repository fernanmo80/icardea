package de.offis.health.icardea.cied.pdf.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse the content of a OBX Segment under the title "Lead Performance Trends" in PDF.
 * 
 * @author MYang
 */
public interface OBXParserInterface_LeadPerformanceTrends {
	
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE() throws PropertyNotFoundException;
	//public String getMDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE() throws PropertyNotFoundException;
	//public String getMDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE() throws PropertyNotFoundException;
	
	
	/*MDC_IDC_MSMT_LEADCHNL_[CHAMBER]_PACING_THRESHOLD
	 * RV lead pacing threshold
	 * LV lead pacing threshold
	 * RA lead pacing threshold
	 */
	//MDC_IDC_MSMT_LEADCHNL_[CHAMBER]_PACING_THRESHOLD_AMPLITUDE
	//public String getMDC_IDC_MSMT_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_RV_PACING_THRESHOLD_AMPLITUDE() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_LV_PACING_THRESHOLD_AMPLITUDE() throws PropertyNotFoundException;
	
	//MDC_IDC_MSMT_LEADCHNL_[CHAMBER]_PACING_THRESHOLD_PULSEWIDTH
	//public String getMDC_IDC_MSMT_LEADCHNL_RA_PACING_THRESHOLD_PULSEWIDTH() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_RV_PACING_THRESHOLD_PULSEWIDTH() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_LV_PACING_THRESHOLD_PULSEWIDTH() throws PropertyNotFoundException;

	//MDC_IDC_MSMT_LEADCHNL_[CHAMBER]_PACING_THRESHOLD_POLARITY
	//public String getMDC_IDC_MSMT_LEADCHNL_RA_PACING_THRESHOLD_POLARITY() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_RV_PACING_THRESHOLD_POLARITY() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_LV_PACING_THRESHOLD_POLARITY() throws PropertyNotFoundException;
	
	/*MDC_IDC_MSMT_LEADCHNL_[CHAMBER]_IMPEDANCE
	 *Pacing Impedance
	 */
	//MDC_IDC_MSMT_LEADCHNL_[CHAMBER]_IMPEDANCE_VALUE
	//public String getMDC_IDC_MSMT_LEADCHNL_RA_IMPEDANCE_VALUE() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_RV_IMPEDANCE_VALUE() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_LV_IMPEDANCE_VALUE() throws PropertyNotFoundException;
	
	//MDC_IDC_MSMT_LEADCHNL_[CHAMBER]_IMPEDANCE_POLARITY
	//public String getMDC_IDC_MSMT_LEADCHNL_RA_IMPEDANCE_POLARITY() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_RV_IMPEDANCE_POLARITY() throws PropertyNotFoundException;
	//public String getMDC_IDC_MSMT_LEADCHNL_LV_IMPEDANCE_POLARITY() throws PropertyNotFoundException;
	
	//MDC_IDC_SET_LEADCHNL_[CHAMBER]_PACING_CAPTURE_MODE
	//public String getMDC_IDC_SET_LEADCHNL_RA_PACING_CAPTURE_MODE() throws PropertyNotFoundException;
	//public String getMDC_IDC_SET_LEADCHNL_RV_PACING_CAPTURE_MODE() throws PropertyNotFoundException;
	//public String getMDC_IDC_SET_LEADCHNL_LV_PACING_CAPTURE_MODE() throws PropertyNotFoundException;
	
	//MDC_IDC_MSMT_LEADHVCHNL_STATUS
	/*
	MDC_IDC_MSMT_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE 722176
	MDC_IDC_MSMT_LEADCHNL_RV_PACING_THRESHOLD_AMPLITUDE 722177
	MDC_IDC_MSMT_LEADCHNL_LA_PACING_THRESHOLD_AMPLITUDE 722179
	
	MDC_IDC_MSMT_LEADCHNL_RA_SENSING_POLARITY
	MDC_IDC_MSMT_LEADCHNL_RV_SENSING_POLARITY
	MDC_IDC_MSMT_LEADCHNL_LA_SENSING_POLARITY
	*/
}
