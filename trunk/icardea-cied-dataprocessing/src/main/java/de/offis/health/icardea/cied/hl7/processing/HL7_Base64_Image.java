package de.offis.health.icardea.cied.hl7.processing;

//import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import de.offis.health.icardea.cied.pdf.extractor.PDFiText2Extractor;
import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.common.filenamefilter.ImageTypeFilenameFilter;
import de.offis.health.icardea.common.filenamefilter.PDFFilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class HL7_Base64_Image {
	
	/**
	 * Logger object
	 */
	public static ArrayList egm_Image_ArrayList = new ArrayList();
	private static Logger logger = Logger.getLogger(HL7_Base64_Image.class);
	
	/**
	 * PDF sample files from Medtronic
	 */
	private File[] medtronicPDFFiles = null;
	private String medtronicEGMFilePath = null;
	private byte[] imageEGM;
	//String resourcesPath = GlobalTools.MAVEN_TEST_RESOURCES;
	
	public File extractEGMImagesFromPDFFiles(File ciedPdfFile) throws IOException, Exception {
		logger.info("Start image processing");
		File egmPDFFile =null;
		PDFExtractor pdfExtractor = null;
		EGM_PDF_Generator egm_pdf_Generator=null;
		//File medtronicPDFTestFileDirectory = new File(resourcesPath + "pdf" + GlobalTools.FILESEPARATOR +
		//		"medtronic" + GlobalTools.FILESEPARATOR);
		//File medtronicPDFFileDirectory = new File(AppConfig.getProperty("DIRECTORY_Medtronic_Original_PDF_Report"));
		//logger.info("Current DIRECTORY Medtronic PDF Report is " + AppConfig.getProperty("DIRECTORY_Medtronic_Original_PDF_Report"));
		//this.medtronicExampleFiles = medtronicPDFFileDirectory.listFiles(new PDFFilenameFilter());
		this.medtronicEGMFilePath = AppConfig.getProperty("DIRECTORY_MEDTRONIC_EXPORTED_EGM");
		logger.info("Current DIRECTORY Medtronic PDF Report is "+ ciedPdfFile.getAbsolutePath());
	
		try {
			// Check if all Medtronic files can be opened.
			//for (int i = 0; i < this.medtronicExampleFiles.length; i++) {
				//PDFiText2Extractor pdfiText2Extractor = new PDFiText2Extractor();
				//assertTrue(pdfiText2Extractor.openDocument(ciedPdfFile.getAbsolutePath()));
				//get all pages with the title name "Current EGM"
				ArrayList<Integer> egmPageNumber = new ArrayList<Integer>();//= pdfiText2Extractor.getEGMPageNumber();
				egmPageNumber.add(2);
				logger.info("egmPageNumber 0 is "+egmPageNumber.get(0));
				//generate EGM image in the PDF with the title name "Current EGM"^
				//pdfiText2Extractor.getImages(2);
				//pdfiText2Extractor.exportEGMImagesToFileSystem(this.medtronicEGMFilePath, egmPageNumber);
				
				//pdfExtractor = new PDFiText2Extractor();
				PDFiText2Extractor pdfiText2Extractor = new PDFiText2Extractor();
				logger.info(ciedPdfFile.getAbsolutePath());
				//comment assertTrue we are not in Testing trunk!
				//				assertTrue(pdfiText2Extractor.openDocument(ciedPdfFile.getAbsolutePath()));
				//pdfiText2Extractor.exportAllImagesToFileSystem(medtronicEGMFilePath);

				for (int i=1; i<pdfiText2Extractor.getNumberOfPages();i++) {
					//logger.info("EGM from page "+ i);
				pdfiText2Extractor.getImages(i);
				}
				//pdfiText2Extractor.dispose();
				//generate EGM image file into PDF
				//egm_pdf_Generator=new EGM_PDF_Generator();
				//egmPDFFile=egm_pdf_Generator.Generator_EGM_PDF(this.medtronicEGMFilePath, ciedPdfFile.getName());
				//Clean the image files in the DIRECTORY_Medtronic_Exported_EGM
				//deleteAllFile(this.medtronicEGMFilePath);
				 
			//}
		} catch (Exception ex) {
			//logger.error(GlobalTools.getExceptionTraceLog(ex));
			throw ex;
		} finally {
			if (pdfExtractor != null) {
				pdfExtractor.dispose();
			}
		} // end try..catch..finally
		return egmPDFFile;
	}

	public static boolean deleteAllFile(String folderFullPath){
		boolean ret = false;
		File file = new File(folderFullPath);
		if(file.exists()){
			if(file.isDirectory()){
				File[] fileList = file.listFiles(new ImageTypeFilenameFilter());
				for (int i = 0; i < fileList.length; i++) {
					String filePath = fileList[i].getPath();
					deleteAllFile(filePath);
				}
			}
			if(file.isFile()){
				file.delete();
			}
		}
		return ret;
	}
}