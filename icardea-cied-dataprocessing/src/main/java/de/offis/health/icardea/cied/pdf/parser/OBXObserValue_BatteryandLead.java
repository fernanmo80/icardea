package de.offis.health.icardea.cied.pdf.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_BatteryandLead;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public class OBXObserValue_BatteryandLead extends AbstractPDFParser implements OBXParserInterface_BatteryandLead {
	private static Logger logger = Logger.getLogger(OBXObserValue_BatteryandLead.class);
	
	private OBXObserValue_BatteryandLead() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentBatteryandLead", "en");
	}
	
	public OBXObserValue_BatteryandLead(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentBatteryandLead", languageCode);
	}
	
	private final String PROPERTY_KEY_REGEX_DEVICE_BATTERY_VOLTAGE="PDFPARSER_REGEX_DEVICE_BATTERY_VOLTAGE";
	public String getMDC_IDC_MSMT_BATTERY_VOLTAGE() throws PropertyNotFoundException {
		String mdc_IDC_MSMT_BATTERY_VOLTAGE = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_BATTERY_VOLTAGE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_MSMT_BATTERY_VOLTAGE = matcher.group(1);
			//			deviceBatteryVoltage = matcher.group();
		} // end if
		
		return mdc_IDC_MSMT_BATTERY_VOLTAGE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_IMPEDANCE="PDFPARSER_REGEX_MDC_IDC_MSMT_BATTERY_IMPEDANCE";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_IMPEDANCE_Cluster="PDFPARSER_REGEX_MDC_IDC_MSMT_BATTERY_IMPEDANCE_Cluster";
	public String getMDC_IDC_MSMT_BATTERY_IMPEDANCE()
	throws PropertyNotFoundException {
		String mdc_IDC_MSMT_BATTERY_IMPEDANCE_cluster = null;
		String mdc_IDC_MSMT_BATTERY_IMPEDANCE = null;
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_IMPEDANCE_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			mdc_IDC_MSMT_BATTERY_IMPEDANCE_cluster = matcher_cluster.group();
			
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_IMPEDANCE), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(mdc_IDC_MSMT_BATTERY_IMPEDANCE_cluster);
			if (matcher.find()) {
				mdc_IDC_MSMT_BATTERY_IMPEDANCE= matcher.group();
			}
		}
		return mdc_IDC_MSMT_BATTERY_IMPEDANCE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME="PDFPARSER_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME_Cluster="PDFPARSER_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME_Cluster";
	public String getMDC_IDC_MSMT_CAP_CHARGE_TIME()
	throws PropertyNotFoundException {
		String mdc_IDC_MSMT_CAP_CHARGE_TIME_cluster = null;
		String mdc_IDC_MSMT_CAP_CHARGE_TIME = null;
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			mdc_IDC_MSMT_CAP_CHARGE_TIME_cluster = matcher_cluster.group();
			//logger.info("mdc_IDC_MSMT_CAP_CHARGE_TIME_cluster "+mdc_IDC_MSMT_CAP_CHARGE_TIME_cluster);
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(mdc_IDC_MSMT_CAP_CHARGE_TIME_cluster);
			if (matcher.find()) {
				mdc_IDC_MSMT_CAP_CHARGE_TIME= matcher.group().trim();
				//logger.info("mdc_IDC_MSMT_CAP_CHARGE_TIME_cluster "+mdc_IDC_MSMT_CAP_CHARGE_TIME);
			}
		}
		return mdc_IDC_MSMT_CAP_CHARGE_TIME;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_1="PDFPARSER_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_1";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_2="PDFPARSER_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_2";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_Cluster="PDFPARSER_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_Cluster";
	public String getMDC_IDC_MSMT_CAP_CHARGE_DTM()
	throws PropertyNotFoundException {
		String mdc_IDC_MSMT_CAP_CHARGE_DTM_cluster = null;
		String mdc_IDC_MSMT_CAP_CHARGE_DTM = null;
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			mdc_IDC_MSMT_CAP_CHARGE_DTM_cluster = matcher_cluster.group().trim();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_1), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 = pattern_1.matcher(mdc_IDC_MSMT_CAP_CHARGE_DTM_cluster);
			if (matcher_1.find()) {
				//For the data in the form "10-Jan-2010 20:21:41"
				mdc_IDC_MSMT_CAP_CHARGE_DTM=matcher_1.group(3) + getMonthNumberFromMonthShortName(matcher_1.group(2)) + matcher_1.group(1) + matcher_1.group(4) + matcher_1.group(5) + matcher_1.group(6);
			}
			else {
				Pattern pattern_2 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_2), Pattern.MULTILINE | Pattern.DOTALL);
				Matcher matcher_2 = pattern_2.matcher(mdc_IDC_MSMT_CAP_CHARGE_DTM_cluster);
				if (matcher_2.find()) {
					//For the data in the form "03-Apr-2010", hours, minute and second are set to 00-00-00
					mdc_IDC_MSMT_CAP_CHARGE_DTM=  matcher_2.group(3) + getMonthNumberFromMonthShortName(matcher_2.group(2)) + matcher_2.group(1)+"000000";
				}
			}
		}
		return mdc_IDC_MSMT_CAP_CHARGE_DTM;
	}
	
	private final String PROPERTY_KEY_REGEX_ICARDEA_IDC_SET_VV="PDFPARSER_REGEX_ICARDEA_IDC_SET_VV";
	public String getICARDEA_IDC_SET_VV() throws PropertyNotFoundException {
		String icardea_IDC_SET_VV = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_ICARDEA_IDC_SET_VV), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			icardea_IDC_SET_VV= matcher.group(1).trim();
		} // end if
		return icardea_IDC_SET_VV;
	}
}