package de.offis.health.icardea.cied.pdf.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_Parameters;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_TransmissionNotes;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public class OBXObserValue_TransmissionNotes extends AbstractPDFParser implements OBXParserInterface_TransmissionNotes {
	private static Logger logger = Logger.getLogger(OBXObserValue_TransmissionNotes.class);
	
	private final String PROPERTY_KEY_REGEX_DEVICE_NAME = "PDFPARSER_REGEX_DEVICENAME";
	private final String PROPERTY_KEY_REGEX_DEVICE_SERIAL = "PDFPARSER_REGEX_DEVICESERIAL";
	private final String PROPERTY_KEY_REGEX_DEVICE_INTERROGATION_DATE = "PDFPARSER_REGEX_DEVICEINTERROGATIONDATE";
	
	private OBXObserValue_TransmissionNotes() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentTransmissionNotes", "en");
	}
	
	public OBXObserValue_TransmissionNotes(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("OBXSegmentTransmissionNotes", languageCode);
	}

	public String getMDC_IDC_PG_MFG() throws PropertyNotFoundException {
		String mdc_IDC_PG_MFG="Medtronic";
		return mdc_IDC_PG_MFG;
	}

	public String getMDC_IDC_PG_MODEL() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String mdc_IDC_PG_MODEL = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_NAME), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_PG_MODEL = matcher.group(1);
		} // end if
		return mdc_IDC_PG_MODEL.trim();
	}

	public String getMDC_IDC_PG_SERIAL() throws PropertyNotFoundException {
		String mdc_IDC_PG_SERIAL = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_SERIAL), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_PG_SERIAL = matcher.group(1);
		} // end if
		return mdc_IDC_PG_SERIAL;
	}

	public String getMDC_IDC_PG_TYPE() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String mdc_IDC_PG_TYPE="Implantable Cardioverter-Defibrillator";
		return mdc_IDC_PG_TYPE;
	}

	public String getMDC_IDC_SESS_DTM() throws PropertyNotFoundException {
		String mdc_IDC_SESS_DTM = null;
		Pattern pattern = Pattern.compile(getProperty(this.PROPERTY_KEY_REGEX_DEVICE_INTERROGATION_DATE), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getPdfContent());
		if (matcher.find()) {
			mdc_IDC_SESS_DTM = matcher.group(3) + getMonthNumberFromMonthShortName(matcher.group(2)) + matcher.group(1) + matcher.group(4) + matcher.group(5) + matcher.group(6);
		} // end if
		return mdc_IDC_SESS_DTM;
	}

	public String getMDC_IDC_SESS_TYPE() throws PropertyNotFoundException {
		String mdc_IDC_SESS_TYPE="Remote";
		return mdc_IDC_SESS_TYPE;
	}

}