package de.offis.health.icardea.cied.pdf.interfaces;

import java.io.File;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public interface OBXParserInterface {
	
	public String getMDC_IDC_EPISODE_ID() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_DTM() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_DURATION() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_VENDOR_TYPE() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_TYPE() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_THERAPY_RESULT() throws PropertyNotFoundException;
	
	public String getMDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY() throws PropertyNotFoundException;
	
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE() throws PropertyNotFoundException;
	
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH() throws PropertyNotFoundException;
	
	public String getMDC_IDC_SET_BRADY_AT_MODE_SWITCH_MODE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_MAX_TRACKING_RATE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_MAX_SENSOR_RATE() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_PAV_DELAY() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_BRADY_SAV_DELAY() throws PropertyNotFoundException;
	
	public String getMDC_IDC_MSMT_CAP_CHARGE_DTM() throws PropertyNotFoundException;
	public String getMDC_IDC_MSMT_CAP_CHARGE_TIME() throws PropertyNotFoundException;
	
	public String getMDC_IDC_MSMT_BATTERY_VOLTAGE() throws PropertyNotFoundException;
	public String getMDC_IDC_MSMT_BATTERY_DTM() throws PropertyNotFoundException;
	
	public String getMDC_IDC_MSMT_LEADHVCHNL_STATUS() throws PropertyNotFoundException;

	public String getMDC_IDC_LEAD_CONNECTION_STATUS() throws PropertyNotFoundException;
	

	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT() throws PropertyNotFoundException;
	
	public String getMDC_IDC_PG_TYPE() throws PropertyNotFoundException;
	public String getMDC_IDC_PG_MODEL(File txtFile) throws PropertyNotFoundException;
	public String getMDC_IDC_PG_MODEL() throws PropertyNotFoundException;
	public String getMDC_IDC_PG_SERIAL(File txtFile) throws PropertyNotFoundException;
	public String getMDC_IDC_PG_SERIAL() throws PropertyNotFoundException;
	public String getMDC_IDC_PG_MFG() throws PropertyNotFoundException;
	public String getMDC_IDC_SESS_DTM(File txtFile) throws PropertyNotFoundException;
	public String getMDC_IDC_SESS_DTM() throws PropertyNotFoundException;
	public String getMDC_IDC_SESS_TYPE() throws PropertyNotFoundException;
}
