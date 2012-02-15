/**
 * 
 */
package de.offis.health.icardea.cied.monitoring;

import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;

import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.common.filenamefilter.PDFFilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.DirectoryScanner;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * This class is responsible for the directory monitoring.
 * It contains the main directory scanner which recognizes the
 * directory changes. It's also responsible moving the files.
 * 
 *
 */
public class CIEDDirectoryMonitoring {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(CIEDDirectoryMonitoring.class);
	
	/**
	 * The directory scanner which scans directories for changes.
	 */
	private DirectoryScanner directoryScanner = null;
	
	/**
	 * The directory where to move the invalid PDF files.
	 */
	private String directoryInvalidPDFFiles;
	
	/**
	 * The directory where to move the successfully processed PDF files.
	 */
	private String directoryProcessedPDFFiles;
	
	/**
	 * The directory where to move the PDF files that will be processed.
	 */
	private String directoryWorkPDFFiles;
	
	/**
	 * Constant for the work directory where the files that will be processed are stored.
	 */
	private final static String PROPERTY_KEY_TARGET_DIR_WORK_PDF_FILES = "TARGET_DIRECTORY_WORK_PDF_FILES";
	
	/**
	 * Constant for the invalid directory where the invalid files are stored.
	 */
	private final static String PROPERTY_KEY_TARGET_DIR_INVALID_PDF_FILES = "TARGET_DIRECTORY_INVALID_PDF_FILES";
	
	/**
	 * Constant for the invalid directory where the successfully processed files are stored.
	 */
	private final static String PROPERTY_KEY_TARGET_DIR_PROCESSED_PDF_FILES = "TARGET_DIRECTORY_PROCESSED_PDF_FILES";
	
	
	/**
	 * Default constructor
	 */
	public CIEDDirectoryMonitoring() throws PropertyNotFoundException, InvalidParameterValueException {
		logger.info("Setting up CIEDDirectoryMonitoring...");
		/*
		 * Setting up directory scanner
		 */
		this.initDirectoryScanner();
		
		/*
		 * Setting up PDF processing directories
		 */
		this.initPDFProcessingDirectories();
	}
	
	/**
	 * Initialize the directory scanner with the values from the
	 * application configuration file.
	 */
	private void initDirectoryScanner() throws PropertyNotFoundException, InvalidParameterValueException {
		this.directoryScanner = new DirectoryScanner();
		this.directoryScanner.setFilenameFilter(new PDFFilenameFilter());
		this.directoryScanner.setRecursivelyScanDirectories(false);
		this.directoryScanner.setReportExistingFilesOnStartup(true);
		
		/*
		 * General helper variable
		 */
		String helperParam = null;
		
		/*
		 * Setting up scan interval time
		 */
		int scanIntervalTime = 60;
		try {
			helperParam = AppConfig.getProperty(DirectoryScanner.PROPERTY_KEY_SCAN_INTERVAL_TIME);
			if (helperParam != null && helperParam.length() > 0) {
				scanIntervalTime = GlobalTools.getIntValue(helperParam);
			} else {
				// helperParam is null or empty
				logger.warn("The scan interval time is not set in the property file (falling " +
						"back to default value: " + scanIntervalTime + "). " +
						"Please update your configuration file!");
			}
		} catch (NumberFormatException ex) {
			logger.error("The scan interval time could not be converted to a number: " + ex);
		} // end try..catch
		
		/*
		 * Checking scan interval unit and set the configure the interval time.
		 */
		helperParam = AppConfig.getProperty(DirectoryScanner.PROPERTY_KEY_SCAN_INTERVAL_UNIT);
		
		if (helperParam != null && DirectoryScanner.SCAN_INTERVAL_UNITS_ALLOWED_STRINGS.indexOf(helperParam.toLowerCase()) >= 0) {
			this.directoryScanner.setScanInterval(scanIntervalTime, helperParam);
		} else {
			// No unit for the scan interval is set or value incorrect...using default ('seconds')!
			logger.error("The parameter '" + DirectoryScanner.PROPERTY_KEY_SCAN_INTERVAL_UNIT + "' " + 
					"is not set or contains an invalid unit ('" + helperParam +"'). " + 
					"Allowed units are: " + DirectoryScanner.SCAN_INTERVAL_UNITS_ALLOWED_STRINGS);
			this.directoryScanner.setScanInterval(scanIntervalTime);
		} // end if..else
		
		/*
		 * Determine which directories should be scanned for changes
		 */
		helperParam = AppConfig.getProperty(DirectoryScanner.PROPERTY_KEY_SCAN_DIRECTORIES);
		if (helperParam != null && helperParam.length() > 0) {
			directoryScanner.setScanDirectoryList(helperParam);
		} else {
			String message = "There are no directories set to be monitored " +
					"(parameter is null or empty). Please update your" +
					"configuration file!";
			logger.error(message);
			throw new InvalidParameterValueException(message);
		}
		
		this.directoryScanner.start();
	}
	
