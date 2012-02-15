package de.offis.health.icardea.cied.pdf.parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.pdf.extractor.PDFApachePDFBoxExtractor;
import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.cied.pdf.interfaces.PDFParser;
import de.offis.health.icardea.cied.tools.IEEE11073NomenclatureProperties;

import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.filenamefilter.PDFFilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * @author MYang
 */

public class PDFProcessing {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(PDFProcessing.class);
	
	/**
	 * All Medtronic PDF sample files.
	 */
	//private File[] medtronicPDFFiles = null;
	
	/**
	 * Only Medtronic DeviceType2 PDF sample files as <code>List</code>.
	 */
	private List<File> medtronicDeviceType2Files = new ArrayList<File>();
	
	/**
	 * The content of each read PDF file.
	 */
	//private List<String> medtronicPdfContent = new ArrayList<String>();
	private String medtronicPdfContent;
	private String medtronicPdfprocessedfilename;
	private List<String> medtronicPdfprocessed = new ArrayList<String>();
	
	private List<String> medtronicPdfunknown = new ArrayList<String>();
	
	public void execute(File medtronic_PDF_Directory, File medtronic_HL7_Directory) throws Exception {
		//String mdtDeviceType1SupportedDevices = (new PDFParserMDTDeviceType1(AppConfig.getProperty(PDFParser.PROPERTY_KEY_LANGUAGE_SETTING))).getSupportedDeviceList().toString();
		String mdtDeviceType2SupportedDevices = (new PDFParserMDTDeviceType2(AppConfig.getProperty(PDFParser.PROPERTY_KEY_LANGUAGE_SETTING))).getSupportedDeviceList().toString();
		//logger.info(mdtDeviceType1SupportedDevices);
		logger.debug(mdtDeviceType2SupportedDevices);
		logger.debug("DIRECTORY for Medtronic PDF Report is " + medtronic_PDF_Directory.getAbsolutePath());
		//Step 1. Get all PDF file from directory for Medtronic ICD reports
		if (medtronic_PDF_Directory.isDirectory()){
			File[] medtronicPDFList = medtronic_PDF_Directory.listFiles(new PDFFilenameFilter());
			if(medtronicPDFList.length != 0){
				//if there is any *.pdf file under medtronic_PDF_Directory
				logger.info("Start parsing PDF into HL7v2.5 Messages");
				//Step 2. processing all PDF file in directory for Medtronic ICD reports
				processingPdfFiles(medtronicPDFList, medtronic_PDF_Directory, medtronic_HL7_Directory);
			} else{
				logger.debug("No PDF Files in current directory "+ medtronic_PDF_Directory.getAbsolutePath());
			}
		}
		else {
			logger.warn("Alert!!! Directory "+ medtronic_PDF_Directory.getAbsolutePath()+" does not exist,please check it !");
		}
	}
		
	/**
	 * 
	 * @throws java.lang.Exception
	 */
	private void processingPdfFiles(File[] medtronicPDFList, File medtronic_PDF_Directory,
			File medtronic_HL7_Directory) throws Exception {
		//Step 2. processing all PDF file in directory for Medtronic ICD reports
		
		PDFExtractor pdfExtractor = null;
		PDFValidation pdfValidation=null;
		PDF2HL7_HAPI_Parser pdf2hl7_hapi=null;
		
		try {
			pdfExtractor = new PDFApachePDFBoxExtractor();
			pdfValidation=new PDFValidation();
			pdf2hl7_hapi=new PDF2HL7_HAPI_Parser();
			/*
			 * Get all files identified to contain data from Medtronic
			 * Type2 devices.
			 */
			for (File pdfFile : medtronicPDFList) {//this.medtronicDeviceType2Files) {
				//isPDFFile=false;
				logger.info("Start Parsing: "+pdfFile.getAbsolutePath());
				
				String fileTimestamp = GlobalTools.date2String(new java.util.Date(), "yyyy-MM-dd_HH-mm-ss");
				//Step 3. checking each PDF file in directory for Medtronic ICD reports
				/*Through pdfValidation.checkPDF
				 *1. check whether this PDF file is readable
				 *2. check whether this PDF file including supported device number
				 *3. check whether this PDF file including basic device information
				 */
				if (pdfValidation.checkPDF(pdfExtractor, pdfFile)) {
					//Step 4. Parsing each PDF file in directory for Medtronic ICD reports
					if (pdf2hl7_hapi.pdfParsing(pdfExtractor, pdfFile, medtronic_HL7_Directory)){
					/*If parsing from PDF to HL7 with HAPI is finished*/
						logger.info("Move supported file '" + 
								pdfFile.getName() + "' to processed directory: "+ 
								AppConfig.getProperty("DIRECTORY_MEDTRONIC_PROCESSED_PDF_REPORT")+
								pdfFile.getName());
						GlobalTools.moveFile(medtronic_PDF_Directory.getAbsolutePath()+GlobalTools.FILESEPARATOR+pdfFile.getName(),
								AppConfig.getProperty("DIRECTORY_MEDTRONIC_PROCESSED_PDF_REPORT"),
								fileTimestamp + "_processed_" + pdfFile.getName() );
					}
					else {
						/* It seems to be a Medtronic PDF, but we can not interpret it 
						 * may Move to another Directory*/
						logger.info("Move not fully parsed file '" + 
								pdfFile.getName() + 
						"' to unknown directory.");
						GlobalTools.moveFile(medtronic_PDF_Directory.getAbsolutePath()+GlobalTools.FILESEPARATOR+pdfFile.getName(), 
								AppConfig.getProperty("DIRECTORY_MEDTRONIC_UNKNOWN_PDF_REPORT"),
								fileTimestamp + "_notFullyParsed_" + pdfFile.getName() );
					}
				}
				else {
					this.medtronicPdfunknown.add(pdfFile.getName());
					logger.info("Move unsupported file '" + 
							pdfFile.getName() + 
					"' to unknown directory.");
					GlobalTools.moveFile(AppConfig.getProperty("DIRECTORY_MEDTRONIC_ORIGINAL_PDF_REPORT")+pdfFile.getName(), 
							AppConfig.getProperty("DIRECTORY_MEDTRONIC_UNKNOWN_PDF_REPORT"), 
							fileTimestamp + "_processed_" + pdfFile.getName() );
					//dispose();
				}
				this.medtronicPdfContent="null";
				//dispose();
				//Close the PDF and free internally used object references.
				pdfExtractor.dispose();
			} // end if
			// end for each
		} catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
			throw ex;
		} finally {
			if (pdfExtractor != null) {
				pdfExtractor.dispose();
			}
		} // end try..catch..finally
	}
	/*
	public void dispose() throws Exception {
		//if (this.medtronicExampleFiles != null) {
		//	this.medtronicExampleFiles = null;
		//}

		if (this.medtronicDeviceType2Files != null) {
			this.medtronicDeviceType2Files.clear();
			this.medtronicDeviceType2Files = null;
		}

		if (this.medtronicPdfContent != null) {
			logger.info(medtronicPdfContent);
			//this.medtronicPdfContent.clear();
			this.medtronicPdfContent = null;
		}
	}
	*/
}