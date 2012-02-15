/**
 * 
 */
package de.offis.health.icardea.cied.pdf.extractor;

import static org.junit.Assert.*;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import de.offis.health.icardea.InitJUnitTestSuite;
import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.common.filenamefilter.PDFFilenameFilter;
import de.offis.health.icardea.tools.GlobalTools;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <p>
 * This class will test the iText v2.1.x based PDF extractor class {@link PDFiText2Extractor}.
 * </p>
 * 
 *
 */
public class TestPDFiText2Extractor {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(TestPDFiText2Extractor.class);
	
	/**
	 * PDF sample files from Medtronic
	 */
	private File[] medtronicExampleFiles = null;
	
	/**
	 * The export path for all images extracted from the Medtronic PDF files.
	 */
	private String medtronicExtrFilePath = null;
	
	/**
	 * PDF sample files from SJM
	 */
	private File[] sjmExampleFiles = null;
	
	/**
	 * The export path for all images extracted from the Medtronic PDF files.
	 */
	private String sjmExtrFilePath = null;
	
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
		File sjmPDFTestFileDirectory = new File(resourcesPath + "pdf" + GlobalTools.FILESEPARATOR +
				"sjm" + GlobalTools.FILESEPARATOR);
		
		String pdfFileName = null;
		//pdfFileName = "Medtronic_PuenteHandlePDF_EN.pdf";
		
		if (pdfFileName == null) {
			this.medtronicExampleFiles = medtronicPDFTestFileDirectory.listFiles(new PDFFilenameFilter());
			this.medtronicExtrFilePath = GlobalTools.checkDirectoryPath(medtronicPDFTestFileDirectory.getAbsolutePath()) + "extr_iText2";
			
			this.sjmExampleFiles = sjmPDFTestFileDirectory.listFiles(new PDFFilenameFilter());
			this.sjmExtrFilePath = GlobalTools.checkDirectoryPath(sjmPDFTestFileDirectory.getAbsolutePath()) + "extr_iText2";
		} else {
			// Check only the given file...
			this.medtronicExampleFiles = medtronicPDFTestFileDirectory.listFiles(new PDFFilenameFilter(pdfFileName));
			this.medtronicExtrFilePath = GlobalTools.checkDirectoryPath(medtronicPDFTestFileDirectory.getAbsolutePath()) + "extr_iText2";
			
			this.sjmExampleFiles = sjmPDFTestFileDirectory.listFiles(new PDFFilenameFilter(pdfFileName));
			this.sjmExtrFilePath = GlobalTools.checkDirectoryPath(sjmPDFTestFileDirectory.getAbsolutePath()) + "extr_iText2";
		} // end if..else
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Testing successful opening PDF files.
	 */
	@Test
	public void openPDFFilesSuccess() throws IOException, Exception {
		PDFExtractor pdfExtractor = null;
		
		try {
			// Check if all Medtronic files can be opened.
			for (int i = 0; i < this.medtronicExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.medtronicExampleFiles[i].getAbsolutePath()));
				pdfExtractor.dispose();
			} // end for
			
