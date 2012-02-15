/**
 * 
 */
package de.offis.health.icardea.cied.pdf.parser;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.offis.health.icardea.InitJUnitTestSuite;
import de.offis.health.icardea.cied.datamodel.CIEDAFData;
import de.offis.health.icardea.cied.datamodel.CIEDVTData;
import de.offis.health.icardea.cied.datamodel.CIEDDeviceData;
import de.offis.health.icardea.cied.pdf.extractor.PDFApachePDFBoxExtractor;
import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.cied.pdf.interfaces.PDFParser;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.common.filenamefilter.PDFFilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

import de.offis.health.icardea.cied.hl7.processing.HL7_ORU_Creator;
import de.offis.health.icardea.cied.hl7.processing.PropertiesReadandWrite;
import de.offis.health.icardea.cied.hl7.oru.ORU_MSH;
import de.offis.health.icardea.cied.hl7.oru.ORU_PID;
import de.offis.health.icardea.cied.hl7.oru.ORU_PV1;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBR;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBX;

/**
 *
 */
public class TestPDFParserMDTDeviceType2 {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(TestPDFParserMDTDeviceType2.class);
	
	/**
	 * All Medtronic PDF sample files.
	 */
	private File[] medtronicExampleFiles = null;
	
	/**
	 * Only Medtronic DeviceType2 PDF sample files as <code>List</code>.
	 */
	private List<File> medtronicDeviceType2Files = new ArrayList<File>();
	
	/**
	 * The content of each read PDF file.
	 */
	private List<String> medtronicPdfContent = new ArrayList<String>();
	
	/**
	 * Testing parser to extract the device name from a medtronic pdf file
	 */
	@Test
	public void getDeviceData() throws Exception {
		//MSH Object
		ORU_MSH oru_msh=null;
		ORU_PID oru_pid=null;
		ORU_PV1 oru_pv1=null;
		ORU_OBR oru_obr=null;
		ORU_OBX oru_obx=null;
		//ArrayList obx_list =null;
		//OBX Object 
		CIEDDeviceData ciedDeviceData = null;
		CIEDAFData ciedAFData=null;
		CIEDVTData ciedVTData=null;
		//ORU_Object oru_object=new ORU_Object();
		
		PDFParser pdfParser = null;
		String Episode=null;
		String deviceName = null;
		String deviceSerialNumber = null;
		String deviceInterrogationDate = null;
		
		String properties_path= this.getClass().getResource("").getPath().toString();
		try {
			Properties hl7_oru_segment_properties = new Properties();
			PropertiesReadandWrite propertiesReadandWrite = new PropertiesReadandWrite();
			hl7_oru_segment_properties = propertiesReadandWrite.getProperties(properties_path+"HL7_ORU_Segment.properties");
			
			pdfParser = new PDFParserMDTDeviceType2(AppConfig.getProperty(PDFParser.PROPERTY_KEY_LANGUAGE_SETTING));
			ciedDeviceData = new CIEDDeviceData();
			ciedAFData=new CIEDAFData();
			ciedVTData=new CIEDVTData();
			
			oru_msh=new ORU_MSH();
			oru_pid=new ORU_PID();
			oru_pv1=new ORU_PV1();
			oru_obr=new ORU_OBR();
			//obx_list = new ArrayList();
			
			for (String pdfContent : this.medtronicPdfContent) {
				
			} // end foreach
		} catch(PropertyNotFoundException ex) {
			logger.error("The accessed property key hasn't been found in the PDF parser property file. ", ex);
		} finally {
			if (pdfParser != null) {
				//pdfParser.dispose();
				logger.debug("Generate pdfParser.....: ");
			} // end if
		} // end try..catch..finally
	}
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Call general initialization class (required for log4j initialisation)
		InitJUnitTestSuite.setUpBeforeClass();
		
		// Logger
		logger.info("setUp called in " + getClass());
		
		String resourcesPath = GlobalTools.MAVEN_TEST_RESOURCES;
		
		File medtronicPDFTestFileDirectory = new File(resourcesPath + "pdf" + GlobalTools.FILESEPARATOR +
				"medtronic" + GlobalTools.FILESEPARATOR);
		
		this.medtronicExampleFiles = medtronicPDFTestFileDirectory.listFiles(new PDFFilenameFilter());
				
		PDFParser pdfParser = null;
		
		// Check all Medtronic files
		for (int i = 0; i < this.medtronicExampleFiles.length; i++) {
			pdfParser = new PDFParserMDTDeviceType2(AppConfig.getProperty(PDFParser.PROPERTY_KEY_LANGUAGE_SETTING));
			
			/*
			 * The following foreach loop should identify the Medtronic
			 * devices "Secura" and "Consulta" which are Type2 devices!
			 */
			for (String device : pdfParser.getSupportedDeviceList()) {
				//Loggerinformation for device name and supported device
				//logger.info("Supported Devices: " + device);
				//logger.info("Filename.........: " + this.medtronicExampleFiles[i].getName());
				
				if (this.medtronicExampleFiles[i].getName().toLowerCase().contains(device.toLowerCase())) {
					this.medtronicDeviceType2Files.add(this.medtronicExampleFiles[i]);
					logger.info(" --> Added " + this.medtronicExampleFiles[i].getName());
				}
			} // end foreach
			
		} // end for
		
		pdfParser.dispose();
		pdfParser = null;
		
		
		PDFExtractor pdfExtractor = null;
		
		try {
			pdfExtractor = new PDFApachePDFBoxExtractor();
			/*
			 * Get all files identified to contain data from Medtronic
			 * Type2 devices.
			 */
			for (File pdfFile : this.medtronicDeviceType2Files) {
				
				/*
				 * Open each file get the full text extracted from the PDF file
				 * and store it in a <code>List</code> object.
				 * This <code>List</code> object will be processed in each of
				 * the tests.
				 */
				if (pdfExtractor.openDocument(pdfFile.getAbsolutePath())) {
					this.medtronicPdfContent.add(pdfExtractor.getText());
					
					logger.info("Supported medtronicPdfContent: ");// + this.medtronicPdfContent.toString() );
					//Close the PDF and free internally used object references.
					pdfExtractor.dispose();
				} // end if
				
			} // end foreach
		} catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
			throw ex;
		} finally {
			if (pdfExtractor != null) {
				pdfExtractor.dispose();
			}
		} // end try..catch..finally
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (this.medtronicExampleFiles != null) {
			this.medtronicExampleFiles = null;
		}
		
		if (this.medtronicDeviceType2Files != null) {
			this.medtronicDeviceType2Files.clear();
			this.medtronicDeviceType2Files = null;
		}
		
		if (this.medtronicPdfContent != null) {
			this.medtronicPdfContent.clear();
			this.medtronicPdfContent = null;
		}
	}
}
