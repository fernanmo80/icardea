/**
 * 
 */
package de.offis.health.icardea.cied.pdf.extractor;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfDictionary;
import com.lowagie.text.pdf.PdfSmartCopy;
import com.lowagie.text.pdf.PdfString;
import com.lowagie.text.pdf.PRStream;
import com.lowagie.text.pdf.PdfName;
import com.lowagie.text.pdf.PdfObject;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStream;
import com.lowagie.text.pdf.parser.PdfTextExtractor;

import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.cied.tools.ImageProcessingTools;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * <p>
 * This class allows opening a PDF file and can extract information from
 * it using the unofficial iText v4.2.0 library (LGPL v2/MPL 1.1 versions).
 * </p>
 * <p>
 * <b>Note:</b> This older iText library is published under the less problematic
 * <a href="http://www.gnu.org/licences/lgpl.html">GNU Lesser General Public
 * License (GNU LGPL) v2 (1991)</a> and
 * <a href="http://www.mozilla.org/MPL/">Mozilla Public License (MPL) 1.1</a>
 * license types.
 * </p>
 * @see <a href="http://www.freshports.org/devel/itext/">iText v4.2.0 (free PDF library) - from FreeBSD.org</a>
 * 
 *
 */
public class PDFiText4Extractor extends AbstractPDFExtractor implements PDFExtractor {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(PDFiText4Extractor.class);
	
	/**
	 * The full PDF file path.
	 */
	private String fullPDFFilePath = null;
	
	/**
	 * The full PDF directory path with ending file separator.
	 */
	private String fullPDFDirectoryPath = null;
	
	/**
	 * PDF reader
	 */
	private PdfReader pdfReader = null;
	
