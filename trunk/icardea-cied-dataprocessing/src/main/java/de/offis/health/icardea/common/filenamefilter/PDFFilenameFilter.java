package de.offis.health.icardea.common.filenamefilter;

import java.io.File;
import java.io.FilenameFilter;

import org.apache.log4j.Logger;

/**
 * <p>
 * Class that implements the FilenameFilter Interface. This implementation
 * filters for files where the name ends with String <code>.pdf</code>.
 * </p>
 * <p>
 * Optionally it is possible to set one particular file using the not empty
 * constructor.
 * </p>
 * 
 *
 */
public class PDFFilenameFilter implements FilenameFilter {
	/**
	 * Optional variable if this filter should only check a single file
	 */
	String pdfFileName = null;
	
	/**
	 * Logger object
	 */
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(PDFFilenameFilter.class);
	
	
	/**
	 * Default constructor.
	 */
	public PDFFilenameFilter() {
		super();
	}
	
	/**
	 * Optional not empty default constructor which allows the checking for
	 * one particular file and <u>not</u> all <code>*.pdf</code> files.
	 * 
	 * @param pdfFileName The pdf file to look for.
	 */
	public PDFFilenameFilter(String pdfFileName) {
		super();
		this.pdfFileName = pdfFileName;
	}
	
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
			if (pdfFileName != null) {
				if (lowerCaseName.endsWith(pdfFileName.toLowerCase())) {
					returnCode = true;
				}
			} else if (lowerCaseName.endsWith(".pdf")) {
				returnCode = true;
			} // end if
		} // end if
		return returnCode;
	}
}