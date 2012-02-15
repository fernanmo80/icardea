package de.offis.health.icardea.cied.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;

public class IEEE11073NomenclatureProperties {
	private static Logger logger = Logger.getLogger(IEEE11073NomenclatureProperties.class);
	
	public Properties getNomenclatureProperties () {
		Properties ieee_nomenclature = new Properties();
		String propertyFilename = "IEEE_Nomenclature.properties";
		InputStream inputStream = getClass().getResourceAsStream("/config/pdfparser/" + propertyFilename);
		try {
			if (inputStream != null) {
				ieee_nomenclature.load(inputStream);
			}
			else {
				throw new PropertyFileNotFoundException("Error reading property file: '" +
						propertyFilename + "'.");
			}
		} catch (IOException e) {
			logger.error("Could not read IEEE_Nomenclature.properties");
			e.printStackTrace();
		} catch (PropertyFileNotFoundException e) {
			logger.error("Could not find IEEE_Nomenclature.properties");
			e.printStackTrace();
		}
		return ieee_nomenclature;
	}
}
