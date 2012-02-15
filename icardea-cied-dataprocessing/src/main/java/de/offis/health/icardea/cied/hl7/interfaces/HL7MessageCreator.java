/**
 * 
 */
package de.offis.health.icardea.cied.hl7.interfaces;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to create new HL7 messages.
 * 
 *
 */
public interface HL7MessageCreator {
	/**
	 * <p>
	 * This method will create the HL7 message.
	 * Based on the provided message type the segments will be
	 * included into the message.
	 * </p>
	 * <p>
	 * This requires that each of the required (by the HL7 message type)
	 * segments have to be called before calling this method.
	 * </p>
	 * 
	 * @param hl7MessageType The HL7 message type as String (e.g "ORU_R01").
	 * @return Returns <code>true</code> if the message could be created without an error, otherwise <code>false</code>.
	 */
	// TODO: Add throwing an exception if not all required segments have been provided by calling the setXXXSegment methods. Create an own exception named IncompleteSegmentsException for that.
	public boolean createMessage(String hl7MessageType);
	public void setMSHSegment(Object mshSegment);
	public void setPIDSegment(Object pidSegment);
	public void setOBRSegment(Object obrSegment);
}
