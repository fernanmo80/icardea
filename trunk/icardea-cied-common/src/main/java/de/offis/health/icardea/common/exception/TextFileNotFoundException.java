/**
 * 
 */
package de.offis.health.icardea.common.exception;

/**
 * This kind of exception should be thrown, if the text file
 * can't be found or accessed.
 * 
 *
 */
public class TextFileNotFoundException extends Exception {
	/**
	 * Generated serial version
	 */
	private static final long serialVersionUID = 3835139264092141387L;
	
	/**
	 * This constructor allows to create an exception with the given
	 * error message text.
	 * 
	 * @param message The error message to be used.
	 */
	public TextFileNotFoundException(String arg0) {
		super(arg0);
	}
	
	/**
	 * This constructor allows to create an exception with the given
	 * error message text and cause.
	 * 
	 * @param message The error message to be used.
	 * @param cause The cause from the original exception.
	 */
	public TextFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}