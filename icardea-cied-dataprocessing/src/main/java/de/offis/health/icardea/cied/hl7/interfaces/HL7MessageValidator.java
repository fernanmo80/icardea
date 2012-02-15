/**
 * 
 */
package de.offis.health.icardea.cied.hl7.interfaces;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to validate HL7 messages.
 * 
 *
 */
public interface HL7MessageValidator {
	/**
	 * This method will validate the HL7 message based on the provided message type.
	 * 
	 * @param hl7Message The HL7 message as String.
	 * @param hl7MessageType The HL7 message type as String (e.g "ORU_R01").
	 * @return Returns <code>true</code> if the message could be validated without an error, otherwise <code>false</code>.
	 */
	// TODO: Add throwing an exception if unknown elements are found.
	// TODO: Check if we can provide our own Enum here which will be checked in the concrete implementation to use the HL7 library specific message type.
	public boolean validateMessage(String hl7Message, String hl7MessageType);
}
