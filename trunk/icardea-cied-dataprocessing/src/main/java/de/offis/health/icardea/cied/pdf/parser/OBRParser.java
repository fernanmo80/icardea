package de.offis.health.icardea.cied.pdf.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import de.offis.health.icardea.cied.pdf.interfaces.OBRParserInterface;
import de.offis.health.icardea.cied.pdf.interfaces.PDFParser;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;

public class OBRParser extends AbstractPDFParser implements OBRParserInterface{

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
		
		PDFParserMDTDeviceType2 pdfParserMDTDeviceType2=null;
		try {
			pdfParserMDTDeviceType2 = new PDFParserMDTDeviceType2(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
			pdfParserMDTDeviceType2.setPdfContent(this.getPdfContent());
		} catch (InvalidParameterValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropertyFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String getDeviceSerial=pdfParserMDTDeviceType2.getDeviceSerial();
		if (getDeviceSerial!=null){
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher =pattern.matcher(getDeviceSerial);
			/*the number in the series is required.*/ 
				if (matcher.find()) {
					obr_fillerOrderNumber_entityIdentifier=matcher.group();
				}
			}
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
		
		PDFParserMDTDeviceType2 pdfParserMDTDeviceType2=null;
		try {
			pdfParserMDTDeviceType2 = new PDFParserMDTDeviceType2(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
			pdfParserMDTDeviceType2.setPdfContent(this.getPdfContent());
		} catch (InvalidParameterValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropertyFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obr_observationEndData_Time_time=pdfParserMDTDeviceType2.getDeviceInterrogationDate();
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