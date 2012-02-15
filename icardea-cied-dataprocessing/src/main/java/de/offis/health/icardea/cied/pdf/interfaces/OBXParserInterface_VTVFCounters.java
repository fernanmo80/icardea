package de.offis.health.icardea.cied.pdf.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse the content of a OBX Segment under the title "VT/VFCounters" in PDF.
 * 
 * @author MYang
 */
public interface OBXParserInterface_VTVFCounters {
	
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_TYPE_AF() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_TYPE_SVT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_TYPE_NSVT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_TYPE_FVT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_TYPE_VF() throws PropertyNotFoundException;
	
	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_AF() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_SVT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_NSVT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_VT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_FVT() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_VF() throws PropertyNotFoundException;
	
	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START() throws PropertyNotFoundException;
	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END() throws PropertyNotFoundException;
	//public String getMDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT() throws PropertyNotFoundException;
}
