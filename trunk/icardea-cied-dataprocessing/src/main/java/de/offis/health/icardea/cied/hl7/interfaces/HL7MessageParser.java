/**
 * 
 */
package de.offis.health.icardea.cied.hl7.interfaces;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to parse HL7 messages.
 * 
 *
 */
public interface HL7MessageParser {
	/**
	 * This method will parse the HL7 message based on the provided message type.
	 * The segments will be stored in class variables that can be access by
	 * getXXXSegment methods.
	 * 
	 * @param hl7Message The HL7 message as String.
	 * @param hl7MessageType The HL7 message type as String (e.g "ORU_R01").
	 * @return Returns <code>true</code> if the message could be parsed without an error, otherwise <code>false</code>.
	 */
	// TODO: Add throwing an exception if not all required segments are found in the message. Create an own exception named IncompleteSegmentsException for that.
	public boolean parseMessage(String hl7Message, String hl7MessageType);
	public Object getMSHSegment(Object mshSegment);
	public Object getPIDSegment(Object pidSegment);
	public Object getOBRSegment(Object obrSegment);
}
