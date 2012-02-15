package de.offis.health.icardea.cied.pdf.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_BatteryandLead;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_PatientInformation;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public class OBXObserValue_PatientInformation extends AbstractPDFParser implements OBXParserInterface_PatientInformation {
	private static Logger logger = Logger.getLogger(OBXObserValue_PatientInformation.class);
	
	private OBXObserValue_PatientInformation() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentPatientInformation", "en");
	}
	
	public OBXObserValue_PatientInformation(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentPatientInformation", languageCode);
	}
	
	private String PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster=null;
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_LEAD_IMPLANT_DT="PDFPARSER_REGEX_MDC_IDC_LEAD_IMPLANT_DT";
	public String getMDC_IDC_LEAD_IMPLANT_DT(int lead_index)
	throws PropertyNotFoundException {
		String MDC_IDC_LEAD_IMPLANT_cluster = null;
		String MDC_IDC_LEAD_IMPLANT_DT = null;
		
		switch (lead_index) {
		case 1:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_1_Cluster";
			break;
		case 2:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_2_Cluster";
			break;
		case 3:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_3_Cluster";
			break;
		default:
		}
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			MDC_IDC_LEAD_IMPLANT_cluster = matcher_cluster.group();
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_IMPLANT_DT), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(MDC_IDC_LEAD_IMPLANT_cluster);
			if (matcher.find()) {
				MDC_IDC_LEAD_IMPLANT_DT= matcher.group(3) + getMonthNumberFromMonthShortName(matcher.group(2)) + matcher.group(1) + "0000";
			}
		}
		return MDC_IDC_LEAD_IMPLANT_DT;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_LEAD_MFG="PDFPARSER_REGEX_MDC_IDC_LEAD_MFG";
	public String getMDC_IDC_LEAD_MFG(int lead_index)
	throws PropertyNotFoundException {
		String MDC_IDC_LEAD_IMPLANT_cluster = null;
		String MDC_IDC_LEAD_MFG = null;
		
		switch (lead_index) {
		case 1:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_1_Cluster";
			break;
		case 2:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_2_Cluster";
			break;
		case 3:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_3_Cluster";
			break;
		default:
		}
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			MDC_IDC_LEAD_IMPLANT_cluster = matcher_cluster.group();
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_MFG), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(MDC_IDC_LEAD_IMPLANT_cluster);
			if (matcher.find()) {
				MDC_IDC_LEAD_MFG= matcher.group();
			}
		}
		return MDC_IDC_LEAD_MFG;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_LEAD_MODEL="PDFPARSER_REGEX_MDC_IDC_LEAD_MODEL";
	public String getMDC_IDC_LEAD_MODEL(int lead_index)
	throws PropertyNotFoundException {
		String MDC_IDC_LEAD_IMPLANT_cluster = null;
		String MDC_IDC_LEAD_MODEL = null;
		
		switch (lead_index) {
		case 1:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_1_Cluster";
			break;
		case 2:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_2_Cluster";
			break;
		case 3:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_3_Cluster";
			break;
		default:
		}
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			MDC_IDC_LEAD_IMPLANT_cluster = matcher_cluster.group();
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_MODEL), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(MDC_IDC_LEAD_IMPLANT_cluster);
			if (matcher.find()) {
				MDC_IDC_LEAD_MODEL= matcher.group();
			}
		}
		return MDC_IDC_LEAD_MODEL;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_LEAD_SERIAL="PDFPARSER_REGEX_MDC_IDC_LEAD_SERIAL";
	public String getMDC_IDC_LEAD_SERIAL(int lead_index)
	throws PropertyNotFoundException {
		String MDC_IDC_LEAD_IMPLANT_cluster = null;
		String MDC_IDC_LEAD_SERIAL = null;
		
		switch (lead_index) {
		case 1:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_1_Cluster";
			break;
		case 2:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_2_Cluster";
			break;
		case 3:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_3_Cluster";
			break;
		default:
		}
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			MDC_IDC_LEAD_IMPLANT_cluster = matcher_cluster.group();
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_SERIAL), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(MDC_IDC_LEAD_IMPLANT_cluster);
			if (matcher.find()) {
				MDC_IDC_LEAD_SERIAL= matcher.group();
			}
		}
		return MDC_IDC_LEAD_SERIAL;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_LEAD_LOCATION="PDFPARSER_REGEX_MDC_IDC_LEAD_LOCATION";
	public String getMDC_IDC_LEAD_LOCATION(int lead_index)
	throws PropertyNotFoundException {
		String MDC_IDC_LEAD_IMPLANT_cluster = null;
		String MDC_IDC_LEAD_LOCATION = null;
		
		switch (lead_index) {
		case 1:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_1_Cluster";
			break;
		case 2:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_2_Cluster";
			break;
		case 3:
			PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster="PDFPARSER_REGEX_MDC_IDC_LEAD_3_Cluster";
			break;
		default:
		}
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			MDC_IDC_LEAD_IMPLANT_cluster = matcher_cluster.group();
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_LEAD_LOCATION), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(MDC_IDC_LEAD_IMPLANT_cluster);
			if (matcher.find()) {
				MDC_IDC_LEAD_LOCATION= matcher.group();
			}
		}
		return MDC_IDC_LEAD_LOCATION;
	}
}