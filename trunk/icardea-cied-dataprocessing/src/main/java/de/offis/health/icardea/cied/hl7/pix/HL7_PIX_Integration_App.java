package de.offis.health.icardea.cied.hl7.pix;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class HL7_PIX_Integration_App {
	/**
	 * Logger configuration file
	 */
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";
	
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(HL7_PIX_Integration_App.class);
	
	/**
	 * Default constructor
	 */
	public HL7_PIX_Integration_App() {
	}
	
	/**
	 * Main entry point of the application to start the crawler with
	 * the given browser client and portal definition.
	 * 
	 * @param args The parameters submitted starting the application.
	 * @throws PropertyNotFoundException 
	 * @throws IOException 
	 * @throws PropertyFileNotFoundException  
	 */
	public static void main(String[] args) throws PropertyNotFoundException, IOException {
		
		// ###############################################################//
		// Initialize application parameters
		// ###############################################################//
		
		// Read log4j configuration file (has to be in the path)
		PropertyConfigurator.configure(HL7_PIX_Integration_App.class.getClassLoader().getResource(LOG4J_CONFIGFILE) );
		File originalDirectory=new File(AppConfig.getProperty("DIRECTORY_ORIGINAL_HL7_MESSAGE"));
		File traget_HL7_Directory = new File(AppConfig.getProperty("DIRECTORY_PIX_HL7_MESSAGE"));
		File pix_Processed_HL7_Directory=new File(AppConfig.getProperty("DIRECTORY_HL7_TRANSMITTED"));
		// Show that the application is alive
		HL7_PIX_Integration hl7_pix_integration = null;
		logger.debug("Processing parsed file in " +originalDirectory);
		// TODO Access Rights Test for Moving
		while(originalDirectory.exists()){
			logger.debug("---------------PIX Integration System Running---------------");
			try {
				hl7_pix_integration=new HL7_PIX_Integration();
				hl7_pix_integration.execution(originalDirectory, traget_HL7_Directory, pix_Processed_HL7_Directory);
				
				Thread.sleep(GlobalTools.getIntValue(AppConfig.getProperty("DIRECTORYSCANNER_SCAN_INTERVAL_TIME"))*1000);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
