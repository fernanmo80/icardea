/**
 * 
 */
package de.offis.health.icardea.common.exception;

/**
 * This kind of exception should be thrown, if an error occurred while reading
 * properties from a Property object which do not exist.
 * 
 */
public class PropertyNotFoundException extends Exception {
	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = 3729379362526550411L;
	
	/**
	 * This constructor allows to create an exception with the given error message text.
	 * 
	 * @param message The error message to be used.
	 */
	public PropertyNotFoundException(String arg0) {
		super(arg0);
	}
}
