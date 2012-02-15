/**
 * 
 */
package de.offis.health.icardea.cied.pdf.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.interfaces.PDFParser;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * This class offers methods to parse the PDF content of the type 2 device series
 * of Medtronic ICDs. The list of supported devices is defined in 
 * {@link #getSupportedDeviceList()}.
 * 
 *
 */
public class PDFParserMDTDeviceType2 extends AbstractPDFParser implements PDFParser {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(PDFParserMDTDeviceType2.class);
	
	/**
	 * Property key to access the regular expression to extract the name of the device from the PDF content.
	 */
	private final String PROPERTY_KEY_REGEX_DEVICE_NAME = "PDFPARSER_REGEX_DEVICENAME";
	
	/**
	 * Property key to access the regular expression to extract the serial of the device from the PDF content.
	 */
	private final String PROPERTY_KEY_REGEX_DEVICE_SERIAL = "PDFPARSER_REGEX_DEVICESERIAL";
	
	/**
	 * Property key to access the regular expression to extract the serial of the device from the PDF content.
	 */
	private final String PROPERTY_KEY_REGEX_DEVICE_INTERROGATION_DATE = "PDFPARSER_REGEX_DEVICEINTERROGATIONDATE";
	
	private final String PROPERTY_KEY_REGEX_DEVICE_BATTERY_VOLTAGE="PDFPARSER_REGEX_DEVICE_BATTERY_VOLTAGE";
	
	//private final String PROPERTY_KEY_REGEX_EVENT_DURATION_TIME_AF="PDFPARSER_REGEX_EVENT_DURATION_TIME_AF";
	
	private final String PROPERTY_KEY_REGEX_EVENT_EPISODE_TYPE_AF="PDFPARSER_REGEX_EVENT_EPISODE_TYPE_AF";
	private final String PROPERTY_KEY_REGEX_EVENT_EPISODE_TYPE_AF_Cluster="PDFPARSER_REGEX_EVENT_EPISODE_TYPE_AF_Cluster";
	
	private final String PROPERTY_KEY_REGEX_EVENT_EPISODE_TYPE_SVT="PDFPARSER_REGEX_EVENT_EPISODE_TYPE_SVT";
	private final String PROPERTY_KEY_REGEX_EVENT_EPISODE_TYPE_SVT_Cluster="PDFPARSER_REGEX_EVENT_EPISODE_TYPE_SVT_Cluster";
	
	private final String PROPERTY_KEY_REGEX_EVENT_EPISODE_TYPE_VT="PDFPARSER_REGEX_EVENT_EPISODE_TYPE_VT";
	private final String PROPERTY_KEY_REGEX_EVENT_EPISODE_TYPE_VT_Cluster="PDFPARSER_REGEX_EVENT_EPISODE_TYPE_VT_Cluster";
	
	private final String PROPERTY_KEY_REGEX_EVENT_EPISODE_TYPE_Lead_Impedance_Cluster="PDFPARSER_REGEX_EVENT_EPISODE_TYPE_Lead_Impedance_Cluster";
	
	private final String PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE="PDFPARSER_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE";
	private final String PROPERTY_KEY_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster="PDFPARSER_REGEX_DEVICE_LEADCHNL_CHAMBER_PACING_AMPLITUDE_Cluster";
	
	private final String PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT="PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT";
	private final String PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_Cluster="PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_Cluster";
	
	private final String PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT="PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT";
	private final String PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_Cluster="PROPERTY_KEY_REGEX_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_Cluster";
	
	/**
	 * <p>
	 * Hidden default constructor to force using the parameterized constructor
	 * to setup the class.
	 * </p>
	 * <p>
	 * The property filename being used is constructed using the base filename
	 * (fixed base filename = 'PDFParserMDTDeviceType2'), the two letter
	 * language code ('en') and the extension '.properties'. For other languages
	 * use {@link #PDFParserMDTDeviceType2(String)}.
	 * </p>
	 * <p>
	 * The property file needs to be accessible by the application (classpath).
	 * </p>
	 * 
	 * @throws InvalidParameterValueException 
	 * @throws PropertyFileNotFoundException 
	 */
	private PDFParserMDTDeviceType2() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("PDFParserMDTDeviceType2", "en");
	}
	
	/**
	 * <p>
	 * The constructor to setup the class behaviour by loading the correct
	 * property file.
	 * </p>
	 * <p>
	 * The property filename being used is constructed using the base filename
	 * (fixed base filename = 'PDFParserMDTDeviceType2'), the two letter
	 * language code (parameter) and the extension '.properties'.
	 * </p>
	 * <p>
	 * The property file needs to be accessible by the application (classpath).
	 * </p>
	 *
	 * @param languageCode The ISO-639-1 two letter language code ('de', 'en', etc.).
	 * @throws InvalidParameterValueException
	 * @throws PropertyFileNotFoundException 
	 */
	public PDFParserMDTDeviceType2(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("PDFParserMDTDeviceType2", languageCode);
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFParser#getSupportedDeviceList()
	 */
	public List<String> getSupportedDeviceList() {
		return new ArrayList<String>(Arrays.asList("Consulta", "Maximo II", "Concerto II", "Secura", "Virtuoso II", "Protecta XT", "Protecta", "Concerto"));
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFParser#getDeviceName()
	 */
	public String getDeviceName() throws PropertyNotFoundException {
		String deviceName = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_NAME), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			deviceName = matcher.group(1).trim();
				//matcher.group(1).trim()+" "+matcher.group(2).trim();
		} // end if
		
		return deviceName;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFParser#getDeviceName()
	 */ 
	public String getDeviceInterrogationDate() throws PropertyNotFoundException {
		String deviceInterrogationDate = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_INTERROGATION_DATE), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			deviceInterrogationDate = matcher.group(3) + getMonthNumberFromMonthShortName(matcher.group(2)) + matcher.group(1) + matcher.group(4) + matcher.group(5) + matcher.group(6);
		} // end if
		
		return deviceInterrogationDate;
	}
	

	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFParser#getDeviceSerial()
	 */
	public String getDeviceSerial() throws PropertyNotFoundException {
		String deviceSerial = null;
		
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_SERIAL), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			deviceSerial = matcher.group().trim();
		} // end if
		
		return deviceSerial;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFParser#dispose()
	 */
	public void dispose() {
		// TODO Auto-generated method stub
	}
		public String getMDC_IDC_LEAD_CONNECTION_STATUS()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}