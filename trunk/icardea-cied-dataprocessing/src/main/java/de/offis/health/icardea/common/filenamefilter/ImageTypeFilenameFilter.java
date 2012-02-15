/**
 * 
 */
package de.offis.health.icardea.common.filenamefilter;

import java.io.File;
import java.io.FilenameFilter;

import org.apache.log4j.Logger;

/**
 * Class that implements the FilenameFilter Interface. This implementation
 * filters for files where the name ends with Strings like <code>.jpg</code>,
 * <code>.jpeg</code>, <code>.png</code>, <code>.tiff</code>, <code>.tif</code>,
 * and <code>.gif</code>.
 * 
 *
 */
public class ImageTypeFilenameFilter implements FilenameFilter {
	/**
	 * Logger object
	 */
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(ImageTypeFilenameFilter.class);
	
	/**
	 * This method overwrites the accept method from 
	 * {@link java.io.FilenameFilter#accept(java.io.File, java.lang.String)}.
	 * It will check if the filename String ends with the defined strings.
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	public boolean accept(File file, String name) {
		boolean returnCode = false;
		if (name != null) {
			String lowerCaseName = name.toLowerCase();
			if (lowerCaseName.endsWith(".jpg")||
					lowerCaseName.endsWith(".jpeg")||
					lowerCaseName.endsWith(".png")||
					lowerCaseName.endsWith(".tiff")||
					lowerCaseName.endsWith(".tif")||
					lowerCaseName.endsWith(".gif")) {
				returnCode = true;
			} // end if
		} // end if
		return returnCode;
	}
}
