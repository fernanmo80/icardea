/**
 * 
 */
package de.offis.health.icardea.cied.tools;


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
 * 
 * @author ATh
 *
 */
public class HL7ReceiverServer implements Runnable{

	/**
	 * @param args
	 */
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";

	private static Logger logger = Logger.getLogger(HL7ReceiverServer.class);

	static SimpleServer genericServer; 

	private  int port=21013;
	private Application myapp;
	static boolean keepAlive=true;

	public class RunWhenShuttingDown extends Thread { 

		public void run() { 
			logger.info("Shutdown caught!");

			try {
				//	shutdown code here 
				Thread.sleep(2000);
				keepAlive=false;
			} catch (InterruptedException e) 
			{ 
				//	error on console level
				e.printStackTrace(); 
			} 
		} 
	}
	public HL7ReceiverServer(int inport, Application app){
		super();
		this.port=inport;
		this.myapp=app;
	}

	public HL7ReceiverServer(int inport){
		this(inport, new HL7ReceiverApplication());
	}


	public void runProgramm() throws InterruptedException { 
		Runtime.getRuntime().addShutdownHook(new RunWhenShuttingDown()); 
		while(keepAlive) 
		{ 
			logger.debug("Server loop running..."); 
			Thread.sleep(15000); 
		} 
		logger.info("Stopped running."); 

	}


	public void run()
	{ 

		genericServer  = new SimpleServer(port, LowerLayerProtocol.makeLLP(),  new GenericParser());	
		genericServer.registerApplication("*", "*", myapp);
		genericServer.start();
	
		logger.info("Start Generic Server on Port:"+port); 

	}



	public static void main(String[] args)  {

		//TODO parameterize accepted Messages 

		try {
			// ###############################################################//
			// Initialize application parameters
			// ###############################################################//

			// Read log4j configuration file (has to be in the path)
			PropertyConfigurator.configure(HL7ReceiverServer.class.getClassLoader().getResource(LOG4J_CONFIGFILE) );

			// Show that the application is alive
			logger.info("Application started.");

			// Instantiate singleton instance of configuration properties object
			AppConfig.createInstance();
			logger.info("Configuration instantiated.");
	

			String dirString=null;
			int portGeneric=21001;
			boolean inXML=true;
			if (args.length>0){
				try {
					portGeneric = Integer.parseInt(args[0]);
				} catch (NumberFormatException e) {
					System.err.println("Usage HL7Receiver [portnumber [directory [inXMLBoolean]]]\n");
					System.err.println("Without a directory message will only received and not stored.\n"+
					"without a portnumber, property file will be used\n");
					System.exit(1);
				}
				if (args.length>1) {
					dirString=args[1];
				}
				if (args.length>2) {
					inXML=Boolean.parseBoolean(args[2]);
				}

			}else{
				try {
					portGeneric=GlobalTools.getIntValue(AppConfig.getProperty("HL7_RECEIVER_GENERIC_PORT"));
					dirString=AppConfig.getProperty("DIRECTORY_HL7_RECEIVED");
					inXML=AppConfig.getProperty("LOCAL_HL7_FILEFORMAT_inXML").equals("Yes");
				} catch (NumberFormatException ex) {
					logger.error(GlobalTools.getExceptionTraceLog(ex));
				} catch (PropertyNotFoundException ex) {
					logger.error(GlobalTools.getExceptionTraceLog(ex));
				}
			}

			System.out.println("Port: "+portGeneric+" XML:"+inXML+" Dir:"+dirString);
			Application handlerGeneric = null;
			if (dirString!=null){
				if (inXML) {
					handlerGeneric = 
						new HL7ReceiverFileStorageApplication ( new DefaultXMLParser(),dirString);

				}else{
					handlerGeneric = 
						new HL7ReceiverFileStorageApplication (dirString);
				}
			}else {
				handlerGeneric = 
					new HL7ReceiverApplication ();
			}
			//short 
			HL7ReceiverServer myHl7ReceiverServer =new HL7ReceiverServer(portGeneric,handlerGeneric);
			new Thread(myHl7ReceiverServer,"HL7Server").start();
			//with control

						

			myHl7ReceiverServer.runProgramm();
			logger.info("Stopping running."); 


		} catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} finally {
			logger.debug("Server stopped!");
		} // end try..catch..finally


	}
}