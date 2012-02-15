package de.offis.health.icardea.cied.pdf.parser;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import de.offis.health.icardea.cied.pdf.interfaces.MSHParserInterface;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class MSHParser extends AbstractPDFParser implements MSHParserInterface{

	private static Logger logger = Logger.getLogger(MSHParser.class);
	
	private MSHParser() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("MSHSegment", "en");
	}
	
	public MSHParser(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("MSHSegment", languageCode);
	}

	public String getMSH_encodingCharacters() throws PropertyNotFoundException {
		String msh_encodingCharacters=null;
		msh_encodingCharacters=getProperty("MSH_EncodingCharacters");
		return msh_encodingCharacters;
	}

	public String getMSH_fieldSeparator() throws PropertyNotFoundException {
		String msh_fieldSeparator=null;
		msh_fieldSeparator=getProperty("MSH_FieldSeparator");
		return msh_fieldSeparator;
	}

	public String getMSH_messageControlID() throws PropertyNotFoundException {
		String msh_messageControlID=null;
		msh_messageControlID=GlobalTools.date2String(new java.util.Date(), "yyyyMMddHHmmssSSS");//Obligated requirement Control ID with actually time stamp
		return msh_messageControlID;
	}

	public String getMSH_messageType_message_structure_id()
			throws PropertyNotFoundException {
		String msh_messageType_message_structure_id=null;
		msh_messageType_message_structure_id=getProperty("MSH_MessageType_message_structure_id");
		return msh_messageType_message_structure_id;
	}

	public String getMSH_messageType_messagecode()
			throws PropertyNotFoundException {
		String msh_messageType_messagecode=null;
		msh_messageType_messagecode=getProperty("MSH_MessageType_messagecode");
		return msh_messageType_messagecode;
	}

	public String getMSH_messageType_triggerevent()
			throws PropertyNotFoundException {
		String msh_messageType_triggerevent=null;
		msh_messageType_triggerevent=getProperty("MSH_MessageType_triggerevent");
		return msh_messageType_triggerevent;
	}

	public String getMSH_processingID() throws PropertyNotFoundException {
		String msh_processingID=null;
		msh_processingID=getProperty("MSH_ProcessingID");
		return msh_processingID;
	}

	public String getMSH_receivingApplication()
			throws PropertyNotFoundException {
		String msh_receivingApplication=null;
		msh_receivingApplication=getProperty("MSH_ReceivingApplication");
		return msh_receivingApplication;
	}

	public String getMSH_receivingFacility() throws PropertyNotFoundException {
		String msh_receivingFacility=null;
		msh_receivingFacility=getProperty("MSH_ReceivingFacility"); //namespace ID
		return msh_receivingFacility;
	}

	public String getMSH_sendingApplication() throws PropertyNotFoundException {
		String msh_sendingApplication=null;
		msh_sendingApplication=getProperty("MSH_SendingApplication");
		return msh_sendingApplication;
	}

	public String getMSH_sendingFacility() throws PropertyNotFoundException {
		String msh_fieldSeparator=null;
		msh_fieldSeparator=getProperty("MSH_SendingFacility");
		return msh_fieldSeparator;
	}

	public String getMSH_versionID() throws PropertyNotFoundException {
		String msh_versionID=null;
		msh_versionID=getProperty("MSH_VersionID"); //iCARDEA adopt HL7v2.5
		return msh_versionID;
	}
}