package de.offis.health.icardea.cied.virtualClient;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.SimpleServer;
import ca.uhn.hl7v2.llp.LowerLayerProtocol;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.PipeParser;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;



/**
 * Application to start an Hl7 Server 
 * 
 * Copy from HL7ReceiverServer only for intern test as virtual Adaptive Care Planner
 * @author ATh
 *
 */
public class CarePlannerServer implements Runnable{

	/**
	 * @param args
	 */
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";

	private static Logger logger = Logger.getLogger(CarePlannerServer.class);
	static SimpleServer serverPipe;
	static SimpleServer serverXML; 
	static SimpleServer genericServer; 
	static  int portPipe=21011;
	static  int portXML=21012;
	static  int portGeneric=21013;
	
	static boolean keepAlive=true;
	
//	public class RunWhenShuttingDown extends Thread { 
//		
//		public void run() { 
//			logger.info("Shutdown caught!");
//
//			try {
//				serverPipe.stop();
//				serverXML.stop();
//				genericServer.stop();
//				Thread.sleep(2000);
//				keepAlive=false;
//			} catch (InterruptedException e) 
//			{ 
//				//e.printStackTrace(); 
//			} 
//		} 
//	}


	public void runProgramm() throws InterruptedException { 
//		Runtime.getRuntime().addShutdownHook(new RunWhenShuttingDown()); 
		// not needed ad this stage
		
		while(keepAlive) 
		{ 
			logger.debug("Pipe running..."+serverPipe.isRunning()); 
			Thread.sleep(15000); 
		} 
		logger.info("Stopped running."); 
		
	}
	
	
//	public void run() throws InterruptedException 
	public void run()
	{ 

		try {
			portPipe=GlobalTools.getIntValue(AppConfig.getProperty("HL7_RECEIVER_PIPE_PORT"));
			portXML=GlobalTools.getIntValue(AppConfig.getProperty("HL7_RECEIVER_XML_PORT"));
			portGeneric=GlobalTools.getIntValue(AppConfig.getProperty("HL7_RECEIVER_GENERIC_PORT"));
			//portGeneric=GlobalTools.getIntValue(AppConfig.getProperty("SJM_CLIENT_GENERIC_PORT"));
		} catch (NumberFormatException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} catch (PropertyNotFoundException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		}
		
		serverPipe = new SimpleServer(portPipe,LowerLayerProtocol.makeLLP(),  new PipeParser());	
		serverXML  = new SimpleServer(portXML, LowerLayerProtocol.makeLLP(),  new DefaultXMLParser());	
		genericServer  = new SimpleServer(portGeneric, LowerLayerProtocol.makeLLP(),  new GenericParser());	
			
		Application handlerPipe = new CarePlannerApplication();
		Application handlerXML = new CarePlannerApplication(new DefaultXMLParser());
		Application handlerGeneric = new CarePlannerApplication(new GenericParser());
		
		serverPipe.registerApplication("*", "*", handlerPipe);
		logger.info("Start Pipe Server on port:"+portPipe); 
		serverPipe.start();
		serverXML.registerApplication("*", "*", handlerXML);
		logger.info("Start XML Serveron port:"+portXML); 
		serverXML.start();
		genericServer.registerApplication("*", "*", handlerGeneric);
		logger.info("Start Generic Serveron port:"+portGeneric); 
		genericServer.start();
		
		
	}
	
	/* Further maybe a Client/Server for different data transmission  
	public void run_Client4SJM(){
		String target_Pathname_Client4SJM=null;
		try {
			portGeneric=GlobalTools.getIntValue(AppConfig.getProperty("SJM_CLIENT_GENERIC_PORT"));
		} catch (NumberFormatException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} catch (PropertyNotFoundException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		}
		
		genericServer  = new SimpleServer(portGeneric, LowerLayerProtocol.makeLLP(),  new GenericParser());	
			
		try {
			target_Pathname_Client4SJM=AppConfig.getProperty("DIRECTORY_SJM_MESSAGE");
		} catch (PropertyNotFoundException e) {
			logger.error("Can not found Property: DIRECTORY_SJM_MESSAGE !");
		}
		//Application handlerGeneric = new HL7ReceiverApplication(new GenericParser(),target_Pathname_Client4SJM);
		//genericServer.registerApplication("*", "*", handlerGeneric);
		logger.info("Start Generic Client as HL7 Receiver."); 
		genericServer.start();
	}
	*/
	
	public static void main(String[] args)  {
		//TODO Parameterize Applications
		//TODO parameterize accepted Messages 

		try {
			// ###############################################################//
			// Initialize application parameters
			// ###############################################################//

			// Read log4j configuration file (has to be in the path)
			PropertyConfigurator.configure(CarePlannerServer.class.getClassLoader().getResource(LOG4J_CONFIGFILE) );

			// Show that the application is alive
			logger.info("Application started.");

			// Instantiate singleton instance of configuration properties object
			AppConfig.createInstance();
			logger.info("Configuration instantiated.");

			//short 
			new Thread(new CarePlannerServer()).start();
			//with control
//			HL7ReceiverServer hl7ReceiverServer = new HL7ReceiverServer();
//			Thread hl7ReceiverServerT = new Thread(hl7ReceiverServer);
//			hl7ReceiverServerT.start();
			
//			Runtime.getRuntime().addShutdownHook(new RunWhenShuttingDown()); 
			
			while(keepAlive) 
			{ 
				logger.debug("Server running..."); 
				Thread.sleep(15000); 
			} 
			logger.info("Stopping running."); 
			
			
		} catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} finally {
//			serverPipe.stop();
//			serverXML.stop();
//			genericServer.stop();
			logger.debug("Server stopped!");
		} // end try..catch..finally


	}
}