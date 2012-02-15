/**
 * 
 */
package de.offis.health.icardea.cied.txt.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.interfaces.PDFParser;
import de.offis.health.icardea.cied.pdf.interfaces.MSHParserInterface;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;

/**
 * This abstract class defines generic functions and properties used
 * in the concrete PDF parser classes.
 * 
 *
 * This Class is inherited from AbstractPDFParser
 * To avoid misunderstanding change all "PDF" to "TXT"  
 */
public abstract class AbstractTXTParser {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(AbstractTXTParser.class);
	
	/**
	 * Properties object for each portal implementation.
	 */
	protected Properties txtParserProperties = new Properties();
	
	public final static String SEPARATOR_SIMPLE_LIST = ",";
	
	/**
	 * The content of the PDF to parse.
	 */
	private String txtContent = null;
	
	/**
	 * Property key to access the list of month short names.
	 */
	private final String PROPERTY_KEY_MONTH_SHORTNAME_ARRAY = "PDFPARSER_MONTH_SHORTNAME_ARRAY";
	
	/**
	 * Empty default Constructor
	 */
	@SuppressWarnings("unused")
	private AbstractTXTParser() {}
	
	/**
	 * The not empty default constructor to initialize the concrete
	 * implementation to parse the PDF content.
	 * 
	 * @param propertyBaseFilename The base filename used for the property file (normally the classes base name).
	 * @param languageCode The ISO-639-1 two letter language code ('de', 'en', etc.).
	 * @throws InvalidParameterValueException
	 * @throws PropertyFileNotFoundException 
	 */
	public AbstractTXTParser(String propertyBaseFilename, String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		String propertyFilename = null;
		
		// Check property base filename
		if (propertyBaseFilename == null || propertyBaseFilename.trim().length() == 0) {
			throw new InvalidParameterValueException("The property base filename is not set (parameter is null or empty).");
		}
		propertyFilename = propertyBaseFilename.trim();
		
		
		// Check language code
		if (languageCode == null || languageCode.trim().length() == 0) {
			throw new InvalidParameterValueException("The language code is not set (parameter is null or empty).");
		}
		
		// Filename construction base on parameters
		propertyFilename = propertyFilename + "_" + languageCode.trim().toLowerCase() + ".properties";
		
		
		// Read configuration properties file
		logger.trace("Looking for the following property file: " + propertyFilename);
		try {
			InputStream inputStream = AbstractTXTParser.class.getClassLoader().getResourceAsStream("config/pdfparser/" + propertyFilename);
			
			if (inputStream != null) {
				txtParserProperties.load(inputStream);
			} else {
				throw new PropertyFileNotFoundException("Error reading txt parsers property file: '" +
						propertyFilename + "'.");
			}
			
		} catch (IOException ex) {
			throw new PropertyFileNotFoundException("Error reading txt parsers property file: '" +
						propertyFilename + "'.", ex);
		} // end try..catch
	}
	
	/**
	 * <p>
	 * Method to get a property from the classes property object.
	 * </p>
	 * <p>
	 * The returned String is trimmed (removing spaces) to
	 * prevent errors if the property stores numbers and it needs
	 * to be converted to a string (e.g. '10 ' would raise a
	 * {@link NumberFormatException} because the blank is not removed). 
	 * </p>
	 * <p>
	 * An exception is thrown if the key doesn't exist.
	 * </p>
	 * 
	 * @param key The key of the property value to be returned.
	 * @return The value corresponding to the given key.
	 * @throws PropertyNotFoundException
	 */
	public String getProperty(String key) throws PropertyNotFoundException {
		String value = txtParserProperties.getProperty(key);
		if (value == null) {
			throw new PropertyNotFoundException(
					"Property key '" + key + "' not found. Please " +
					"make sure that this key exists in the txt parser" +
					"property file.");
		} // end if
		return value.trim();
	}
	
	
	/**
	 * <p>
	 * This method will compare a given month short name (e.g. 'Jan', 'Feb',...)
	 * with a configured (<b><u>Attention:</u> <i>language specific!!!</i></b>)
	 * list of short month names to determine the correct month number
	 * ('01',..,'12').
	 * </p>
	 * <p>
	 * The list of short names (comma separated no spaces) is read from the
	 * specified property file by using the key
	 * {@link #PROPERTY_KEY_MONTH_SHORTNAME_ARRAY}.
	 * </p>
	 * @param monthShortName The short name to convert into a month number string.
	 * @return Returns the month number as String ('01',..,'12'). In case of
	 * a problem <code>null</code> is returned.
	 * @throws PropertyNotFoundException 
	 */
	protected String getMonthNumberFromMonthShortName(String monthShortName) throws PropertyNotFoundException {
		int monthNumber = 0;
		String monthString = null;
		
		if (monthShortName != null && monthShortName.trim().length() > 0) {
			monthShortName = monthShortName.trim().toLowerCase();
		}
		
		String[] monthShortNameArray = getProperty(this.PROPERTY_KEY_MONTH_SHORTNAME_ARRAY).toLowerCase().split(SEPARATOR_SIMPLE_LIST);
		for (int i = 0; i < monthShortNameArray.length; i++) {
			if (monthShortName.indexOf(monthShortNameArray[i]) == 0) {
				monthNumber = i;
				
				// Increase Array index by one because it starts at 0!
				monthNumber++;
			} // end if
		} // end for
		
		if (monthNumber > 0 && monthNumber <= 12) {
			monthString = ((monthNumber > 0 && monthNumber < 10)? "0" + monthNumber : "" + monthNumber);
		}
		
		return monthString;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFParser#setPdfContent(String)
	 */
	public void setTxtContent(String txtContent) {
		this.txtContent = txtContent;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFParser#getPdfContent()
	 */
	public String getTxtContent() {
		return txtContent;
	}
}
