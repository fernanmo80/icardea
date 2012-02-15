package de.offis.health.icardea.cied.pdf.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_LeadPerformanceTrends;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public class OBXObserValue_LeadPerformanceTrends extends AbstractPDFParser implements OBXParserInterface_LeadPerformanceTrends {
	private static Logger logger = Logger.getLogger(OBXObserValue_LeadPerformanceTrends.class);
	
	private OBXObserValue_LeadPerformanceTrends() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentLeadPerformanceTrends", "en");
	}
	
	public OBXObserValue_LeadPerformanceTrends(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentLeadPerformanceTrends", languageCode);
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
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_IMPEDANCE_POLARITY="PDFPARSER_REGEX_MDC_IDC_MSMT_LEADCHNL_RA_IMPEDANCE_POLARITY";
	public String getMDC_IDC_SET_LEADCHNL_RA_IMPEDANCE_POLARITY()
			throws PropertyNotFoundException {
			String mdc_IDC_SET_LEADCHNL_RA_IMPEDANCE_POLARITY = null;
			
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_IMPEDANCE_POLARITY), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(getPdfContent());
			if (matcher.find()) {
				mdc_IDC_SET_LEADCHNL_RA_IMPEDANCE_POLARITY= matcher.group();
			}
		return mdc_IDC_SET_LEADCHNL_RA_IMPEDANCE_POLARITY;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_LEADCHNL_RV_IMPEDANCE_POLARITY="PDFPARSER_REGEX_MDC_IDC_MSMT_LEADCHNL_RV_IMPEDANCE_POLARITY";
	public String getMDC_IDC_MSMT_LEADCHNL_RV_IMPEDANCE_POLARITY()
			throws PropertyNotFoundException {
			String mdc_IDC_MSMT_LEADCHNL_RV_IMPEDANCE_POLARITY = null;
			
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_LEADCHNL_RV_IMPEDANCE_POLARITY), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(getPdfContent());
			if (matcher.find()) {
				mdc_IDC_MSMT_LEADCHNL_RV_IMPEDANCE_POLARITY= matcher.group();
			}
		return mdc_IDC_MSMT_LEADCHNL_RV_IMPEDANCE_POLARITY;
	}
	
	
	public String getMDC_IDC_MSMT_LEADCHNL_RA_IMPEDANCE_VALUE()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	//MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE="PDFPARSER_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE_Cluster="PDFPARSER_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE_Cluster";
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE()
			throws PropertyNotFoundException {
		String mdc_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE_cluster = null;
		String mdc_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE = null;
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			mdc_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE_cluster = matcher_cluster.group();
			
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(mdc_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE_cluster);
			if (matcher.find()) {
				mdc_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE= matcher.group().trim();
			}
		}
		return mdc_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH="PDFPARSER_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH_Cluster="PDFPARSER_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH_Cluster";
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PULSEWIDTH()
			throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH_cluster = null;
		String MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH = null;
		
		Pattern pattern_cluster = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_cluster = pattern_cluster.matcher(getPdfContent());
		if (matcher_cluster.find()) {
			MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH_cluster = matcher_cluster.group();
			
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher = pattern.matcher(MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH_cluster);
			if (matcher.find()) {
				MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH= matcher.group().trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PACING_PULSEWIDTH;
	}
	
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_POLARITY()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_CAPTURE_MODE()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}