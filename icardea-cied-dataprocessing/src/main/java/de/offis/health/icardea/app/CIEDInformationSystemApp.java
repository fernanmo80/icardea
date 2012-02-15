/**
 * 
 */
package de.offis.health.icardea.app;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.offis.health.icardea.cied.hl7.pix.HL7_PIX_Integration;
import de.offis.health.icardea.cied.hl7.transmission.HL7_Transmission;
import de.offis.health.icardea.cied.pdf.parser.PDFProcessing;
import de.offis.health.icardea.cied.tools.HL7ReceiverFileStorageApplication;
import de.offis.health.icardea.cied.tools.HL7ReceiverServer;
import de.offis.health.icardea.cied.txt.parser.TXTProcessing;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * <p>
 * The CIED Information System Application class is calling the other classes to
 * start the complete CIED data processing workflow required to serve CIED data to
 * the iCARDEA Careplan Engine.
 * </p>
 * <p>
 * <u>The modules included are:</u>
 * <ul>
 *    <li>DBTools</li>
 *    <li>CIEDDataExposureService</li>
 *    <ul>
 *       <li>HL7 Message Sender (HAPI)</li>
 *    </ul>
 *    <li>CIEDDataMonitoring</li>
 *    <ul>
 *       <li>CIEDMessageMonitoring (HL7 Message Receiver with message processing (HAPI))</li>
 *       <li>CIEDDirectoryMonitoring (PDF file processing)</li>
 *    </ul>
 *    <li>etc.</li>
 * </ul>
 * </p>
 *
 *
 */
public class CIEDInformationSystemApp {
	/**
	 * Logger configuration file
	 */
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";
	
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(CIEDInformationSystemApp.class);
	
	/**
	 * Default constructor
	 */
	static boolean keepAlive=true;
	
	//File medtronic_PDF_Directory=null;
	
	public CIEDInformationSystemApp() {
	}
	
	/**
	 * Main entry point of the application to start the crawler with
	 * the given browser client and portal definition.
	 * 
	 * @param args The parameters submitted starting the application.
	 * @throws PropertyFileNotFoundException  
	 */
	public static void main(String[] args) {
		
		int portSJM=2121,portSimulateCareplan=2122;
		String dirSJMString="hl7_out";
		String dirCareplaneString="hl7_out_care";
		boolean storeinXML=false;
		boolean sendToCareplanner=false;
		
		try {
			// ###############################################################//
			// Initialize application parameters
			// ###############################################################//
			
			// Read log4j configuration file (has to be in the path)
			PropertyConfigurator.configure(CIEDInformationSystemApp.class.getClassLoader().getResource(LOG4J_CONFIGFILE) );
			
			// Show that the application is alive
			logger.info("Application started.");
			
			// Instantiate singleton instance of configuration properties object
			AppConfig.createInstance();
			logger.info("Configuration instantiated.");
			logger.info("---------------CIED Data Integration System Start---------------");
			
			TXTtoHL7_Convert tt_TXTtoHL7Convert=new TXTtoHL7_Convert();
			PDFtoHL7_Convert tt_PDFtoHL7Convert=new PDFtoHL7_Convert();
			PIX_Integration tt_PIX_Integration=new PIX_Integration();
			Runnable_HL7_Transmission tt_HL7_Transmission=new Runnable_HL7_Transmission();
			
			try {
				//portGeneric=GlobalTools.getIntValue(AppConfig.getProperty("HL7_RECEIVER_GENERIC_PORT"));
				portSJM=GlobalTools.getIntValue(AppConfig.getProperty("SJM_CLIENT_GENERIC_PORT"));
				portSimulateCareplan=GlobalTools.getIntValue(AppConfig.getProperty("ADAPTIVE_CARE_PLANNER_HL7_PORT"));
				dirCareplaneString=AppConfig.getProperty("DIRECTORY_HL7_RECEIVED");
				dirSJMString=AppConfig.getProperty("DIRECTORY_ORIGINAL_HL7_MESSAGE");
				storeinXML=AppConfig.getProperty("LOCAL_HL7_FILEFORMAT_inXML").equals("Yes");
				sendToCareplanner=AppConfig.getProperty("SEND_TO_CAREPLANNER").equals("Yes");
			} catch (NumberFormatException ex) {
				logger.error(GlobalTools.getExceptionTraceLog(ex));
			} catch (PropertyNotFoundException ex) {
				logger.error(GlobalTools.getExceptionTraceLog(ex));
			}
			
			HL7ReceiverFileStorageApplication handlerGeneric = 
				new HL7ReceiverFileStorageApplication (dirSJMString);
			handlerGeneric.setInXML(storeinXML);
			
			HL7ReceiverFileStorageApplication handlerCareplaneGeneric = 
				new HL7ReceiverFileStorageApplication (dirCareplaneString);
			handlerCareplaneGeneric.setInXML(true); //always true
			
			
			if (!sendToCareplanner) {
				HL7ReceiverServer hl7ReceiverServer = new HL7ReceiverServer(portSimulateCareplan,handlerCareplaneGeneric);
				new Thread(hl7ReceiverServer,  "CarePlane Simulater ").start();
			}
			
			//			HL7ReceiverServer hl7ReceiverServer = new HL7ReceiverServer(portSimulateCareplan);
			
			HL7ReceiverServer sjmReceiverServer = new HL7ReceiverServer(portSJM,handlerGeneric);
			
			
			
			new Thread(sjmReceiverServer,  "SJM Receiver Thread ").start();
			new Thread(tt_PDFtoHL7Convert, "PDF converter Thread").start();
			new Thread(tt_TXTtoHL7Convert, "TXT converter Thread").start();
			new Thread(tt_PIX_Integration, "PIX integrate Thread").start();
			new Thread(tt_HL7_Transmission,"HL7 Sender Thread   ").start();
			
			
			
			while(keepAlive) 
			{
				logger.debug("*********CIED Data Integration System running*********"); 
				Thread.sleep(60*60*1000); 
			}
			logger.info("---------------CIED Data Integration System Stopped---------------");
			
		}catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} finally {
			logger.debug("CIED Data Integration Stopped!");
		} 
	}
}

