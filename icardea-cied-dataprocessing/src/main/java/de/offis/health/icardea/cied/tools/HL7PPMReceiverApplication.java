/**
 * 
 */
package de.offis.health.icardea.cied.tools;

import java.io.IOException;
import java.sql.SQLException;

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
public class HL7PPMReceiverApplication implements Application {

	private Parser parser;
	@SuppressWarnings("unused")
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";

	private static Logger logger = Logger.getLogger(HL7PPMReceiverApplication.class);




	/**
	 * Default constructor assuming using Pipe Parsing HL7 Messages
	 */
	public HL7PPMReceiverApplication(){
		//		super();
		this(new GenericParser());
		//		logger.debug("Create PipeParsing App");
	}

	/**
	 * Default constructor assuming adding own Parser (e.g. XML) 
	 */
	public HL7PPMReceiverApplication(Parser inParser){
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
//FIXME @MY here please split the message in to OBX segments and make a addCIEDData for each OBX segment
		
		return true;

	}

	/**
	 * @param ciedSerial IDCO compatible serial number like model:Secura/serial:PZC600368S
	 * @param fullRefID IDCO / IEEE or private  Reference like 721344^MDC_IDC_MSMT_BATTERY_VOLTAGE^MDC
	 * @param data the stored value
	 * @return true if successfull
	 */
	public boolean addCIEDData(String ciedSerial, String fullRefID, String data){
		return addCIEDData( ciedSerial,  fullRefID,  data, "19000101120000", "21000101120000");
	}
	/**
	 * @param ciedSerial IDCO compatible serial number like model:Secura/serial:PZC600368S
	 * @param fullRefID IDCO / IEEE or private  Reference like 721344^MDC_IDC_MSMT_BATTERY_VOLTAGE^MDC
	 * @param data the stored value
	 * @param timeLow  date time format yyyymmddhhmmss from this time the data value is correct
	 * @return true if successfull
	 */

	public boolean addCIEDData(String ciedSerial, String fullRefID, String data,String timeLow){
		return addCIEDData( ciedSerial,  fullRefID,  data, timeLow, "21000101120000");
	}

	/**
	 * @param ciedSerial IDCO compatible serial number like model:Secura/serial:PZC600368S
	 * @param fullRefID IDCO / IEEE or private  Reference like 721344^MDC_IDC_MSMT_BATTERY_VOLTAGE^MDC
	 * @param data the stored value
	 * @param timeLow  date time format yyyymmddhhmmss from this time the data value is correct
	 * @param timeHigh date time format yyyymmddhhmmss up to this time the data value is correct
	 * @return true if successfull
	 */
	public boolean addCIEDData(String ciedSerial, String fullRefID, String data, String timeLow, String timeHigh){
	
		int rs=-1;
		if (timeLow.length()<14 || timeHigh.length()<14) {
			logger.warn("error datetime to small");
			return false;
		}
		String insertString="insert into ppmpending (source,status,SerialID,dataset,FULLREFID,timelow,timehigh) values ('CIED','P',";
		insertString=insertString+"'"+ciedSerial+"','"+data+"','"+fullRefID+"','"+timeLow.trim().substring(0,13)+"','"+timeHigh.trim().substring(0,13)+"')";
		
		logger.debug(insertString);
//		try {
//			rs= getStmt().executeUpdate(insertString);
//			logger.debug(rs+":" +insertString);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			logger.error(rs+":" +insertString);
//	
//			e.printStackTrace();
//			return false;
//		}
	
		return true;
	}
}

