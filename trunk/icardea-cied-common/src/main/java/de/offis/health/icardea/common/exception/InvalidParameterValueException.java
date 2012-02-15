/**
 * 
 */
package de.offis.health.icardea.common.exception;

/**
 * This kind of exception should be thrown, if the given parameter
 * is not within the valid range of values.
 * 
 */
public class InvalidParameterValueException extends Exception {
	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = -8570606217740440663L;
	
	/**
	 * This constructor allows to create an exception with the given error message text.
	 * 
	 * @param message The error message to be used.
	 */
	public InvalidParameterValueException(String arg0) {
		super(arg0);
	}
}