class PDFtoHL7_Convert implements Runnable{
	private static Logger logger = Logger.getLogger(PDFtoHL7_Convert.class);
	public void run()
	{
		File medtronic_PDF_Directory=null;
		//File medtronic_EGM_Directory=null;
		File medtronic_HL7_Directory=null;
		PDFProcessing pdftohl7convert = new PDFProcessing();
		logger.info("****** Starting PDF to HL7 converter Thread ");
		try {
			medtronic_PDF_Directory = new File(AppConfig.getProperty("DIRECTORY_MEDTRONIC_ORIGINAL_PDF_REPORT"));
			//medtronic_EGM_Directory= new File(AppConfig.getProperty("DIRECTORY_MEDTRONIC_EXPORTED_EGM"));
			medtronic_HL7_Directory = new File(AppConfig.getProperty("DIRECTORY_ORIGINAL_HL7_MESSAGE"));
			
		} catch (NumberFormatException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} catch (PropertyNotFoundException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		}
		
		logger.info("PDF incomming dir: "+medtronic_PDF_Directory);
		logger.info("PDF to HL7 results in: "+medtronic_HL7_Directory);
		
		while (medtronic_PDF_Directory!=null)
		{
			try {
				if (!medtronic_PDF_Directory.isDirectory()) {
					logger.warn("Directory "+medtronic_PDF_Directory.getAbsolutePath()+ "does not exit !");
					GlobalTools.createDirectory(medtronic_PDF_Directory.getAbsolutePath());
				}
				if (!medtronic_HL7_Directory.isDirectory()) {
					logger.warn("Directory "+medtronic_HL7_Directory.getAbsolutePath()+ "does not exit !");
					GlobalTools.createDirectory(medtronic_HL7_Directory.getAbsolutePath());
				}
				pdftohl7convert.execute(medtronic_PDF_Directory, medtronic_HL7_Directory);
				
				Thread.sleep(GlobalTools.getIntValue(AppConfig.getProperty("DIRECTORYSCANNER_SCAN_INTERVAL_TIME"))*1000);
			}
			catch (Exception e){
				logger.error(GlobalTools.getExceptionTraceLog(e));
			}
		}
	}
}

