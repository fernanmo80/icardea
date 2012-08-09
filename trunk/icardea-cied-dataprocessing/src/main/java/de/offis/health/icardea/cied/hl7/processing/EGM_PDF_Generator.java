package de.offis.health.icardea.cied.hl7.processing;

//import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.apache.log4j.Logger;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.codec.PngImage;

import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.common.filenamefilter.ImageTypeFilenameFilter;
import de.offis.health.icardea.common.filenamefilter.PDFFilenameFilter;
import de.offis.health.icardea.config.AppConfig;

public class EGM_PDF_Generator {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(EGM_PDF_Generator.class);
	//int intPermissions = PdfWriter.AllowPrinting |PdfWriter.AllowScreenReaders; 
	
	public File Generator_EGM_PDF (String egmFilePath, String filename) throws Exception {
		File[] medtronicEGMFiles = null;
		File egmPdfFile=null;
		logger.info("Start to generate EGM PDF file in ");
		/* step 1: creation of a document-object  
		 * Define the PDF size A4 Paper.
		 * For A3 Size EGM figure will be reserved
		 */
		Document document = new Document(PageSize.A4, 50, 50, 50, 50);
		// step 2:  
		// we create a writer that listens to the document  
		// and directs a PDF-stream to a file  
		//PdfWriter.getInstance(document, new FileOutputStream("tmpEGM.pdf"));
		egmPdfFile=new File(egmFilePath+"\\"+filename.substring(0,filename.lastIndexOf("."))+"_EGM.pdf");
		logger.info("EGM Pdf file path is "+egmPdfFile.getAbsolutePath());
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(egmPdfFile.getAbsolutePath()));
		writer.setStrictImageSequence(true); 
		
		// step 3: Open the document  
		document.open();
		document.add(new Paragraph("Current EGM in CIED Report "+"\""+filename+"\"")); 
		
		File medtronicEGMDirectory = new File(AppConfig.getProperty("DIRECTORY_MEDTRONIC_EXPORTED_EGM"));
		// boolean isPDFFile=false;
		medtronicEGMFiles = medtronicEGMDirectory.listFiles(new ImageTypeFilenameFilter());
		
		if(medtronicEGMFiles.length!=0){};
		
		for (int i = 0; i < medtronicEGMFiles.length; i++) {
			//step 4:
			logger.info("iTextPDFGenerator file name "+medtronicEGMFiles[i].toString());
			iTextPDFGenerator(medtronicEGMFiles[i].toString(), document);
		}
		// step 5: we close the document
		document.close();
		return egmPdfFile;
	}
	
	private boolean iTextPDFGenerator(String filepPathName, Document document) {
		boolean iTextPDFGenerator=false;
		try {
			Image pngImage=null;
			// step 4:
			//document.add(new Paragraph("EGM_"+filepPathName));  
			pngImage = Image.getInstance(filepPathName);  
			pngImage.scalePercent(60); //60% for original figure
			//pngImage.scaleAbsolute(int newWidth, int newHeight) 
			//pngImage.scalePercent(int percent) 
			//pngImage.scalePercent(int percentX, int percentY)
			document.add(pngImage); 
		}  
		catch(DocumentException de) {  
			System.err.println(de.getMessage());  
		}  
		catch(IOException ioe) {  
			System.err.println(ioe.getMessage());  
		}  
		return  iTextPDFGenerator;
	}
}