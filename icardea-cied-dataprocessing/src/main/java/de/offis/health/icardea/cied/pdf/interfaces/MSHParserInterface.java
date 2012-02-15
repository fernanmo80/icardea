package de.offis.health.icardea.cied.pdf.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse the content of a MSH Segment.
 * 
 * @author MYang
 */
public interface MSHParserInterface {

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
	
}
