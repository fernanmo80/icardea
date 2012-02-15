package de.offis.health.icardea.cied.pdf.parser;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.hl7.pix.HL7_PIX_Integration;
import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.cied.pdf.interfaces.PDFParser;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * This class offers the validation method to check whether in the PDF including the Medtronic
 * Device name "PDFPARSER_SUPPORTED_ICD_TYPE" which are defined in properties file
 * And also the basic information 
 * -1.DeviceName 
 * -2.DeviceSerialNumber 
 * -3.Device Interrogation Date
 * @author MYang
 */
public class PDFValidation {

	private static Logger logger = Logger.getLogger(PDFValidation.class);
	String fileTimestamp = GlobalTools.date2String(new java.util.Date(), "yyyy-MM-dd_HH-mm-ss");
	
	public boolean checkPDF(PDFExtractor pdfExtractor, File pdfFile) throws Exception {
		boolean checkPDF_flag=false; 
		
		if (checkPDFFile(pdfExtractor, pdfFile)) {
		//First check whether PDF file is readable
		/*
			try {
			Pattern pattern;
			pattern = Pattern.compile(AppConfig.getProperty("PDFPARSER_SUPPORTED_ICD_TYPE"));
			Matcher matcher = pattern.matcher(pdfExtractor.getText());
			if (matcher.find()) {
				//Second check whether PDF contains supported Device name
				logger.info("Supported Medtronic Device Type: ");

				//Third check whether PDF contains basic information for HL7 parsing
				checkPDF_flag= checkBasicInformation(pdfExtractor);
			} else {
				String fileName=pdfFile.getName();
				logger.info("Unsupported Medtronic Device Type: ");
				logger.info("Move unsupported file '" + 
						fileName + 
				"' to unknown directory.");
				GlobalTools.moveFile(pdfFile.getAbsolutePath(),//AppConfig.getProperty("DIRECTORY_MEDTRONIC_ORIGINAL_PDF_REPORT")+fileName, 
						AppConfig.getProperty("DIRECTORY_MEDTRONIC_UNKNOWN_PDF_REPORT"), 
						fileTimestamp + "_processed_" + fileName);
				checkPDF_flag= false;
			}
		} catch (PropertyNotFoundException e) {
			checkPDF_flag=false;
		} catch (Exception e) {
			checkPDF_flag=false;
		}
		*/
		checkPDF_flag= checkBasicInformation(pdfExtractor);
		}
		return checkPDF_flag;
	}
	
	private boolean checkBasicInformation(PDFExtractor pdfExtractor) throws Exception, PropertyFileNotFoundException, PropertyNotFoundException {
		PDFParser pdfParser = null;
		pdfParser = new PDFParserMDTDeviceType2(AppConfig.getProperty(PDFParser.PROPERTY_KEY_LANGUAGE_SETTING));
		pdfParser.setPdfContent(pdfExtractor.getText());
		
		String deviceName = null;
		String deviceSerialNumber = null;
		String deviceInterrogationDate = null;
		
		logger.debug("Check PDF Contents: 1.DeviceName 2.DeviceSerialNumber 3.Device Interrogation Date");
		
		deviceName = pdfParser.getDeviceName();
		if (deviceName != null) {
			logger.debug("Found device name..............: " + deviceName);
		}
		
		deviceSerialNumber = pdfParser.getDeviceSerial();
		if (deviceSerialNumber != null) {
			logger.debug("Found device serial number.....: " + deviceSerialNumber);
		}
		
		deviceInterrogationDate = pdfParser.getDeviceInterrogationDate();
		if (deviceInterrogationDate != null) {
			logger.debug("Found device interrogation date: " + deviceInterrogationDate);
		}
		
		if ((deviceName == null)|(deviceSerialNumber == null)|(deviceInterrogationDate == null)){
			logger.info("Missing mandantory Device information. Can not successfull parse the File");
			return(false);
		}
		else {
			//I would suggest to reserve this logger.info to know which PDF file has been processed when error happens
			logger.info("Current CIED report is for "+deviceName+"/"+deviceSerialNumber+" interrogated on "+deviceInterrogationDate);
			return true;
		}
	}
	
	
	private boolean checkPDFFile (PDFExtractor pdfExtractor, File pdfFile) throws Exception{
		boolean pdfFileValidation=false;
		try {
			pdfFileValidation =pdfExtractor.openDocument(pdfFile.getAbsolutePath());
		} catch (IOException e) {
			logger.warn("IOException, Unsupported PDF File: ");
			logger.warn("Move unsupported file '" + 
					pdfFile.getName() + 
			"' to unknown directory.");
			// TODO Access Rights Test for Moving
			GlobalTools.moveFile(pdfFile.getAbsolutePath()+GlobalTools.FILESEPARATOR+pdfFile.getName(), 
					AppConfig.getProperty("DIRECTORY_MEDTRONIC_UNKNOWN_PDF_REPORT"), 
					GlobalTools.date2String(new java.util.Date(), "yyyy-MM-dd_HH-mm-ss") + "_unknown_" + pdfFile.getName() );
			pdfFileValidation=false;
		}
		return pdfFileValidation;
	}
}