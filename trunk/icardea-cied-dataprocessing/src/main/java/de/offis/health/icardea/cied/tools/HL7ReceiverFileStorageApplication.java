/**
 * 
 */
package de.offis.health.icardea.cied.tools;

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
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;
/**
 * This Class is a Demonstration HL7 Message receiver to handle  
 * 
 * @author ATh
 *
 */
public class HL7ReceiverFileStorageApplication extends HL7ReceiverApplication {

	private Parser parser;
	@SuppressWarnings("unused")
	private static final String LOG4J_CONFIGFILE = "config/logger/CIEDDataProcessing_log4j.properties";

	private static Logger logger = Logger.getLogger(HL7ReceiverFileStorageApplication.class);

	private DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd-HH-mm-ss-SSS");
	private Date date = new Date();


	private String new_filename=dateFormat.format(date);

	private String store_pathname="tmp_DIRECTORY_HL7_RECEIVED";
	//inXML and fielextension have to be same
	private boolean inXML=false;
	private String fileextensionString=".hl7";
	private boolean isGenericParser=false;

	public boolean isInXML() {
		return inXML;
	}

	public void setInXML(boolean in) {
		if (!(in == inXML)){
			this.inXML = in;
			//FIXME switch encoding if generic 
			// else we have to create a new one
			if (in){
				if (!this.parser.getDefaultEncoding().equals("XML")){

					if (!isGenericParser){
						this.parser=new GenericParser();
						logger.debug("Switch to Generic Server!");
					}

					((GenericParser)this.parser).setXMLParserAsPrimary();
				}
				this.fileextensionString=".xml";
			}else {
				if (!this.parser.getDefaultEncoding().equals("VB")){
					if (!isGenericParser) {
						this.parser=new GenericParser();
						logger.debug("Switch to Generic Server!");
					}
					((GenericParser)this.parser).setPipeParserAsPrimary();
				}
				this.fileextensionString=".hl7";
			}
			logger.debug("Change Storageformat to *"+this.fileextensionString);
			logger.debug("Change Parser Encoder to "+this.parser.getDefaultEncoding());
			
		}
	}

	public String getStore_pathname() {
		return store_pathname;
	}

	public boolean setStore_pathname(String inpath) {
		this.store_pathname = inpath;
		File folder = new File(inpath);
		if (!folder.isDirectory()) {
			if (GlobalTools.createDirectory(inpath)){
				logger.info("Created directory: "+inpath);
			}else {
				logger.fatal("Fatal errror can't create: "+ inpath);
				return(false);
			}
		}
		return(true);
	}


	public HL7ReceiverFileStorageApplication(String storeString){
		//		super();

		this(new GenericParser(), storeString);

		//		logger.debug("Create PipeParsing App");
	}
	/**
	 * Default constructor assuming using Pipe Parsing HL7 Messages
	 */
	public HL7ReceiverFileStorageApplication(){

		this(new GenericParser(),"hl7storage");
	}

	/**
	 * Default constructor assuming adding own Parser (e.g. XML) 
	 */
	public HL7ReceiverFileStorageApplication(Parser inParser, String storeString){
		//	super(inParser);
		this.parser=inParser;
		isGenericParser=inParser.getClass().getSimpleName().endsWith("GenericParser");

		if (inParser.getDefaultEncoding().equals("XML")){
			setInXML(true);
		}else {
			setInXML(false);
		}
		setStore_pathname(storeString);
		if (!init()){
			logger.fatal("Can not init Receiver APP");
			//	throw 
		}
		logger.info("Receiver Parsing App: "+this.parser.getClass().getSimpleName());
		logger.debug("Encoding: "+ this.parser.getDefaultEncoding()+ " Generic:"+isGenericParser);
		logger.info("Write Messages into '"+getStore_pathname()+"'");


	}

	public boolean init() {

		//		try {
		//			inXML=AppConfig.getProperty("LOCAL_HL7_FILEFORMAT_inXML").equals("Yes");
		//		} catch (PropertyNotFoundException e) {
		//
		//			logger.error("Can not found Property: RECEIVED_HL7_inXML ! Set to " + inXML );
		//
		//		}

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
		return(super.processMessage(arg0));
	}



	public boolean useMessage(Message in) throws HL7Exception, IOException {
		logger.info("Writing Message in "+store_pathname);
		logger.trace("Now we write use Message:\n"+in);

		new_filename=  dateFormat.format(new Date())+this.fileextensionString;
		if ( new_filename!=null){
			//TODO usage of local parser no creation of the a new one
			if (!isInXML()) {
				in.setParser(new PipeParser());
				//				new_filename=new_filename+".hl7";
			} else {
				in.setParser(new DefaultXMLParser());
				//				new_filename=new_filename+".xml";
			}
		}else {
			//TODO no filename error
			return false;
		}
		//To avoid read write racing conflicts first write to *.tmp and rename after writer finished
		PrintWriter pw = new PrintWriter(new FileWriter(store_pathname
				+ new_filename+".tmp"));

		logger.info("Store Message to "+ store_pathname+ new_filename);
		logger.debug("Writing message:\n"+in.encode() );
		pw.print(in.encode());
		pw.close();
		return GlobalTools.moveFile(store_pathname
				+ new_filename+".tmp", store_pathname, new_filename);

	}
}

