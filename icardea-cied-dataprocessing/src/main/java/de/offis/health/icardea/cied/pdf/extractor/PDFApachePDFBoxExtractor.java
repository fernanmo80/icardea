/**
 * 
 */
package de.offis.health.icardea.cied.pdf.extractor;

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

import org.apache.log4j.Logger;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDXObjectImage;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode;
import org.apache.pdfbox.util.PDFTextStripper;

import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * <p>
 * This class allows opening a PDF file and can extract information from
 * it using the Apache PDFBox library (PDFTextStripper and required classes for
 * image extraction).
 * <p>
 * <p>
 * <b>Note:</b> The PDFBox library is published under the less problematic
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">Apache License v2.0</a>.
 * </p>
 * @see <a href="http://pdfbox.apache.org/">Apache PDFBox (Java PDF library) - Website</a>
 * 
 *
 */
public class PDFApachePDFBoxExtractor extends AbstractPDFExtractor implements PDFExtractor {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(PDFApachePDFBoxExtractor.class);
	
	/**
	 * Decimal formatter for PDF pages. The number should be always 3-digits
	 * long.
	 */
	private static java.text.DecimalFormat pageNumberFormat = new java.text.DecimalFormat("000");
	
	/**
	 * The full PDF file path.
	 */
	private String fullPDFFilePath = null;
	
	/**
	 * The full PDF directory path with ending file separator.
	 */
	private String fullPDFDirectoryPath = null;
	
	/**
	 * PDF document
	 */
	private PDDocument pdfDocument = null;
	
	/**
	 * PDF text bookmark entries in a List
	 */
	@SuppressWarnings("unchecked")
	private List bookmarkTextList = null;
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#exportAllImagesToFileSystem(String)
	 */
	public void exportAllImagesToFileSystem(String fullExportDirectoryPath) throws IOException, Exception {
		imageExtractor(fullExportDirectoryPath);
		return;
	}
	
