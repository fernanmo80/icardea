/**
 * 
 */
package de.offis.health.icardea.cied.pdf.interfaces;

import java.io.IOException;

import de.offis.health.icardea.tools.GlobalTools;

/**
 * This interface defines the basic access methods used in the
 * implemented classes to access a PDF file as well as to search
 * and extract information from it.
 * 
 *
 */
public interface PDFExtractor {
	/**
	 * The page start marker is used as identification where a new page
	 * starts. The string is followed by a system specific line separator.
	 */
	public final static String PAGE_START_MARKER = "###PAGE-START###" + GlobalTools.LINESEPARATOR;
	
	/**
	 * This method will export all images found in the PDF file as PNG to the given export directory
	 * or the location of the processed PDF file.
	 * 
	 * @param fullExportDirectoryPath The optional full path to the export directory.
	 * If empty or null the location of the processed PDF file is used as export directory
	 * @throws IOException
	 * @throws Exception
	 */
	public void exportAllImagesToFileSystem(String fullExportDirectoryPath) throws IOException, Exception;
	
	/**
	 * This method will export the text extracted from the PDF file into a text file in
	 * the given export directory
	 * or the location of the processed PDF file.
	 * 
	 * @param fullExportDirectoryPath The optional full path to the export directory.
	 * If empty or null the location of the processed PDF file is used as export directory
	 * @throws Exception
	 */
	public void exportAllPagesAsTextToFileSystem(String fullExportDirectoryPath) throws Exception;
	
	/**
	 * This method is handling opening the PDF file for further processing.
	 * Before any other method can be called it is required to have opened a
	 * PDF file.
	 * 
	 * @param fullPDFFilePath The (full) path to the PDF file to process.
	 * @return Returns <code>true</code> if the file could be opened, otherwise <code>false</code>.
	 * @throws IOException
	 * @throws Exception
	 */
	public boolean openDocument(String fullPDFFilePath) throws IOException, Exception;
	
	/**
	 * <p>
	 * The method will get the given page object from the PDF file. The file has
	 * to be opened before calling this method.
	 * </p>
	 * <p> 
	 * <b><u>Attention:</u></b> Please note that the page number is 1-based, so
	 * the actual implementation has to make sure that even if the library uses
	 * a 0-based page index, that it expects a 1-based and subtracts 1 from the
	 * given page number internally!
	 * </p>
	 * 
	 * @param pageNumber The page number of the page to return.
	 * (<b><u>Attention:</u></b> The page number is 1-based (page 1...page n)</b>).
	 * @return Returns the given page as object or <code>null</code> when the page
	 * doesn't exist.
	 * @throws Exception
	 */
	public Object getPage(int pageNumber) throws Exception;
	
	/**
	 * <p>
	 * This method will return the requested page from the PDF file if that
	 * page number exists.<br />
	 * The actual implementation will call {@link #getPDFPages(int, int)}
	 * using the given page number for both parameters.
	 * </p> 
	 * 
	 * @param pageNumber The page number of the page to return.
	 * (<b><u>Attention:</u></b> The page number is 1-based (page 1...page n)</b>).
	 * @return Returns the given page as byte array or <code>null</code> when
	 * the page doesn't exist.
	 */
	public byte[] getPDFPage(int pageNumber);
	
	/**
	 * <p>
	 * This method will return the requested pages from the PDF file if those
	 * page numbers exist.
	 * </p> 
	 * 
	 * @param fromPageNumber The lower page number of the pages to return.
	 * (<b><u>Attention:</u></b> The page number is 1-based (page 1...page n)</b>).
	 * @param toPageNumber The upper page number of the pages to return.
	 * (<b><u>Attention:</u></b> The page number is 1-based (page 1...page n)</b>).
	 * @return Returns the given page as byte array or <code>null</code> when
	 * the page doesn't exist.
	 */
	public byte[] getPDFPages(int fromPageNumber, int toPageNumber);
	
	/**
	 * <p>
	 * This method will return the images it found on the given page as ArrayList.
	 * The PDF file has to be opened before calling this method.
	 * </p>
	 * @param Returns a ArrayList containing the images as byte array.
	 * @throws Execption
	 */
	//public ArrayList<byte[]> getImages(int pageNumber) throws Exception;
	
