/**
 * 
 */
package de.offis.health.icardea.cied.pdf.extractor;

import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;

/**
 * This abstract class defines generic functions and properties used
 * in the concrete PDF extractor classes.
 * 
 *
 */
public abstract class AbstractPDFExtractor implements PDFExtractor {
	/**
	 * Decimal formatter for the PDF internal reference number. The number
	 * should be always 4-digits long.
	 */
	public final static java.text.DecimalFormat REF_NUMBER_FORMAT = new java.text.DecimalFormat("0000");
	
	/**
	 * The character/string used for bookmark indention.
	 */
	private String bookmarkTextIndentionCharacter = "\t";
	
	/**
	 * The indention size for each bookmark level or in other words
	 * how often the {@link #bookmarkTextIndentionCharacter} will be
	 * replicated for each level.
	 */
	private int bookmarkTextIndentionSize = 1;
	
	/**
	 * This helper method is used to repeat the configured
	 * {@link #bookmarkTextIndentionCharacter} for
	 * {@link #bookmarkTextIndentionSize} number of times and
	 * returns this String.
	 * 
	 * @return Returns the bookmark indention string.
	 */
	protected String bookmarkIndentionString() {
		final StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < bookmarkTextIndentionSize; i++) {
			stringBuffer.append(bookmarkTextIndentionCharacter);
		} // end for
		return stringBuffer.toString();
	}
}