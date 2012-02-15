/**
 * 
 */
package de.offis.health.icardea.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

/**
 * This class offers general global helper functions used in the application.
 * This includes the current directory the user used to start the application,
 * the file separators used for this platform, filename and directory helper
 * methods as well as other system details.
 * 
 *
 */
public class GlobalTools {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(GlobalTools.class);
	
	/**
	 * File separator (Windows, OS/2, eComStation = "\"; Linux, MacOS X = "/" and so on)
	 */
	public final static String FILESEPARATOR = System.getProperty("file.separator");
	
	/**
	 * System specific line separator
	 */
	public final static String LINESEPARATOR = System.getProperty("line.separator");
	
	/**
	 * Currently active path
	 */
	public final static String USERDIR = System.getProperty("user.dir");
	
	/**
	 * Path to the Maven source main directory.
	 */
	// TODO: Find a better solution to the resources path problem
	public final static String MAVEN_MAIN = "src" + FILESEPARATOR + 
												"main" + FILESEPARATOR;
	/**
	 * Path to the Maven main resources directory where
	 * additional files can be found.
	 */
	// TODO: Find a better solution to the resources path problem
	public final static String MAVEN_MAIN_RESOURCES = MAVEN_MAIN +
												"resources" + FILESEPARATOR;
	
	/**
	 * Path to the Maven source test directory.
	 */
	// TODO: Find a better solution to the resources path problem
	public final static String MAVEN_TEST = "src" + FILESEPARATOR + 
												"test" + FILESEPARATOR;
	
	/**
	 * Path to the Maven test resources directory where
	 * additional files can be found.
	 */
	// TODO: Find a better solution to the resources path problem
	public final static String MAVEN_TEST_RESOURCES = MAVEN_TEST +
												"resources" + FILESEPARATOR;
	
	/**
	 * Fixed CRLF line separator.
	 */
	public final static String CRLF = "\r\n";
	/**
	 * Fixed CR line separator.
	 */
	public final static String CR = "\r";
	/**
	 * Fixed LF line separator.
	 */
	public final static String LF = "\n";
	
	/**
	 * Date format string for ISO8601 (<code>yyyy-MM-dd HH:mm:ss z</code>)
	 */
	public final static String DATE_FORMAT_STRING_ISO8601 = "yyyy-MM-dd HH:mm:ss z";
	
	/**
	 * The JVM runtime. It can be used to get details on the current status of the VM
	 * like e.g. the memory consumption and allows accessing the garbage collector.
	 */
	final static Runtime runtime = Runtime.getRuntime();
	
	/**
	 * <p>
	 * This method will return the filename without the extension. It is
	 * assumed that the extension is always added using a dot at the end
	 * of the file. If there is no extension the filename is returned
	 * (without the full path information).
	 * </p>
	 * <p>
	 * The filename can be given with the full path or just the filename itself.
	 * Exceptions are thrown when the filename is null, or the length is 0.
	 * </p>
	 * @param fullPathFileName The filename (as full path or just the filename) from which to grab the filename without the extension.
	 * @return Returns the filename without extension.
	 * @throws Exception The Exception is including information why the exception has been thrown.
	 */
	public synchronized static String getFileNameWithoutExtension(String fullPathFileName) throws Exception {
		if (fullPathFileName == null) {
			throw new Exception("No filename given (String is null).");
		}
		
		fullPathFileName = fullPathFileName.trim();
		
		if (fullPathFileName.length() == 0) {
			throw new Exception("No filename given (String length is 0).");
		}
		
		int dot = fullPathFileName.lastIndexOf(".");
		int separator = fullPathFileName.lastIndexOf(FILESEPARATOR);
		
		if (dot == -1) {
			// The filename has no extension, so return the full filename
			return fullPathFileName.substring(separator + 1);
		} else {
			// The filename without extension
			return fullPathFileName.substring(separator + 1, dot);
		}
	}
	
	/**
	 * <p>
	 * This method will return the filename with the extension but without the full path.
	 * </p>
	 * <p>
	 * The filename can be given with the full path or just the filename itself.
	 * Exceptions are thrown when the filename is null, or the length is 0.
	 * </p>
	 * @param fullPathFileName The filename (as full path or just the filename) from which to grab the filename with the extension.
	 * @return Returns the filename without the path information.
	 * @throws Exception The Exception is including information why the exception has been thrown.
	 */
	public synchronized static String getFileNameWithoutFullPath(String fullPathFileName) throws Exception {
		if (fullPathFileName == null) {
			throw new Exception("No filename given (String is null).");
		}
		
		fullPathFileName = fullPathFileName.trim();
		
		if (fullPathFileName.length() == 0) {
			throw new Exception("No filename given (String length is 0).");
		}
		
		int separator = fullPathFileName.lastIndexOf(FILESEPARATOR);
		
		if (separator == -1) {
			// The filename doesn't include a path, so return the full filename.
			return fullPathFileName;
		} else {
			// The filename includes a path which will be removed from the filename.
			return fullPathFileName.substring(separator + 1);
		}
	}
	