	/**
	 * Initialize the PDF processing directories by reading, checking and setting
	 * the directories based on the values from the application configuration file.
	 */
	private void initPDFProcessingDirectories() throws PropertyNotFoundException {
		/*
		 * General helper variable
		 */
		String helperParam = null;
		
		
		/*
		 * =================
		 * WORKING DIRECTORY
		 * =================
		 */
		helperParam = AppConfig.getProperty(CIEDDirectoryMonitoring.PROPERTY_KEY_TARGET_DIR_WORK_PDF_FILES);
		if (helperParam != null && helperParam.length() > 0) {
			/*
			 * TODO: The directories need to be checked 
			 * a) Does the directory exist? --> NO --> create the directory
			 * b) If the directory exists check if you have write rights to that directory
			 */
			this.directoryWorkPDFFiles = helperParam; 
		} else {
			// No directory set
			logger.error("There is no target directory for the work PDF files set (key: " + 
						CIEDDirectoryMonitoring.PROPERTY_KEY_TARGET_DIR_WORK_PDF_FILES + "). " +
						"Please update your configuration file!");
		} // end if
		
		
		/*
		 * =================
		 * INVALID DIRECTORY
		 * =================
		 */
		helperParam = AppConfig.getProperty(CIEDDirectoryMonitoring.PROPERTY_KEY_TARGET_DIR_INVALID_PDF_FILES);
		if (helperParam != null && helperParam.length() > 0) {
			/*
			 * TODO: The directories need to be checked 
			 * a) Does the directory exist? --> NO --> create the directory
			 * b) If the directory exists check if you have write rights to that directory
			 */
			this.directoryInvalidPDFFiles = helperParam;
		} else {
			// No directory set
			logger.error("There is no target directory for the invalid PDF files set (key: " + 
						CIEDDirectoryMonitoring.PROPERTY_KEY_TARGET_DIR_INVALID_PDF_FILES + "). " +
						"Please update your configuration file!");
		} // end if
		
		
		/*
		 * ===================
		 * PROCESSED DIRECTORY
		 * ===================
		 */
		helperParam = AppConfig.getProperty(CIEDDirectoryMonitoring.PROPERTY_KEY_TARGET_DIR_PROCESSED_PDF_FILES);
		if (helperParam != null && helperParam.length() > 0) {
			/*
			 * TODO: The directories need to be checked 
			 * a) Does the directory exist? --> NO --> create the directory
			 * b) If the directory exists check if you have write rights to that directory
			 */
			this.directoryProcessedPDFFiles = helperParam;
		} else {
			// No directory set
			logger.error("There is no target directory for the processed PDF files set (key: " + 
						CIEDDirectoryMonitoring.PROPERTY_KEY_TARGET_DIR_PROCESSED_PDF_FILES + "). " +
						"Please update your configuration file!");
		} // end if
		
		
		// Cleanup
		helperParam = null;
	}
	
	/**
	 * This method will move the new PDF files to the
	 * work directory ({@link #directoryWorkPDFFiles}) to be
	 * processed by other components.
	 * 
	 * @param newFileList A list of new PDF files to be moved to the
	 * work directory for further processing.
	 */
	public void moveFilesToWorkDirectory(List<File> newFileList) {
		// TODO: Implement the file movement logic
	}
	
	/**
	 * This method will move the invalid PDF files to the
	 * invalid directory ({@link #directoryInvalidPDFFiles}).
	 * 
	 * @param invalidFileList A list of invalid PDF files to be moved because of an error.
	 */
	public void moveFilesToInvalidDirectory(List<File> invalidFileList) {
		// TODO: Implement the file movement logic
	}
	
	/**
	 * This method will move the successfully processed PDF files to the
	 * processed directory ({@link #directoryProcessedPDFFiles}).
	 * 
	 * @param processedFileList A list of successfully processed PDF files to be moved.
	 */
	public void moveFilesToProcessedDirectory(List<File> processedFileList) {
		// TODO: Implement the file movement logic
	}
}