	/**
	 * <p>
	 * The method will extract text from the given page number of the PDF file.
	 * The file has to be opened before calling this method
	 * (see {@link #openDocument(String)}).
	 * </p>
	 * <p> 
	 * <b><u>Attention1:</u></b> Please note that the page number is 1-based, so
	 * the actual implementation has to make sure that even if the library uses
	 * a 0-based page index, that it expects a 1-based and subtracts 1 from the
	 * given page number internally!
	 * </p>
	 * <p> 
	 * <b><u>Attention2:</u></b> Please note that each page where text could be
	 * extracted from is prefixed by {@link #PAGE_START_MARKER}. This marker can
	 * be used to parse the text.
	 * </p>
	 * 
	 * @param pageNumber The page number of the page to extract the text from.
	 * (<b><u>Attention:</u></b> The page number is 1-based (page 1...page n)</b>).
	 * @return Returns the text found on the given page prefixed by {@link #PAGE_START_MARKER},
	 * or <code>null</code> when no text could be found.
	 * @throws IOException
	 * @throws Exception
	 */
	public String getText(int pageNumber) throws IOException, Exception;
	
	/**
	 * <p>
	 * The method will extract text from the PDF file.
	 * The file has to be opened before calling this method
	 * (see {@link #openDocument(String)}).
	 * </p>
	 * <p> 
	 * <b><u>Attention:</u></b> Please note that each page where text could be
	 * extracted from is prefixed by {@link #PAGE_START_MARKER}. This marker can
	 * be used to parse the text using Regular Expressions (Regex).
	 * </p>
	 * @return Returns the text found inside the PDF file where each page text-block
	 * is prefixed by {@link #PAGE_START_MARKER} or <code>null</code> when no text 
	 * could be found.
	 * @throws IOException
	 * @throws Exception
	 */
	public String getText() throws Exception;
	
	/**
	 * This method will return the content of the PDF bookmark
	 * as list of String objects.
	 * 
	 * @return The bookmark content as List of String objects.
	 */
	@SuppressWarnings("unchecked")
	public java.util.List getBookmarkTitlesAsText();
	
	/**
	 * <p>This method will return the number of pages of the PDF
	 * document.</p>
	 * <u>Possible return values:</u>
	 * <ul>
	 * 	<li>Normally the number of pages should be between <code>1..n</code>.</li>
	 * 	<li>If there is no page but e.g. some bookmark information or just
	 * 		metadata it is possible that <code>0</code> will be returned</li>
	 * 	<li>In case of an error (e.g. the PDF file hasn't been opened) the
	 * 		number of pages will be <code>-1</code>.</li>
	 * </ul>
	 * 
	 * @return Returns the total number of pages in the PDF document.
	 */
	public int getNumberOfPages();
	
	/**
	 * This method will return the title of the PDF document.
	 * 
	 * @return The title of the PDF document or <code>null</code>.
	 */
	public String getTitle();
	
	/**
	 * This method will return the subject of the PDF document.
	 * 
	 * @return The subject of the PDF document or <code>null</code>.
	 */
	public String getSubject();
	
	/**
	 * This method will return a string with the keywords of the PDF document.
	 * The keyword string can use all kinds of separators so beware thinking
	 * of just ',' and ';' characters.
	 * 
	 * @return The keywords of the PDF document using different separators or <code>null</code>.
	 */
	public String getKeywords();
	
	/**
	 * This method will return the author of the PDF document.
	 * 
	 * @return The author of the PDF document or <code>null</code>.
	 */
	public String getAuthor();
	
	/**
	 * This method will return the producer of the PDF document.
	 * 
	 * @return The producer of the PDF document or <code>null</code>.
	 */
	public String getProducer();
	
	/**
	 * This method will return the creator of the PDF document.
	 * 
	 * @return The creator of the PDF document or <code>null</code>.
	 */
	public String getCreator();
	
	/**
	 * This method will return the creation date of the PDF document as
	 * formatted ISO8601 string.
	 * 
	 * @return The creation date as ISO8601 formatted string or <code>null</code>.
	 */
	public String getCreationDate();
	
	/**
	 * This method will return the modification date of the PDF document as
	 * formatted ISO8601 string.
	 * 
	 * @return The modification date as ISO8601 formatted string or <code>null</code>.
	 */
	public String getModificationDate();
	
	/**
	 * This method is called when the object is destroyed.
	 * To help the garbage collector removing no longer used
	 * references it does help to close so far unclosed references
	 * manually and set other objects to null.
	 */
	public void dispose();
}