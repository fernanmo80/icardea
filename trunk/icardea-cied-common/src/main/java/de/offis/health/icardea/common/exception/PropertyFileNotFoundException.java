/**
 * 
 */
package de.offis.health.icardea.common.exception;

/**
 * This kind of exception should be thrown, if the properties file
 * can't be found or accessed.
 * 
 */
public class PropertyFileNotFoundException extends Exception {
	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = -9042646720371655335L;
	
	/**
	 * This constructor allows to create an exception with the given error message text.
	 * 
	 * @param message The error message to be used.
	 */
	public PropertyFileNotFoundException(String arg0) {
		super(arg0);
	}
	
	/**
	 * This constructor allows to create an exception with the given
	 * error message text and cause.
	 * 
	 * @param message The error message to be used.
	 * @param cause The cause from the original exception.
	 */
	public PropertyFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