			// Check if all SJM files can be opened.
			for (int i = 0; i < this.sjmExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.sjmExampleFiles[i].getAbsolutePath()));
				pdfExtractor.dispose();
			} // end for
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
	 * Test failure opening PDF files.
	 */
	@Test(expected=Exception.class)
	public void openPDFFilesFail() throws IOException, Exception {
		PDFExtractor pdfExtractor = null;
		
		try {
			// Check a failure opening a PDF file.
			pdfExtractor = new PDFiText2Extractor();
			pdfExtractor.openDocument("Not_Existing_PDF.pdf");
			pdfExtractor.dispose();
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (pdfExtractor != null) {
				pdfExtractor.dispose();
			}
		} // end try..catch..finally
	}
	
	/**
	 * Testing the extraction of all images from PDF files.
	 */
	@Test
	public void extractAllImagesFromPDFFiles() throws IOException, Exception {
		PDFExtractor pdfExtractor = null;
		try {
			// Check if all Medtronic files can be opened.
			for (int i = 0; i < this.medtronicExampleFiles.length; i++) {
				logger.info(this.medtronicExampleFiles[i].getAbsolutePath());
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.medtronicExampleFiles[i].getAbsolutePath()));
				pdfExtractor.exportAllImagesToFileSystem(this.medtronicExtrFilePath);
				pdfExtractor.dispose();
			} // end for
			
			// Check if all SJM files can be opened.
			for (int i = 0; i < this.sjmExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.sjmExampleFiles[i].getAbsolutePath()));
				pdfExtractor.exportAllImagesToFileSystem(this.sjmExtrFilePath);
				pdfExtractor.dispose();
			} // end for
		} catch (Exception ex) {
//			ex.printStackTrace();
			logger.error(GlobalTools.getExceptionTraceLog(ex));
			throw ex;
		} finally {
			if (pdfExtractor != null) {
				pdfExtractor.dispose();
			}
		} // end try..catch..finally
	}
	
	/**
	 * Testing the extraction of all images from PDF files.
	 */
	
	@Test
	public void extractImagesFromPage() throws IOException, Exception {
		PDFiText2Extractor pdfExtractor = null;
		try {
			// Check if all Medtronic files can be opened.
			for (int i = 0; i < this.medtronicExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.medtronicExampleFiles[i].getAbsolutePath()));
				pdfExtractor.getImages(2);
				pdfExtractor.dispose();
			} // end for
			
			// Check if all SJM files can be opened.
			for (int i = 0; i < this.sjmExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.sjmExampleFiles[i].getAbsolutePath()));
				pdfExtractor.getImages(2);
				pdfExtractor.dispose();
			} // end for
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
	 * Testing the extraction of text from PDF files.
	 */
	@Test
	public void extractCompleteTextFromPDFFiles() throws IOException, Exception {
		PDFExtractor pdfExtractor = null;
		
		try {
			// Check if all Medtronic files can be opened.
			for (int i = 0; i < this.medtronicExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.medtronicExampleFiles[i].getAbsolutePath()));
				pdfExtractor.exportAllPagesAsTextToFileSystem(this.medtronicExtrFilePath);
				pdfExtractor.dispose();
			} // end for
			
			// Check if all SJM files can be opened.
			for (int i = 0; i < this.sjmExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.sjmExampleFiles[i].getAbsolutePath()));
				pdfExtractor.exportAllPagesAsTextToFileSystem(this.sjmExtrFilePath);
				pdfExtractor.dispose();
			} // end for
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
	 * Testing the access to the bookmark entries of PDF files.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void getBookmarkTitlesAsTextFromPDFFiles() throws IOException, Exception {
		PDFExtractor pdfExtractor = null;
		java.util.List bookmarkList = null;
		
		try {
			// Check if all Medtronic files can be opened.
			for (int i = 0; i < this.medtronicExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.medtronicExampleFiles[i].getAbsolutePath()));
				bookmarkList = pdfExtractor.getBookmarkTitlesAsText();
				if (bookmarkList != null) {
					for (Iterator iterator = bookmarkList.iterator(); iterator.hasNext();) {
						String bookmarkTitle = (String) iterator.next();
						logger.debug(bookmarkTitle);
					}
				}
				pdfExtractor.dispose();
			} // end for
			
			// Check if all SJM files can be opened.
			for (int i = 0; i < this.sjmExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.sjmExampleFiles[i].getAbsolutePath()));
				bookmarkList = pdfExtractor.getBookmarkTitlesAsText();
				if (bookmarkList != null) {
					for (Iterator iterator = bookmarkList.iterator(); iterator.hasNext();) {
						String bookmarkTitle = (String) iterator.next();
						logger.debug(bookmarkTitle);
					}
				}
				pdfExtractor.dispose();
			} // end for
		} catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex), ex);
			throw ex;
		} finally {
			if (pdfExtractor != null) {
				pdfExtractor.dispose();
			}
		} // end try..catch..finally
	}
	
	/**
	 * Test to read the author from the PDF metadata.
	 * 
	 * @throws IOException
	 * @throws Exception
	 */
	@Test
	public void extractPDFPage() throws IOException, Exception {
		PDFExtractor pdfExtractor = null;
		byte[] extractedPdfDocumentContent = null;
		BufferedOutputStream bufferedOutputStream = null;
		int pageNumberToExtract = 2;
		String extractedDocumentFileName = null;
		
		try {
			// Check if all Medtronic files can be opened.
			for (int i = 0; i < this.medtronicExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.medtronicExampleFiles[i].getAbsolutePath()));
				extractedPdfDocumentContent = pdfExtractor.getPDFPage(pageNumberToExtract);
				
				if (extractedPdfDocumentContent != null) {
					try {
						extractedDocumentFileName = this.medtronicExampleFiles[i].getName();
						int posOfDot = extractedDocumentFileName.lastIndexOf(".");
						
						if (posOfDot > 0) {
							FileOutputStream fileOutputStream = new FileOutputStream(
									this.medtronicExtrFilePath +
									GlobalTools.FILESEPARATOR +
									extractedDocumentFileName.substring(0, posOfDot) +
									"_page_" + pageNumberToExtract + ".pdf");
							
							bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
							bufferedOutputStream.write(extractedPdfDocumentContent);
						} // end if
					} catch (IOException ex) {
						logger.error("An IOException occurred writing the extracted PDF page as PDF.", ex);
					} finally {
						if (bufferedOutputStream != null) {
							bufferedOutputStream.flush();
							try {
								bufferedOutputStream.close();
							} catch (IOException ex) {}
						} // end if
					} // try..catch..finally
				} // end if
				
				pdfExtractor.dispose();
			} // end for
			
			// Check if all SJM files can be opened.
			for (int i = 0; i < this.sjmExampleFiles.length; i++) {
				pdfExtractor = new PDFiText2Extractor();
				assertTrue(pdfExtractor.openDocument(this.sjmExampleFiles[i].getAbsolutePath()));
				extractedPdfDocumentContent = pdfExtractor.getPDFPage(pageNumberToExtract);
				
				if (extractedPdfDocumentContent != null) {
					try {
						extractedDocumentFileName = this.sjmExampleFiles[i].getName();
						int posOfDot = extractedDocumentFileName.lastIndexOf(".");
						
						if (posOfDot > 0) {
							FileOutputStream fileOutputStream = new FileOutputStream(
									this.sjmExtrFilePath +
									GlobalTools.FILESEPARATOR +
									extractedDocumentFileName.substring(0, posOfDot) +
									"_page_" + pageNumberToExtract + ".pdf");
							
							bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
							bufferedOutputStream.write(extractedPdfDocumentContent);
						} // end if
					} catch (IOException ex) {
						logger.error("An IOException occurred writing the extracted PDF page as PDF.", ex);
					} finally {
						if (bufferedOutputStream != null) {
							bufferedOutputStream.flush();
							try {
								bufferedOutputStream.close();
							} catch (IOException ex) {}
						} // end if
					} // try..catch..finally
				} // end if
				
				pdfExtractor.dispose();
			} // end for
		} catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex), ex);
			throw ex;
		} finally {
			if (pdfExtractor != null) {
				pdfExtractor.dispose();
			}
		} // end try..catch..finally
	}
}