package de.offis.health.icardea.common.filenamefilter;

import java.io.File;
import java.io.FilenameFilter;

import org.apache.log4j.Logger;

public class HL7FilenameFilter implements FilenameFilter{
	/**
	 * Logger object
	 */
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(HL7FilenameFilter.class);
	
	/**
	 * This method overwrites the accept method from 
	 * {@link java.io.FilenameFilter#accept(java.io.File, java.lang.String)}.
	 * It will check if the filename String ends with the defined strings.
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		boolean returnCode = false;
		if (name != null) {
			String lowerCaseName = name.toLowerCase();
			if (lowerCaseName.endsWith(".hl7") ||
			lowerCaseName.endsWith(".xml"))
			{
				returnCode = true;
			} // end if
		} // en
		return returnCode;
	}

}