	/**
	 * <p>
	 * This method will return the extension of the given filename. It is
	 * assumed that the extension is always added using a dot at the end
	 * of the file. If there is no extension an empty String is returned.
	 * </p>
	 * <p>
	 * The filename can be given with the full path or just the filename itself.
	 * Exceptions are thrown when the filename is null, or the length is 0.
	 * </p>
	 * @param fullPathFileName The filename (as full path or just the filename) from which to grab the filename without the extension.
	 * @return Returns the extension found at the filename or an empty string if there hasn't been an extension.
	 * @throws Exception The Exception is including information why the exception has been thrown.
	 */
	public synchronized static String getFileNameExtension(String fullPathFileName) throws Exception {
		if (fullPathFileName == null) {
			throw new Exception("No filename given (String is null).");
		}
		
		fullPathFileName = fullPathFileName.trim();
		
		if (fullPathFileName.length() == 0) {
			throw new Exception("No filename given (String length is 0).");
		}
		
		int dot = fullPathFileName.lastIndexOf(".");
		
		if (dot == -1) {
			return "";
		} else {
			return fullPathFileName.substring(dot + 1);
		}
	}
	
	/**
	 * This method will check a directory and makes sure it ends with a 
	 * {@link #FILESEPARATOR} character. If the given string is null or it's
	 * length is 0, null is returned to the calling method.
	 * 
	 * @param fullDirectoryPath The (full) path of a directory (with ending FILESEPARATOR char) or null.
	 * @return Returns null if the given string is null or it's length is 0, otherwise return the string and make sure it ends with a FILESEPARATOR char.
	 */
	public synchronized static String checkDirectoryPath(String fullDirectoryPath) {
		String checkedDirectoryPath = null;
		if (fullDirectoryPath != null) {
			checkedDirectoryPath = fullDirectoryPath.trim();
			
			// If length is 0 then return null
			if (checkedDirectoryPath.length() == 0) {
				checkedDirectoryPath = null;
			} else {
				/*
				 * Return the path but check if the directory path contains
				 * an ending FILESEPARATOR char...if not append it.
				 */
				checkedDirectoryPath = checkedDirectoryPath + (checkedDirectoryPath.endsWith(FILESEPARATOR)?"":FILESEPARATOR);
			}
		}
		return checkedDirectoryPath;
	}
	
	/**
	 * This method will format the elapsed time and print it out to the
	 * results (00h:00m:00s).
	 * 
	 * @param durationTimeMillis The duration time in milliseconds
	 * @return Returns a string in 00h:00m:00s
	 */
	public synchronized static String elapsedTime(long durationTimeMillis) {
		// Calculate passed time ignoring milliseconds 
		long time = (durationTimeMillis) / 1000;
		
		// Calculate hours, minutes and seconds
		String seconds = Integer.toString((int)(time % 60));
		String minutes = Integer.toString((int)((time % 3600) / 60));
		String hours = Integer.toString((int)(time / 3600));
		
		// Fill up each value to two digits 
		for (int i = 0; i < 2; i++) {
			if (seconds.length() < 2) {
				seconds = "0" + seconds;
			}
			if (minutes.length() < 2) {
				minutes = "0" + minutes;
			}
			if (hours.length() < 2) {
				hours = "0" + hours;
			}
		} // end for
		
		return hours + "h:" + minutes + "m:" + seconds + "s";
	}
	
	/**
	 * This method will calculate the elapsed time and print it out to the
	 * results (00h:00m:00s).
	 * 
	 * @param startTimeMillis Start time in milliseconds
	 * @param stopTimeMillis Stop time in milliseconds
	 * @return Returns a string in 00h:00m:00s
	 */
	public synchronized static String elapsedTime(long startTimeMillis, long stopTimeMillis) {
		// If startTime > stopTime swap the time values
		if (startTimeMillis > stopTimeMillis) {
			long tmpMillis = stopTimeMillis;
			stopTimeMillis = startTimeMillis;
			startTimeMillis = tmpMillis;
		}
		
		// Calculate passed time ignoring milliseconds 
		return elapsedTime(stopTimeMillis-startTimeMillis);
	}
	
