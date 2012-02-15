package de.offis.health.icardea.cied.hl7.processing;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.ContentByteUtils;
import com.itextpdf.text.pdf.parser.PdfContentStreamProcessor;
import com.itextpdf.text.pdf.parser.RenderListener;
import de.offis.health.icardea.cied.hl7.processing.HL7_Base64_Image;

/**
 * This method implements a page based content parser for
 * iText similar to PdfReaderContentParser that comes
 * with iText v5.0.2.
 * 
 *
 */
public class PDFiTextImagePageReaderContentParser {
	/**
	 * Logger object
	 */
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(PDFiTextImagePageReaderContentParser.class);
	
	private final PdfReader pdfReader;
	public byte[] imageEGM;
	
	/**
	 * Default constructor using the constructor of the Superclass.
	 * @param reader
	 */
	public PDFiTextImagePageReaderContentParser(PdfReader pdfReader) {
		this.pdfReader = pdfReader;
	}
	
	/**
	 * Processes content from the specified page number using the specified listener
	 * @param <E> the type of the renderListener - this makes it easy to chain calls
	 * @param pageNumber The page number to process.
	 * @param renderListener The listener that will receive render callbacks.
	 * @return Returns the provided renderListener.
	 * @throws IOException if operations on the reader fail.
	 */
	public <E extends RenderListener> E processContent(int pageNumber, E renderListener) throws IOException{
		
		PdfDictionary pageDic = pdfReader.getPageN(pageNumber);
		PdfDictionary resourcesDic = pageDic.getAsDict(PdfName.RESOURCES);
		if (renderListener instanceof PDFiTextImageRenderListener) {
			((PDFiTextImageRenderListener) renderListener).setPageNumber(pageNumber);
		}
		PdfContentStreamProcessor processor = new PdfContentStreamProcessor(renderListener);
		processor.processContent(ContentByteUtils.getContentBytesForPage(pdfReader, pageNumber), resourcesDic);
		return renderListener;
	}
}