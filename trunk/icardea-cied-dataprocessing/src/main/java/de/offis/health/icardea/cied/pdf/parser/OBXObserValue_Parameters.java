package de.offis.health.icardea.cied.pdf.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_Parameters;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public class OBXObserValue_Parameters extends AbstractPDFParser implements OBXParserInterface_Parameters {
	private static Logger logger = Logger.getLogger(OBXObserValue_Parameters.class);
	
	private OBXObserValue_Parameters() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentParameters", "en");
	}
	
	public OBXObserValue_Parameters(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentParameters", languageCode);
	}

	private final String PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE
	="PDFPARSER_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE";
	private final String PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster
	="PDFPARSER_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster";

	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE()
	throws PropertyNotFoundException {
		String[] mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE = {null,null,null};
		String mdc_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE = null;
		String mdc_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE_cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());//pattern.matcher("Amplitude 3.50 V 3.50 V 4.00 V");//
		if (matcher.find()) {
			mdc_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE_cluster=matcher.group();
			Pattern pattern_RA = Pattern.compile("Atrial");
			Matcher matcher_RA = pattern_RA.matcher(mdc_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE_cluster);
			if (matcher_RA.find()){
				Pattern pattern_Amplitude = Pattern.compile("Amplitude.*V");
				Matcher matcher_Amplitude= pattern_Amplitude.matcher(mdc_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE_cluster);
				matcher_Amplitude.find();
				mdc_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE_cluster = matcher_Amplitude.group();
				mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE = mdc_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE_cluster.split("V");
				
				for(int i=0; i<mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE.length;i++){
					Pattern pattern_third = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE), Pattern.MULTILINE | Pattern.DOTALL);
					Matcher matcher_third = pattern_third.matcher(mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE[i]);//(mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_cluster);
					if (matcher_third.find()){
						mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE[i] = matcher_third.group();
					}
				}
				if (mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE.length>0){
					mdc_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE=mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE[0];
				}
			}
		}
		return mdc_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE;
	}
	
	public String getMDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE()
	throws PropertyNotFoundException {
		String[] mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE = {null,null,null};
		String mdc_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE = null;
		String mdc_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE_cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());//pattern.matcher("Amplitude 3.50 V 3.50 V 4.00 V");//
		if (matcher.find()) {
			mdc_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE_cluster=matcher.group();
			Pattern pattern_RV = Pattern.compile("RV");
			Matcher matcher_RV = pattern_RV.matcher(mdc_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE_cluster);
			if (matcher_RV.find()){
				Pattern pattern_Amplitude = Pattern.compile("Amplitude.*V");
				Matcher matcher_Amplitude= pattern_Amplitude.matcher(mdc_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE_cluster);
				matcher_Amplitude.find();
				mdc_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE_cluster = matcher_Amplitude.group();
				mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE = mdc_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE_cluster.split("V");
				
				for(int i=0; i<mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE.length;i++){
					Pattern pattern_third = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE), Pattern.MULTILINE | Pattern.DOTALL);
					Matcher matcher_third = pattern_third.matcher(mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE[i]);//(mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_cluster);
					if (matcher_third.find()){
						mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE[i] = matcher_third.group();
					}
				}
				if (mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE.length>1){
					mdc_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE=mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE[1];
				}
			}
		}
		return mdc_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE;
	}
	
	public String getMDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE() 
	throws PropertyNotFoundException {
		String[] mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE = {null,null,null};
		String mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE = null;
		String mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_cluster=matcher.group();
			
			Pattern pattern_LV = Pattern.compile("LV");
			Matcher matcher_LV = pattern_LV.matcher(mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_cluster);
			if (matcher_LV.find()){
				Pattern pattern_Amplitude = Pattern.compile("Amplitude.*V");
				Matcher matcher_Amplitude= pattern_Amplitude.matcher(mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_cluster);
				if (matcher_Amplitude.find()){
					
					mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_cluster = matcher_Amplitude.group();
					mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE = mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_cluster.split("V");
					
					for(int i=0; i<mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE.length;i++){
						Pattern pattern_third = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE), Pattern.MULTILINE | Pattern.DOTALL);
						Matcher matcher_third = pattern_third.matcher(mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE[i]);//(mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_cluster);
						if (matcher_third.find()){
							mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE[i] = matcher_third.group();
						}
					}
				}
				if (mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE.length>2){
					mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE=mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE[2];
				}
			}
		}
		return mdc_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE;
	}

	private final String PROPERTY_KEY_REGEX_MDC_IDC_PG_IMPLANT_DT
	="PDFPARSER_REGEX_MDC_IDC_PG_IMPLANT_DT";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_PG_IMPLANT_DT_Cluster
	="PDFPARSER_REGEX_MDC_IDC_PG_IMPLANT_DT_Cluster";
	
	public String getMDC_IDC_PG_IMPLANT_DT() throws PropertyNotFoundException {
		String mdc_IDC_PG_IMPLANT_DT = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_PG_IMPLANT_DT), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_PG_IMPLANT_DT = matcher.group(3) + getMonthNumberFromMonthShortName(matcher.group(2)) + matcher.group(1)+"0000";
		}
		return mdc_IDC_PG_IMPLANT_DT;
	}
	
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_ENUM_BRADY_MODE
	="PDFPARSER_REGEX_MDC_IDC_ENUM_BRADY_MODE";
	public String getMDC_IDC_ENUM_BRADY_MODE() throws PropertyNotFoundException {
		String mdc_IDC_ENUM_BRADY_MODE = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_ENUM_BRADY_MODE), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_ENUM_BRADY_MODE = matcher.group().trim();
		}
		return mdc_IDC_ENUM_BRADY_MODE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_LOWRATE
	="PDFPARSER_REGEX_MDC_IDC_SET_BRADY_LOWRATE";
	public String getMDC_IDC_SET_BRADY_LOWRATE() throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_LOWRATE = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_LOWRATE), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_LOWRATE = matcher.group().trim();
		}
		return mdc_IDC_SET_BRADY_LOWRATE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_TRACKING_RATE
	="PDFPARSER_REGEX_MDC_IDC_SET_BRADY_MAX_TRACKING_RATE";
	public String getMDC_IDC_SET_BRADY_MAX_TRACKING_RATE() throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_MAX_TRACKING_RATE = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_TRACKING_RATE), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_MAX_TRACKING_RATE = matcher.group().trim();
		}
		return mdc_IDC_SET_BRADY_MAX_TRACKING_RATE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_SENSOR_RATE
	="PDFPARSER_REGEX_MDC_IDC_SET_BRADY_MAX_SENSOR_RATE";
	public String getMDC_IDC_SET_BRADY_MAX_SENSOR_RATE() throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_MAX_SENSOR_RATE = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_SENSOR_RATE), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_MAX_SENSOR_RATE = matcher.group().trim();
		}
		return mdc_IDC_SET_BRADY_MAX_SENSOR_RATE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_AT_MODE_SWITCH_RATE
	="PDFPARSER_REGEX_MDC_IDC_SET_BRADY_AT_MODE_SWITCH_RATE";
	public String getMDC_IDC_SET_BRADY_AT_MODE_SWITCH_RATE() throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_AT_MODE_SWITCH_RATE = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_AT_MODE_SWITCH_RATE), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_AT_MODE_SWITCH_RATE = matcher.group().trim();
		}
		return mdc_IDC_SET_BRADY_AT_MODE_SWITCH_RATE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_SAV_DELAY
	="PDFPARSER_REGEX_MDC_IDC_SET_BRADY_SAV_DELAY";
	public String getMDC_IDC_SET_BRADY_SAV_DELAY() throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_SAV_DELAY = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_SAV_DELAY), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_SAV_DELAY = matcher.group().trim();
		}
		return mdc_IDC_SET_BRADY_SAV_DELAY;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_PAV_DELAY
	="PDFPARSER_REGEX_MDC_IDC_SET_BRADY_PAV_DELAY";
	public String getMDC_IDC_SET_BRADY_PAV_DELAY() throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_PAV_DELAY = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_PAV_DELAY), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_PAV_DELAY = matcher.group().trim();
		}
		return mdc_IDC_SET_BRADY_PAV_DELAY;
	}
	
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_ZONE="PDFPARSER_REGEX_MDC_IDC_SET_ZONE";
	
	public String getMDC_IDC_SET_ZONE_DETECTION_INTERVAL()
			throws PropertyNotFoundException {
		String zone_data = null;
		Pattern pattern = Pattern.compile(getProperty(PROPERTY_KEY_REGEX_MDC_IDC_SET_ZONE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			zone_data=matcher.group(3);
		}
		return zone_data;
	}

	public String getMDC_IDC_SET_ZONE_STATUS() throws PropertyNotFoundException {
		String zone_data = null;
		Pattern pattern = Pattern.compile(getProperty(PROPERTY_KEY_REGEX_MDC_IDC_SET_ZONE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			zone_data=matcher.group(2);
		}
		return zone_data;
	}

	public String getMDC_IDC_SET_ZONE_TYPE() throws PropertyNotFoundException {
		String zone_data = null;
		Pattern pattern = Pattern.compile(getProperty(PROPERTY_KEY_REGEX_MDC_IDC_SET_ZONE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			zone_data=matcher.group(1);
		}
		return zone_data;
	}

	public String getMDC_IDC_SET_ZONE_VENDOR_TYPE()
			throws PropertyNotFoundException {
		String zone_data = null;
		Pattern pattern = Pattern.compile(getProperty(PROPERTY_KEY_REGEX_MDC_IDC_SET_ZONE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			zone_data=matcher.group(1);
		}
		return zone_data;
	}
	
	public String getICARDEA_IDC_SET_LIMIT_VF()
	throws PropertyNotFoundException {
		String zone_data = null;
		Pattern pattern = Pattern.compile(getProperty(PROPERTY_KEY_REGEX_MDC_IDC_SET_ZONE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			zone_data=matcher.group(4);
		}
		return zone_data;
	}
	
	public String getICARDEA_IDC_SET_LIMIT_FVT()
	throws PropertyNotFoundException {
		String zone_data = null;
		Pattern pattern = Pattern.compile(getProperty(PROPERTY_KEY_REGEX_MDC_IDC_SET_ZONE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			zone_data=matcher.group(4);
		}
		return zone_data;
	}
	
	public String getICARDEA_IDC_SET_LIMIT_VT()
	throws PropertyNotFoundException {
		String zone_data = null;
		Pattern pattern = Pattern.compile(getProperty(PROPERTY_KEY_REGEX_MDC_IDC_SET_ZONE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			zone_data=matcher.group(4);
		}
		return zone_data;
	}
	
	private final String PROPERTY_KEY_REGEX_ZONE="PDFPARSER_REGEX_ZONE";
	public String getZoneCluster() throws PropertyNotFoundException {
		String cluster = null;
		Pattern pattern = Pattern.compile(getProperty(PROPERTY_KEY_REGEX_ZONE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			cluster=matcher.group();
		}
		return cluster;
	}

	/*
	 * Example to show how add new parameters
	 */
	private final String PROPERTY_KEY_REGEX_ICARDEA_IDC_SET_NCAP
	="PDFPARSER_REGEX_ICARDEA_IDC_SET_NCAP";
	public String getICARDEA_IDC_SET_NCAP() throws PropertyNotFoundException {
		String icardea_IDC_SET_NCAP = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_ICARDEA_IDC_SET_NCAP), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			icardea_IDC_SET_NCAP = matcher.group().trim();
		}
		return icardea_IDC_SET_NCAP;
	}
}