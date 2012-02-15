package de.offis.health.icardea.cied.hl7.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public interface HL7Parser {
	
	public String getDeviceName() throws PropertyNotFoundException;
	
	public String getHL7_ORU_MSH() throws PropertyNotFoundException;
	public String getHL7_ORU_PID() throws PropertyNotFoundException;
	public String getHL7_ORU_PV1() throws PropertyNotFoundException;
	public String getHL7_ORU_OBR() throws PropertyNotFoundException;
	public String getHL7_ORU_NTE() throws PropertyNotFoundException;
	
	public String getMDC_IDC_MSMT_BATTERY_VOLTAGE() throws PropertyNotFoundException;
	public String getMDC_IDC_MSMT_LEADHVCHNL_STATUS() throws PropertyNotFoundException;
	public String getMDC_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE() throws PropertyNotFoundException;
	public String getMDC_IDC_LEAD_CONNECTION_STATUS () throws PropertyNotFoundException;

	//AF
	public String getMDC_IDC_EPISODE_DURATION_AF() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_TYPE_AF() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_TYPE_SVT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_AF() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_AF() throws PropertyNotFoundException;
	
	//VT
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_VT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_VT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT_VT() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_TYPE_VT() throws PropertyNotFoundException;
}