	/**
	 * This method will stop the current processing until ENTER
	 * has been pressed on the keyboard.
	 */
	public synchronized static void pressEnterToContinue() {
		System.out.print("Press [ENTER] to continue...");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException ex) {
			logger.error("An IOException occurred: " +
					GlobalTools.getExceptionTraceLog(ex));
		} // end try..catch
	}
	
	/**
	 * <p>
	 * This method is an replacement for the replaceAll function
	 * available since Java 1.4 because this code should be compatible
	 * with Java 1.3 (or even older).
	 * </p>
	 * <p>
	 * The given string will checked for the searchString that will be
	 * replaced by the replacement. Finally the new String will be returned.
	 * </p>
	 * 
	 * @param inputString The string to work with.
	 * @param searchString The string that will be searched for.
	 * @param replacement The replacement string used instead of searchString.
	 * @return The new string where all searched substrings have been replaced.
	 */
	public synchronized static String replaceAll(String inputString, String searchString, String replacement) {
		int start = 0, pos = 0;
		StringBuffer result = new StringBuffer(inputString.length());
		while ((pos = inputString.indexOf(searchString, start)) >= 0) {
			result.append(inputString.substring(start, pos));
			result.append(replacement);
			start = pos + searchString.length();
		} // end while
		
		result.append(inputString.substring(start));
		return result.toString();
	}
	
	/**
	 * This method will return the trace log of the given exception
	 * to find the exact cause and also the file where the exception
	 * occurred.
	 * 
	 * @param exception The exception to get the trace information from.
	 * @return The string with the exception trace log.
	 */
	public synchronized static String getExceptionTraceLog(Throwable throwable) {
		String throwableTraceLog = "";
		if (throwable != null) {
			try {
				String cause = "";
				cause = throwable.getCause() == null ? "noCause " : throwable.getCause().toString();
				//cause = throwable.toString();
				
				String file = "";
				int line = 0;
				
				StackTraceElement[] stack = throwable.getStackTrace();
				if (stack != null) {
					if (stack.length > 0) {
						StackTraceElement first  = stack[0];
						if (first != null ) {
							file = first.getFileName();
							line = first.getLineNumber();
						} // end if
					} // end if
				} // end if
				
				throwableTraceLog = throwable.toString() + "; " + throwable.getMessage() + LINESEPARATOR + "Cause: " + cause + LINESEPARATOR + "File: " + file + LINESEPARATOR + "Line: " + line;
			} catch(Exception ex) {
				return throwable.getMessage() + " - Error converting throwable stacktrace to string!";
			} // end try..catch
		} // end if
		return throwableTraceLog;
	}
	
	/**
	 * This method will return the trace log of the given exception
	 * to find the exact cause and also the file where the exception
	 * occurred.
	 * 
	 * @param exception The exception to get the trace information from.
	 * @return The string with the exception trace log.
	 */
	public synchronized static String getExceptionTraceLog(Exception exception) {
		String exceptionTraceLog = "";
		if (exception != null) {
			try {
				String cause = "";
				cause = exception.getCause() == null ? "noCause " : exception.getCause().toString();
				//cause = throwable.toString();
				
				String file = "";
				int line = 0;
				
				StackTraceElement[] stack = exception.getStackTrace();
				if (stack != null) {
					if (stack.length > 0) {
						StackTraceElement first  = stack[0];
						if (first != null ) {
							file = first.getFileName();
							line = first.getLineNumber();
						} // end if
					} // end if
				} // end if
				
				exceptionTraceLog = exception.toString() + "; " + exception.getMessage() + LINESEPARATOR + "Cause: " + cause + LINESEPARATOR + "File: " + file + LINESEPARATOR + "Line: " + line;
			} catch(Exception ex) {
				return exception.getMessage() + " - Error converting exception stacktrace to string!";
			} // end try..catch
		} // end if
		return exceptionTraceLog;
	}
	
	/**
	 * This method will calculate and return the heap memory details.
	 * 
	 * @return Returns the memory details as:<br><code>wMB used - xMB free - yMB total - zMB max<code>
	 */
	public synchronized static String getMemoryInfo() {
		double freeMem = runtime.freeMemory() / 1048576.0d;
		double totalMem = runtime.totalMemory() / 1048576.0d;
		double maxMem = runtime.maxMemory() / 1048576.0d;
		double usedMem = totalMem - freeMem;
		DecimalFormat df = new DecimalFormat("###,###,###,##0.000");
		
		return df.format(usedMem) + "MB used - " + df.format(freeMem) + "MB free - " + df.format(totalMem) + "MB total - " + df.format(maxMem) + "MB max";
	}
	
	/**
	 * This method will gather the system details and return a string
	 * containing the OS name, architecture and version.
	 * 
	 * @return Returns the OS details as:<br><code>&lt;os-name&gt; (&lt;os-achitecture&gt;) v&lt;version&gt;</code>
	 */
	public static String getSystemInfo() {
		return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") v" + System.getProperty("os.version");
	}
	
	/**
	 * This method will interpret a given string as boolean value.
	 * Valid values are: <pre>true, false, yes, no</pre>
	 * 
	 * @param booleanValue The string containing an interpretable value.
	 * @return Returns a boolean value.
	 */
	public synchronized static boolean getBooleanValue(String booleanValue) {
		boolean returnValue = false;
		if (booleanValue != null && booleanValue.length() > 0) {
			if (booleanValue.equalsIgnoreCase("yes") || booleanValue.equalsIgnoreCase("true")) {
				returnValue = true;
			} else if (!(booleanValue.equalsIgnoreCase("no") || booleanValue.equalsIgnoreCase("false"))) {
				logger.warn("The given value is '" + booleanValue + "' but only 'true'/'false' and 'yes'/'no' are allowed. Using default (false).");
			}
		} else {
			logger.warn("The given value is null or empty. Using default (false).");
		}
		return returnValue;
	}
	
	/**
	 * This method will interpret a given string as int value.
	 * If the value can't be parsed and interpreted a {@linkplain NumberFormatException}
	 * is thrown.
	 * 
	 * @param intValue The string containing an interpretable value.
	 * @return Returns an int value.
	 *
	 * @throws NumberFormatException
	 */
	public synchronized static int getIntValue(String intValue) throws NumberFormatException {
		int returnValue = -1;
		returnValue = Integer.parseInt(intValue);
		return returnValue;
	}
	
	/**
	 * This method will 'touch' the given file, setting it's last modification
	 * date to the current system timestamp.
	 * 
	 * @param file The file of which the last modification should be changed.
	 * @return Returns <code>true</code> if the operation is successful, otherwise
	 * <code>false</code>.
	 */
	public synchronized static boolean touchFile(File file) {
		boolean successful = false;
		
		if (file == null) {
			logger.error("There is no file object given (null) to set a new timestamp.");
			return successful;
		}
		
		successful = touchFile(file, System.currentTimeMillis());
		return successful;
	}
	
	/**
	 * This method will 'touch' the given file, setting it's last modification
	 * date to the given timestamp value (respecting the valid range of values).
	 * 
	 * @param file The file of which the last modification should be changed.
	 * @param lastModifiedTimestamp The timestamp to use as last modification
	 * (valid values are 0,..,System.currentTimeInMillis).
	 * @return Returns <code>true</code> if the operation is successful, otherwise
	 * <code>false</code>.
	 */
	public synchronized static boolean touchFile(File file, long lastModifiedTimestamp) {
		boolean successful = false;
		
		if (file == null) {
			logger.error("There is no file object given (null) to set a new timestamp.");
			return successful;
		}
		
		if (lastModifiedTimestamp < 0 || System.currentTimeMillis() < lastModifiedTimestamp) {
			logger.error("The timestamp can't be higher then the current system time nor negative.");
			return successful;
		}
		
		try {
			successful = file.setLastModified(lastModifiedTimestamp);
		} catch(IllegalArgumentException ex) {
			logger.error("The given timestamp is negative: " +
					GlobalTools.getExceptionTraceLog(ex));
		} catch(SecurityException ex) {
			logger.error("The system security settings do not allow " +
					"changing the file nor it's properties: " +
					GlobalTools.getExceptionTraceLog(ex));
		}
		return successful;
	}
	
	/**
	 * This method will 'move' the given file and stores in the the given
	 * target directory. If the <code>targetFilename</code> parameter is given
	 * the original file will be replaced by <code>targetFilename</code>,
	 * otherwise the original filename will be preserved (not changed from
	 * the source path).
	 * 
	 * @param sourceFullPathWithFilename The full path information of the source
	 * 		file to move.
	 * @param targetFullPath The target path where to move the file.
	 * @param targetFilename <i>Optional</i> parameter which allows to rename
	 * 		the original filename from the <code>sourceFullPathFileName</code> to this
	 * 		new <code>targetFilename</code>.
	 * @return Returns <code>true</code> if the operation is successful, otherwise
	 * <code>false</code>.
	 */
	public synchronized static boolean moveFile(String sourceFullPathWithFilename, 
			String targetFullPath, String targetFilename) {
		boolean successful = true;
		
		/*
		 * First we have to check the input strings to see if they contain
		 * valid values. This is required because there may be incorrect
		 * path information given by e.g. the configuration file. 
		 */
		
		/*
		 * Check source path
		 */
		if (sourceFullPathWithFilename == null) {
			logger.error("There is no source path with filename String given ('null').");
			successful = false;
		} else {
			sourceFullPathWithFilename = sourceFullPathWithFilename.trim();
			if (sourceFullPathWithFilename.length() == 0) {
				logger.error("The given source path with file name String is empty.");
				successful = false;
			}
		} // end if..else
		
		/*
		 * Check target path
		 */
		if (targetFullPath == null) {
			logger.error("There is no target path String given ('null').");
			successful = false;
		} else {
			targetFullPath = targetFullPath.trim();
			if (targetFullPath.length() == 0) {
				logger.error("The given target path String is empty.");
				successful = false;
			}
		} // end if..else
		
		/*
		 * Check if the target filename is given by the optional parameter.
		 */
		if (targetFilename != null) {
			targetFilename = targetFilename.trim();
			if (targetFilename.length() == 0) {
				logger.error("The given target filename String is empty which" +
						"is not allowed. If the file shouldn't be renamed" +
						"use 'null' as parameter but NOT an empty String.");
				successful = false;
			}
		}
		
		if (successful) {
			File sourceFullPathFileObj = new File(sourceFullPathWithFilename);
			File targetFullPathFileObj = new File(targetFullPath);
			
			/*
			 * If the optional targetFilename parameter is 'null' the file
			 * shouldn't be renamed. We have to use the original filename.
			 */
			if (targetFilename == null) {
				// Get original filename
				targetFilename = sourceFullPathFileObj.getName();
				
				/*
				 * Now check if the File object really returned a filename,
				 * because it is possible that only a path was given so there
				 * won't be a filename.
				 */
				if (targetFilename == null) {
					logger.error("The given source path doesn't contain a filename.");
					successful = false;
				}
			}
			
			/*
			 * Now we check if the target directory exists and if not we try
			 * to create it.
			 */
			try {
				if (successful && !targetFullPathFileObj.exists()) {
					successful = successful && targetFullPathFileObj.mkdirs();
					if (!successful) {
						logger.error("The target directory " +
								"'" + targetFullPathFileObj.getAbsolutePath() + "' " +
								"doesn't exist and the directory structure " +
								"couldn't be created.");
					}
				} // end if 
			} catch (SecurityException ex) {
				logger.error("The system security settings do not " +
						"allow moving the file: " +
						GlobalTools.getExceptionTraceLog(ex));
				successful = false;
			}
			
			/*
			 * If we were able to get here we can finally try to move the file.
			 */
			if (successful) {
				try {
					successful = sourceFullPathFileObj.renameTo(
							new File(targetFullPathFileObj, targetFilename));
				} catch(SecurityException ex) {
					logger.error("The system security settings do not " +
							"allow moving the file: " +
							GlobalTools.getExceptionTraceLog(ex));
					successful = false;
				}
			} // if..else..
			
			//if rename make no use for file move, use Cut function (Copy & Delete) instead
			if (!successful)  {
				successful=cutGeneralFile(sourceFullPathWithFilename, targetFullPath);
				}
			
		} // end if 'null' checks on input strings were successful
		return successful;
	}
	
	/**
	 * This method will create the given directory.
	 * 
	 * @param directoryPath The full path to the directory that should be created.
	 * @return Returns <code>true</code> if the operation is successful, otherwise
	 * <code>false</code>.
	 */ 
	public synchronized static boolean createDirectory(String directoryPath) {
		boolean successful = false;
		if (directoryPath != null) {
			directoryPath = directoryPath.trim();
			if (directoryPath.length() > 0) {
				try {
					java.io.File myFilePath = new java.io.File(directoryPath);
					if (!myFilePath.exists()) {
						myFilePath.mkdirs();
						successful = true;
					} else {
						// If the directory already exists we also return true.
						successful = true;
					} // end if..else
				} catch (SecurityException ex) {
					logger.error("The system security settings do not " +
							"allow creating the directory " +
							"'" + directoryPath + "': " +
							GlobalTools.getExceptionTraceLog(ex));
				} // end try..catch
			} else {
				logger.error("The given directory string is empty.");
			} // end if..else
		} else {
			logger.error("No given directory string is 'null'.");
		} // end if..else
		
		return successful;
	}
	
	/**
	 * This method calculates the MD5 hash for the given input byte array and
	 * returns the hash code as String.
	 * 
	 * @param byteArrayToHash The byte array for which the MD5 hash is generated for.
	 * @return Returns the generated MD5 hash as String.
	 * @throws NoSuchAlgorithmException
	 */
	public synchronized static String getHashMD5(byte[] byteArrayToHash) throws NoSuchAlgorithmException {
		String md5hexString = "00";
		
		// Initialize MessageDigest
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		
		// Load content of the byte array
		messageDigest.update(byteArrayToHash);
		
		// Calculate MD5
		byte[] md5 = messageDigest.digest();
		
		// Convert the byte array into a BigInteger value
		BigInteger bigInteger = new BigInteger(1, md5);
		
		// Convert the BigInteger into a Hex-Value (should be a 32-character long String)
		md5hexString = bigInteger.toString(16);
		
		// Make sure the string uses and even length. If it's not even leftPad with a "0".
		return (md5hexString.length()%2==0?md5hexString:"0"+md5hexString);
	}
	
	/**
	 * This method will parse a given date string using the given format
	 * and tries to convert it into a Date object.
	 * 
	 * @param dateString The date string to parse.
	 * @param formatString The format string describing the given date string.
	 * @return The {@link java.util.Date} object if parsed successfully or
	 * <code>null</code> if an error occurred. 
	 */
	public synchronized static Date string2Date(String dateString, String formatString) {
		Date newDate = null;
		SimpleDateFormat sdfToDate = null;
		if (formatString == null) {
			sdfToDate = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
			logger.warn("No specific format string given, falling back to a default value " +
					"(" + sdfToDate.toPattern() + "). Please provide a format " +
					"string together with the date string!");
		} else {
			sdfToDate = new SimpleDateFormat(formatString);
		} // end if..else
		
		if (dateString != null) {
			try {
				newDate = sdfToDate.parse(dateString);
				logger.trace(newDate);
			} catch (ParseException ex) {
				logger.error("Error parsing the given date string (" + dateString +
						") using the given format string (" + sdfToDate.toPattern() + "): " +
						GlobalTools.getExceptionTraceLog(ex));
			} // end try..catch
		} else {
			logger.error("The given date string is 'null' so the date can't " +
					"be converted. The function is returning 'null' as Date " +
					"object.");
		} // end if..else
		
		return newDate;
	}
	
	/**
	 * This method will convert a given date using the given format String
	 * into a String object.
	 * 
	 * @param date The date object to convert.
	 * @param formatString The format String to use to format the date. If it is
	 * not set the default format <code>'dd-MMM-yyyy HH:mm:ss'</code> is used.
	 * @return The date as String object if converted successfully or
	 * <code>null</code> if an error occurred. 
	 */
	public synchronized static String date2String(Date date, String formatString) {
		String dateString = null;
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdfToDate = null;
		if (formatString == null) {
			sdfToDate = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
			logger.warn("No specific format string given, falling back to a default value " +
					"(" + sdfToDate.toPattern() + "). Please provide a format " +
					"string together with the date!");
		} else {
			sdfToDate = new SimpleDateFormat(formatString);
		} // end if..else
		
		try {
			if (date != null) {
				cal.setTime(date);
				dateString = sdfToDate.format(cal.getTime());
				logger.trace(dateString);
			}
		} catch (Exception ex) {
			logger.error("Error converting the given date (" + date.toString() +
					") using the given format string (" + sdfToDate.toPattern() + "): " +
					GlobalTools.getExceptionTraceLog(ex));
		} // end try..catch
		
		return dateString;
	}
	
	/**
	 * This method will convert a given Calendar object using the given format
	 * String into a String object.
	 * 
	 * @param calendar The calendar object to convert.
	 * @param formatString The format String to use to format the Calendar object.
	 * If it is not set the default format <code>'dd-MMM-yyyy HH:mm:ss'</code> is used.
	 * @return The date as String object if converted successfully or
	 * <code>null</code> if an error occurred. 
	 */
	public synchronized static String calendar2String(Calendar calendar, String formatString) {
		String dateString = null;
		SimpleDateFormat sdfToDate = null;
		if (formatString == null) {
			sdfToDate = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
			logger.warn("No specific format string given, falling back to a default value " +
					"(" + sdfToDate.toPattern() + "). Please provide a format " +
					"string together with the date!");
		} else {
			sdfToDate = new SimpleDateFormat(formatString);
		} // end if..else
		
		try {
			if (calendar != null) {
				dateString = sdfToDate.format(calendar.getTime());
				logger.trace(dateString);
			}
		} catch (Exception ex) {
			logger.error("Error converting the given calendar (" + calendar.toString() +
					") using the given format string (" + sdfToDate.toPattern() + "): " +
					GlobalTools.getExceptionTraceLog(ex));
		} // end try..catch
		
		return dateString;
	}
	
	/**
	 * Copy defined directory/file to destination directory
	 * @param srcPath Source directory/file absolute path
	 * @param destDir Destination directory path
	 * @return boolean true: Operation successful, false: Operation failed
	 */
	public static boolean copyGeneralFile(String srcPath, String destDir) {
		boolean success = false;
		File file = new File(srcPath);
		if (!file.exists()) {
			logger.warn("Source File or Source Directory does not exist!");
			return false;
		}
		if (file.isFile()) {
			logger.debug("File copy operation!");
			success = copyFile(srcPath, destDir);
		} else if (file.isDirectory()) {
			logger.debug("Directory copy operation!");
			success = copyDirectory(srcPath, destDir);
		}
		return success;
	}
	
	/**
	 * Copy directory and all directories and all files inside to destination path
	 * 
	 * @param srcDirPath Source Directory absolute path
	 * @param destDirPath Destination directory name
	 * @return boolean true: Operation successful, false: Operation failed
	 */
	public static boolean copyDirectory(String srcDirPath, String destDir) {
		boolean success = false;
		
		if (srcDirPath==null || destDir==null) {
			logger.error("Path is null, please check the input path name!");
			return(false);
		}
		
		File srcDir= new File (srcDirPath);
		if (!srcDir.exists()) {// If source directory does not exit
			logger.error("Source direcotry " + srcDirPath + " does not exit");
			return false;
		}
		
		//Get the name of source directory, Example: if the source dir is E://dir, the name is "dir"
		String dirName = getDirName(srcDirPath);
		//The complete routing for destination directory 
		String destDirPath = destDir + File.separator + dirName;
		
		File destDirFile = new File(destDirPath);
		
		if (srcDir.isDirectory()) {
			//Copy directory
			//Target location has been occupied by a directory with same name
			if (destDirFile.exists()) { 
				logger.info("Path for target direcotry " + destDirPath +
				" has been occupied by directory with same name");
			} else {
				if(!destDirFile.mkdirs()) {
					logger.error("Directory " + destDirFile.getAbsolutePath() + " could not be created!");
					return(false); 
				}///????? what happens when it can not created ????? ADDED FALSE!!!!!!
			}
			
			//Get the sub files and sub-directories under source directory
			File[] fileList = srcDir.listFiles(); 
			
			if (fileList.length==0) {
				// If source directory is empty set flag "success" as true
				success = true;
			} else {
				for (File file: fileList) {
					if (file.isFile()) { // is File
						success = copyFile(file.getAbsolutePath(), destDirPath);
					} else if (file.isDirectory()) { // is Directory
						success = copyDirectory(file.getAbsolutePath(), destDirPath);
					}
					if (!success) {
						logger.warn("Copy dir/file " + file.getAbsolutePath() + " is failed");
						//if one copy operation is failed, do not continue to copy other files. ///????WHY????
						break;
					}
				}
			}
			if (success) {
				logger.debug("Copy direcotry " + dirName + " is finished successful!");
			} else {
				logger.warn("Copy direcotry " + dirName + " is failed!");
			}
		}
		return success;
	}
	
	/**
	 * Copy file to destination path with new defined file name 
	 * 
	 * @param srcFilePath Source file absolute path
	 * @param destDirPath Destination directory name
	 * @param destName Destination file name
	 * @return boolean true: Operation successful, false: Operation failed
	 */
	public static boolean copyFile(String srcFilePath, String destDirPath, String destName) throws IOException {
		
		if (destDirPath.endsWith(File.separator)) { // If path is end with "//", delete the tailer "//" first
			destDirPath = destDirPath.substring(0, destDirPath.lastIndexOf(File.separator));
		}
		
		String destFilePath= destDirPath + File.separator + destName;
		boolean success = copyFile(srcFilePath, destFilePath);
		return success;
	}
	
	/**
	 * Copy file to destination path with original file name 
	 * 
	 * @param srcFilePath Source file absolute path
	 * @param destDir Destination directory name
	 * @return boolean true: Operation successful, false: Operation failed
	 */
	public static boolean copyFile(String srcFilePath, String destDirPath) {
		boolean success = false;
		
		File srcFile = new File(srcFilePath);
		//check source file
		// ?????? why logger warn and not error???????
		if (!srcFile.exists()) {
			logger.error ("Source file "+ srcFilePath + " does not exist");
			return false;
		}
		
		if (!srcFile.isFile()) {
			logger.error("Source file "+ srcFilePath + " is not a file!");//?????? is not a File!!!!!
			return false;
		}
		
		//Get the file name of the source file
		String fileName = srcFilePath.substring(srcFilePath.lastIndexOf(GlobalTools.FILESEPARATOR)+1);

		//Check the destination directory
		if (destDirPath==null) {
			logger.warn ("Directory is null, please check the validation of destination directory");
			return false;
		}
		
		if (destDirPath.endsWith(File.separator)) { // If path is end with "//", delete the tailer "//" first
			destDirPath = destDirPath.substring(0, destDirPath.lastIndexOf(File.separator));
		}
		
		String destFilePath = destDirPath + File.separator + fileName;
		File destFile = new File(destFilePath);
		
		//Check 1: whether destination file path is same as the original file path
		if (destFilePath.equals(srcFilePath)) { // source file path is same as target file path 
			logger.warn ("Path for target file " + destFilePath + 
			" is same as original file path!");
			return false;
		}
		
		
		//Check 2: whether file already exists in destination directory
		if(destFile.exists() && destFile.isFile()) { // under this path already one file with same name //????WHY NOT OVERWRITE????
			logger.info ("File "+ fileName +" has been existed in traget directory "+ destDirPath +" and will be overwritten");
			//return false;
		}
		
		//If directory for destination file does not exist or is not null
		if (destFile.getParentFile()!=null && !destFile.getParentFile().exists()){
			destFile.getParentFile().mkdirs();
		}
		
		try {
			InputStream inStream  = new FileInputStream(srcFilePath);
			OutputStream outStream = new FileOutputStream(destFilePath);
			
			//Transfer bytes from inStream to outStream
			byte[] buf = new byte[1024];
			int length;
			while ((length = inStream.read(buf)) > 0) {
				outStream.write(buf, 0, length);
			}
			inStream.close();
			outStream.close();
			success = true;
		} catch (FileNotFoundException ex) {
			logger.error("The destination file could not be built.", ex);
		} catch (IOException ex) {
			logger.error("An IOException occurred while copying the file.", ex);
		}
		return success;
	}
	
	/**
	 * get the name of directory or file
	 * 
	 * @param dirPath path for directory
	 * @return String
	 */
	private static String getDirName(String dirPath) {
		
		if (dirPath == null) {
			logger.warn("Directory path is null!");
			return null;
		}
		
		File dirFile = new File(dirPath);
		if (!dirFile.exists()) { // File does not exist
			logger.warn("File "+ dirPath +" does not exist!");
			return null;
		}
		
		if (dirPath.endsWith(File.separator)) { // If path is end with "//", delete the tailer "//" first
			dirPath = dirPath.substring(0, dirPath.lastIndexOf(File.separator));
		}
		return dirPath.substring(dirPath.lastIndexOf(File.separator)+1);
	}
	
	/**
	 * Delete file and directory
	 * 
	 * @param filePath absolute path for file waiting for delete
	 * @return boolean true: Operation successful, false: Operation failed
	 */
	public static boolean deleteGeneralFile(String filePath) {
		boolean success = false;
		
		if (filePath == null) {
			logger.warn("File path is null!");
			return(false);
		}
		
		File file = new File(filePath);
		if (!file.exists()) { // File does not exist
			logger.warn("File "+ filePath +" does not exist!");
			return(false);
		}
		
		if (file.isDirectory()) { // if it is a directory
			success = deleteDirectory(file.getAbsolutePath());
		} else if (file.isFile()) {
			success = deleteFile(file);
		} else {
			logger.warn("Path is not File or directory!");
		}
		
		if (success) {
			logger.debug("Delete file or directory successfully!");
		} else{
			logger.warn("Delete file or directory "+ filePath + " failed");
		}
		return success;
	}
	
	/**
	 * Delete file
	 * @param File object for file to be delete
	 * @return boolean true: Operation successful, false: Operation failed
	 */
	private static boolean deleteFile(File file) {
		return file.delete();
	}
	
	/**
	 * Delete the directory and all sub-files and sub directories inside.
	 * If there is any sub files or sub directories under it, the sub directories
	 * and files will be delete first.
	 * @param dirFile path is the File object for source directory
	 * @return boolean only true path was a directory and is deleted
	 */
	public static boolean deleteDirectory(String dirPath) {
		Boolean success=false;
		
		if (dirPath == null) {
			logger.warn("Delete directory fails! Path for directory is null");
			return(false);
		}
		
		File dirFile = new File(dirPath);
		
		if (!dirFile.exists()) {
			logger.warn("Delete directory fails! Dir: " + dirPath +" does not exist!");
			return(false); //TODO ???????WHY FALSE directory is "deleted" means does not existing !!!!!!!
		}
		
		if (dirFile.isDirectory()) {
		File[] subFiles = dirFile.listFiles();
		for (int i = 0; i < subFiles.length; i++){
			if (subFiles[i].list() != null && subFiles[i].list().length > 0){
				success = deleteDirectory(subFiles[i]);
			}
			else{
				success = subFiles[i].delete();
			}
			if (!success) { // if one file failed, continue to delete other files
				logger.warn("Failure for deleting dir/file: " + subFiles[i].getAbsolutePath());
				logger.warn("Delete directory " + dirFile.getAbsolutePath() + " failed!");
			//TODO same warning even if file or directory failure????
			}
		}
		success = dirFile.delete();
		}
		return success;
	}

	/**
	 * Delete the directory and all sub-files and sub directories inside.
	 * If there is any sub files or sub directories under it, the sub directories
	 * and files will be delete first.
	 * @param dirPath path is the absolute path for directory
	 * @return boolean only true path was a directory and is deleted
	 */
	public static boolean deleteDirectory(File dirFile) {
		Boolean success=false;
		String dirPath= dirFile.getAbsolutePath();
		if (dirPath!=null && dirFile.exists()) {
			success=deleteDirectory(dirPath);
		} else {
			logger.warn("File path " + dirPath + " is not effective");
		}
		return success;
	}
	
	
	/**
	 * Cut directory or file into destination path
	 * Cut operation is combined with: Copy and Delete
	 * @param srcPath path for source file or directory
	 * @param destDir path for target file or directory
	 */
	public static boolean cutGeneralFile(String srcPath, String destDir) {
		logger.debug("Cut operation Start!");
		if (!copyGeneralFile(srcPath, destDir)) {
			logger.error("Cut failure duo to Copy failure!");
			return false;
		}
		
		if(!deleteGeneralFile(srcPath)) {
			logger.error("Cut failure duo to Delete failure!");
			return false;
		}
		logger.debug("Cut operation successful!");
		return true;
	}
}