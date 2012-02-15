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

/**
 * This class offers methods to parse the PDF content of the type 1 device series
 * of Medtronic ICDs. The list of supported devices is defined in 
 * {@link #getSupportedDeviceList()}.
 * 
 *
 */
public class PDFParserMDTDeviceType1 extends AbstractPDFParser implements PDFParser {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(PDFParserMDTDeviceType1.class);
	
	/**
	 * <p>
	 * Hidden default constructor to force using the parameterized constructor
	 * to setup the class.
	 * </p>
	 * <p>
	 * The property filename being used is constructed using the base filename
	 * (fixed base filename = 'PDFParserMDTDeviceType1'), the two letter
	 * language code ('en') and the extension '.properties'. For other languages
	 * use {@link #PDFParserMDTDeviceType1(String)}.
	 * </p>
	 * <p>
	 * The property file needs to be accessible by the application (classpath).
	 * </p>
	 * 
	 * @throws InvalidParameterValueException 
	 * @throws PropertyFileNotFoundException 
	 */
	private PDFParserMDTDeviceType1() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("PDFParserMDTDeviceType1", "en");
	}
	
	/**
	 * <p>
	 * The constructor to setup the class behaviour by loading the correct
	 * property file.
	 * </p>
	 * <p>
	 * The property filename being used is constructed using the base filename
	 * (fixed base filename = 'PDFParserMDTDeviceType1'), the two letter
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
	public PDFParserMDTDeviceType1(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("PDFParserMDTDeviceType1", languageCode);
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFParser#getSupportedDeviceList()
	 */
	public List<String> getSupportedDeviceList() {
		return new ArrayList<String>(Arrays.asList("Gem", "Insync", "Maximo", "Marquis", "Intrinsic", "Concerto", "Entrust", "Virtuoso"));
	}

	public void dispose() {
		// TODO Auto-generated method stub
	}

	public String getDeviceInterrogationDate() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDeviceName() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDeviceSerial() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}