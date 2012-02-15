/**
 * 
 */
package de.offis.health.icardea.text.tools;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.offis.health.icardea.InitJUnitTestSuite;
import de.offis.health.icardea.common.exception.TextFileNotFoundException;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * <p>
 * This class will test the common {@link SimpleTextFileReader} class.
 * </p>
 * 
 *
 */
public class TestSimpleTextFileReader {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(TestSimpleTextFileReader.class);
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Call general initialization class (required for log4j initialisation)
		InitJUnitTestSuite.setUpBeforeClass();
		
		// Logger
		logger.info("setUp called in " + getClass());
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * This method will test the loadTextFile(..) function.
	 */
	@Test
	public void readTextFile() {
		String fileContent = null;
		SimpleTextFileReader simpleTextFileReader = null;
		
		/*
		 * Positive Test:
		 * Try to load an existing file AS IS (no line trimming
		 * and no line skipping).
		 */
		simpleTextFileReader = new SimpleTextFileReader();
		simpleTextFileReader.setClearFileContentAutomatically(true);
		simpleTextFileReader.setSkipEmptyLines(false);
		simpleTextFileReader.setTrimLines(false);
		
		try {
			simpleTextFileReader.loadTextFile(
					GlobalTools.checkDirectoryPath(GlobalTools.USERDIR) +
					GlobalTools.MAVEN_TEST_RESOURCES + 
					"items_for_tests" + GlobalTools.FILESEPARATOR + 
					"textfiles" + GlobalTools.FILESEPARATOR + 
					"TestSimpleTextFileReader_UTF-8.txt");
			
			// If we get here everything is correct
			assertTrue(true);
		} catch (TextFileNotFoundException ex) {
			// If the file wasn't found something is wrong.
			assertFalse(ex.getMessage(), true);
		}
		
		fileContent = simpleTextFileReader.getFileContent();
		
		// As the file wasn't read the content should be empty.
		assertEquals(setupCompareString(false, false), fileContent);
		
		
		/*
		 * Positive Test:
		 * Try to load an existing file and trim and skip empty lines.
		 */
		simpleTextFileReader = new SimpleTextFileReader();
		simpleTextFileReader.setClearFileContentAutomatically(true);
		simpleTextFileReader.setSkipEmptyLines(true);
		simpleTextFileReader.setTrimLines(true);
		
		try {
			simpleTextFileReader.loadTextFile(
					GlobalTools.checkDirectoryPath(GlobalTools.USERDIR) +
					GlobalTools.MAVEN_TEST_RESOURCES + 
					"items_for_tests" + GlobalTools.FILESEPARATOR + 
					"textfiles" + GlobalTools.FILESEPARATOR + 
					"TestSimpleTextFileReader_UTF-8.txt");
			
			// If we get here everything is correct
			assertTrue(true);
		} catch (TextFileNotFoundException ex) {
			// If the file wasn't found something is wrong.
			assertFalse(ex.getMessage(), true);
		}
		
		fileContent = simpleTextFileReader.getFileContent();
		
		// As the file wasn't read the content should be empty.
		assertEquals(setupCompareString(true, true), fileContent);
		
		
		/*
		 * Negative Test:
		 * Try to load a not existing file.
		 */
		simpleTextFileReader = new SimpleTextFileReader();
		simpleTextFileReader.setClearFileContentAutomatically(true);
		simpleTextFileReader.setSkipEmptyLines(false);
		simpleTextFileReader.setTrimLines(false);
		
		try {
			simpleTextFileReader.loadTextFile("path");
			
			// If we get here something is wrong
			assertFalse(true);
		} catch (TextFileNotFoundException ex) {
			// As there wasn't a file to load we run into this exception.
			assertFalse(ex.getMessage(), false);
		}
		
		fileContent = simpleTextFileReader.getFileContent();
		
		// As the file wasn't read the content should be empty.
		assertEquals("", fileContent);
	}
	
	/**
	 * This method will create a predefined compare String for the
	 * readTextFile test. Depending on the parameters you call this
	 * method the returned String will be slightly different.
	 * 
	 * @param trimLines
	 * @param skipEmptyLines
	 * @return Returns a predefined test String.
	 */
	private String setupCompareString(boolean trimLines, boolean skipEmptyLines) {
		StringBuffer stringBuffer = new StringBuffer();
		
		if (!trimLines) {
			stringBuffer.append("  ");
		}
		stringBuffer.append("###START###");
		if (!trimLines) {
			stringBuffer.append("  ");
		}
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		if (!skipEmptyLines) {
			stringBuffer.append("");
			stringBuffer.append(GlobalTools.LINESEPARATOR);
		}
		stringBuffer.append("[Tue Aug 30 03:29:01 CEST 2011] DatabaseProductName=PostgreSQL");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		stringBuffer.append("DatabaseProductVersion=9.0.4");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		stringBuffer.append("DriverName=PostgreSQL Native Driver");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		stringBuffer.append("DriverVersion=PostgreSQL 8.4 JDBC3 (build 701)");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		stringBuffer.append("DriverMajorAndMinorVersion=8.4");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		stringBuffer.append("URL=jdbc:postgresql://localhost:5432/postgres");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		stringBuffer.append("UserName=postgres");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		if (!skipEmptyLines) {
			stringBuffer.append("");
			stringBuffer.append(GlobalTools.LINESEPARATOR);
		}
		stringBuffer.append("[Tue Aug 30 03:29:10 CEST 2011] Hotlist file quickNavHotlist.dat successfully written.");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		stringBuffer.append("[Tue Aug 30 03:29:10 CEST 2011] Exiting JMDB");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		stringBuffer.append("[Tue Aug 30 03:29:10 CEST 2011] =============================================");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		if (!skipEmptyLines) {
			stringBuffer.append("");
			stringBuffer.append(GlobalTools.LINESEPARATOR);
		}
		
		stringBuffer.append("Umlauts ����");
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		if (!skipEmptyLines) {
			stringBuffer.append("");
			stringBuffer.append(GlobalTools.LINESEPARATOR);
		}
		
		if (!trimLines) {
			stringBuffer.append("  ");
		}
		stringBuffer.append("###END###");
		if (!trimLines) {
			stringBuffer.append("  ");
		}
		stringBuffer.append(GlobalTools.LINESEPARATOR);
		
		return stringBuffer.toString();
	}
}