	/**
	 * PDF text bookmark entries in a List
	 */
	@SuppressWarnings("unchecked")
	private List bookmarkTextList = null;
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#exportAllImagesToFileSystem(String)
	 */
	public void exportAllImagesToFileSystem(String fullExportDirectoryPath) throws IOException, Exception {
		/*
		 * Basic iText image extraction (should also work with older versions (non GPL)
		 */
		imageExtractor(fullExportDirectoryPath);
		return;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#exportAllPagesAsTextToFileSystem(java.lang.String)
	 */
	public void exportAllPagesAsTextToFileSystem(String fullExportDirectoryPath) throws Exception {
		textExtractor(fullExportDirectoryPath);
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getPage(int)
	 */
	public Object getPage(int pageNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getPDFPage(int)
	 */
	public byte[] getPDFPage(int pageNumber) {
		return getPDFPages(pageNumber, pageNumber);
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getPDFPages(int, int)
	 */
	public byte[] getPDFPages(int fromPageNumber, int toPageNumber) {
		ByteArrayOutputStream byteArrayOutputStream = null;
		boolean extractionSuccessful = false;
		
		if (pdfReader != null) {
			int numberOfPages = getNumberOfPages();
			
			/*
			 * Check if the given page numbers are in the allowed range.
			 */
			if (fromPageNumber > 0 && fromPageNumber <= numberOfPages &&
				toPageNumber > 0 && toPageNumber <= numberOfPages) {
				/*
				 * Now check if the given fromPageNumber is smaller
				 * as the given toPageNumber. If not swap the numbers.
				 */
				if (fromPageNumber > toPageNumber) {
					int tmpPageNumber = toPageNumber;
					toPageNumber = fromPageNumber;
					fromPageNumber = tmpPageNumber;
				}
				
				Document newDocument = new Document();
				
				try {
					byteArrayOutputStream = new ByteArrayOutputStream();
					PdfSmartCopy pdfCopy = new PdfSmartCopy(newDocument, byteArrayOutputStream);
					newDocument.open();
					for (int currentPage = fromPageNumber; currentPage <= toPageNumber; currentPage++) {
						pdfCopy.addPage(pdfCopy.getImportedPage(pdfReader, currentPage));
					} // end for
					pdfCopy.flush();
					pdfCopy.close();
					newDocument.close();
					extractionSuccessful = true;
				} catch (DocumentException ex) {
					// TODO: Create an own exception for PDF processing errors.
					logger.error("An exception occurred while extracting " +
							"pages from the input PDF file.", ex);
				} catch (IOException ex) {
					// TODO: Create an own exception for PDF processing errors.
					logger.error("An exception occurred while extracting " +
							"pages from the input PDF file.", ex);
				} finally {
					if (!extractionSuccessful) {
						byteArrayOutputStream = null;
					}
				} // end try..catch..finally
			} // end if checking range of given pages
		} // end if (pdfReader != null)
		
		if (byteArrayOutputStream != null) {
			return byteArrayOutputStream.toByteArray();
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getText()
	 */
	public String getText(int pageNumber) throws IOException, Exception {
		String returnValue = null;
		
		if (pdfReader != null) {
			int numberOfPages = getNumberOfPages();
			
			if (pageNumber > 0 && pageNumber <= numberOfPages) {
				PdfTextExtractor pdfTextExtractor = new PdfTextExtractor(pdfReader);
				String extractedText = pdfTextExtractor.getTextFromPage(pageNumber);
				if (extractedText != null && extractedText.trim().length() > 0) {
					returnValue = PAGE_START_MARKER + extractedText;
				} // end if
			} else {
				// TODO: Add own exception.
				throw new Exception("The given page number (" + pageNumber + ") " +
						"is not in the range of valid pages (1.." + numberOfPages + ").");
			}// end if..else
		} else {
			// TODO: Add own exception.
			throw new Exception("There is no open PDF to work with.");
		} // end if..else
		return returnValue;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getText()
	 */
	public String getText() throws Exception {
		String returnValue = null;
		StringBuffer stringBuffer = null;
		String pageText = null;
		
		if (pdfReader != null) {
			int numberOfPages = getNumberOfPages();
			stringBuffer = new StringBuffer();
			
			// Try to extract text from each page and fill stringBuffer
			for (int currentPage = 1; currentPage <= numberOfPages; currentPage++) {
				pageText = getText(currentPage);
				if (pageText != null) {
					stringBuffer.append(pageText);
				} else {
					logger.debug("The call of getText(" + currentPage + ") returned: null");
				}// end if..else
			} // end for
			
			if (stringBuffer.length() > 0) {
				returnValue = stringBuffer.toString();
			}
		} else {
			// TODO: Add own exception.
			throw new Exception("There is no open PDF to work with.");
		} // end if..else
		
		return returnValue;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#openDocument()
	 */
	public boolean openDocument(String fullPDFFilePath) throws IOException, Exception {
		boolean returnCode = false;
		
		if (fullPDFFilePath == null) {
			throw new Exception("There is no full path to a file given.");
		} // end if
		
		File pdfFile = new File(fullPDFFilePath);
		if (pdfFile.isFile() && pdfFile.canRead()) {
			this.fullPDFFilePath = pdfFile.getAbsolutePath();
			this.fullPDFDirectoryPath = pdfFile.getPath();
			
			logger.debug("FilePath.....: " + this.fullPDFFilePath);
			logger.debug("DirectoryPath: " + this.fullPDFDirectoryPath);
			
			// Open the PDF file
			pdfReader = new PdfReader(pdfFile.getAbsolutePath());
			
			logger.debug("PDF contains pages: " + pdfReader.getNumberOfPages());
			
			// Remove reference to the file object as it is no longer needed (cleanup)
			pdfFile = null;
			
			returnCode = true;
		} else {
			throw new Exception("The given PDF file is not a file or not readable (check permissions).");
		} // end if..else
		return returnCode;
	}
	
	/**
	 * <p>
	 * This method searches for all image objects from the currently processed
	 * PDF file and stores them as PDF in the given export directory or in the
	 * same directory where the original PDF file is stored.
	 * </p>
	 * <p>
	 * The filename of the images is build based on the original PDF filename
	 * (without extension) and additional details like page number, image
	 * number and if available the internal image name.
	 * </p>
	 * @param fullExportDirectoryPath The optional full export path where the images
	 * should be stored. If not given, the location of the original PDF file is used.
	 * @throws Exception
	 */
	private void imageExtractor(String fullExportDirectoryPath) throws Exception {
		if (fullExportDirectoryPath != null) {
			fullExportDirectoryPath = GlobalTools.checkDirectoryPath(fullExportDirectoryPath);
			File exportDirectory = new File(fullExportDirectoryPath);
			if (!exportDirectory.exists()) {
				exportDirectory.mkdirs();
			} // end if
		} // end if
		
		int totalNumberOfPDFObjects = pdfReader.getXrefSize();
		for (int pdfObjectCounter = 0; pdfObjectCounter < totalNumberOfPDFObjects; pdfObjectCounter++) {
			PdfObject pdfObject = pdfReader.getPdfObject(pdfObjectCounter);
			if (pdfObject != null) {
				if (pdfObject.isStream()) {
					PdfStream pdfStream = (PdfStream) pdfObject;
					PdfObject pdfObjectSubType = pdfStream.get(PdfName.SUBTYPE);
					
					if (pdfObject == null) {
						logger.debug("The internal PDF object is null.");
					} // end if
					
					if (!pdfObject.isStream()) {
						logger.debug("The internal PDF object is not representing a stream object.");
					} // end if
					
					// Check PDF subtype and make sure it's an Image type
					if (pdfObjectSubType != null && pdfObjectSubType.toString().equals(PdfName.IMAGE.toString())) {
						// Now we have a PDF stream object with an image but what is that exactly?
						//byte[] byteArrayImage = PdfReader.getStreamBytesRaw((PRStream) pdfStream);
						byte[] byteArrayImage = null;
						if (PdfName.FLATEDECODE.equals(pdfStream.getAsName(PdfName.FILTER))) {
							byteArrayImage = PdfReader.getStreamBytes((PRStream) pdfStream);
						// else if other filter (not supported yet)
						} else {
							byteArrayImage = PdfReader.getStreamBytesRaw((PRStream) pdfStream);
						} // end if..else
						
						
						// Test PdfImage - START
						/*
						PdfImage pdfImage = (PdfImage) ((PdfStream)((PRStream)pdfStream));
						logger.trace("pdfImage --> pdfName --> Width...........: " + pdfStream.get(PdfName.WIDTH));
						logger.trace("pdfImage --> pdfName --> Height..........: " + pdfStream.get(PdfName.HEIGHT));
						logger.trace("pdfImage --> pdfName --> Id..............: " + pdfImage.get(PdfName.ID));
						logger.trace("pdfImage --> pdfName --> Image...........: " + pdfImage.get(PdfName.IMAGE));
						logger.trace("pdfImage --> pdfName --> ImageB..........: " + pdfImage.get(PdfName.IMAGEB));
						logger.trace("pdfImage --> pdfName --> ImageC..........: " + pdfImage.get(PdfName.IMAGEC));
						logger.trace("pdfImage --> pdfName --> ImageI..........: " + pdfImage.get(PdfName.IMAGEI));
						logger.trace("pdfImage --> pdfName --> Imagemask.......: " + pdfImage.get(PdfName.IMAGEMASK));
						logger.trace("pdfImage --> pdfName --> Info............: " + pdfImage.get(PdfName.INFO));
						logger.trace("pdfImage --> pdfName --> Name............: " + pdfImage.get(PdfName.NAME));
						logger.trace("pdfImage --> pdfName --> Named...........: " + pdfImage.get(PdfName.NAMED));
						logger.trace("pdfImage --> pdfName --> Page............: " + pdfStream.get(PdfName.PAGE));
						*/
						// Test PdfImage - STOP
						
						
						
						
						// STREAM
						/*
						logger.trace("pdfObject.toString()): " + pdfObject.toString());
						logger.trace("pdfObjectCounter.................: " + pdfObjectCounter);
						logger.trace("pdfObject.getIndRef().getNumber(): " + (pdfObject.getIndRef()!=null?pdfObject.getIndRef().toString():"null"));
						logger.trace("pdfStream.getIndRef().getNumber(): " + (pdfStream.getIndRef()!=null?pdfStream.getIndRef().toString():"null"));
						logger.trace("pdfStream --> pdfName --> toString........: " + pdfStream.toString());
						logger.trace("pdfStream --> pdfName --> Width...........: " + pdfStream.get(PdfName.WIDTH));
						logger.trace("pdfStream --> pdfName --> Height..........: " + pdfStream.get(PdfName.HEIGHT));
						logger.trace("pdfStream --> pdfName --> BitsPerComponent: " + pdfStream.get(PdfName.BITSPERCOMPONENT));
						logger.trace("pdfStream --> pdfName --> BitsPerSample...: " + pdfStream.get(PdfName.BITSPERSAMPLE));
						logger.trace("pdfStream --> pdfName --> ColorSpace......: " + pdfStream.get(PdfName.COLORSPACE));
						logger.trace("pdfStream --> pdfName --> CCITTFaxDecode..: " + pdfStream.get(PdfName.CCITTFAXDECODE));
						logger.trace("pdfStream --> pdfName --> Document........: " + pdfStream.get(PdfName.DOCUMENT));
						logger.trace("pdfStream --> pdfName --> Decode..........: " + pdfStream.get(PdfName.DECODE));
						logger.trace("pdfStream --> pdfName --> DecodeParms.....: " + pdfStream.get(PdfName.DECODEPARMS));
						logger.trace("pdfStream --> pdfName --> DeviceGray......: " + pdfStream.get(PdfName.DEVICEGRAY));
						logger.trace("pdfStream --> pdfName --> DeviceCMYK......: " + pdfStream.get(PdfName.DEVICECMYK));
						logger.trace("pdfStream --> pdfName --> DeviceRGB.......: " + pdfStream.get(PdfName.DEVICERGB));
						logger.trace("pdfStream --> pdfName --> Filter..........: " + pdfStream.get(PdfName.FILTER));
						logger.trace("pdfStream --> pdfName --> Filter - as name: " + pdfStream.getAsName(PdfName.FILTER));
						
						logger.trace("pdfStream --> pdfName --> Id..............: " + pdfStream.get(PdfName.ID));
						logger.trace("pdfStream --> pdfName --> Image...........: " + pdfStream.get(PdfName.IMAGE));
						logger.trace("pdfStream --> pdfName --> ImageB..........: " + pdfStream.get(PdfName.IMAGEB));
						logger.trace("pdfStream --> pdfName --> ImageC..........: " + pdfStream.get(PdfName.IMAGEC));
						logger.trace("pdfStream --> pdfName --> ImageI..........: " + pdfStream.get(PdfName.IMAGEI));
						logger.trace("pdfStream --> pdfName --> Imagemask.......: " + pdfStream.get(PdfName.IMAGEMASK));
						logger.trace("pdfStream --> pdfName --> Info............: " + pdfStream.get(PdfName.INFO));
						logger.trace("pdfStream --> pdfName --> Name............: " + pdfStream.get(PdfName.NAME));
						logger.trace("pdfStream --> pdfName --> Named...........: " + pdfStream.get(PdfName.NAMED));
						logger.trace("pdfStream --> pdfName --> Named - as name.: " + pdfStream.getAsName(PdfName.NAMED));
						
						logger.trace("pdfStream --> pdfName --> Page............: " + pdfStream.get(PdfName.PAGE));
						logger.trace("pdfStream --> pdfName --> PageElement.....: " + pdfStream.get(PdfName.PAGEELEMENT));
						logger.trace("pdfStream --> pdfName --> Pdf.............: " + pdfStream.get(PdfName.PDF));
						logger.trace("pdfStream --> pdfName --> PdfDocEncoding..: " + pdfStream.get(PdfName.PDFDOCENCODING));
						logger.trace("pdfStream --> pdfName --> Position........: " + pdfStream.get(PdfName.POSITION));
						logger.trace("pdfStream --> pdfName --> Producer........: " + pdfStream.get(PdfName.PRODUCER));
						logger.trace("pdfStream --> pdfName --> Properties......: " + pdfStream.get(PdfName.PROPERTIES));
						logger.trace("pdfStream --> pdfName --> Sect............: " + pdfStream.get(PdfName.SECT));
						logger.trace("pdfStream --> pdfName --> SubType.........: " + pdfStream.get(PdfName.SUBTYPE));
						logger.trace("pdfStream --> pdfName --> Supplement......: " + pdfStream.get(PdfName.SUPPLEMENT));
						logger.trace("pdfStream --> pdfName --> Title...........: " + pdfStream.get(PdfName.TITLE));
						*/
						// logger.trace("pdfImage --> pdfName --> : " + (pdfName.).toString());
						
						// Extract the image name
						String streamImageName = (pdfStream.get(PdfName.NAME)==null?null:pdfStream.get(PdfName.NAME).toString());
						if (streamImageName != null && streamImageName.length() > 1 && streamImageName.startsWith("/")) {
							streamImageName = streamImageName.substring(1);
						} else {
							streamImageName = null;
						} // end if..else
						
						String exportFileWithoutExtension = (fullExportDirectoryPath!=null?fullExportDirectoryPath:this.fullPDFDirectoryPath)+GlobalTools.getFileNameWithoutExtension(this.fullPDFFilePath) + "_(" + "p000" + "_ref" + REF_NUMBER_FORMAT.format(pdfObjectCounter) + (streamImageName==null?"_unk":"_" + streamImageName) + ")"; 
						
						// Test
						FileOutputStream fileOutputStream = new FileOutputStream(exportFileWithoutExtension + ".jpg");
						
						/*
						 * Write given byte array to a file.
						 */
						fileOutputStream.write(byteArrayImage);
						fileOutputStream.flush();
						fileOutputStream.close();
						fileOutputStream = null;
						
						/* 
						 * Check image details
						 */
						int pdfImageBitsPerComponent = -1;
						try {
							if (pdfStream.get(PdfName.BITSPERCOMPONENT).isNumber()) {
								pdfImageBitsPerComponent = new Integer(pdfStream.get(PdfName.BITSPERCOMPONENT).toString()).intValue();
							}
						} catch (NumberFormatException ex) {}
						
						int pdfImageHeight = -1;
						try {
							if (pdfStream.get(PdfName.HEIGHT).isNumber()) {
								pdfImageHeight = new Integer(pdfStream.get(PdfName.HEIGHT).toString()).intValue();
							}
						} catch (NumberFormatException ex) {}
						
						int pdfImageWidth  = -1;
						try {
							if (pdfStream.get(PdfName.WIDTH).isNumber()) {
								pdfImageWidth = new Integer(pdfStream.get(PdfName.WIDTH).toString()).intValue();
							}
						} catch (NumberFormatException ex) {}
						
						logger.debug("Height..........:" + pdfImageHeight);
						logger.debug("Width...........:" + pdfImageWidth);
						logger.debug("BitsPerComponent:" + pdfImageBitsPerComponent);
						
						// or you could try making a java.awt.Image from the array:
						
						if (PdfName.DEVICERGB.equals(pdfStream.get(PdfName.COLORSPACE)) &&
							PdfName.FLATEDECODE.equals(pdfStream.get(PdfName.FILTER)) &&
							pdfImageBitsPerComponent > 0 && pdfImageWidth > 0 && pdfImageHeight > 0) {
							
							BufferedImage bufferedImage = ImageProcessingTools.toBufferedImage(byteArrayImage, pdfImageWidth, pdfImageHeight, pdfImageBitsPerComponent);
							if (bufferedImage != null) {
								ImageIO.write(bufferedImage, "PNG", new FileOutputStream(exportFileWithoutExtension+ "_imageIO" + ".png"));
							} // end if
						} else if (PdfName.DEVICEGRAY.equals(pdfStream.get(PdfName.COLORSPACE)) &&
							PdfName.RUNLENGTHDECODE.equals(pdfStream.get(PdfName.FILTER)) &&
							pdfImageBitsPerComponent > 0 && pdfImageWidth > 0) {
							
							BufferedImage bufferedImage = ImageProcessingTools.toBufferedImage(ImageProcessingTools.runLengthDecode(byteArrayImage), pdfImageWidth, 2233, pdfImageBitsPerComponent);
							if (bufferedImage != null) {
								ImageIO.write(bufferedImage, "PNG", new FileOutputStream(exportFileWithoutExtension+ "_imageIO" + ".png"));
							} // end if
						} // end if...
						
						/*
						Image image = Toolkit.getDefaultToolkit().createImage(imageByteArray);
						
						
						BufferedImage bufferedImage = ImageProcessingTools.toBufferedImage(image, pdfImageWidth, pdfImageHeight);
						if (bufferedImage != null) {
							System.out.println("Image-Height....:" + bufferedImage.getHeight());
							System.out.println("Image-Width.....:" + bufferedImage.getWidth());
							System.out.println("Image-isAlphaP..:" + bufferedImage.isAlphaPremultiplied());
							File pngOutputFile = new File(exportFileWithoutExtension + "_imageIO.jpg");
							ImageIO.write(bufferedImage, "jpg", pngOutputFile);
						}
						*/
						/**/
						
					} // end if
				} // end if 
			} // end if
		} // end for
	}
	
	/**
	 * This method will write the text extracted from the PDF document into
	 * a file with the extension <code>.txt</code>.
	 * 
	 * @param fullExportDirectoryPath The optional full export path where the text file should be stored. If not given, the location of the original PDF file is used.
	 * @throws Exception
	 */
	private void textExtractor(String fullExportDirectoryPath) throws Exception {
		if (fullExportDirectoryPath != null) {
			fullExportDirectoryPath = GlobalTools.checkDirectoryPath(fullExportDirectoryPath);
			File exportDirectory = new File(fullExportDirectoryPath);
			if (!exportDirectory.exists()) {
				exportDirectory.mkdirs();
			} // end if
		} // end if
		
		String baseExportDirectoryPath = fullExportDirectoryPath!=null?fullExportDirectoryPath:this.fullPDFDirectoryPath;
		String baseFileNameWithoutExtension = GlobalTools.getFileNameWithoutExtension(this.fullPDFFilePath);
		
		// Writer object to write files
		Writer out = null;
		StringBuffer stringBuffer = new StringBuffer();
		String pageText = null;
		
		int numberOfPages = pdfReader.getNumberOfPages();
		for (int currentPage = 1; currentPage <= numberOfPages; currentPage++) {
			pageText = getText(currentPage);
			if (pageText != null) {
				stringBuffer.append(pageText);
			} else {
				logger.debug("The call of getText(" + currentPage + ") returned: null");
			}// end if..else
		} // end for
		
		// If we have something to write, open a file to write the content. 
		String fullExportFileNameWithExtension = baseExportDirectoryPath + baseFileNameWithoutExtension + ".txt";
		if (stringBuffer.length() > 0) {
			logger.debug("Full export filename with extension: '" + fullExportFileNameWithExtension + "'");
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fullExportFileNameWithExtension), "UTF8"));
			out.write(stringBuffer.toString());
			out.flush();
			out.close();
		} else {
			logger.debug("Nothing to export to file '" + GlobalTools.getFileNameWithoutFullPath(fullExportFileNameWithExtension) + "'");
		} // end if..else
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getNumberOfPages()
	 */
	public int getNumberOfPages() {
		int numberOfPages = -1;
		if (pdfReader != null) {
			numberOfPages = pdfReader.getNumberOfPages();
		}
		return numberOfPages;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getBookmarkContentAsText()
	 */
	@SuppressWarnings("unchecked")
	public java.util.List getBookmarkTitlesAsText() {
		java.util.List bookmarkContent = null;
		if (pdfReader != null) {
			//bookmarkContent = SimpleBookmark.getBookmark(pdfReader);
			
			PdfDictionary catalog = pdfReader.getCatalog();
			if (catalog != null) {
				PdfObject rootPdfObject = PdfReader.getPdfObjectRelease(catalog.get(PdfName.OUTLINES));
						if (rootPdfObject != null && rootPdfObject.isDictionary()) {
							PdfDictionary rootOutlinesPdfDictionary = (PdfDictionary)rootPdfObject;
							/*
							 * If it doesn't exist create the List and populate it,
							 * otherwise just return the already existing List.
							 */
							if (bookmarkTextList == null) {
								bookmarkTextList = new ArrayList<String>();
								
								// Populate the List
								populateBookmarkTextList(rootOutlinesPdfDictionary, "");
							} // end if
							
						}
			} // end if
		}
		return bookmarkContent;
	}
	
	/**
	 * This method will populate the text bookmark list.
	 * 
	 * @param rootOutlinesPdfDictionary The node element for the bookmark item.
	 * @param indentionString The base indention string to be used.
	 */
	@SuppressWarnings("unchecked")
	private void populateBookmarkTextList(PdfDictionary rootOutlinesPdfDictionary, String indentionString) {
		PdfDictionary outlineItemPdfDictionary = (PdfDictionary)PdfReader.getPdfObjectRelease(rootOutlinesPdfDictionary.get(PdfName.FIRST));
		while (outlineItemPdfDictionary != null) {
			PdfString bookmarkTitle = (PdfString)PdfReader.getPdfObjectRelease(outlineItemPdfDictionary.get(PdfName.TITLE));
			bookmarkTextList.add(indentionString + bookmarkTitle.toUnicodeString());
			logger.trace(indentionString + bookmarkTitle.toUnicodeString());
			
			/*
			 * Recursive call to fill List
			 */
			populateBookmarkTextList(outlineItemPdfDictionary, indentionString + bookmarkIndentionString());
			
			/*
			 * Get next outline item
			 */
			outlineItemPdfDictionary = (PdfDictionary)PdfReader.getPdfObjectRelease(outlineItemPdfDictionary.get(PdfName.NEXT));
		} // end while
	}
	
	/**
	 * This method will return the key and value pairs stored in the PDF
	 * information. It's the basic information like title, subject, author,
	 * creator, keywords, producer (meaning application) as well as creation
	 * and modification date. The method is provided for debugging purposes.
	 * 
	 * @return Returns <code>key=value</code> pair line by line (using system
	 * dependent newline).
	 */
	@SuppressWarnings("unused")
	private String getPdfInfo() {
		StringBuffer stringBuffer = new StringBuffer();
		if (pdfReader != null) {
			Map<?, ?> info = pdfReader.getInfo();
			String key;
			String value;
			Iterator<?> iterator = info.keySet().iterator();
			while (iterator.hasNext()) {
				key = (String) iterator.next();
				value = (String) info.get(key);
				stringBuffer.append(key);
				stringBuffer.append("=");
				stringBuffer.append(value);
				stringBuffer.append(GlobalTools.LINESEPARATOR);
			} // end while
		} // end if
		
		return stringBuffer.toString();
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getAuthor()
	 */
	public String getAuthor() {
		/*
		 * Key = "Author"
		 */
		String author = null;
		if (pdfReader != null) {
			Map<?, ?> info = pdfReader.getInfo();
			author = (String) info.get("Author");
		} // end if
		
		return author;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getCreationDate()
	 */
	public String getCreationDate() {
		/*
		 * Key = "CreationDate"
		 * 
		 * Samples of format (key=value):
		 * CreationDate=D:20100415143436Z
		 * CreationDate=D:20100415174640+02'00'
		 */
		String creationDate = null;
		if (pdfReader != null) {
			Map<?, ?> info = pdfReader.getInfo();
			// TODO: Fix the format of the date to ISO8601 timestamp
			creationDate = (String) info.get("CreationDate");
		} // end if
		
		return creationDate;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getCreator()
	 */
	public String getCreator() {
		/*
		 * Key = "Creator"
		 */
		String creator = null;
		if (pdfReader != null) {
			Map<?, ?> info = pdfReader.getInfo();
			creator = (String) info.get("Creator");
		} // end if
		
		return creator;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getKeywords()
	 */
	public String getKeywords() {
		/*
		 * Key = "Keywords"
		 */
		String keywords = null;
		if (pdfReader != null) {
			Map<?, ?> info = pdfReader.getInfo();
			keywords = (String) info.get("Keywords");
		} // end if
		
		return keywords;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getModificationDate()
	 */
	public String getModificationDate() {
		/*
		 * Key = "ModDate"
		 * 
		 * Samples of format (key=value):
		 * ModDate=D:20100415143436Z
		 * ModDate=D:20100415174640+02'00'
		 */
		String modificationDate = null;
		if (pdfReader != null) {
			Map<?, ?> info = pdfReader.getInfo();
			// TODO: Fix the format of the date to ISO8601 timestamp
			modificationDate = (String) info.get("ModDate");
		} // end if
		
		return modificationDate;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getProducer()
	 */
	public String getProducer() {
		/*
		 * Key = "Producer"
		 * 
		 * Samples of format (key=value):
		 * Producer=iText by lowagie.com (r0.94 - paulo 102)
		 */
		String producer = null;
		if (pdfReader != null) {
			Map<?, ?> info = pdfReader.getInfo();
			producer = (String) info.get("Producer");
		} // end if
		
		return producer;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getSubject()
	 */
	public String getSubject() {
		/*
		 * Key = "Subject"
		 */
		String subject = null;
		if (pdfReader != null) {
			Map<?, ?> info = pdfReader.getInfo();
			subject = (String) info.get("Subject");
		} // end if
		
		return subject;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getTitle()
	 */
	public String getTitle() {
		/*
		 * Key = "Title"
		 */
		String title = null;
		if (pdfReader != null) {
			Map<?, ?> info = pdfReader.getInfo();
			title = (String) info.get("Title");
		} // end if
		
		return title;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#dispose()
	 */
	public void dispose() {
		this.bookmarkTextList = null;
		this.fullPDFDirectoryPath = null;
		this.fullPDFFilePath = null;
		
		if (this.pdfReader != null) {
			this.pdfReader.close();
		}
		System.gc();
		return;
	}
}