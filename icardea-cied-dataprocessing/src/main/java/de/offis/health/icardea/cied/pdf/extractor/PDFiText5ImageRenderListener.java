/**
 * 
 */
package de.offis.health.icardea.cied.pdf.extractor;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;

import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.parser.ImageRenderInfo;
import com.itextpdf.text.pdf.parser.PdfImageObject;
import com.itextpdf.text.pdf.parser.RenderListener;
import com.itextpdf.text.pdf.parser.TextRenderInfo;

/**
 * This class renders the images found in a PDF document based on
 * the iText v5+ RenderListener class.
 * 
 *
 */
public class PDFiText5ImageRenderListener implements RenderListener {
	/**
	 * Logger object
	 */
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(PDFiText5ImageRenderListener.class);
	
	/**
	 * Decimal formatter for the PDF internal reference number. The number
	 * should be always 4-digits long.
	 */
	private static java.text.DecimalFormat refNumberFormat = new java.text.DecimalFormat("0000");
	
	/**
	 * Decimal formatter for PDF pages. The number should be always 3-digits
	 * long.
	 */
	private static java.text.DecimalFormat pageNumberFormat = new java.text.DecimalFormat("000");
	
	/**
	 * Base export directory path (as fully qualified path with an ending
	 * file separator) or an empty string to export to current directory.
	 */
	private String baseExportDirectoryPath = "";
	
	/**
	 * Base filename without an extension. Additional details will be
	 * appended including the extension.
	 */
	private String baseFileNameWithoutExtension = "";
	
	/**
	 * The page number that is processed. By default it is
	 * set to -1 so only when another Parser supports it,
	 * this will be set to the correct page number.
	 */
	private int pageNumber = -1;
	
	/**
	 * Default empty hidden constructor, to prevent using it. 
	 */
	@SuppressWarnings("unused")
	private PDFiText5ImageRenderListener() {}
	
	/**
	 * Default constructor to setup the export directory and base filename,
	 * that will be extended by an image id and extension when images are
	 * exported.
	 * 
	 * @param baseExportDirectoryPath The base export path (as fully qualified path) or empty string to export to current directory.
	 * @param baseFileNameWithoutExtension The base filename without an extension. Additional details will be appended including the extension.
	 * @throws Exception
	 */
	public PDFiText5ImageRenderListener(String baseExportDirectoryPath, String baseFileNameWithoutExtension) throws Exception {
		if (baseExportDirectoryPath == null) {
			throw new Exception("The base export directory is not defined (null).");
		}
		
		if (baseFileNameWithoutExtension == null) {
			throw new Exception("The base filename without extension is not defined (null).");
		}
		
		this.baseExportDirectoryPath = baseExportDirectoryPath;
		this.baseFileNameWithoutExtension = baseFileNameWithoutExtension;
	}
	
	/* (non-Javadoc)
	 * @see com.itextpdf.text.pdf.parser.RenderListener#beginTextBlock()
	 */
	public void beginTextBlock() {
	}
	
	/* (non-Javadoc)
	 * @see com.itextpdf.text.pdf.parser.RenderListener#endTextBlock()
	 */
	public void endTextBlock() {
	}
	
	/* (non-Javadoc)
	 * @see com.itextpdf.text.pdf.parser.RenderListener#renderImage(com.itextpdf.text.pdf.parser.ImageRenderInfo)
	 */
	public void renderImage(ImageRenderInfo renderInfo) {
		try {
			FileOutputStream fileOutputStream;
			PdfImageObject image = renderInfo.getImage();
			String imageName = (image.get(PdfName.NAME)==null?null:image.get(PdfName.NAME).toString());
			if (imageName != null && imageName.length() > 1 && imageName.startsWith("/")) {
				imageName = imageName.substring(1);
			} else {
				imageName = null;
			}
			
			String fullExportFileNameWithoutExtension = this.baseExportDirectoryPath + this.baseFileNameWithoutExtension + "_(" + (getPageNumber()>0?"p"+pageNumberFormat.format(getPageNumber()):"p"+pageNumberFormat.format(0)) + "_ref" + refNumberFormat.format(renderInfo.getRef().getNumber()) + (imageName==null?"_unk":"_" + imageName) + ")";
			PdfName filter = (PdfName)image.get(PdfName.FILTER);
			if (PdfName.DCTDECODE.equals(filter)) {
				fileOutputStream = new FileOutputStream(fullExportFileNameWithoutExtension + ".jpg");
				fileOutputStream.write(image.getStreamBytes());
				fileOutputStream.flush();
				fileOutputStream.close();
			} else if (PdfName.JPXDECODE.equals(filter)) {
				fileOutputStream = new FileOutputStream(fullExportFileNameWithoutExtension + ".jp2");
				fileOutputStream.write(image.getStreamBytes());
				fileOutputStream.flush();
				fileOutputStream.close();
			} else {
				BufferedImage awtimage = renderInfo.getImage().getAwtImage();
				if (awtimage != null) {
					ImageIO.write(awtimage, "png", new FileOutputStream(fullExportFileNameWithoutExtension + ".png"));
				} // end if
			} // end if..else
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see com.itextpdf.text.pdf.parser.RenderListener#renderText(com.itextpdf.text.pdf.parser.TextRenderInfo)
	 */
	public void renderText(TextRenderInfo renderInfo) {
	}
	
	/**
	 * This method allows to set the page number for the currently 
	 * processed page. Only when another parser supports it, this
	 * method will be called
	 * with the correct page number.
	 * 
	 * @param pageNumber The page number to set.
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	/**
	 * This method will return the page number for the currently
	 * processed page. It is only set when another parser supports it.
	 * 
	 * @return The stored page number (is -1 if not set or unknown).
	 */
	public int getPageNumber() {
		return pageNumber;
	}
}
