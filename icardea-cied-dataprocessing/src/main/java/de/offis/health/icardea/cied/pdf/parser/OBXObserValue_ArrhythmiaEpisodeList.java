package de.offis.health.icardea.cied.pdf.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_ArrhythmiaEpisodeList;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.tools.GlobalTools;

public class OBXObserValue_ArrhythmiaEpisodeList extends AbstractPDFParser implements OBXParserInterface_ArrhythmiaEpisodeList{
	private static Logger logger = Logger.getLogger(OBXObserValue_BatteryandLead.class);
	
	private OBXObserValue_ArrhythmiaEpisodeList() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentArrhythmiaEpisodeList", "en");
	}
	
	public OBXObserValue_ArrhythmiaEpisodeList(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentArrhythmiaEpisodeList", languageCode);
	}
	private final String PROPERTY_KEY_PDFPARSER_YES="PDFPARSER_YES";
	private final String PROPERTY_KEY_PDFPARSER_NO="PDFPARSER_NO";
	//private final String PROPERTY_KEY_MONTH_SHORTNAME_ARRAY="PDFPARSER_MONTH_SHORTNAME_ARRAY";
	
	private final String PROPERTY_KEY_EPISODE_DTM="PDFPARSER_REGEX_EPISODE_DTM";
	private final String PROPERTY_KEY_EPISODE_DURATION_1="PDFPARSER_REGEX_EPISODE_DURATION_1";
	private final String PROPERTY_KEY_EPISODE_DURATION_2="PDFPARSER_REGEX_EPISODE_DURATION_2";
	private final String PROPERTY_KEY_EPISODE_DURATION_3="PDFPARSER_REGEX_EPISODE_DURATION_3";
	private final String PROPERTY_KEY_EPISODE_ID="PDFPARSER_REGEX_EPISODE_ID";
	private final String PROPERTY_KEY_EPISODE_TYPE="PDFPARSER_REGEX_EPISODE_TYPE";
	private final String PROPERTY_KEY_EPISODE_THERAPY_DETAILS_ATP="PDFPARSER_REGEX_EPISODE_THERAPY_DETAILS_ATP";
	private final String PROPERTY_KEY_EPISODE_THERAPY_DETAILS_Shock="PDFPARSER_REGEX_EPISODE_THERAPY_DETAILS_Shock";
	private final String PROPERTY_KEY_EPISODE_RECENT_COUNT_ATP="PDFPARSER_REGEX_EPISODE_RECENT_COUNT_ATP";
	private final String PROPERTY_KEY_EPISODE_THERAPY_RESULT="PDFPARSER_REGEX_EPISODE_THERAPY_RESULT";

	public String getMDC_IDC_EPISODE_DTM() throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_DTM=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_EPISODE_DTM), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_DTM=matcher.group(3) + getMonthNumberFromMonthShortName(matcher.group(2)) + matcher.group(1) + matcher.group(4) + matcher.group(5) + "00";
		}
		return mdc_IDC_EPISODE_DTM;
	}
	
	public String getMDC_IDC_EPISODE_DURATION()
	throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_DURATION=null;
		
		//hh:mm:ss
		Pattern pattern_2 = Pattern.compile
		(getProperty(this.PROPERTY_KEY_EPISODE_DURATION_1), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_2 = pattern_2.matcher(getPdfContent());
		if (matcher_2.find()){
			mdc_IDC_EPISODE_DURATION=
				Integer.toString(
						GlobalTools.getIntValue(matcher_2.group(6))*3600+
						GlobalTools.getIntValue(matcher_2.group(7))*60+
						GlobalTools.getIntValue(matcher_2.group(8)));
		}
		else {
			//mm:ss
			Pattern pattern_3 = Pattern.compile
			(getProperty(this.PROPERTY_KEY_EPISODE_DURATION_2), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_3 = pattern_3.matcher(getPdfContent());
			if (matcher_3.find()){
				mdc_IDC_EPISODE_DURATION=Integer.toString(
						GlobalTools.getIntValue(matcher_3.group(6))*60+
						GlobalTools.getIntValue(matcher_3.group(7)));
			}
			else {
				//:ss
				Pattern pattern_4 = Pattern.compile
				(getProperty(this.PROPERTY_KEY_EPISODE_DURATION_3), Pattern.MULTILINE | Pattern.DOTALL);
				Matcher matcher_4 = pattern_4.matcher(getPdfContent());
				if (matcher_4.find()){
					mdc_IDC_EPISODE_DURATION=matcher_4.group(6);
				}
			}
		}
		return mdc_IDC_EPISODE_DURATION;
	}
	
	public String getMDC_IDC_EPISODE_ID() throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_ID=null;
		Pattern pattern = Pattern.compile
		(getProperty(this.PROPERTY_KEY_EPISODE_ID), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_ID=(matcher.group(1).trim());
		}
		return mdc_IDC_EPISODE_ID;
	}
	
	public String getMDC_IDC_EPISODE_TYPE() throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_TYPE=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_EPISODE_TYPE), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_TYPE=matcher.group().trim();
		}
		return mdc_IDC_EPISODE_TYPE;
	}
	
	public String getMDC_IDC_EPISODE_VENDOR_TYPE()
	throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getMDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS()
	throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS=null;
		String mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_ATP="";
		String mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_Shock="";
		
		Pattern pattern_ATP = Pattern.compile(getProperty(this.PROPERTY_KEY_EPISODE_THERAPY_DETAILS_ATP), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_ATP = pattern_ATP.matcher(getPdfContent());
		if (matcher_ATP.find()){
			mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_ATP="ATP*"+matcher_ATP.group(2).trim()+" ";
		}

		Pattern pattern_shock = Pattern.compile(getProperty(this.PROPERTY_KEY_EPISODE_THERAPY_DETAILS_Shock), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher_schock = pattern_shock.matcher(getPdfContent());
		
		if (mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_ATP!="") {
			mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS=mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_ATP;
		}

		while(matcher_schock.find()){
			mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_Shock=mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_Shock+ " " + matcher_schock.group().trim();
		}
		
		if (mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_Shock!="") {
			mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS=mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_ATP+ "Shock" +mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS_Shock;
		}

		return mdc_IDC_EPISODE_DETECTION_THERAPY_DETAILS;
	}
	
	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_ATP() 
	throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_ATP=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_EPISODE_RECENT_COUNT_ATP), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getPdfContent());
		
		if (matcher.find()){
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_ATP=matcher.group(2).trim();
		}
		return mdc_IDC_STAT_EPISODE_RECENT_COUNT_ATP;
	}
	
	public String getMDC_IDC_EPISODE_THERAPY_RESULT()
	throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_DETECTION_THERAPY_RESULTS=null;
		Pattern pattern_ATP = Pattern.compile(getProperty(this.PROPERTY_KEY_EPISODE_THERAPY_RESULT), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern_ATP.matcher(getPdfContent());
		
		if (matcher.find()){
			mdc_IDC_EPISODE_DETECTION_THERAPY_RESULTS=matcher.group(2).trim();
			if(mdc_IDC_EPISODE_DETECTION_THERAPY_RESULTS.equals((getProperty(this.PROPERTY_KEY_PDFPARSER_YES)).toString())) {
				mdc_IDC_EPISODE_DETECTION_THERAPY_RESULTS="Successful";
			}
			if(mdc_IDC_EPISODE_DETECTION_THERAPY_RESULTS.equals((getProperty(this.PROPERTY_KEY_PDFPARSER_NO)).toString())) {
				mdc_IDC_EPISODE_DETECTION_THERAPY_RESULTS="Unsuccessful";
			}
		}
		return mdc_IDC_EPISODE_DETECTION_THERAPY_RESULTS;
	}
}