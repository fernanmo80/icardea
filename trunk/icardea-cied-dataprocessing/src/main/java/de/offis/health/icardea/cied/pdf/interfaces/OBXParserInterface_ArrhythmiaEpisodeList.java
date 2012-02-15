package de.offis.health.icardea.cied.pdf.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;
/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse the content of a OBX Segment under the title "ArrhythmiaEpisodeList" in PDF.
 * 
 * @author MYang
 */
public interface OBXParserInterface_ArrhythmiaEpisodeList {
	public String getMDC_IDC_EPISODE_ID() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_DTM() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_DURATION() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_VENDOR_TYPE() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_TYPE() throws PropertyNotFoundException;
	public String getMDC_IDC_EPISODE_THERAPY_RESULT() throws PropertyNotFoundException;
	
}