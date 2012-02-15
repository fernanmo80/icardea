package de.offis.health.icardea.cied.txt.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import de.offis.health.icardea.cied.pdf.interfaces.OBRParserInterface;
import de.offis.health.icardea.cied.pdf.interfaces.PDFParser;
import de.offis.health.icardea.cied.pdf.parser.AbstractPDFParser;
import de.offis.health.icardea.cied.pdf.parser.PDFParserMDTDeviceType2;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;

public class OBRParser extends AbstractTXTParser implements OBRParserInterface{
	
	private static Logger logger = Logger.getLogger(OBRParser.class);
	
	private OBRParser() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBRSegment", "en");
	}
	
	public OBRParser(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBRSegment", languageCode);
	}
	
	public String getOBR_fillerOrderNumber_entityIdentifier()
	throws PropertyNotFoundException {
		String obr_fillerOrderNumber_entityIdentifier=null;
		
		return obr_fillerOrderNumber_entityIdentifier;
	}
	
	public String getOBR_observationData_Time_time()
	throws PropertyNotFoundException {
		String obr_observationData_Time_time=null;
		obr_observationData_Time_time="";
		return obr_observationData_Time_time;
	}
	
	public String getOBR_observationEndData_Time_time()
	throws PropertyNotFoundException {
		String obr_observationEndData_Time_time=null;

		return obr_observationEndData_Time_time;
	}
	
	public String getOBR_placerOrderNumber_entityIdentifier()
	throws PropertyNotFoundException {
		String obr_placerOrderNumber_entityIdentifier=null;
		String getDeviceInterrogationDate="";
		obr_placerOrderNumber_entityIdentifier=getDeviceInterrogationDate;
		return obr_placerOrderNumber_entityIdentifier;
	}
	
	public String getOBR_resultStatus() throws PropertyNotFoundException {
		String obr_OBR_resultStatus=null;
		obr_OBR_resultStatus="";
		return obr_OBR_resultStatus;
	}
	
	public String getOBR_resultsRptStatusChngDate_Time_time()
	throws PropertyNotFoundException {
		String obr_resultsRptStatusChngDate_Time_time=null;
		obr_resultsRptStatusChngDate_Time_time="";
		return obr_resultsRptStatusChngDate_Time_time;
	}
	
	public String getOBR_setID() throws PropertyNotFoundException {
		String obr_setID=null;
		obr_setID=getProperty("OBR_Set_ID");
		return obr_setID;
	}
	
	public String getOBR_universalServiceIdentifier_identifier()
	throws PropertyNotFoundException {
		String obr_universalServiceIdentifier_identifier=null;
		obr_universalServiceIdentifier_identifier=getProperty("OBR_UniversalServiceIdentifier_Identifier");
		return obr_universalServiceIdentifier_identifier;
	}
	
	public String getOBR_universalServiceIdentifier_text()
	throws PropertyNotFoundException {
		String obr_universalServiceIdentifier_text=null;
		obr_universalServiceIdentifier_text="";
		return obr_universalServiceIdentifier_text;
	}
}