class TXTtoHL7_Convert implements Runnable{
	private static Logger logger = Logger.getLogger(TXTtoHL7_Convert.class);
	public void run()
	{
		File sjm_Txt_Directory=null;
		//File medtronic_EGM_Directory=null;
		File sjm_HL7_Directory=null;
		TXTProcessing txttohl7convert = new TXTProcessing();
		logger.info("****** Starting PDF to HL7 converter Thread ");
		try {
			sjm_Txt_Directory = new File(AppConfig.getProperty("DIRECTORY_SJM_ORIGINAL_TXT_REPORT"));
			//medtronic_EGM_Directory= new File(AppConfig.getProperty("DIRECTORY_MEDTRONIC_EXPORTED_EGM"));
			sjm_HL7_Directory = new File(AppConfig.getProperty("DIRECTORY_SJM_HL7_MESSAGE"));
			
		} catch (NumberFormatException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} catch (PropertyNotFoundException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		}
		
		logger.info("TXT incomming dir: "+sjm_Txt_Directory);
		logger.info("TXT to HL7 results in: "+sjm_HL7_Directory);
		
		while (sjm_Txt_Directory!=null)
		{ 
			try {
				if (!sjm_Txt_Directory.isDirectory()) {
					logger.warn("Directory "+sjm_Txt_Directory.getAbsolutePath()+ "does not exit !");
					GlobalTools.createDirectory(sjm_Txt_Directory.getAbsolutePath());
				}
				if (!sjm_HL7_Directory.isDirectory()) {
					logger.warn("Directory "+sjm_HL7_Directory.getAbsolutePath()+ "does not exit !");
					GlobalTools.createDirectory(sjm_HL7_Directory.getAbsolutePath());
				}
				txttohl7convert.execution(sjm_Txt_Directory, sjm_HL7_Directory);
				
				Thread.sleep(GlobalTools.getIntValue(AppConfig.getProperty("DIRECTORYSCANNER_SCAN_INTERVAL_TIME"))*1000);
			}
			catch (Exception e){
				logger.error(GlobalTools.getExceptionTraceLog(e));
			}
			
		}
	}
}

class PIX_Integration implements Runnable{
	private static Logger logger = Logger.getLogger(PIX_Integration.class);
	public void run()
	{
		File original_HL7_Directory=null;
		File traget_HL7_Directory=null;
		File pix_Processed_HL7_Directory=null;
		//File sjm_HL7_Directory=null; //SJM hl7 message will also saved in original_HL7_Directory
		HL7_PIX_Integration hl7_pix_integration = new HL7_PIX_Integration();
		logger.info("****** Starting PIX integration Thread ");
		
		try {
			original_HL7_Directory = new File(AppConfig.getProperty("DIRECTORY_ORIGINAL_HL7_MESSAGE"));
			traget_HL7_Directory = new File(AppConfig.getProperty("DIRECTORY_PIX_HL7_MESSAGE"));
			pix_Processed_HL7_Directory=new File(AppConfig.getProperty("DIRECTORY_HL7_TRANSMITTED"));
		} catch (NumberFormatException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} catch (PropertyNotFoundException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		}
		
		logger.info("PIX working dir: "+original_HL7_Directory);
		logger.info("PIX integrated messages in: "+traget_HL7_Directory);
		
		while (original_HL7_Directory!=null)
		{
			try {
				if (original_HL7_Directory.isDirectory()) {
					hl7_pix_integration.execution(original_HL7_Directory, traget_HL7_Directory, pix_Processed_HL7_Directory);
				}
				else{
					logger.info("Directory "+original_HL7_Directory.getAbsolutePath()+ "does not exit !");
					GlobalTools.createDirectory(original_HL7_Directory.getAbsolutePath());
				}
				Thread.sleep(GlobalTools.getIntValue(AppConfig.getProperty("DIRECTORYSCANNER_SCAN_INTERVAL_TIME"))*1000);
			}
			catch (Exception e){
				logger.error(GlobalTools.getExceptionTraceLog(e));
			}
			finally{
			}
		}
	}
}

class Runnable_HL7_Transmission implements Runnable{
	private static Logger logger = Logger.getLogger(Runnable_HL7_Transmission.class);
	
	public void run()
	{
		File hl74Transmission_Directory=null;
		File hl7afterTransmission_Directory=null;
		HL7_Transmission hl7_transmission = new HL7_Transmission();
		logger.info("****** Starting HL7 Sender Thread ");
		try {
			//HL7 after PIX-Integration processing will be transmitted
			hl74Transmission_Directory =new File(AppConfig.getProperty("DIRECTORY_PIX_HL7_MESSAGE"));
			hl7afterTransmission_Directory=new File(AppConfig.getProperty("DIRECTORY_HL7_TRANSMITTED"));
		}catch (NumberFormatException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} catch (PropertyNotFoundException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		}
		logger.info("Sender working dir: "+hl74Transmission_Directory);
		logger.info("Sender transmitted messages in: "+hl7afterTransmission_Directory);
		while (hl74Transmission_Directory.isDirectory())
		{
			try {
				if (hl74Transmission_Directory.isDirectory()) {
					if(!hl7_transmission.execution(hl74Transmission_Directory, hl7afterTransmission_Directory)){
						logger.warn("Transmission to Adaptive Care Planner failed");
					}
				}
				else{
					logger.warn("Directory "+hl74Transmission_Directory.getAbsolutePath()+ "does not exit !");
					GlobalTools.createDirectory(hl74Transmission_Directory.getAbsolutePath());
				}
				Thread.sleep(GlobalTools.getIntValue(AppConfig.getProperty("DIRECTORYSCANNER_SCAN_INTERVAL_TIME"))*1000);
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
