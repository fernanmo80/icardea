package de.offis.health.icardea.cied.virtualClient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;


import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;
/**
 * This Class is a Demonstration HL7 Message receiver to handle  
 * Copy from HL7ReceiverServer only for intern test as virtual Adaptive Care Planner
 * @author ATh
 *
 */
public class CarePlannerApplication implements Application {

	private Parser parser;
	@SuppressWarnings("unused")
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";

	private static Logger logger = Logger.getLogger(CarePlannerApplication.class);

	DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd-HH-mm-ss-SSS");
	Date date = new Date();
	boolean inXML=true;
	String new_filename=dateFormat.format(date);
	String new_pathname="tmp_DIRECTORY_HL7_RECEIVED";
	File folder = new File(new_pathname);


	/**
	 * Default constructor assuming using Pipe Parsing HL7 Messages
	 */
	public CarePlannerApplication(){
		//		super();
		this(new PipeParser());
		//		logger.debug("Create PipeParsing App");
	}

	/**
	 * Default constructor assuming adding own Parser (e.g. XML) 
	 */
	public CarePlannerApplication(Parser inParser){
		super();
		this.parser=inParser;
		if (!init()){
			logger.fatal("Can not init Receiver APP");
			//	throw 
		}
		logger.info("Receiver Parsing App:"+inParser.getClass()+" Encoding:"+ inParser.getDefaultEncoding());


	}

	public boolean init() {

		try {
			inXML=AppConfig.getProperty("LOCAL_HL7_FILEFORMAT_inXML").equals("Yes");
		} catch (PropertyNotFoundException e) {

			logger.error("Can not found Property: RECEIVED_HL7_inXML ! Set to " + inXML );

		}
		try {
			new_pathname=AppConfig.getProperty("DIRECTORY_HL7_RECEIVED");
			/*Run as SJM Client. Save all received SJM HL7 in DIRECTORY_ORIGINAL_HL7_MESSAGE
			 *for PIX Integration processing
			 */
			//new_pathname=AppConfig.getProperty("DIRECTORY_ORIGINAL_HL7_MESSAGE");
		} catch (PropertyNotFoundException e) {
			logger.error("Can not found Property: DIRECTORY_HL7_RECEIVED ! Set to:" + new_pathname );
		}
		folder = new File(new_pathname);
		if (!folder.isDirectory()) {
			if (GlobalTools.createDirectory(new_pathname)){
				logger.info("Created directory: "+new_pathname);
			}else {
				logger.fatal("Fatal errror can't create: "+ new_pathname);
				return(false);
			}
		}
		return true;

	}

	/* (non-Javadoc)
	 * @see ca.uhn.hl7v2.app.Application#canProcess(ca.uhn.hl7v2.model.Message)
	 */
	public boolean canProcess(Message arg0) {
		//  TODO Check message parser compliance
		logger.debug("Can Process Message?\n"+arg0);

		return true;
	}


	/* (non-Javadoc)
	 * @see ca.uhn.hl7v2.app.Application#processMessage(ca.uhn.hl7v2.model.Message)
	 */
	public Message processMessage(Message arg0) throws ApplicationException,
	HL7Exception {
		boolean retValue = true;
		Message retMessage;
		logger.debug("processing Message:\n"+arg0);
		// 		arg0.encode();
		//		String encodeString = parser.encode(arg0);
		//		retValue=useMessage(encodeString);
		//alternative
		try {
			retValue=useMessage(arg0);
		} catch (IOException e1) {

			logger.error("Got IO Exception:" + GlobalTools.getExceptionTraceLog(e1));
			retValue=false;
		} 

		logger.debug("Create ACK Message");
		try {
			if (retValue) {			
				retMessage=arg0.generateACK();
				logger.debug("Return ACK Message:\n"+retMessage);
			}else {
				//TODO HL7 conform error handling
				retMessage=arg0.generateACK("AE",new HL7Exception("Message processing failed"));
				logger.error("Return ACK Message:\n"+retMessage);
			}

			return( retMessage); //(ACK) DefaultApplication.makeACK((MSH)arg0.get("MSH"));
		} catch (IOException e) {
			logger.fatal("IOException:"+e.getMessage());
			throw new HL7Exception(e);
		}

	}
	public boolean useMessage(String inString){
		logger.debug("Now we can use String Message:\n"+inString);
		return true;
	}

	public boolean useMessage(Message in) throws HL7Exception, IOException {
		logger.trace("Now we can use Message:\n"+in);

		new_filename=  dateFormat.format(new Date());
		if ( new_filename!=null){

			if (!inXML) {
				in.setParser(new PipeParser());
				new_filename=new_filename+".hl7";
			} else {
				in.setParser(new DefaultXMLParser());
				new_filename=new_filename+".xml";
			}
		}else {
			//TODO no filename error
			return false;
		}
		//To avoid read write racing confilcts first write to *.tmp and rename after writer finished
		PrintWriter pw = new PrintWriter(new FileWriter(new_pathname
				+ new_filename+".tmp"));
		logger.info("Store Message to"+ new_pathname+ new_filename);
		logger.debug("Writing message:\n"+in.encode() );
		pw.print(in.encode());
		pw.close();
		GlobalTools.moveFile(new_pathname
				+ new_filename+".tmp", new_pathname, new_filename);
		return true;
	}
}

