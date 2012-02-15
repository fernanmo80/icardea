package de.offis.health.icardea.cied.txt.parser;

import java.io.File;

import org.apache.log4j.Logger;
import de.offis.health.icardea.cied.pdf.interfaces.PIDParserInterface;
import de.offis.health.icardea.cied.txt.parser.AbstractTXTParser;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;

public class PIDParser extends AbstractTXTParser implements PIDParserInterface{
	
	private static Logger logger = Logger.getLogger(PIDParser.class);
	
	private PIDParser() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("PIDSegment", "en");
	}
	
	public PIDParser(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("PIDSegment", languageCode);
	}

	public String getPID_administrativeSex() throws PropertyNotFoundException {
		
		String pid_administrativeSex=null;
		pid_administrativeSex=""; //Sex M or W
		return pid_administrativeSex;
	}

	public String getPID_data_timeOfBorth_dataofbirth()
			throws PropertyNotFoundException {
		
		String pid_data_timeOfBorth_dataofbirth=null;
		pid_data_timeOfBorth_dataofbirth="";
		return pid_data_timeOfBorth_dataofbirth;
	}

	public String getPID_patientAddress_city() throws PropertyNotFoundException {
		
		String pid_patientAddress_city=null;
		pid_patientAddress_city=""; //In real Medtronic PDF no address information
		return pid_patientAddress_city;
	}

	public String getPID_patientAddress_country()
			throws PropertyNotFoundException {
		
		String pid_patientAddress_country=null;
		pid_patientAddress_country=""; //In real Medtronic PDF no address information
		return pid_patientAddress_country;
	}

	public String getPID_patientAddress_postalCode()
			throws PropertyNotFoundException {
		
		String pid_patientAddress_postalCode=null;
		pid_patientAddress_postalCode="";
		return pid_patientAddress_postalCode;
	}

	public String getPID_patientAddress_street()
			throws PropertyNotFoundException {
		
		String pid_patientAddress_street=null;
		pid_patientAddress_street="";
		return pid_patientAddress_street;
	}
	
	public String getPID_patientAddress_state_province()
			throws PropertyNotFoundException {
		
		String pid_patientAddress_state_province=null;
		pid_patientAddress_state_province=""; //In real Medtronic PDF no address information
		return pid_patientAddress_state_province;
	}

	public String getPID_patientIdentifierList_assigningAuthority()
			throws PropertyNotFoundException {
		
		String pid_patientIdentifierList_assigningAuthority=null;
		pid_patientIdentifierList_assigningAuthority="SJM"; //St .Jude Medtronic
		return pid_patientIdentifierList_assigningAuthority;
	}

	public String getPID_patientIdentifierList_assigningAuthority2()
			throws PropertyNotFoundException {
		
		String pid_patientIdentifierList_assigningAuthority2=null;
		pid_patientIdentifierList_assigningAuthority2=
			getProperty("PID_PatientIdentifierList_assigning_authority2");//required by SRDC
		return pid_patientIdentifierList_assigningAuthority2;
	}

	public String getPID_patientIdentifierList_idNumber(File txtFile)
			throws PropertyNotFoundException {
		String pid_patientIdentifierList_idNumber=null;
		/*
		 * The format of the ID will be following:"model:xxx/serial:yyy"
		 * Example: model:XZY987/serial:abc123
		 */
		OBXObserValue_SJM obxParser_sjm_txt=null;
		String deviceName=null;
		String deviceSerial=null;

		try {
			obxParser_sjm_txt = new OBXObserValue_SJM(AppConfig.getProperty("SJM_TXTPARSER_LANGUAGE_SETTING"));
			obxParser_sjm_txt.setTxtContent(this.getTxtContent());
			deviceName=obxParser_sjm_txt.getMDC_IDC_PG_MODEL(txtFile);
			//logger.info("deviceName "+deviceName);
			deviceSerial=obxParser_sjm_txt.getMDC_IDC_PG_SERIAL(txtFile);
			//logger.info("deviceSerial "+deviceSerial);
		} catch (InvalidParameterValueException e) {
			e.printStackTrace();
		} catch (PropertyFileNotFoundException e) {
			e.printStackTrace();
		}
		
		if (deviceName!=null&deviceSerial!=null) {
			pid_patientIdentifierList_idNumber="model:"+deviceName+"/"+"serial:"+deviceSerial;
		}
		else {
			pid_patientIdentifierList_idNumber="model:unknown/serial:unknown";
			logger.warn("SJM CIED device name and serial number is unknown!");
		}
		return pid_patientIdentifierList_idNumber;
	}

	public String getPID_patientIdentifierList_idNumber2()
			throws PropertyNotFoundException {
		
		String pid_patientIdentifierList_idNumber2=null;
		pid_patientIdentifierList_idNumber2="PIX_Patient_ID"; //PIX will be filled later
		return pid_patientIdentifierList_idNumber2;
	}

	public String getPID_patientIdentifierList_patientIdentifierTypeCode()
			throws PropertyNotFoundException {
		
		String pid_patientIdentifierList_patientIdentifierTypeCode=null;
		pid_patientIdentifierList_patientIdentifierTypeCode=
			getProperty("PID_PatientIdentifierList_identifier_type_code");
		return pid_patientIdentifierList_patientIdentifierTypeCode;
	}

	public String getPID_patientIdentifierList_patientIdentifierTypeCode2()
			throws PropertyNotFoundException {
		
		String pid_patientIdentifierList_patientIdentifierTypeCode2=null;
		pid_patientIdentifierList_patientIdentifierTypeCode2=
			getProperty("PID_PatientIdentifierList_identifier_type_code2");
		return pid_patientIdentifierList_patientIdentifierTypeCode2;
	}

	public String getPID_patientName_familyName()
			throws PropertyNotFoundException {
		
		String pid_patientName_familyName=null;
		pid_patientName_familyName="";
		return pid_patientName_familyName;
	}

	public String getPID_patientName_givenName()
			throws PropertyNotFoundException {
		
		String pid_patientName_givenName=null;
		pid_patientName_givenName="";
		return pid_patientName_givenName;
	}

	public String getPID_patientName_secondName()
			throws PropertyNotFoundException {
		
		String pid_patientName_secondName=null;
		pid_patientName_secondName="";
		return pid_patientName_secondName;
	}

	public String getPID_patientName_suffix() throws PropertyNotFoundException {
		
		String pid_patientName_suffix=null;
		pid_patientName_suffix="";
		return pid_patientName_suffix;
	}

	public String getPID_setID() throws PropertyNotFoundException {
		
		String pid_setID=null;
		pid_setID="";
		return pid_setID;
	}

	public String getPID_patientIdentifierList_idNumber()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}