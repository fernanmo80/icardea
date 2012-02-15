package de.offis.health.icardea.cied.hl7.processing;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.offis.health.icardea.app.CIEDInformationSystemApp;
import de.offis.health.icardea.cied.tools.HL7ReceiverFileStorageApplication;
import de.offis.health.icardea.cied.tools.HL7ReceiverServer;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.common.filenamefilter.PDFFilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class HL7_Base64_Image_App {

	/**
	 * Logger configuration file
	 */
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";

	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(HL7_Base64_Image_App.class);

	/**
	 * Default constructor
	 */
	static boolean keepAlive=true;

	//File medtronic_PDF_Directory=null;

	public HL7_Base64_Image_App() {
	}

	/**
	 * Main entry point of the application to start the crawler with
	 * the given browser client and portal definition.
	 * 
	 * @param args The parameters submitted starting the application.
	 * @throws PropertyFileNotFoundException  
	 */
	public static void main(String[] args) {

		try {
			// ###############################################################//
			// Initialize application parameters
			// ###############################################################//

			// Read log4j configuration file (has to be in the path)
			PropertyConfigurator.configure(CIEDInformationSystemApp.class.getClassLoader().getResource(LOG4J_CONFIGFILE) );

			// Show that the application is alive
			logger.info("EGM Application started.");
			
			File medtronicPDFFilePath = new File(AppConfig.getProperty("DIRECTORY_MEDTRONIC_ORIGINAL_PDF_REPORT"));
			File [] medtronicPDFFiles = medtronicPDFFilePath.listFiles(new PDFFilenameFilter());
			HL7_Base64_Image egm= new HL7_Base64_Image();
			for (int i = 0; i < medtronicPDFFiles.length; i++) {
			egm.extractEGMImagesFromPDFFiles(medtronicPDFFiles[i]);
			}
			// Instantiate singleton instance of configuration properties object
			AppConfig.createInstance();
		} catch (PropertyFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropertyNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{}
	}
}
