/**
 * 
 */
package de.offis.health.icardea.tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.offis.health.icardea.InitJUnitTestSuite;

/**
 * <p>
 * This class will test the common GlobalTools methods used in various
 * places.
 * </p>
 * 
 *
 */
public class TestGlobalTools {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(TestGlobalTools.class);
	
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
	 * This method will test the MD5 hash function in GlobalTools.
	 * 
	 * @throws UnsupportedEncodingException 
	 * @throws NoSuchAlgorithmException 
	 */
	@Test
	public void getHashMD5() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		/*
		 * Positive Test:
		 * Hash for the UTF-8 String 'Test' should be 
		 * "0cbc6611f5540bd0809a388dc95a615b" 
		 */
		assertEquals("MD5 hash for 'Test' (UTF-8) should be: 0cbc6611f5540bd0809a388dc95a615b", "0cbc6611f5540bd0809a388dc95a615b", GlobalTools.getHashMD5("Test".getBytes("UTF-8")));
		
		/*
		 * Negative Test:
		 * Hash for the UTF-8 String 'TEST' should NOT be 
		 * "0cbc6611f5540bd0809a388dc95a615b"
		 */
		assertNotSame("0cbc6611f5540bd0809a388dc95a615b", GlobalTools.getHashMD5("TEST".getBytes("UTF-8")));
	}
	
	/**
	 * This method will test the delete function in GlobalTools.
	 * @throws IOException 
	 * 
	 * @throws
	 * @throws
	 */
	@Test
	public void testDeleteGeneralFile () throws IOException {
		File destination = new File(getSrcDirectory(), "src_file.txt");
		destination.createNewFile();
		assertTrue("src_file.txt doesn't exist to delete", destination.exists());
		GlobalTools.deleteGeneralFile(destination.getAbsolutePath());
		assertTrue("Delete operation is failed", !destination.exists());
	}
	
	/**
	 * This method will test the Copy function in GlobalTools.
	 * @throws IOException 
	 * 
	 * @throws
	 * @throws
	 */
	@Test
	public void testCopyGeneralFile () throws IOException {
		String fileName="testFileForCopy.txt";
		File srcFileForCopy = new File(getSrcDirectory(), fileName);
		File destFileAfterCopy = new File(getDestDirectory(), fileName);
		
		srcFileForCopy.createNewFile();
		assertTrue("testFileForCopy.txt doesn't exist to delete", srcFileForCopy.exists());
		
		if (destFileAfterCopy.exists()) {
			assertTrue(fileName+ " has been existed in destination directory and could not be deleted", 
					destFileAfterCopy.delete());
		}
		
		GlobalTools.copyGeneralFile(srcFileForCopy.getAbsolutePath(), getDestDirectory().getAbsolutePath());
		assertTrue("Copy Operation is failed", destFileAfterCopy.exists());
	}
	
	/**
	 * This method will test the Cut function in GlobalTools.
	 * @throws IOException 
	 * 
	 * @throws
	 * @throws
	 */
	@Test
	public void testCutGeneralFile () throws IOException {
		String fileName="testFileForCut.txt";
		File srcFileForCut = new File(getSrcDirectory(), fileName);
		File destFileAfterCut = new File(getDestDirectory(), fileName);
		
		srcFileForCut.createNewFile();
		assertTrue(fileName + " could not be built", srcFileForCut.exists());

		if (destFileAfterCut.exists()) {
			assertTrue(fileName + " has been existed in destination directory and could not be deleted", 
					destFileAfterCut.delete());
		}
		
		GlobalTools.cutGeneralFile(srcFileForCut.getAbsolutePath(), getDestDirectory().getAbsolutePath());
		assertTrue("Cut Operation is failed, source file still exists", !srcFileForCut.exists());
		assertTrue("Cut Operation is failed, destination file does not exist", destFileAfterCut.exists());
	}
	
	/**
	 * This method will test the Move function in GlobalTools.
	 * @throws IOException 
	 * 
	 * @throws
	 * @throws
	 */
	@Test
	public void testMoveFile() throws IOException {
		String fileName="testFileForMove.txt";
		File srcFileForCut = new File(getSrcDirectory(), fileName);
		File destFileAfterCut = new File(getDestDirectory(), fileName);
		
		srcFileForCut.createNewFile();
		assertTrue(fileName + " could not be built", srcFileForCut.exists());

		if (destFileAfterCut.exists()) {
			assertTrue(fileName + " has been existed in destination directory and could not be deleted", 
					destFileAfterCut.delete());
		}
		GlobalTools.moveFile(srcFileForCut.getAbsolutePath(), getDestDirectory().getAbsolutePath(), null);
		assertTrue("Cut Operation is failed, source file still exists", !srcFileForCut.exists());
		assertTrue("Cut Operation is failed, destination file does not exist", destFileAfterCut.exists());
	}
	
	/**
	 * This method will test the Move (Overwriting) function in GlobalTools.
	 * @throws IOException 
	 * 
	 * @throws
	 * @throws
	 */
	@Test
	public void testOverwriteFile() throws IOException {
		String fileName="testFileForOverwrite.txt";
		File srcFileForOverwrite = new File(getSrcDirectory(), fileName);
		File desFileForOverwrite = new File(getDestDirectory(), fileName);
		
		//Clean old file in source and destination directory
		if (srcFileForOverwrite.exists()) {
			if(!GlobalTools.deleteGeneralFile(srcFileForOverwrite.getAbsolutePath())) {
				logger.error("Delete " + srcFileForOverwrite.getAbsolutePath() + " operation is failed!");
			}
		}
		
		if (desFileForOverwrite.exists()) {
			if(!GlobalTools.deleteGeneralFile(desFileForOverwrite.getAbsolutePath())) {
				logger.error("Delete " + desFileForOverwrite.getAbsolutePath() + "operation is failed!");
			}
		}
		
		srcFileForOverwrite.createNewFile();
		desFileForOverwrite.createNewFile();
		assertTrue("Source file for overwrite " + fileName + " could not be built", srcFileForOverwrite.exists());
		assertTrue("Destin file for overwrite " + fileName + " could not be built", desFileForOverwrite.exists());
		
		String contentInSrc="This is contents in source file for overwriting";
		String contentInDes="This is contents in dest file before overwriting";
		
		writeContentIntoFile(srcFileForOverwrite.getAbsolutePath(), contentInSrc);
		writeContentIntoFile(desFileForOverwrite.getAbsolutePath(), contentInDes);
		
		if (desFileForOverwrite.exists()) {
			assertTrue(fileName + " to be overwritten does not existed in destination directory", 
					desFileForOverwrite.exists());
		}
		
		GlobalTools.moveFile(srcFileForOverwrite.getAbsolutePath(), getDestDirectory().getAbsolutePath(), null);
		assertTrue("Overwrite operation is failed, source file still exists", !srcFileForOverwrite.exists());
		assertTrue("Overwrite operation is failed, destin file does not exist", desFileForOverwrite.exists());

		assertTrue("Overwrite operation is failed, content in original destination file after overwriting is still existed",
				checkContent(desFileForOverwrite.getAbsolutePath(),contentInSrc));
		assertTrue("Overwrite operation is failed, content in original source file after overwriting does not exist",
				!checkContent(desFileForOverwrite.getAbsolutePath(),contentInDes));
	}
	
	//absolute Path will be changed later
	public static File getSrcDirectory() {
		File testDir = new File("C:\\Test\\srcDir\\");
		if (!testDir.exists()) {
			testDir.mkdir();
		}
		return testDir;
	}
	
	public static File getDestDirectory() {
		File testDir = new File("C:\\Test\\destDir\\");
		if (!testDir.exists()) {
			testDir.mkdir();
		}
		return testDir;
	}
	
	
	/**
	 * This method will write contents into text file function in GlobalTools.
	 * @throws IOException 
	 * 
	 * @throws
	 * @throws
	 */
	
	public boolean writeContentIntoFile (String filePath, String content) throws IOException {
		Boolean success=false;
		String fileTimestamp = GlobalTools.date2String(new java.util.Date(), "yyyy-MM-dd_HH-mm-ss");
		try{
			FileWriter fw=new FileWriter( filePath, true);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write("File is created at " + fileTimestamp +"\r\n");
			bw.write(content+"\r\n");
			bw.close();
			fw.close();
			success=true;
			
		}
		catch(IOException e) 
		{
			logger.error("Writing contents into file failed");
			success=false;
		}
		return success;
	}
	
	public String readContentOutofFile (String filePath) throws IOException {
		String num = null;
		String content = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			StringBuffer buffer = new StringBuffer();
			while ((num = reader.readLine()) != null) {
				buffer.append(num + "\n");
				content = buffer.toString();
			}
		} catch (IOException e) {
			logger.error("Read file "+ filePath + "failed");
		}
		return content;
	}
	
	/**
	 * This method will check whether content in text include defined key word.
	 * @throws IOException 
	 * 
	 * @Parameter filePath: the absolute path for text file
	 * @Parameter keyString: defined key word
	 * @Return boolean: if keyString is included return true otherwise false 
	 */
	public boolean checkContent (String filePath, String keyString) throws IOException {
		boolean check=false;
		check=(readContentOutofFile(filePath).indexOf(keyString)!=-1);
		return check;
	}
}