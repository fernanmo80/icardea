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

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSmartCopy;
import com.itextpdf.text.pdf.PdfString;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * <p>
 * This class allows opening a PDF file and can extract information from
 * it using the iText v5+ library (PdfReaderContentParser and PdfTextExtractor).
 * </p>
 * <p>
 * <b>Note:</b> This library is using the GNU AGPL license so it is only an 
 * <i>optional</i> and currently experimental package due to the problems
 * with the nature of the <a href="http://itextpdf.com/terms-of-use/index.php?page=AGPL">Affero
 * General Public License (AGPL)</a>.
 * <br />
 * <b>In other word this class is currently not used due to licensing issues.</b>
 * </p>
 * 
 * @see <a href="http://itextpdf.com/">iText (Java PDF library) - Website</a>
 * 
 *
 */
public class PDFiText5Extractor extends AbstractPDFExtractor implements PDFExtractor {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(PDFiText5Extractor.class);
	
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
		imageExtractor(fullExportDirectoryPath);
		return;
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
				TextExtractionStrategy strategy;
				PdfReaderContentParser parser = new PdfReaderContentParser(pdfReader);
				strategy = parser.processContent(pageNumber, new SimpleTextExtractionStrategy());
				
				if (strategy != null && strategy.getResultantText().trim().length() > 0) {
					returnValue = PAGE_START_MARKER + strategy.getResultantText();
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
		
		PDFiText5PageReaderContentParser contentParser = new PDFiText5PageReaderContentParser(pdfReader);
		PDFiText5ImageRenderListener imageRenderListener = new PDFiText5ImageRenderListener(baseExportDirectoryPath, baseFileNameWithoutExtension);
		for (int i = 1; i <= pdfReader.getNumberOfPages(); i++) {
			contentParser.processContent(i, imageRenderListener);
		} // end for
	}
	
	/* (non-Javadoc)
	 * @see de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor#exportAllPagesAsTextToFileSystem(java.lang.String)
	 */
	public void exportAllPagesAsTextToFileSystem(String fullExportDirectoryPath) throws Exception {
		textExtractor(fullExportDirectoryPath);
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
			logger.debug("Full export filename with extension: " + fullExportFileNameWithExtension);
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