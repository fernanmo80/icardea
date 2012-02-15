package de.offis.health.icardea.cied.pdf.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_ArrhythmiaEpisodeList;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.tools.GlobalTools;

public class OBXObserValue_HeartFailureManagementReport extends AbstractPDFParser implements OBXParserInterface_ArrhythmiaEpisodeList{
	private static Logger logger = Logger.getLogger(OBXObserValue_HeartFailureManagementReport.class);

	private OBXObserValue_HeartFailureManagementReport() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentHeartFailureManagementReport", "en");
	}
	
	public OBXObserValue_HeartFailureManagementReport(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentHeartFailureManagementReport", languageCode);
	}

	public String getMDC_IDC_EPISODE_DTM() throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_DTM=null;
		Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-(2[0-9]{3}) ([01][0-9]|2[0-3]):([0-5][0-9]).*?");//, Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_DTM=matcher.group(3) + getMonthNumberFromMonthShortName(matcher.group(2)) + matcher.group(1) + matcher.group(4) + matcher.group(5) + "00";			
		}
		return mdc_IDC_EPISODE_DTM;
	}

	public String getMDC_IDC_EPISODE_DURATION()
			throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_DURATION=null;
		
		Pattern pattern_2 = Pattern.compile
		("(0[1-9]|[12][0-9]|3[01])-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-(2[0-9]{3}) ([01][0-9]|2[0-3]):([0-5][0-9]).*?([0-5][0-9]):([0-5][0-9]):([0-5][0-9]).*?");
		Matcher matcher_2 = pattern_2.matcher(getPdfContent());
		if (matcher_2.find()){
			mdc_IDC_EPISODE_DURATION=
				Integer.toString(
						GlobalTools.getIntValue(matcher_2.group(6))*3600+
						GlobalTools.getIntValue(matcher_2.group(7))*60+
						GlobalTools.getIntValue(matcher_2.group(8)));
		}
		else {
		Pattern pattern_3 = Pattern.compile
		("(0[1-9]|[12][0-9]|3[01])-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-(2[0-9]{3}) ([01][0-9]|2[0-3]):([0-5][0-9]).*?:([0-5][0-9]):([0-5][0-9]).*?");
		Matcher matcher_3 = pattern_3.matcher(getPdfContent());
			if (matcher_3.find()){
				mdc_IDC_EPISODE_DURATION=Integer.toString(
						GlobalTools.getIntValue(matcher_3.group(6))*60+
						GlobalTools.getIntValue(matcher_3.group(7)));
			}
			else {
				Pattern pattern_4 = Pattern.compile
				("(0[1-9]|[12][0-9]|3[01])-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-(2[0-9]{3}) ([01][0-9]|2[0-3]):([0-5][0-9]).*?:([0-5][0-9]).*?");
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
		Pattern pattern = Pattern.compile("(\\d+)\\s(?=(0[1-9]|[12][0-9]|3[01])-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-(2[0-9]{3}))");
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()){
			mdc_IDC_EPISODE_ID=(matcher.group(1).trim());
		}
		return mdc_IDC_EPISODE_ID;
	}

	public String getMDC_IDC_EPISODE_TYPE() throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_TYPE=null;
		Pattern pattern = Pattern.compile("AT/AF|VF|VT|VT-NS");
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

	public String getMDC_IDC_EPISODE_THERAPY_RESULT()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}