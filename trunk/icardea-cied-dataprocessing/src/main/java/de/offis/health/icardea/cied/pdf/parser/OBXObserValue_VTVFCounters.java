package de.offis.health.icardea.cied.pdf.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.sun.mail.handlers.image_gif;

import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_Parameters;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_VTVFCounters;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public class OBXObserValue_VTVFCounters extends AbstractPDFParser implements OBXParserInterface_VTVFCounters {
	private static Logger logger = Logger.getLogger(OBXObserValue_VTVFCounters.class);
	
	private final String PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT="PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT";
	private final String PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_Cluster="PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_Cluster";
	
	private final String PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT="PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT";
	private final String PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_Cluster="PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_Cluster";
	
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_AF="PDFPARSER_REGEX_STAT_EPISODE_TYPE_AF";
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_AF_Cluster="PDFPARSER_REGEX_STAT_EPISODE_TYPE_AF_Cluster";
	
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_SVT="PDFPARSER_REGEX_STAT_EPISODE_TYPE_SVT";
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_SVT_Cluster="PDFPARSER_REGEX_STAT_EPISODE_TYPE_SVT_Cluster";
	
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VT="PDFPARSER_REGEX_STAT_EPISODE_TYPE_VT";
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VT_Cluster="PDFPARSER_REGEX_STAT_EPISODE_TYPE_VT_Cluster";
	
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_FVT="PDFPARSER_REGEX_STAT_EPISODE_TYPE_FVT";
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_FVT_Cluster="PDFPARSER_REGEX_STAT_EPISODE_TYPE_FVT_Cluster";
	
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_NSVT="PDFPARSER_REGEX_STAT_EPISODE_TYPE_NSVT";
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_NSVT_Cluster="PDFPARSER_REGEX_STAT_EPISODE_TYPE_NSVT_Cluster";
	
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VF="PDFPARSER_REGEX_STAT_EPISODE_TYPE_VF";
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VF_Cluster="PDFPARSER_REGEX_STAT_EPISODE_TYPE_VF_Cluster";
	
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_START="PDFPARSER_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_START";
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_START_Cluster="PDFPARSER_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_START_Cluster";
	
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_END="PDFPARSER_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_END";
	private final String PROPERTY_KEY_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_END_Cluster="PDFPARSER_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_END_Cluster";
	
	private OBXObserValue_VTVFCounters() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentVTVFCounters", "en");
	}
	
	public OBXObserValue_VTVFCounters(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentVTVFCounters", languageCode);
	}
	/*
	public String getMDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT() 
	throws PropertyNotFoundException {
		String mdc_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT_VT=null;
		mdc_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT_VT=""; //not in PDF files
		return mdc_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT_VT;
	}
	 */
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT() 
	throws PropertyNotFoundException {
		String mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT="0";
		String mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_Cluster = null;

		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		
		if (matcher.find()) {
			mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_Cluster=matcher.group();
			Pattern pattern_DELIVERED = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_DELIVERED =pattern_DELIVERED.matcher(mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_Cluster);
			
			if (matcher_DELIVERED.find()){
				mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT=matcher_DELIVERED.group(3);
			}
		}
		return mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT;
	}
	
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT()
	throws PropertyNotFoundException {
		String mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT=null;
		String mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_Cluster = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		
		if (matcher.find()) {
			mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_Cluster=matcher.group();
			Pattern pattern_ABORTED = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_ABORTED =pattern_ABORTED.matcher(mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_Cluster);
			
			if (matcher_ABORTED.find()){
				mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT=matcher_ABORTED.group(3);
			}
		}
		
		return mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT;
	}
	
	public String getMDC_IDC_STAT_EPISODE_TYPE_AF() throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_TYPE_AF = null;
		String mdc_IDC_STAT_EPISODE_TYPE_AF_Cluster = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_AF_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			//mdc_IDC_STAT_EPISODE_TYPE_AF="AT/AF";
			mdc_IDC_STAT_EPISODE_TYPE_AF_Cluster=matcher.group();
			Pattern pattern_AF = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_AF), Pattern.MULTILINE | Pattern.DOTALL);
			//("((?:^|\\b)VT(?:^|\\b)).*"); //
			Matcher matcher_AF =pattern_AF.matcher(mdc_IDC_STAT_EPISODE_TYPE_AF_Cluster);
			if (matcher_AF.find()){
				/*
				mdc_IDC_STAT_EPISODE_TYPE_AF=matcher_AF.group();
				String[] SubString = mdc_IDC_STAT_EPISODE_TYPE_AF.split(" ");
				int AF_Last_Session=Integer.parseInt(SubString[2]);
				if (AF_Last_Session==0){
					mdc_IDC_STAT_EPISODE_TYPE_AF=null;
				}
				else if (AF_Last_Session >0){
					mdc_IDC_STAT_EPISODE_TYPE_AF="AT/AF";
				}
				*/
				mdc_IDC_STAT_EPISODE_TYPE_AF="AT/AF";
			}
		}
		return mdc_IDC_STAT_EPISODE_TYPE_AF;
	}
	
	public String getMDC_IDC_STAT_EPISODE_TYPE_SVT()
	throws PropertyNotFoundException {
		
		String mdc_IDC_STAT_EPISODE_TYPE_SVT = null;
		String mdc_IDC_STAT_EPISODE_TYPE_SVT_Cluster = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_SVT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			//mdc_IDC_STAT_EPISODE_TYPE_SVT="SVT";
			mdc_IDC_STAT_EPISODE_TYPE_SVT_Cluster=matcher.group();
			Pattern pattern_SVT = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_SVT), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_SVT =pattern_SVT.matcher(mdc_IDC_STAT_EPISODE_TYPE_SVT_Cluster);
			if (matcher_SVT.find()){
				/*
				mdc_IDC_STAT_EPISODE_TYPE_SVT=matcher_SVT.group();
				String[] SubString = mdc_IDC_STAT_EPISODE_TYPE_SVT.split(" ");
				int SVT_Last_Session=Integer.parseInt(SubString[2]);
				if (SVT_Last_Session==0){
					mdc_IDC_STAT_EPISODE_TYPE_SVT=null;
				}
				else if (SVT_Last_Session >0){
					mdc_IDC_STAT_EPISODE_TYPE_SVT="SVT";
				}
				*/
				mdc_IDC_STAT_EPISODE_TYPE_SVT="SVT";
			}
		}
		return mdc_IDC_STAT_EPISODE_TYPE_SVT;
	}
	
	public String getMDC_IDC_STAT_EPISODE_TYPE_VT() 
	throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_TYPE_VT=null;
		String mdc_IDC_STAT_EPISODE_TYPE_VT_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			//mdc_IDC_EPISODE_TYPE_VT="VT";
			mdc_IDC_STAT_EPISODE_TYPE_VT_Cluster=matcher.group();
			Pattern pattern_VT = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VT), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_VT =pattern_VT.matcher(mdc_IDC_STAT_EPISODE_TYPE_VT_Cluster);
			if (matcher_VT.find()){
				/*
				mdc_IDC_STAT_EPISODE_TYPE_VT=matcher_VT.group();
				String[] SubString = mdc_IDC_STAT_EPISODE_TYPE_VT.split(" ");
				int VT_Last_Session=Integer.parseInt(SubString[2]);
				if (VT_Last_Session==0){
					mdc_IDC_STAT_EPISODE_TYPE_VT=null;
				}
				else if (VT_Last_Session >0){
					mdc_IDC_STAT_EPISODE_TYPE_VT="VT";
				}
				*/
				mdc_IDC_STAT_EPISODE_TYPE_VT="VT";
			}
		}
		return mdc_IDC_STAT_EPISODE_TYPE_VT;
	}
	
	public String getMDC_IDC_STAT_EPISODE_TYPE_FVT()
	throws PropertyNotFoundException {
		String mdc_IDC_EPISODE_TYPE_FVT=null;
		String mdc_IDC_EPISODE_TYPE_FVT_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_FVT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			//mdc_IDC_EPISODE_TYPE_FVT="FVT";
			mdc_IDC_EPISODE_TYPE_FVT_Cluster=matcher.group();
			Pattern pattern_FVT = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_FVT), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_FVT =pattern_FVT.matcher(mdc_IDC_EPISODE_TYPE_FVT_Cluster);
			if (matcher_FVT.find()){
				/*
				mdc_IDC_EPISODE_TYPE_FVT=matcher_FVT.group();
				String[] SubString = mdc_IDC_EPISODE_TYPE_FVT.split(" ");
				int FVT_Last_Session=Integer.parseInt(SubString[2]);
				if (FVT_Last_Session==0){
					mdc_IDC_EPISODE_TYPE_FVT=null;
				}
				else if (FVT_Last_Session >0){
					mdc_IDC_EPISODE_TYPE_FVT="FVT";
				}
				*/
				mdc_IDC_EPISODE_TYPE_FVT="FVT";
			}
		}
		return mdc_IDC_EPISODE_TYPE_FVT;
	}
	
	public String getMDC_IDC_STAT_EPISODE_TYPE_VF() throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_TYPE_VF=null;
		String mdc_IDC_STAT_EPISODE_TYPE_VF_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VF_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			//mdc_IDC_EPISODE_TYPE_VF="VF";
			mdc_IDC_STAT_EPISODE_TYPE_VF_Cluster=matcher.group();
			Pattern pattern_VF = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VF), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_VF =pattern_VF.matcher(mdc_IDC_STAT_EPISODE_TYPE_VF_Cluster);
			if (matcher_VF.find()){
				/*
				mdc_IDC_EPISODE_TYPE_VF=matcher_VF.group();
				String[] SubString = mdc_IDC_EPISODE_TYPE_VF.split(" ");
				int VF_Last_Session=Integer.parseInt(SubString[2]);
				if (VF_Last_Session==0){
					mdc_IDC_EPISODE_TYPE_VF=null;
				}
				else if (VF_Last_Session >0){
					mdc_IDC_EPISODE_TYPE_VF="VF";
				}
				*/
				mdc_IDC_STAT_EPISODE_TYPE_VF="VF";
			}
		}
		return mdc_IDC_STAT_EPISODE_TYPE_VF;
	}
	

	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_AF()
		throws PropertyNotFoundException {	
	String mdc_IDC_STAT_EPISODE_RECENT_COUNT_AF = "0";
	String mdc_IDC_STAT_EPISODE_RECENT_COUNT_AF_Cluster = null;

	Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_AF_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
	Matcher matcher =pattern.matcher(getPdfContent());
	if (matcher.find()) {
		mdc_IDC_STAT_EPISODE_RECENT_COUNT_AF_Cluster=matcher.group();
		Pattern pattern_AF = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_AF), Pattern.MULTILINE | Pattern.DOTALL);

		Matcher matcher_AF =pattern_AF.matcher(mdc_IDC_STAT_EPISODE_RECENT_COUNT_AF_Cluster);
		if (matcher_AF.find()){
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_AF=matcher_AF.group(3);
		}
	}
		return mdc_IDC_STAT_EPISODE_RECENT_COUNT_AF;
	}

	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_SVT()
		throws PropertyNotFoundException {	
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_SVT = "0";
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_SVT_Cluster = null;

		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_SVT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_SVT_Cluster=matcher.group();
			Pattern pattern_SVT = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_SVT), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_SVT =pattern_SVT.matcher(mdc_IDC_STAT_EPISODE_RECENT_COUNT_SVT_Cluster);
			if (matcher_SVT.find()){
				mdc_IDC_STAT_EPISODE_RECENT_COUNT_SVT=matcher_SVT.group(3);
			}
		}
			return mdc_IDC_STAT_EPISODE_RECENT_COUNT_SVT;
	}

	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_VT()
			throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_VT = "0";
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_VT_Cluster = null;

		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_VT_Cluster=matcher.group();
			Pattern pattern_VT = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VT), Pattern.MULTILINE | Pattern.DOTALL);

			Matcher matcher_VT =pattern_VT.matcher(mdc_IDC_STAT_EPISODE_RECENT_COUNT_VT_Cluster);
			if (matcher_VT.find()){
				mdc_IDC_STAT_EPISODE_RECENT_COUNT_VT=matcher_VT.group(3);
			}
		}
			return mdc_IDC_STAT_EPISODE_RECENT_COUNT_VT;
	}

	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_FVT()
	throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_FVT = "0";
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_FVT_Cluster = null;

		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_FVT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_FVT_Cluster=matcher.group();
			Pattern pattern_FVT = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_FVT), Pattern.MULTILINE | Pattern.DOTALL);

			Matcher matcher_FVT =pattern_FVT.matcher(mdc_IDC_STAT_EPISODE_RECENT_COUNT_FVT_Cluster);
			if (matcher_FVT.find()){
				mdc_IDC_STAT_EPISODE_RECENT_COUNT_FVT=matcher_FVT.group(3);
			}
		}
			return mdc_IDC_STAT_EPISODE_RECENT_COUNT_FVT;
	}

	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_VF()
			throws PropertyNotFoundException {
			String mdc_IDC_STAT_EPISODE_RECENT_COUNT_VF = "0";
			String mdc_IDC_STAT_EPISODE_RECENT_COUNT_VF_Cluster = null;

			Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VF_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher =pattern.matcher(getPdfContent());
			if (matcher.find()) {
				mdc_IDC_STAT_EPISODE_RECENT_COUNT_VF_Cluster=matcher.group();
				Pattern pattern_VF = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_VF), Pattern.MULTILINE | Pattern.DOTALL);
				Matcher matcher_VF =pattern_VF.matcher(mdc_IDC_STAT_EPISODE_RECENT_COUNT_VF_Cluster);
				if (matcher_VF.find()){
					mdc_IDC_STAT_EPISODE_RECENT_COUNT_VF=matcher_VF.group(3);
				}
			}
				return mdc_IDC_STAT_EPISODE_RECENT_COUNT_VF;
	}

	public String getMDC_IDC_STAT_EPISODE_TYPE_NSVT()
			throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_TYPE_NSVT=null;
		String mdc_IDC_STAT_EPISODE_TYPE_NSVT_Cluster = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_NSVT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			//mdc_IDC_EPISODE_TYPE_NSVT="NSVT";
			mdc_IDC_STAT_EPISODE_TYPE_NSVT_Cluster=matcher.group();
			Pattern pattern_NSVT = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_NSVT), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_NSVT =pattern_NSVT.matcher(mdc_IDC_STAT_EPISODE_TYPE_NSVT_Cluster);
			if (matcher_NSVT.find()){
				/*
				mdc_IDC_EPISODE_TYPE_NSVT=matcher_NSVT.group();
				String[] SubString = mdc_IDC_EPISODE_TYPE_NSVT.split(" ");
				int NSVT_Last_Session=Integer.parseInt(SubString[2]);
				if (NSVT_Last_Session==0){
					mdc_IDC_EPISODE_TYPE_NSVT=null;
				}
				else if (NSVT_Last_Session >0){
					mdc_IDC_EPISODE_TYPE_NSVT="NSVT";
				}
				*/
				mdc_IDC_STAT_EPISODE_TYPE_NSVT="NSVT";
			}
		}
		return mdc_IDC_STAT_EPISODE_TYPE_NSVT;
	}

	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_NSVT()
			throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_NSVT = "0";
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_NSVT_Cluster = null;

		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_NSVT_Cluster), Pattern.MULTILINE | Pattern.DOTALL);
		Matcher matcher =pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_NSVT_Cluster=matcher.group();
			Pattern pattern_NSVT = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_TYPE_NSVT), Pattern.MULTILINE | Pattern.DOTALL);
			Matcher matcher_NSVT =pattern_NSVT.matcher(mdc_IDC_STAT_EPISODE_RECENT_COUNT_NSVT_Cluster);
			if (matcher_NSVT.find()){
				mdc_IDC_STAT_EPISODE_RECENT_COUNT_NSVT=matcher_NSVT.group(2);
				}
		}
			return mdc_IDC_STAT_EPISODE_RECENT_COUNT_NSVT;
	}

	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END()
			throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_END), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END = matcher.group(3) + getMonthNumberFromMonthShortName(matcher.group(2)) + matcher.group(1) +  matcher.group(4) + matcher.group(5) + matcher.group(6);
		}
		return mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END;
	}

	public String getMDC_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START()
			throws PropertyNotFoundException {
		String mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START=null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_STAT_EPISODE_RECENT_COUNT_DTM_START), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START = matcher.group(3) + getMonthNumberFromMonthShortName(matcher.group(2)) + matcher.group(1) + "000000";
		}
		return mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START;
	}
}