	/**
	 * <p>
	 * This method searches for all image objects from the currently processed
	 * PDF file and stores them using the correct extension in the given export
	 * directory or in the same directory where the original PDF file is stored.
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
	@SuppressWarnings("unchecked")
	private void imageExtractor(String fullExportDirectoryPath) throws Exception {
		if (fullExportDirectoryPath != null) {
			fullExportDirectoryPath = GlobalTools.checkDirectoryPath(fullExportDirectoryPath);
			File exportDirectory = new File(fullExportDirectoryPath);
			if (!exportDirectory.exists()) {
				exportDirectory.mkdirs();
			} // end if
		} // end if
		
		String baseExportDirectoryPath = fullExportDirectoryPath!=null?fullExportDirectoryPath:this.fullPDFDirectoryPath;
		String baseFileNameWithoutExtension = GlobalTools.getFileNameWithoutExtension(this.fullPDFFilePath);
		
		if (pdfDocument != null) {
			List<PDPage> pages = pdfDocument.getDocumentCatalog().getAllPages();
			Iterator<PDPage> iterator = pages.iterator();
			int currentPage = 0;
			int imageCounter = 0;
			
			while(iterator.hasNext()) {
				currentPage++;
				
				PDPage page = iterator.next();
				PDResources resources = page.getResources();
				Map imageMap = resources.getImages();
				if (imageMap != null) {
					Iterator imageIterator = imageMap.keySet().iterator();
					while (imageIterator.hasNext()) {
						imageCounter++;
						
						String key = (String)imageIterator.next();
						PDXObjectImage pdfObjectImage = (PDXObjectImage)imageMap.get(key);
						String imageName = key;
						String fullExportFileNameWithoutExtension = baseExportDirectoryPath + baseFileNameWithoutExtension + "_(" + ((currentPage)>0?"p"+pageNumberFormat.format((currentPage)):"p"+pageNumberFormat.format(0)) + "_ref" + REF_NUMBER_FORMAT.format(imageCounter) + (imageName==null?"_unk":"_" + imageName) + ")";
						
						logger.debug("Writing image as: " + fullExportFileNameWithoutExtension + "." + pdfObjectImage.getSuffix());
						
						/*
						 * The write2file method will automatically append the extension.
						 */
//						pdfObjectImage.write2file(fullExportFileNameWithoutExtension + "." + pdfObjectImage.getSuffix());
						pdfObjectImage.write2file(fullExportFileNameWithoutExtension);
					} // end while
				} // end if
			} // end while
			
		} else {
			// TODO: Add own exception.
			throw new Exception("There is no open PDF to work with.");
		}
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
	@SuppressWarnings("unchecked")
	public byte[] getPDFPages(int fromPageNumber, int toPageNumber) {
		ByteArrayOutputStream byteArrayOutputStream = null;
		boolean extractionSuccessful = false;
		
		if (pdfDocument != null) {
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
				
				/*
				 * Now extract the pages
				 * 
				 * NOTE
				 * ====
				 * Since Apache PDFBox v1.5.0 there exists the class
				 * org.apache.pdfbox.util.PageExtractor
				 */
				
				/*
				boolean isApachePageExtractorAvailable = false;
				Class<?> pageExtractorClass = null;
				try {
					pageExtractorClass = getClass().getClassLoader().loadClass("org.apache.pdfbox.util.PageExtractor");
					Constructor<?> pdfExtractConstructor = pageExtractorClass.getConstructor(PDDocument.class, int.class, int.class);
					Method pdfExtractMethod = pageExtractorClass.getMethod("extract");
					isApachePageExtractorAvailable = true;
				} catch (ClassNotFoundException ex) {
				} catch (SecurityException ex) {
				} catch (NoSuchMethodException ex) {
				}
				*/
				
				try {
					PDDocument extractedDocumentPages = new PDDocument();
					extractedDocumentPages.setDocumentInformation(this.pdfDocument.getDocumentInformation());
					extractedDocumentPages.getDocumentCatalog().setViewerPreferences(
							this.pdfDocument.getDocumentCatalog().getViewerPreferences());
					
					List<PDPage> pages = (List<PDPage>)this.pdfDocument.getDocumentCatalog().getAllPages();
					int pageCounter = 1;
					for(PDPage page : pages) {
						if(pageCounter >= fromPageNumber && pageCounter <= toPageNumber) {
							PDPage importedPdfPage;
							importedPdfPage = extractedDocumentPages.importPage(page);
							importedPdfPage.setCropBox(page.findCropBox());
							importedPdfPage.setMediaBox(page.findMediaBox());
							importedPdfPage.setResources(page.findResources());
							importedPdfPage.setRotation(page.findRotation());
						}
						pageCounter++;
					} // end for
					
					byteArrayOutputStream = new ByteArrayOutputStream();
					extractedDocumentPages.save(byteArrayOutputStream);
					extractedDocumentPages.close();
					extractionSuccessful = true;
				} catch (COSVisitorException ex) {
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
		} // end if (pdfDocument != null)
		
		if (byteArrayOutputStream != null) {
			return byteArrayOutputStream.toByteArray();
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getNumberOfPages()
	 */
	public int getNumberOfPages() {
		int numberOfPages = -1;
		if (pdfDocument != null) {
			numberOfPages = pdfDocument.getNumberOfPages();
		}
		return numberOfPages;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getText()
	 */
	public String getText(int pageNumber) throws IOException, Exception {
		String returnValue = null;
		
		if (pdfDocument != null) {
			int numberOfPages = getNumberOfPages();
			
			if (pageNumber > 0 && pageNumber <= numberOfPages) {
				PDFTextStripper pdfTextStripper = new PDFTextStripper();
				pdfTextStripper.setStartPage(pageNumber);
				pdfTextStripper.setEndPage(pageNumber);
				pdfTextStripper.getText(pdfDocument);
				String extractedText = pdfTextStripper.getText(pdfDocument);
				if (extractedText != null && extractedText.trim().length() > 0) {
					returnValue = PAGE_START_MARKER + extractedText;
				} // end if
			} else {
				// TODO: Add own exception.
				throw new Exception("The given page number (" + pageNumber + ") is not in the range of valid pages (1.." + numberOfPages + ").");
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
		
		if (pdfDocument != null) {
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
			pdfDocument = PDDocument.load(pdfFile.getAbsolutePath());
			
			logger.debug("PDF contains pages: " + pdfDocument.getNumberOfPages());
			
			// Remove reference to the file object as it is no longer needed (cleanup)
			pdfFile = null;
			
			returnCode = true;
		} else {
			throw new Exception("The given PDF file is not a file or not readable (check permissions).");
		} // end if..else
		return returnCode;
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
		
		int numberOfPages = pdfDocument.getNumberOfPages();
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
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getBookmarkContentAsText()
	 */
	@SuppressWarnings("unchecked")
	public List getBookmarkTitlesAsText() {
		if (pdfDocument != null) {
			// Check only *not* encrypted files
			if (!pdfDocument.isEncrypted()) {
				PDDocumentOutline pdDocumentOutline = pdfDocument.getDocumentCatalog().getDocumentOutline();
				if (pdDocumentOutline != null) {
					/*
					 * If it doesn't exist create the List and populate it,
					 * otherwise just return the already existing List.
					 */
					if (bookmarkTextList == null) {
						bookmarkTextList = new ArrayList<String>();
						
						// Populate the List
						populateBookmarkTextList(pdDocumentOutline, "");
					} // end if
				} // end if
			} // end if
		} // end if
		
		return bookmarkTextList;
	}
	
	/**
	 * This method will populate the text bookmark list.
	 * 
	 * @param pdOutlineNode The node element for the bookmark item.
	 * @param indentionString The base indention string to be used.
	 */
	@SuppressWarnings("unchecked")
	private void populateBookmarkTextList(PDOutlineNode pdOutlineNode, String indentionString) {
		PDOutlineItem currentOutlineItem = pdOutlineNode.getFirstChild();
		while (currentOutlineItem != null) {
			bookmarkTextList.add(indentionString + currentOutlineItem.getTitle());
			logger.trace(indentionString + currentOutlineItem.getTitle());
			
			/*
			 * Recursive call to fill List
			 */
			populateBookmarkTextList(currentOutlineItem, indentionString + bookmarkIndentionString());
			
			/*
			 * Get next outline item
			 */
			currentOutlineItem = currentOutlineItem.getNextSibling();
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
		if (pdfDocument != null) {
			PDDocumentInformation pdfInfo = pdfDocument.getDocumentInformation();
			
			// Title
			if (pdfInfo.getTitle() != null) {
				stringBuffer.append("Title");
				stringBuffer.append("=");
				stringBuffer.append(pdfInfo.getTitle());
				stringBuffer.append(GlobalTools.LINESEPARATOR);
			} // end if
			
			// Subject
			if (pdfInfo.getSubject() != null) {
				stringBuffer.append("Subject");
				stringBuffer.append("=");
				stringBuffer.append(pdfInfo.getSubject());
				stringBuffer.append(GlobalTools.LINESEPARATOR);
			} // end if
			
			// Keywords
			if (pdfInfo.getKeywords() != null) {
				stringBuffer.append("Keywords");
				stringBuffer.append("=");
				stringBuffer.append(pdfInfo.getKeywords());
				stringBuffer.append(GlobalTools.LINESEPARATOR);
			} // end if
			
			// Author
			if (pdfInfo.getAuthor() != null) {
				stringBuffer.append("Author");
				stringBuffer.append("=");
				stringBuffer.append(pdfInfo.getAuthor());
				stringBuffer.append(GlobalTools.LINESEPARATOR);
			} // end if
			
			// Producer
			if (pdfInfo.getProducer() != null) {
				stringBuffer.append("Producer");
				stringBuffer.append("=");
				stringBuffer.append(pdfInfo.getProducer());
				stringBuffer.append(GlobalTools.LINESEPARATOR);
			} // end if
			
			// Creator
			if (pdfInfo.getCreator() != null) {
				stringBuffer.append("Creator");
				stringBuffer.append("=");
				stringBuffer.append(pdfInfo.getCreator());
				stringBuffer.append(GlobalTools.LINESEPARATOR);
			} // end if
			
			// CreationDate
			try {
				if (pdfInfo.getCreationDate() != null) {
					stringBuffer.append("CreationDate");
					stringBuffer.append("=");
					stringBuffer.append(GlobalTools.calendar2String(
							pdfInfo.getCreationDate(),
							GlobalTools.DATE_FORMAT_STRING_ISO8601) );
					stringBuffer.append(GlobalTools.LINESEPARATOR);
				} // end if
			} catch (IOException ex) {} // end try..catch
			
			// ModDate
			try {
				if (pdfInfo.getModificationDate() != null) {
					stringBuffer.append("ModDate");
					stringBuffer.append("=");
					stringBuffer.append(GlobalTools.calendar2String(
							pdfInfo.getModificationDate(),
							GlobalTools.DATE_FORMAT_STRING_ISO8601) );
					stringBuffer.append(GlobalTools.LINESEPARATOR);
				} // end if
			} catch (IOException ex) {} // end try..catch
		} // end if
		
		return stringBuffer.toString();
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getAuthor()
	 */
	public String getAuthor() {
		String author = null;
		if (pdfDocument != null) {
			author = pdfDocument.getDocumentInformation().getAuthor();
		} // end if
		
		return author;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getCreationDate()
	 */
	public String getCreationDate() {
		String creationDateString = null;
		if (pdfDocument != null) {
			try {
				creationDateString = GlobalTools.calendar2String(
					pdfDocument.getDocumentInformation().getCreationDate(),
					GlobalTools.DATE_FORMAT_STRING_ISO8601);
			} catch (IOException ex) {}
		} // end if
		
		return creationDateString;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getCreator()
	 */
	public String getCreator() {
		String creator = null;
		if (pdfDocument != null) {
			creator = pdfDocument.getDocumentInformation().getCreator();
		} // end if
		
		return creator;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getKeywords()
	 */
	public String getKeywords() {
		String keywords = null;
		if (pdfDocument != null) {
			keywords = pdfDocument.getDocumentInformation().getKeywords();
		} // end if
		
		return keywords;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getModificationDate()
	 */
	public String getModificationDate() {
		String modificationDateString = null;
		if (pdfDocument != null) {
			try {
				modificationDateString = GlobalTools.calendar2String(
					pdfDocument.getDocumentInformation().getModificationDate(),
						GlobalTools.DATE_FORMAT_STRING_ISO8601);
			} catch (IOException ex) {}
		} // end if
		
		return modificationDateString;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getProducer()
	 */
	public String getProducer() {
		String producer = null;
		if (pdfDocument != null) {
			producer = pdfDocument.getDocumentInformation().getProducer();
		} // end if
		
		return producer;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getSubject()
	 */
	public String getSubject() {
		String subject = null;
		if (pdfDocument != null) {
			subject = pdfDocument.getDocumentInformation().getSubject();
		} // end if
		
		return subject;
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#getTitle()
	 */
	public String getTitle() {
		String title = null;
		if (pdfDocument != null) {
			title = pdfDocument.getDocumentInformation().getTitle();
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
		
		if (this.pdfDocument != null) {
			try {
				this.pdfDocument.close();
			} catch (IOException ex) {
				logger.warn("Exception caught while trying to close the PDF document. " +
					"Additional details: " + GlobalTools.getExceptionTraceLog(ex));
			} finally {
				this.pdfDocument = null;
			}
		}
		System.gc();
		return;
	}
}