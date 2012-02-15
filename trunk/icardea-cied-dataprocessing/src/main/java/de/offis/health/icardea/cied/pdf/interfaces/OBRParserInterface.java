package de.offis.health.icardea.cied.pdf.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse the content of a OBR Segment.
 * 
 * @author MYang
 */
public interface OBRParserInterface {
	
	public String getOBR_setID() throws PropertyNotFoundException;
	public String getOBR_placerOrderNumber_entityIdentifier() throws PropertyNotFoundException;
	public String getOBR_fillerOrderNumber_entityIdentifier() throws PropertyNotFoundException;
	public String getOBR_universalServiceIdentifier_identifier() throws PropertyNotFoundException;
	public String getOBR_universalServiceIdentifier_text() throws PropertyNotFoundException;
	public String getOBR_observationData_Time_time() throws PropertyNotFoundException;
	public String getOBR_observationEndData_Time_time() throws PropertyNotFoundException;
	public String getOBR_resultsRptStatusChngDate_Time_time() throws PropertyNotFoundException;
	public String getOBR_resultStatus() throws PropertyNotFoundException;
}
