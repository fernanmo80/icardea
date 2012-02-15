package de.offis.health.icardea.cied.pdf.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse the content of a OBX Segment under the title "Battery and Lead Measurement" in PDF.
 * 
 * @author MYang
 */
public interface OBXParserInterface_BatteryandLead {
	public String getMDC_IDC_MSMT_BATTERY_IMPEDANCE() throws PropertyNotFoundException;
	public String getMDC_IDC_MSMT_BATTERY_VOLTAGE() throws PropertyNotFoundException;
	public String getMDC_IDC_MSMT_CAP_CHARGE_TIME() throws PropertyNotFoundException;
	public String getMDC_IDC_MSMT_CAP_CHARGE_DTM() throws PropertyNotFoundException;
	
	public String getICARDEA_IDC_SET_VV() throws PropertyNotFoundException;
}
