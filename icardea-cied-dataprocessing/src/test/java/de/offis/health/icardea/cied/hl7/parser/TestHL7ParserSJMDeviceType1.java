package de.offis.health.icardea.cied.hl7.parser;

import static org.junit.Assert.*;
import java.io.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
import de.offis.health.icardea.cied.pdf.parser.PDFParserMDTDeviceType2;
import de.offis.health.icardea.cied.pdf.parser.TestPDFParserMDTDeviceType2;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.common.filenamefilter.HL7FilenameFilter;
//import de.offis.health.icardea.common.filenamefilter.PDFFilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;


import de.offis.health.icardea.cied.hl7.processing.HL7_ORU_Creator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHL7ParserSJMDeviceType1 {
    /*
     * Logger object
	 */
	private static Logger logger = Logger.getLogger(TestHL7ParserSJMDeviceType1.class);
	
	/**
	 * All Medtronic PDF sample files.
	 */
	private File[] sjmExampleFiles = null;
	private File[] new_sjmExampleFiles = null;
	
	/**
	 * Only SJM <code>List</code>.
	 */
	private List<File> sjmDeviceType1Files = new ArrayList<File>();
	
	/**
	 * The content of each read HL7 file.
	 */
	private List<String> sjmHL7Content = new ArrayList<String>();


	
			
	@Before
	public void setUp() throws Exception {
		
		// Call general initialization class (required for log4j initialisation)
		InitJUnitTestSuite.setUpBeforeClass();
		
		// Logger
		//logger.info("setUp called in " + getClass());
		
		String resourcesPath = GlobalTools.MAVEN_TEST_RESOURCES;
        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-");
        
        //System.out.println(Filedatetime);
		
		File sjmHL7TestFileDirectory = new File(resourcesPath + "hl7" + GlobalTools.FILESEPARATOR +
				"sjm" + GlobalTools.FILESEPARATOR);
		
		File new_sjmHL7TestFileDirectory = new File(resourcesPath + "hl7" + GlobalTools.FILESEPARATOR +
				"new_sjm" + GlobalTools.FILESEPARATOR);
		
		this.sjmExampleFiles = sjmHL7TestFileDirectory.listFiles(new HL7FilenameFilter());
		
		
		for (int i = 0; i < this.sjmExampleFiles.length; i++)
		{
			String FileTimeStample = tempDate.format(new java.util.Date());
			//logger.info("Supported Devices: " + device);
			logger.info("Filename.........: " + this.sjmExampleFiles[i].getName());
			HL7ParserSJMDeviceType1.filename=this.sjmExampleFiles[i].getName();
			logger.info("Filepath.........: " + sjmHL7TestFileDirectory.toString());
			HL7ParserSJMDeviceType1.filepath=sjmHL7TestFileDirectory.toString();
			
			HL7ParserSJMDeviceType1.newfilename=FileTimeStample+this.sjmExampleFiles[i].getName();
			logger.info("New filename.........: " + FileTimeStample+this.sjmExampleFiles[i].getName());
			
			HL7ParserSJMDeviceType1.newfilepath=new_sjmHL7TestFileDirectory.toString();
			logger.info("New filenpath.........: " + new_sjmHL7TestFileDirectory.toString());
			HL7ParserSJMDeviceType1 hl7ParserSJMDeviceType1=new HL7ParserSJMDeviceType1();
			
			HL7ParserSJMDeviceType1.keywords_numenclature="(OBR\\|)|(739568\\^)|(739712\\^)|(737824\\^)";
			//HL7_ORU_Creator hl7_oru_creator=new HL7_ORU_Creator(resourcesPath, i);
			hl7ParserSJMDeviceType1.getHL7_ORU_MSH();
			hl7ParserSJMDeviceType1.getHL7_ORU_PID();
			hl7ParserSJMDeviceType1.getHL7_ORU_PV1();
			hl7ParserSJMDeviceType1.getHL7_ORU_OBR();
			//HL7_ORU_Creator hl7_oru_creator=new HL7_ORU_Creator(null, 0);
			//hl7_oru_creator.execution(null, this.sjmExampleFiles[i].getName());
		}
		
		this.new_sjmExampleFiles = new_sjmHL7TestFileDirectory.listFiles(new HL7FilenameFilter());
		for (int i = 0; i < this.new_sjmExampleFiles.length; i++)		
		{
		//HL7_ORU_Creator hl7_oru_creator=new HL7_ORU_Creator(null, 0);
		//hl7_oru_creator.execution(null, this.new_sjmExampleFiles[i].getName(), new_sjmHL7TestFileDirectory.toString());
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHL7ParserSJMDeviceType1() {

		try {
			
			//HL7_ORU_Creator hl7_oru_creator=new HL7_ORU_Creator(null, 0);
			//hl7_oru_creator.execution(null, "hl7");
					
		} finally {
			} // end if
	}
}