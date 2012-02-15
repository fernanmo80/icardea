/**
 * 
 */
package de.offis.health.icardea.text.tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;

import org.apache.log4j.Logger;

import de.offis.health.icardea.common.exception.TextFileNotFoundException;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * <p>
 * This class allows reading a simple text file into the memory.
 * Beside uncompressed files this class also supports reading
 * GZIP compressed files (*.gz).
 * </p>
 * <p>
 * As there are different scenarios how to handle the content,
 * there are several public modifier that allow to change the
 * behaviour of the reading process. Sometimes it is required
 * to skip blank lines sometimes they are required. Sometimes it's
 * even required to force a concrete line separator.
 * </p>
 * <p>
 * <b><u>NOTE:</u></b> Currently this implementation can't
 * handle files properly that use the Byte Order Mark (BOM), to
 * indicate what type of character set is used.
 * </p>
 * 
 *
 */
public class SimpleTextFileReader {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(SimpleTextFileReader.class);
	
	/**
	 * This object will store the content of the file that has been read.
	 */
	private StringBuffer fileContent = new StringBuffer();
	
	/**
	 * <p>
	 * This setting allows to clear the content of the file each time
	 * a file is read (using {@link #loadTextFile(String)} or
	 * {@link #loadTextFile(String, String)}). It is enabled <code>true</code>
	 * default behaviour.
	 * </p>
	 * <p>
	 * If this is disabled <code>false</code>, you can append the content of
	 * multiple files to the internal file content storage. To clear it you
	 * have to call the {@link #clearFileContent()} function in your code.
	 * </p>
	 */
	private boolean clearFileContentAutomatically = true;
	
	/**
	 * <p>
	 * This setting indicates if empty lines found in the file
	 * should be read AS IS or skipped. By default the empty
	 * lines are read AS IS (= NOT skipped).</p>
	 * <p>
	 * <b><u>NOTE:</u></b> This setting is affected by the {@link #trimLines}
	 * setting. A line might only be empty (line length is checked) if it has
	 * been trimmed first. A line containing <code>'      '</code> is not
	 * empty because it contains spaces.
	 * </p>
	 * <p>
	 * If you want to skip these lines as well you have to enable the
	 * {@link #trimLines} feature, which removes all whitespace characters
	 * (e.g. SPACE, TAB, etc.) from the string before the length of the line
	 * is checked.
	 * </p>
	 */
	private boolean skipEmptyLines = false;
	
	/**
	 * <p>
	 * This field indicates if lines should be trimmed (all whitespace characters
	 * like e.g. SPACE, TAB, etc. will be removed) before they are added
	 * to the internal storage.<br />
	 * <b>This is <u>enabled</u> (<code>true</code>) by default.</b>
	 * </p>
	 * <p>
	 * If you need unmodified lines change the value of this variable to
	 * <code>false</code>.
	 * </p>
	 */
	private boolean trimLines = true;
	
	/**
	 * This string defines the line separator that is used to separate the
	 * lines. By default the line separator of the current system is used,
	 * but it is possible to specify another line separator if required.
	 */
	private String lineSeparator = GlobalTools.LINESEPARATOR;
	
	/**
	 * It is important to use the correct character set when the file is
	 * read. By default this class uses the <code>UTF-8</code> character
	 * set.
	 */
	private String charSetName = "UTF-8";
	
	/**
	 * Default constructor
	 */
	public SimpleTextFileReader() {
		super();
	}
	
