package de.offis.health.icardea.cied.hl7.parser;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.offis.health.icardea.InitJUnitTestSuite;
import de.offis.health.icardea.cied.hl7.processing.HL7_ORU_Creator;
import de.offis.health.icardea.common.filenamefilter.HL7FilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class TestHL7MessageSending {
    /*
     * Logger object
	 */
		private static Logger logger = Logger.getLogger(TestHL7MessageSending.class);
		
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

		private List<File> hl7Files = new ArrayList<File>();
		
				
		@Before
		public void setUp() throws Exception {
			
			// Call general initialization class (required for log4j initialisation)
			InitJUnitTestSuite.setUpBeforeClass();
			
			// Logger
			//logger.info("setUp called in " + getClass());
			String hl7FilePathandName=null;
			String resourcesPath = GlobalTools.MAVEN_TEST_RESOURCES;
	        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-");
	        
	        //System.out.println(Filedatetime);
			
			File sjmHL7TestFileDirectory = new File(resourcesPath + "hl7" + GlobalTools.FILESEPARATOR +
					"HL7_Test" + GlobalTools.FILESEPARATOR);
			
			File new_sjmHL7TestFileDirectory = new File(resourcesPath + "hl7" + GlobalTools.FILESEPARATOR +
				"processed_HL7" + GlobalTools.FILESEPARATOR);
			
			this.sjmExampleFiles = sjmHL7TestFileDirectory.listFiles(new HL7FilenameFilter());
			
			logger.info("Filepath.........: " + sjmHL7TestFileDirectory.toString());
			for (int i = 0; i < this.sjmExampleFiles.length; i++)
			{
				this.hl7Files.add(this.sjmExampleFiles[i]);
			}
			String ip_address = AppConfig.getProperty("ADAPTIVE_CARE_PLANNER_HL7_SERVER");
			int port_number = GlobalTools.getIntValue(AppConfig.getProperty("ADAPTIVE_CARE_PLANNER_HL7_PORT"));
			String fileTimestamp = GlobalTools.date2String(new java.util.Date(), "yyyy-MM-dd_HH-mm-ss");
			for (File hl7File : this.hl7Files) {
				logger.info("Start to transmit file : " + hl7File.getAbsolutePath());
				//logger.info("New file path : " + new_sjmHL7TestFileDirectory.toString());
				//logger.info("New file name : " + fileTimestamp+hl7File.getName());
			
			//HL7_ORU_Creator hl7_oru_creator=new HL7_ORU_Creator(ip_address, port_number);
			
			//1) Copy and past hl7 files into folder new_sjm
			//hl7_oru_creator.execution(null, hl7File.getAbsolutePath(),new_sjmHL7TestFileDirectory.toString()+"\\", fileTimestamp+"_"+hl7File.getName());
			//hl7_oru_creator.sending(hl7File.getAbsolutePath());
			//Thread.sleep(30000);
			//2) Do not copy and past hl7 files into folder new_sjm
			//hl7_oru_creator.execution(null, hl7File.getAbsolutePath(),null, null);
			String targetFileDirectory="C:\\Test\\Medtronic\\hl7v25000\\";
			Thread.sleep(20000);
			GlobalTools.moveFile(hl7File.getAbsolutePath(), targetFileDirectory, hl7File.getName().substring(0,hl7File.getName().lastIndexOf("."))+"_transmitted.hl7");
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
				//logger.info(hl7FilePathandName+"Transmittion finished");
				} // end if
		}
}
