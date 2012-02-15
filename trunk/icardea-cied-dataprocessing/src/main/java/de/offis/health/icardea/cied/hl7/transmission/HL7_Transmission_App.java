package de.offis.health.icardea.cied.hl7.transmission;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class HL7_Transmission_App {

	/**
	 * Logger configuration file
	 */
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";
	
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(HL7_Transmission_App.class);
	
	/**
	 * Default constructor
	 */
	public HL7_Transmission_App() {
	}
	
	/**
	 * Main entry point of the application to start the crawler with
	 * the given browser client and portal definition.
	 * 
	 * @param args The parameters submitted starting the application.
	 * @throws Exception 
	 * @throws PropertyFileNotFoundException  
	 */
	public static void main(String[] args) throws Exception {
		
		// ###############################################################//
		// Initialize application parameters
		// ###############################################################//
		
		// Read log4j configuration file (has to be in the path)
		PropertyConfigurator.configure(HL7_Transmission_App.class.getClassLoader().getResource(LOG4J_CONFIGFILE));
		File originalDirectory=new File(AppConfig.getProperty("DIRECTORY_PIX_HL7_MESSAGE"));
		File targetDirectory=new File(AppConfig.getProperty("DIRECTORY_HL7_TRANSMITTED"));
		// Show that the application is alive
		logger.info("HL7 Transmission started.");
		HL7_Transmission hl7_transmission = new HL7_Transmission();
		logger.info("Transmit parsed file with PIX in " +originalDirectory);
		// TODO Access Rights Test for Moving
		while(originalDirectory.exists()) {
			logger.info("---------------Sending HL7v2.5 Message to Adaptive Care Planner---------------");
			try {
	
				hl7_transmission.execution(originalDirectory,targetDirectory);
				
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