	/**
	 * This method can be used to load a text from a given file.
	 * This method is also able to load a GZIP compressed file (*.gz).
	 * 
	 * @param filename The full path to the file to load.
	 * @return Returns <code>true</code> if the file could be loaded and
	 * entries where added otherwise <code>false</code>.
	 * @throws TextFileNotFoundException
	 */
	public synchronized boolean loadTextFile(final String filename) throws TextFileNotFoundException {
		if (clearFileContentAutomatically) {
			clearFileContent();
		}
		
		/*
		 * Default return value, which will be set to <code>true</code>
		 * if the processing was successful.
		 */
		boolean successful = false;
		
		/*
		 * Object to load the file line by line. 
		 */
		BufferedReader bufferedReader = null;
		
		/*
		 * Will be used to store each line of the file.
		 */
		String line;
		
		try {
			/* 
			 * If it's a compressed file (*.gz) use GZIPInputStream,
			 * otherwise try to load as uncompressed file.
			 */
			if (filename.toLowerCase().endsWith(".gz")) {
				bufferedReader = new BufferedReader(
						new InputStreamReader(new GZIPInputStream(
						new FileInputStream(filename)), charSetName));
			} else {
				bufferedReader = new BufferedReader(
						new InputStreamReader(
						new FileInputStream(filename), charSetName));
			}
			
			/*
			 * Read the file line by line...
			 */
			while ((line = bufferedReader.readLine()) != null) {
				/*
				 * Check if lines should be trimmed to remove whitespace characters
				 */
				if (trimLines) {
					line = line.trim();
				}
				
				/*
				 * When enabled we skip empty lines while reading the file
				 * line by line, otherwise we read it AS IS.
				 */
				if (! (skipEmptyLines && line.length() == 0) ) {
					logger.trace("Line read from file: " + line);
					/* 
					 * Check if the value exists and ONLY add the line
					 * to the wordlist if the entry is new.
					 * 
					 * We have to do this to ensure that an
					 * existing value is not replaced by the new value
					 * because it would also change the integer value,
					 * which we want to keep.
					 */
					fileContent.append(line);
					fileContent.append(lineSeparator);
				} else {
					logger.trace("Skipped line containing: " + line);
				}
			}
			successful = true;
		} catch (UnsupportedEncodingException ex) {
			logger.error("The encoding isn't supported. Make sure the file " +
					"('" + filename + "') you try to load is UTF-8 encoded " +
							"(or what was choosen) and " +
							"has no Byte order mark (BOM). " + 
							GlobalTools.getExceptionTraceLog(ex));
		} catch (FileNotFoundException ex) {
			logger.error("The given file ('" + filename + "') can't be found " +
					"or accessed. Make sure it exists and you have access " +
					"rights. " + GlobalTools.getExceptionTraceLog(ex));
			throw new TextFileNotFoundException(ex.getMessage(), ex);
		} catch (IOException ex) {
			logger.error("An IOException occurred while trying to load " +
					" the file ('" + filename + "'). " + 
					GlobalTools.getExceptionTraceLog(ex));
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					logger.error("Couldn't close the bufferedReader object." + 
							GlobalTools.getExceptionTraceLog(ex));
				}
			} // end if
		} // end try..catch..finally
		
		return successful;
	}
	
	/**
	 * This method can be used to load a text from a given file.
	 * This method is also able to load a GZIP compressed file (*.gz).
	 * 
	 * @param filename The full path to the file to load.
	 * @param charSetName The name of the character set to use.
	 * @return Returns <code>true</code> if the file could be loaded and
	 * entries where added otherwise <code>false</code>.
	 * @throws TextFileNotFoundException
	 */
	public synchronized boolean loadTextFile(final String filename, 
			final String charSetName) throws TextFileNotFoundException {
		if (charSetName != null) {
			this.charSetName = charSetName;
		}
		return this.loadTextFile(filename);
	}
	
	/**
	 * This method allows to clear the internal file content storage.
	 */
	public synchronized void clearFileContent() {
		fileContent = new StringBuffer();
	}
	
	/**
	 * This method will return the file content from the internal storage.
	 * 
	 * @return The stored file content
	 */
	public synchronized String getFileContent() {
		return fileContent.toString();
	}
	
	/**
	 * This method will return the current setting for the automatic
	 * content clearing.
	 * 
	 * @return Returns <code>true</code> if automatically cleared or <code>false</code> if not.
	 */
	public boolean isClearFileContentAutomatically() {
		return clearFileContentAutomatically;
	}
	
	/**
	 * This method allows to enable or disable the automatic content clearing.
	 * 
	 * @param clearFileContentAutomatically The setting to clear automatically or not.
	 */
	public void setClearFileContentAutomatically(
			boolean clearFileContentAutomatically) {
		this.clearFileContentAutomatically = clearFileContentAutomatically;
	}
	
	/**
	 * This method returns the current setting indicating that empty lines
	 * are skipped or not.
	 * 
	 * @return Returns <code>true</code> if empty lines are skipped or <code>false</code> if not.
	 */
	public boolean isSkipEmptyLines() {
		return skipEmptyLines;
	}
	
	/**
	 * This method allows to enable or disable the line skipping if the line
	 * is empty. See also {@link #skipEmptyLines} for additional details on
	 * other properties that can influence the behaviour.
	 * 
	 * @param skipEmptyLines The setting to skip empty lines or not.
	 */
	public void setSkipEmptyLines(boolean skipEmptyLines) {
		this.skipEmptyLines = skipEmptyLines;
	}
	
	/**
	 * This method returns the current setting indicating if lines are
	 * trimmed or not.
	 * 
	 * @return Returns <code>true</code> if line trimming is enabled or <code>false</code> if not.
	 */
	public boolean isTrimLines() {
		return trimLines;
	}
	
	/**
	 * This method allows to enable or disable the line trimming.
	 * 
	 * @param trimLines The setting to trim lines or not.
	 */
	public void setTrimLines(boolean trimLines) {
		this.trimLines = trimLines;
	}
	
	/**
	 * This method will return the currently set line separator.
	 * 
	 * @return Returns the currently set line separator.
	 */
	public String getLineSeparator() {
		return lineSeparator;
	}
	
	/**
	 * This method allows to set the line separator string. The most common
	 * line separators are available here:
	 * {@link GlobalTools#LINESEPARATOR}, {@link GlobalTools#CRLF},
	 * {@link GlobalTools#CR} and {@link GlobalTools#LF} 
	 * 
	 * @param lineSeparator The line separator string to use.
	 */
	public void setLineSeparator(String lineSeparator) {
		this.lineSeparator = lineSeparator;
	}
	
	/**
	 * This method will return the currently configured character set as String.
	 * @return The name of the currently configured character set name.
	 */
	public String getCharSetName() {
		return charSetName;
	}
	
	/**
	 * This method allows to configure the character set to be used reading
	 * files.
	 * 
	 * @param charSetName The name of the character set to use.
	 */
	public void setCharSetName(String charSetName) {
		this.charSetName = charSetName;
	}
}