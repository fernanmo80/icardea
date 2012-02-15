package de.offis.health.icardea.cied.txt.parser;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import de.offis.health.icardea.cied.pdf.interfaces.OBRParserInterface;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface;
import de.offis.health.icardea.cied.pdf.interfaces.PDFParser;
import de.offis.health.icardea.cied.pdf.parser.AbstractPDFParser;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class OBXObserValue_SJM extends AbstractTXTParser implements OBXParserInterface{
	
	private static Logger logger = Logger.getLogger(OBXObserValue_SJM.class);
	
	private OBXObserValue_SJM() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegment_SJM", "en");
	}
	
	public OBXObserValue_SJM(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegment_SJM", languageCode);
	}
	
	public String getMDC_IDC_LEAD_CONNECTION_STATUS()
	throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_VOLTAGE="TXTPROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_VOLTAGE";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_VOLTAGE_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_VOLTAGE_Cluster";
	public String getMDC_IDC_MSMT_BATTERY_VOLTAGE()
	throws PropertyNotFoundException {
		String mdc_IDC_MSMT_BATTERY_VOLTAGE=null;
		String mdc_IDC_MSMT_BATTERY_VOLTAGE_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_VOLTAGE_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		
		if (matcher.find()) {
			mdc_IDC_MSMT_BATTERY_VOLTAGE_Cluster=matcher.group();
			Pattern pattern_VOLTAGE = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_VOLTAGE), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_VOLTAGE =pattern_VOLTAGE.matcher(mdc_IDC_MSMT_BATTERY_VOLTAGE_Cluster);
			
			if (matcher_VOLTAGE.find()){
				mdc_IDC_MSMT_BATTERY_VOLTAGE=matcher_VOLTAGE.group(2);
			}
		}
		return mdc_IDC_MSMT_BATTERY_VOLTAGE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_DTM="TXTPROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_DTM";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_DTM_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_DTM_Cluster";
	public String getMDC_IDC_MSMT_BATTERY_DTM()
	throws PropertyNotFoundException {
		String mdc_IDC_MSMT_BATTERY_DTM=null;
		String mdc_IDC_MSMT_BATTERY_DTM_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_DTM_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			mdc_IDC_MSMT_BATTERY_DTM_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_BATTERY_DTM), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(mdc_IDC_MSMT_BATTERY_DTM_Cluster);
			
			if (matcher_1.find()){
				mdc_IDC_MSMT_BATTERY_DTM=matcher_1.group(3)+getMonthNumberFromMonthShortName(matcher_1.group(1))+matcher_1.group(2)+"0000";
			}
		}
		return mdc_IDC_MSMT_BATTERY_DTM;
	}
	
	public String getMDC_IDC_MSMT_LEADHVCHNL_STATUS()
	throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getMDC_IDC_PG_MFG() throws PropertyNotFoundException {
		String mdc_IDC_PG_MFG=null;
		mdc_IDC_PG_MFG="SJM";
		return mdc_IDC_PG_MFG;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_PG_MODEL="TXTPROPERTY_KEY_REGEX_MDC_IDC_PG_MODEL";
	//private final String PROPERTY_KEY_REGEX_MDC_IDC_PG_MODEL_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_PG_MODEL_Cluster";
	public String getMDC_IDC_PG_MODEL(File txtFile) throws PropertyNotFoundException {
		String mdc_IDC_PG_MODEL=null;
		//String mdc_IDC_PG_MODEL_Cluster = null;
		String deviceNameandSerial=null;
		deviceNameandSerial=txtFile.getParentFile().getParentFile().getName();
		if (deviceNameandSerial!=null) {
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_PG_MODEL), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher =pattern.matcher(txtFile.getParentFile().getParent());
			if (matcher.find()){
				mdc_IDC_PG_MODEL=matcher.group(2);
			}
		}
		return mdc_IDC_PG_MODEL;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_PG_SERIAL="TXTPROPERTY_KEY_REGEX_MDC_IDC_PG_SERIAL";
	//private final String PROPERTY_KEY_REGEX_MDC_IDC_PG_SERIAL_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_PG_SERIAL_Cluster";
	public String getMDC_IDC_PG_SERIAL(File txtFile) throws PropertyNotFoundException {
		String mdc_IDC_PG_SERIAL=null;
		//String mdc_IDC_PG_SERIAL_Cluster = null;
		String deviceNameandSerial=null;
		deviceNameandSerial=txtFile.getParentFile().getParentFile().getName();
		if (deviceNameandSerial!=null) {
			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_PG_SERIAL), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher =pattern.matcher(deviceNameandSerial);
			if (matcher.find()){
				mdc_IDC_PG_SERIAL=matcher.group(1);
			}
		}
		return mdc_IDC_PG_SERIAL;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_PG_TYPE="TXTPDFPARSER_REGEX_MDC_IDC_PG_TYPE";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_PG_TYPE_Cluster="TXTPDFPARSER_REGEX_MDC_IDC_PG_TYPE_Cluster";
	public String getMDC_IDC_PG_TYPE() throws PropertyNotFoundException {
		String mdc_IDC_PG_TYPE="ICD";
		return mdc_IDC_PG_TYPE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SESS_DTM="TXTPROPERTY_KEY_REGEX_MDC_IDC_SESS_DTM";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SESS_DTM_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_SESS_DTM_Cluster";
	public String getMDC_IDC_SESS_DTM(File txtFile) throws PropertyNotFoundException {
		String mdc_IDC_SESS_DTM=null;
		//String mdc_IDC_SESS_DTM_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SESS_DTM)+txtFile.getName(), Pattern.MULTILINE | Pattern.DOTALL);//
		Matcher matcher =pattern.matcher(txtFile.getAbsolutePath());
		
		if (matcher.find()) {
			mdc_IDC_SESS_DTM="20"+matcher.group(1)+matcher.group(2);
		}
		return mdc_IDC_SESS_DTM;
	}
	
	public String getMDC_IDC_SESS_DTM() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SESS_TYPE="TXTPROPERTY_KEY_REGEX_MDC_IDC_SESS_DTM";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SESS_TYPE_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_SESS_DTM_Cluster";
	public String getMDC_IDC_SESS_TYPE() throws PropertyNotFoundException {
		String mdc_IDC_SESS_TYPE="Remote";
		return mdc_IDC_SESS_TYPE;
	}
	
	public String getMDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT()
	throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT()
	throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT()
	throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getMDC_IDC_PG_MODEL() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getMDC_IDC_PG_SERIAL() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME="TXTPROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME_Cluster";
	public String getMDC_IDC_MSMT_CAP_CHARGE_TIME()
	throws PropertyNotFoundException {
		String mdc_IDC_MSMT_CAP_CHARGE_TIME=null;
		String mdc_IDC_MSMT_CAP_CHARGE_TIME_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			mdc_IDC_MSMT_CAP_CHARGE_TIME_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_TIME), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(mdc_IDC_MSMT_CAP_CHARGE_TIME_Cluster);
			if (matcher_1.find()){
				mdc_IDC_MSMT_CAP_CHARGE_TIME=matcher_1.group(1);
			}
		}
		return mdc_IDC_MSMT_CAP_CHARGE_TIME;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM="TXTPROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_Cluster";
	public String getMDC_IDC_MSMT_CAP_CHARGE_DTM()
	throws PropertyNotFoundException {
		String mdc_IDC_MSMT_CAP_CHARGE_DTM=null;
		String mdc_IDC_MSMT_CAP_CHARGE_DTM_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			mdc_IDC_MSMT_CAP_CHARGE_DTM_Cluster=matcher.group();
			
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_MSMT_CAP_CHARGE_DTM), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(mdc_IDC_MSMT_CAP_CHARGE_DTM_Cluster);
			if (matcher_1.find()){
				mdc_IDC_MSMT_CAP_CHARGE_DTM=matcher_1.group(3)+getMonthNumberFromMonthShortName(matcher_1.group(1))+matcher_1.group(2)+"0000";
			}
		}
		return mdc_IDC_MSMT_CAP_CHARGE_DTM;
	}
	
	public String getMDC_IDC_SET_BRADY_AT_MODE_SWITCH_MODE()
	throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_SENSOR_RATE="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_SENSOR_RATE";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_SENSOR_RATE_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_SENSOR_RATE_Cluster";
	public String getMDC_IDC_SET_BRADY_MAX_SENSOR_RATE()
	throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_MAX_SENSOR_RATE=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_SENSOR_RATE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_MAX_SENSOR_RATE=matcher.group();
		}
		
		return mdc_IDC_SET_BRADY_MAX_SENSOR_RATE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_TRACKING_RATE="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_TRACKING_RATE";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_TRACKING_RATE_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_TRACKING_RATE_Cluster";
	public String getMDC_IDC_SET_BRADY_MAX_TRACKING_RATE()
	throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_MAX_TRACKING_RATE=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_MAX_TRACKING_RATE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_MAX_TRACKING_RATE=matcher.group();
		}
		
		return mdc_IDC_SET_BRADY_MAX_TRACKING_RATE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_PAV_DELAY="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_PAV_DELAY";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_PAV_DELAY_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_PAV_DELAY_Cluster";
	public String getMDC_IDC_SET_BRADY_PAV_DELAY()
	throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_PAV_DELAY=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_PAV_DELAY), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_PAV_DELAY=matcher.group();
		}
		
		return mdc_IDC_SET_BRADY_PAV_DELAY;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_SAV_DELAY="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_SAV_DELAY";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_SAV_DELAY_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_SAV_DELAY_Cluster";
	public String getMDC_IDC_SET_BRADY_SAV_DELAY()
	throws PropertyNotFoundException {
		String mdc_IDC_SET_BRADY_SAV_DELAY=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_BRADY_SAV_DELAY), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			mdc_IDC_SET_BRADY_SAV_DELAY=matcher.group();
		}
		
		return mdc_IDC_SET_BRADY_SAV_DELAY;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_SENSING_SENSITIVITY_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_SENSING_SENSITIVITY_Cluster";
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY";
	
	public String getMDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY()
	throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY=null;
		String MDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_SENSING_SENSITIVITY_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			MDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(MDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY_Cluster);
			
			if (matcher_1.find()){
				MDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY=matcher_1.group(1).trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY;
	}
	
	public String getMDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY()
	throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY=null;
		String MDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_SENSING_SENSITIVITY_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			MDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(MDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY_Cluster);
			
			if (matcher_1.find()){
				MDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY=matcher_1.group(2).trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY;
	}
	
	public String getMDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY()
	throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY=null;
		String MDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_SENSING_SENSITIVITY_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			MDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(MDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY_Cluster);
			
			if (matcher_1.find()){
				MDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY=matcher_1.group(3).trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE";
	
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE()
	throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE=null;
		String MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE_Cluster);
			
			if (matcher_1.find()){
				MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE=matcher_1.group(1).trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE;
	}
	
	public String getMDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE()
	throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE=null;
		String MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE_Cluster);
			
			if (matcher_1.find()){
				MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE=matcher_1.group(2).trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE;
	}
	
	public String getMDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE()
	throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE=null;
		String MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE_Cluster);
			
			if (matcher_1.find()){
				MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE=matcher_1.group(3).trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_PULSEWIDTH_Cluster="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_PULSEWIDTH_Cluster";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH";
	private final String PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH="TXTPROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH";
	
	public String getMDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH()
	throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH=null;
		String MDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_PULSEWIDTH_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			MDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(MDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH_Cluster);
			
			if (matcher_1.find()){
				MDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH=matcher_1.group(1).trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH;
	}
	
	public String getMDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH()
	throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH=null;
		String MDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_PULSEWIDTH_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			MDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(MDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH_Cluster);
			
			if (matcher_1.find()){
				MDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH=matcher_1.group(2).trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH;
	}
	
	public String getMDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH()
	throws PropertyNotFoundException {
		String MDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH=null;
		String MDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING_PULSEWIDTH_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getTxtContent());
		if (matcher.find()) {
			MDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH_Cluster=matcher.group();
			Pattern pattern_1 = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_1 =pattern_1.matcher(MDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH_Cluster);
			
			if (matcher_1.find()){
				MDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH=matcher_1.group(3).trim();
			}
		}
		return MDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS="TXTPROPERTY_KEY_REGEX_MDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS";
	public String getMDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS()
	throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getTxtContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS=matcher.group(2);
		}
		return mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_DTM="TXTPROPERTY_KEY_REGEX_MDC_IDC_EPISODE_DTM";
	public String getMDC_IDC_EPISODE_DTM() throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_DTM=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_DTM), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getTxtContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_DTM=matcher.group(4) + getMonthNumberFromMonthShortName(matcher.group(2)) + matcher.group(1) + matcher.group(5) + matcher.group(6) + matcher.group(7);			
		}
		return mdc_IDC_EPISODE_DTM;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_ID="TXTPROPERTY_KEY_REGEX_MDC_IDC_EPISODE_ID";
	public String getMDC_IDC_EPISODE_ID() throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_ID=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_ID), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getTxtContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_ID=(matcher.group(1).trim());
		}
		return mdc_IDC_EPISODE_ID;
	}
	
	public String getMDC_IDC_EPISODE_THERAPY_RESULT()
	throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_VENDOR_TYPE="TXTPROPERTY_KEY_REGEX_MDC_IDC_EPISODE_VENDOR_TYPE";
	public String getMDC_IDC_EPISODE_VENDOR_TYPE()
	throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_TYPE=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_VENDOR_TYPE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getTxtContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_TYPE=matcher.group().trim();
		}
		return mdc_IDC_EPISODE_TYPE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_TYPE="TXTPROPERTY_KEY_REGEX_MDC_IDC_EPISODE_TYPE";
	public String getMDC_IDC_EPISODE_TYPE() throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_TYPE=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_TYPE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getTxtContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_TYPE=matcher.group().trim();
		}
		return mdc_IDC_EPISODE_TYPE;
	}
	
	private final String PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_DURATION="TXTPROPERTY_KEY_REGEX_MDC_IDC_EPISODE_DURATION";
	public String getMDC_IDC_EPISODE_DURATION()
	throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_DURATION=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_MDC_IDC_EPISODE_DURATION), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getTxtContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_DURATION=matcher.group(1).trim();
		}
		return mdc_IDC_EPISODE_DURATION;
	}
}