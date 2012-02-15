/**
 * 
 */
package de.offis.health.icardea.cied.tools;

import java.io.IOException;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import de.offis.health.icardea.tools.GlobalTools;
/**
 * This Class is a Demonstration HL7 Message receiver to handle  
 * 
 * @author ATh
 *
 */
public class HL7ReceiverApplication implements Application {

	private Parser parser;
	@SuppressWarnings("unused")
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";

	private static Logger logger = Logger.getLogger(HL7ReceiverApplication.class);




	/**
	 * Default constructor assuming using Pipe Parsing HL7 Messages
	 */
	public HL7ReceiverApplication(){
		//		super();
		this(new GenericParser());
		//		logger.debug("Create PipeParsing App");
	}

	/**
	 * Default constructor assuming adding own Parser (e.g. XML) 
	 */
	public HL7ReceiverApplication(Parser inParser){
//		super();
		parser=inParser;
		if (!init()){
			logger.fatal("Can not init Receiver APP");
			//	throw 
		}
//		logger.info("Receiver Parsing App:"+inParser.getClass()+" Encoding:"+ inParser.getDefaultEncoding());
	}

	public boolean init() {


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
		logger.trace("processing Message:\n"+arg0);

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
				logger.warn("Return ACK Message:\n"+retMessage);
			}

			return( retMessage); //(ACK) DefaultApplication.makeACK((MSH)arg0.get("MSH"));
		} catch (IOException e) {
			logger.fatal("IOException:"+e.getMessage());
			throw new HL7Exception(e);
		}

	}


	public boolean useMessage(Message in) throws HL7Exception, IOException {
		logger.trace("Now we can use Message:\n"+in);

		return true;

	}
}

