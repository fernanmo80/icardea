package de.offis.health.icardea.cied.pdf.parser;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import de.offis.health.icardea.cied.pdf.interfaces.PIDParserInterface;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;

public class PIDParser extends AbstractPDFParser implements PIDParserInterface{
	
	private static Logger logger = Logger.getLogger(PIDParser.class);
	
	//private final String PROPERTY_KEY_REGEX_DEVICE_NAME = "PDFPARSER_REGEX_DEVICENAME";
	//private final String PROPERTY_KEY_REGEX_DEVICE_SERIAL = "PDFPARSER_REGEX_DEVICESERIAL";
	//private final String PROPERTY_KEY_REGEX_DEVICE_INTERROGATION_DATE = "PDFPARSER_REGEX_DEVICEINTERROGATIONDATE";

	private PIDParser() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("PIDSegment", "en");
	}
	
	public PIDParser(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("PIDSegment", languageCode);
	}
	
	public String getPID_administrativeSex() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_administrativeSex=null;
		pid_administrativeSex=""; //Sex M or W
		return pid_administrativeSex;
	}

	public String getPID_data_timeOfBorth_dataofbirth()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_data_timeOfBorth_dataofbirth=null;
		pid_data_timeOfBorth_dataofbirth="";
		return pid_data_timeOfBorth_dataofbirth;
	}

	public String getPID_patientAddress_city() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientAddress_city=null;
		pid_patientAddress_city=""; //In real Medtronic PDF no address information
		return pid_patientAddress_city;
	}

	public String getPID_patientAddress_country()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientAddress_country=null;
		pid_patientAddress_country=""; //In real Medtronic PDF no address information
		return pid_patientAddress_country;
	}

	public String getPID_patientAddress_postalCode()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientAddress_postalCode=null;
		pid_patientAddress_postalCode="";
		return pid_patientAddress_postalCode;
	}

	public String getPID_patientAddress_street()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientAddress_street=null;
		pid_patientAddress_street="";
		return pid_patientAddress_street;
	}
	
	public String getPID_patientAddress_state_province()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientAddress_state_province=null;
		pid_patientAddress_state_province=""; //In real Medtronic PDF no address information
		return pid_patientAddress_state_province;
	}

	public String getPID_patientIdentifierList_assigningAuthority()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientIdentifierList_assigningAuthority=null;
		pid_patientIdentifierList_assigningAuthority="MDT"; //Medtronic
		return pid_patientIdentifierList_assigningAuthority;
	}

	public String getPID_patientIdentifierList_assigningAuthority2()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientIdentifierList_assigningAuthority2=null;
		pid_patientIdentifierList_assigningAuthority2=
			getProperty("PID_PatientIdentifierList_assigning_authority2");//required by SRDC
		return pid_patientIdentifierList_assigningAuthority2;
	}

	public String getPID_patientIdentifierList_idNumber()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientIdentifierList_idNumber=null;
		/*
		 * The format of the ID will be following:"model:xxx/serial:yyy"
		 * Example: model:XZY987/serial:abc123
		 */
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
		
		String getDeviceName=pdfParserMDTDeviceType2.getDeviceName();
		String getDeviceSerial=pdfParserMDTDeviceType2.getDeviceSerial();
		pid_patientIdentifierList_idNumber="model:"+getDeviceName+"/"+"serial:"+getDeviceSerial;
		return pid_patientIdentifierList_idNumber;
	}

	public String getPID_patientIdentifierList_idNumber2()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientIdentifierList_idNumber2=null;
		pid_patientIdentifierList_idNumber2="PIX_Patient_ID"; //PIX will be filled later
		return pid_patientIdentifierList_idNumber2;
	}

	public String getPID_patientIdentifierList_patientIdentifierTypeCode()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientIdentifierList_patientIdentifierTypeCode=null;
		pid_patientIdentifierList_patientIdentifierTypeCode=
			getProperty("PID_PatientIdentifierList_identifier_type_code");
		return pid_patientIdentifierList_patientIdentifierTypeCode;
	}

	public String getPID_patientIdentifierList_patientIdentifierTypeCode2()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientIdentifierList_patientIdentifierTypeCode2=null;
		pid_patientIdentifierList_patientIdentifierTypeCode2=
			getProperty("PID_PatientIdentifierList_identifier_type_code2");
		return pid_patientIdentifierList_patientIdentifierTypeCode2;
	}

	public String getPID_patientName_familyName()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientName_familyName=null;
		pid_patientName_familyName="";
		return pid_patientName_familyName;
	}

	public String getPID_patientName_givenName()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientName_givenName=null;
		pid_patientName_givenName="";
		return pid_patientName_givenName;
	}

	public String getPID_patientName_secondName()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientName_secondName=null;
		pid_patientName_secondName="";
		return pid_patientName_secondName;
	}

	public String getPID_patientName_suffix() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_patientName_suffix=null;
		pid_patientName_suffix="";
		return pid_patientName_suffix;
	}

	public String getPID_setID() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String pid_setID=null;
		pid_setID="";
		return pid_setID;
	}

	public String getPID_patientIdentifierList_idNumber(File txtFile)
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}