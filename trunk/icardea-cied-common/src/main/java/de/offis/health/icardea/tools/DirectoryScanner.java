/**
 * 
 */
package de.offis.health.icardea.tools;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;

import de.offis.health.icardea.common.exception.InvalidParameterValueException;

/**
 * <p>
 * This utility class will periodically scan a directory for files matching a given
 * {@link FilenameFilter}. The files found are grouped into one of the following categories.
 * </p>
 * <b><u>Categories are:</u></b>
 * <ul>
 * <li>Added</li>
 * <li>Modified</li>
 * <li>Removed</li>
 * </ul>
 * 
 *
 */
public class DirectoryScanner {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(DirectoryScanner.class);
	
	/**
	 * The interval in seconds in which the directories should be scanned.
	 * If set to 0 the directory scanner won't be automatically called,
	 * meaning there is no scheduled execution.
	 */
	private volatile int scanInterval = 0;
	
	/**
	 * The maximum file age to be included in the search.
	 * If set ({@link #fileAgeLimit} > 0) older files will be ignored in
	 * the scanning process.
	 */
	private volatile int fileAgeLimit = 0;
	
	/**
	 * The list of listeners scanning directories.
	 */
	private List<DiscreteListener> listenerList = Collections.synchronizedList(new ArrayList<DiscreteListener>());
	
	/**
	 * The {@link Map} containing the previous scan results
	 * (filenames and last modification time).
	 */
	private Map<String, Long> previousScanMap = new HashMap<String, Long>();
	
	/**
	 * The {@link Map} containing the current scan results
	 * (filenames and last modification time).
	 */
	private Map<String, Long> currentScanMap = new HashMap<String, Long>();
	
	/**
	 * The {@link FilenameFilter} to apply. Only files matching this filter will be recognized.
	 */
	private FilenameFilter filenameFilter;
	
	/**
	 * The list containing the directories which will be periodically scanned.
	 */
	private List<File> scanDirectoryList = null;
	
	/**
	 * Indicator if the scanner is running or not.
	 */
	private volatile boolean running = false;
	
	/**
	 * When the scanner is started there might be already files in the
	 * directories to scan which will be marked as added if this parameter
	 * is set to true, otherwise not.
	 */
	private boolean reportExistingFilesAsAdded = true;
	
	/**
	 * The timer object used schedule the timer tasks.
	 */
	private Timer timer;
	
	/**
	 * The timer task which is scheduled by the timer object.
	 */
	private TimerTask timerTask;
	
	/**
	 * Indicating if the directories to be scanned should be scanned
	 * recursively (subdirectories will then be scanned as well) or
	 * just the given directory (ignoring subdirectories).
	 */
	private boolean recursivelyScanDirectories = true;
	
	/**
	 * Each time {@link #scanDirectories()} is called the current timestamp
	 * will be stored which allows limiting the results (nowTimeStamp-maxFileAge > x millis).
	 */
	private volatile long nowTimeStamp = 0L;
	
	/**
	 * Formatter creating an SQL interpretable timestamp string (without
	 * the time zone information).
	 * This can be used when inserting date into an SQL table (e.g. returned
	 * from {@link java.io.File#lastModified()}).
	 */
	private final static SimpleDateFormat sdfSQLTimestampNoTZ = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	
	/**
	 * Inner Listener interface
	 * 
	 * Marker for notifications.
	 */
	public interface Listener {}
	
	/**
	 * Property key constant for the interval time to be used in the properties
	 * file to store the configuration value.
	 */
	public final static String PROPERTY_KEY_SCAN_INTERVAL_TIME = "DIRECTORYSCANNER_SCAN_INTERVAL_TIME";
	
	/**
	 * Property key constant for the scan interval unit (<code>seconds</code>,
	 * <code>minutes</code>, <code>hours</code> -
	 * {@link #SCAN_INTERVAL_UNITS_ALLOWED_STRINGS}) to be used in the
	 * properties file to store the configuration value.
	 */
	public final static String PROPERTY_KEY_SCAN_INTERVAL_UNIT = "DIRECTORYSCANNER_SCAN_INTERVAL_UNIT";
	
	/**
	 * List of Strings allowed to be used as scan interval units.
	 * The '<code>;</code>' char is used to separate the values.
	 */
	public final static String SCAN_INTERVAL_UNITS_ALLOWED_STRINGS = "seconds;minutes;hours;";
	
	/**
	 * The int value to be used for the scan interval unit '<code>seconds</code>'.
	 */
	public final static int SCAN_INTERVAL_UNIT_SECONDS = 0;
	
	/**
	 * The int value to be used for the scan interval unit '<code>minutes</code>'.
	 */
	public final static int SCAN_INTERVAL_UNIT_MINUTES = 1;
	
	/**
	 * The int value to be used for the scan interval unit '<code>hours</code>'.
	 */
	public final static int SCAN_INTERVAL_UNIT_HOURS = 2;
	
	/**
	 * Property key constant for the maximum file age to be used in the
	 * properties file to store the configuration value. This is the maximum
	 * file age of a file. Older files will be ignored in the scanning process.
	 */
	public final static String PROPERTY_KEY_FILE_AGE_LIMIT = "DIRECTORYSCANNER_FILE_AGE_LIMIT";
	
	/**
	 * Property key constant for the file age unit (<code>seconds</code>,
	 * <code>minutes</code>, <code>hours</code>, <code>days</code> -
	 * {@link #FILE_AGE_UNIT_ALLOWED_STRINGS}) to be used in the properties
	 * file to store the configuration value.
	 */
	public final static String PROPERTY_KEY_FILE_AGE_UNIT = "DIRECTORYSCANNER_FILE_AGE_UNIT";
	
	/**
	 * List of Strings allowed to be used as file age units.
	 * The '<code>;</code>' char is used to separate the values.
	 */
	public final static String FILE_AGE_UNITS_ALLOWED_STRINGS = "seconds;minutes;hours;days;";
	
	/**
	 * The int value to be used for the file age unit '<code>seconds</code>'.
	 */
	public final static int FILE_AGE_UNIT_SECONDS = 0;
	
	/**
	 * The int value to be used for the file age unit '<code>minutes</code>'.
	 */
	public final static int FILE_AGE_UNIT_MINUTES = 1;
	
	/**
	 * The int value to be used for the file age unit '<code>hours</code>'.
	 */
	public final static int FILE_AGE_UNIT_HOURS = 2;
	
	/**
	 * The int value to be used for the file age unit '<code>days</code>'.
	 */
	public final static int FILE_AGE_UNIT_DAYS = 3;
	
	/**
	 * <p>
	 * Property key constant for the list of directories to scan to be used
	 * in the properties file to store the configuration value.
	 * </p>
	 * <p>
	 * The values for this key can contain one of more directories which are
	 * separated by the {@link #SCAN_DIRECTORY_SEPARATOR_CHAR} character.
	 * </p>
	 */
	public final static String PROPERTY_KEY_SCAN_DIRECTORIES = "DIRECTORYSCANNER_SCAN_DIRECTORIES";
	
	/**
	 * Constant to be used as separator for the list of directories
	 * that should be scanned.
	 */
	public final static String SCAN_DIRECTORY_SEPARATOR_CHAR = "#";
	
	/**
	 * The listener interface
	 */
	public interface DiscreteListener extends Listener {
		public void fileModified(String filename) throws Exception;
		public void fileAdded(String filename) throws Exception;
		public void fileRemoved(String filename) throws Exception;
	}
	
	public interface BulkListener extends Listener {
		public void filesChanged(List<String> filenames) throws Exception;
	}
	
	/**
	 * Default empty constructor
	 */
	public DirectoryScanner() {}
	
	/**
	 * This method allows to store the directory scan interval in seconds.
	 * 
	 * @param scanIntervalInSeconds The pause in seconds between the directory scans.
	 * @throws InvalidParameterValueException
	 */
	public synchronized void setScanInterval(int scanIntervalInSeconds) throws InvalidParameterValueException {
		checkScanIntervalParameter(scanIntervalInSeconds);
		this.scanInterval = scanIntervalInSeconds;
	}
	
	/**
	 * This method is initializing the scan interval between scans with using
	 * the given parameters. Internally private methods are called to set the
	 * values.
	 * 
	 * @param scanInterval The scan interval needs to be a positive number or 0
	 * (disables DirectoryScanner) otherwise {@link InvalidParameterValueException} will be thrown.
	 * @param scanIntervalUnit A valid unit as listed in {@link #SCAN_INTERVAL_UNITS_ALLOWED_STRINGS}.
	 * @throws InvalidParameterValueException
	 */
	public synchronized void setScanInterval(int scanInterval, String scanIntervalUnit)
										throws InvalidParameterValueException {
		checkScanIntervalParameter(scanInterval);
		
		// Basic test of the given unit.
		if (scanIntervalUnit != null) {
			scanIntervalUnit = scanIntervalUnit.toLowerCase();
		} else {
			logger.error("Incorrect scanIntervalUnit given (scanIntervalUnit=" +
					scanIntervalUnit + ")...falling back to 'seconds' as default.");
			scanIntervalUnit = "seconds";
		} // end if..else
		
		// Further checks including setting the scan interval
		if (scanInterval > 0) {
			if (SCAN_INTERVAL_UNITS_ALLOWED_STRINGS.indexOf(scanIntervalUnit) >= 0) {
				if (scanIntervalUnit.equals("seconds")) {
					setScanInterval(scanInterval);
				} else if (scanIntervalUnit.equals("minutes")) {
					setScanInterval(scanInterval*60);
				} else if (scanIntervalUnit.equals("hours")) {
					setScanInterval(scanInterval*3600);
				} // end if..else
			} else {
				logger.warn("Incorrect scanIntervalUnit given (scanIntervalUnit=" +
						scanIntervalUnit + ")...falling back to seconds as default value.");
				setScanInterval(scanInterval);
			} // end if..else
		} // end if..else
	}
	
	/**
	 * <p>This method is initializing the scan interval between scans with using
	 * the given parameters. Internally private methods are called to set the
	 * values.</p>
	 * <p>Valid parameters for the <code>scanIntervalUnit</code> are the following constants:</p>
	 * <ul>
	 * <li>{@link #SCAN_INTERVAL_UNIT_SECONDS}</li>
	 * <li>{@link #SCAN_INTERVAL_UNIT_MINUTES}</li>
	 * <li>{@link #SCAN_INTERVAL_UNIT_HOURS}</li>
	 * </ul>
	 * 
	 * @param scanInterval The scan interval needs to be a positive number or 0
	 * (disables DirectoryScanner) otherwise {@link InvalidParameterValueException} will be thrown.
	 * @param scanIntervalUnit A valid unit (see constants listed in method description).
	 * @throws InvalidParameterValueException
	 */
	public synchronized void setScanInterval(int scanInterval, int scanIntervalUnit)
										throws InvalidParameterValueException {
		// Check scanInterval parameter and throw exception if required.
		checkScanIntervalParameter(scanInterval);
		
		// Basic test of the given unit.
		switch (scanIntervalUnit) {
			case SCAN_INTERVAL_UNIT_SECONDS:
				setScanInterval(scanInterval);
				break;
			case SCAN_INTERVAL_UNIT_MINUTES:
				setScanInterval(scanInterval*60);
				break;
			case SCAN_INTERVAL_UNIT_HOURS:
				setScanInterval(scanInterval*3600);
				break;
			default:
				logger.error("Incorrect scanIntervalUnit given (scanIntervalUnit=" +
					scanIntervalUnit + ")...falling back to 'seconds' (" +
					SCAN_INTERVAL_UNIT_SECONDS + ") as default.");
				setScanInterval(scanInterval);
				break;
		} // end switch
	}
	
	/**
	 * This method is used to check the given parameter on {@link #setScanInterval(int, int)}
	 * and {@link #setScanInterval(int, String)}.
	 * 
	 * @param scanInterval
	 * @throws InvalidParameterValueException
	 */
	private void checkScanIntervalParameter(int scanInterval)
			throws InvalidParameterValueException {
		if (scanInterval < 0) {
			throw new InvalidParameterValueException("The given scanInterval " +
					"parameter is not allowed to be negative (scanInterval = " +
					scanInterval + ").");
		} else if (scanInterval == 0) {
			logger.info("The given scanInterval for the DirectoryScanner is set to 0 which disables scheduling.");
		} // end if..else
	}
	
	/**
	 * This method will return the directory scan interval in seconds.
	 * 
	 * @return Returns the directory scans interval in seconds.
	 */
	public synchronized int getScanInterval() {
		return scanInterval;
	}
	
	/**
	 * This method allows to store the directory scan interval in seconds.
	 * 
	 * @param fileAgeLimitInSeconds The pause in seconds between the directory scans.
	 * @throws InvalidParameterValueException
	 */
	public synchronized void setFileAgeLimit(int fileAgeLimitInSeconds) throws InvalidParameterValueException {
		checkFileAgeLimitParameter(fileAgeLimitInSeconds);
		this.fileAgeLimit = fileAgeLimitInSeconds;
	}
	
	/**
	 * This method is initializing the file age limit scans with using
	 * the given parameters. Internally private methods are called to set the
	 * values.
	 * 
	 * @param fileAgeLimit The file age limit needs to be a positive number or 0
	 * (disables the check) otherwise {@link InvalidParameterValueException} will be thrown.
	 * @param fileAgeUnit A valid unit as listed in {@link #FILE_AGE_UNITS_ALLOWED_STRINGS}.
	 * @throws InvalidParameterValueException
	 */
	public synchronized void setFileAgeLimit(int fileAgeLimit, String fileAgeUnit)
										throws InvalidParameterValueException {
		checkFileAgeLimitParameter(fileAgeLimit);
		
		// Basic test of the given unit.
		if (fileAgeUnit != null) {
			fileAgeUnit = fileAgeUnit.toLowerCase();
		} else {
			logger.error("Incorrect fileAgeUnit given (scanIntervalUnit=" +
					fileAgeUnit + ")...falling back to 'seconds' as default.");
			fileAgeUnit = "seconds";
		} // end if..else
		
		// Further checks
		if (fileAgeLimit > 0) {
			if (FILE_AGE_UNITS_ALLOWED_STRINGS.indexOf(fileAgeUnit) >= 0) {
				if (fileAgeUnit.equals("seconds")) {
					setFileAgeLimit(fileAgeLimit);
				} else if (fileAgeUnit.equals("minutes")) {
					setFileAgeLimit(fileAgeLimit * 60);
				} else if (fileAgeUnit.equals("hours")) {
					setFileAgeLimit(fileAgeLimit * 3600);
				} else if (fileAgeUnit.equals("days")) {
					setFileAgeLimit(fileAgeLimit * 86400);
				} // end if..else
			} else {
				logger.warn("Incorrect fileAgeUnit given (fileAgeUnit=" +
						fileAgeUnit + ")...falling back to seconds as default value.");
				setFileAgeLimit(fileAgeLimit);
			} // end if..else
		} // end if..else
	}
	
	/**
	 * <p>This method is initializing the file age limit scans with using
	 * the given parameters. Internally private methods are called to set the
	 * values.</p>
	 * <p>Valid parameters for the <code>fileAgeUnit</code> are the following constants:</p>
	 * <ul>
	 * <li>{@link #FILE_AGE_UNIT_SECONDS}</li>
	 * <li>{@link #FILE_AGE_UNIT_MINUTES}</li>
	 * <li>{@link #FILE_AGE_UNIT_HOURS}</li>
	 * <li>{@link #FILE_AGE_UNIT_DAYS}</li>
	 * </ul>
	 * 
	 * @param fileAgeLimit The file age limit needs to be a positive number or 0
	 * (disables the check) otherwise {@link InvalidParameterValueException} will be thrown.
	 * @param fileAgeUnit A valid unit (see constants listed in method description).
	 * @throws InvalidParameterValueException
	 */
	public synchronized void setFileAgeLimit(int fileAgeLimit, int fileAgeUnit)
										throws InvalidParameterValueException {
		// Check fileAgeLimit parameter and throw exception if required.
		checkFileAgeLimitParameter(fileAgeLimit);
		
		// Basic test of the given unit.
		switch (fileAgeUnit) {
			case FILE_AGE_UNIT_SECONDS:
				setFileAgeLimit(fileAgeLimit);
				break;
			case FILE_AGE_UNIT_MINUTES:
				setFileAgeLimit(fileAgeLimit * 60);
				break;
			case FILE_AGE_UNIT_HOURS:
				setFileAgeLimit(fileAgeLimit * 3600);
				break;
			case FILE_AGE_UNIT_DAYS:
				setFileAgeLimit(fileAgeLimit * 86400);
				break;
			default:
				setFileAgeLimit(fileAgeLimit);
				logger.error("Incorrect fileAgeUnit given (fileAgeUnit=" +
						fileAgeUnit + ")...falling back to 'seconds' (" +
						FILE_AGE_UNIT_SECONDS + ") as default.");
				break;
		} // end switch
	}
	
	/**
	 * This method is used to check the given parameter on {@link #setFileAgeLimit(int, int)}
	 * and {@link #setFileAgeLimit(int, String)}.
	 * 
	 * @param fileAgeLimit
	 * @throws InvalidParameterValueException
	 */
	private void checkFileAgeLimitParameter(int fileAgeLimit)
			throws InvalidParameterValueException {
		if (fileAgeLimit < 0) {
			throw new InvalidParameterValueException("The given scanInterval " +
					"parameter is not allowed to be negative (scanInterval = " +
					fileAgeLimit + ").");
		} else if (fileAgeLimit == 0) {
			logger.info("The given scanInterval is set to 0 which completely disables the DirectoryScanner.");
		} // end if..else
	}
	
	/**
	 * This method will return the max. file age limit in seconds.
	 *
	 * @return Returns the max. file age limit in seconds.
	 */
	public synchronized int getFileAgeLimit() {
		return fileAgeLimit;
	}
	
	/**
	 * <p>
	 * This method will parse the given list of directories to configure the
	 * directory scanner.
	 * </p>
	 * <p>
	 * If the given parameter is null or empty the
	 * {@link InvalidParameterValueException} is thrown.
	 * If more then one directory should be set the directories have to be
	 * separated using the {@link #SCAN_DIRECTORY_SEPARATOR_CHAR} character.
	 * </p>
	 * 
	 * @param listOfDirectories The list of directories to scan 
	 * 		(separator char is {@link #SCAN_DIRECTORY_SEPARATOR_CHAR}).
	 * @throws InvalidParameterValueException
	 */
	public void setScanDirectoryList(String listOfDirectories) throws InvalidParameterValueException {
		List<File> directoryListToScan = new ArrayList<File>();
		if (listOfDirectories!= null && listOfDirectories.length() > 0) {
			StringTokenizer stringTokenizer = new StringTokenizer(listOfDirectories, SCAN_DIRECTORY_SEPARATOR_CHAR);
			File newDirectory = null;
			/*
			 * Parse the value and generate a list of directories to be used
			 * for the directory scanner.
			 */
			if (stringTokenizer.countTokens() > 1) {
				/*
				 * Multiple directories to scan
				 */
				String directory = null;
				while (stringTokenizer.hasMoreTokens()) {
					directory = stringTokenizer.nextToken();
					if (directory != null) {
						directory = directory.trim();
						if (directory.length() > 0) {
							newDirectory = new File(directory);
							if (newDirectory.isDirectory()) {
								directoryListToScan.add(newDirectory);
							}
						} // end if
					} // end if
				} // end while
			} else {
				/*
				 * Only one directory to scan
				 */
				newDirectory = new File(listOfDirectories);
				if (newDirectory.isDirectory()) {
					directoryListToScan.add(newDirectory);
				}
			} // end if..else
			
			// Cleanup
			newDirectory = null;
		} // end if...checking configuration value
		
		if (!directoryListToScan.isEmpty()) {
			this.setScanDirectoryList(directoryListToScan);
		} else {
			String message = "There are no directories set to be monitored " +
					"(parameter is null or empty). Please update your" +
					"configuration file!";
			logger.error(message);
			throw new InvalidParameterValueException(message);
		}
	}
	
	/**
	 * This method allows to store a new list {@link List} of directories to scan.
	 * If the given list of File objects is null or empty
	 * {@link InvalidParameterValueException} is thrown.
	 * 
	 * @param scanDirectoryList
	 * @throws InvalidParameterValueException
	 */
	public void setScanDirectoryList(List<File> scanDirectoryList) throws InvalidParameterValueException {
		if (!scanDirectoryList.isEmpty()) {
			this.scanDirectoryList = scanDirectoryList;
		} else {
			String message = "There are no directories set to be monitored " +
					"(parameter is null or empty). Please update your" +
					"configuration file!";
			logger.error(message);
			throw new InvalidParameterValueException(message);
		}
	}
	
	/**
	 * This method will return the {@link List} of directories to scan.
	 * 
	 * @return Returns the {@link List} of directories to scan.
	 */
	public List<File> getScanDirectoryList() {
		return this.scanDirectoryList;
	}
	
	/**
	 * This method allows to enable or disable scanning the given directories
	 * recursively.
	 * 
	 * @param recursivelyScanDirectories If <code>true</code> directories will
	 * be scanned recursively and if <code>false</code> there won't be a
	 * recursively scan.
	 */
	public void setRecursivelyScanDirectories(boolean recursivelyScanDirectories) {
		this.recursivelyScanDirectories = recursivelyScanDirectories;
	}
	
	/**
	 * This method returns the current setting for the recursive scan.
	 * 
	 * @return Returns <code>true</code> when the recursive scan is enabled, 
	 * otherwise <code>false</code>.
	 */
	public boolean getRecursivelyScanDirectories() {
		return this.recursivelyScanDirectories;
	}
	
	/**
	 * This method allows to store the {@link #filenameFilter} which will
	 * be used while scanning the directories for files.
	 * Only files matching the {@link #filenameFilter} will be reported
	 * as added/changed/removed.
	 * 
	 * @param filenameFilter the {@link FilenameFilter} to be used for the directory scan.
	 */
	public void setFilenameFilter(FilenameFilter filenameFilter) {
		this.filenameFilter = filenameFilter;
	}
	
	/**
	 * This method will return the {@link #filenameFilter} which will be used
	 * while scanning the directories for files.
	 * Only files matching the {@link #filenameFilter} will be reported
	 * as added/changed/removed.
	 * 
	 * @return Returns the {@link #filenameFilter} to be used for the directory scan.
	 */
	public FilenameFilter getFilenameFilter() {
		return filenameFilter;
	}
	
	/**
	 * This method allows to store the value whether or not an initial
	 * scan will report all files as being added.
	 * 
	 * @param reportExistingFilesAsAdded If set to true, all files found on initial scan
	 * will be reported as being added, otherwise not.
	 */
	public void setReportExistingFilesOnStartup(boolean reportExistingFilesAsAdded) {
		this.reportExistingFilesAsAdded = reportExistingFilesAsAdded;
	}
	
	/**
	 * This method will add an added/removed/changed listener to the list of listeners.
	 * 
	 * @param listener The listener to be added to the list of listeners.
	 */
	public synchronized void addListener(Listener listener) {
		if (listener == null)
			return;
		listenerList.add((DiscreteListener)listener);
	}
	
	/**
	 * This method will remove a registered listener from the list of listeners.
	 * 
	 * @param listener The registered listener object to be removed from the list of listeners.
	 */
	public synchronized void removeListener(Listener listener) {
		if (listener == null)
			return;
		listenerList.remove(listener);
	}
	
	/**
	 * Start the scanning action.
	 */
	public synchronized void start() {
		if (running) {
			return;
		}
		
		running = true;
		
		if (reportExistingFilesAsAdded) {
			// if files exist at startup, report them
			scan();
		} else {
			// just register the list of existing files and only report changes
			scanDirectories();
			previousScanMap.putAll(currentScanMap);
		}
		schedule();
	}
	
	/**
	 * This method will start a new TimerTask thread
	 * which is returned.
	 * 
	 * @return Returns the new TimerTask.
	 */
	public TimerTask newTimerTask() {
		return new TimerTask() {
			public void run() {
				scan();
			}
		};
	}
	
	/**
	 * This method will start a new Timer as 'Daemon' which will be returned.
	 * 
	 * @return Returns the new Timer running as 'Daemon' for repeating tasks.
	 */
	public Timer newTimer() {
		return new Timer(true);
	}
	
	/**
	 * This method will schedule new TimerTask.
	 */
	public void schedule() {
		if (running) {
			if (timer != null) {
				timer.cancel();
			}
			if (timerTask != null) {
				timerTask.cancel();
			}
			
			if (getScanInterval() > 0) {
				timer = newTimer();
				timerTask = newTimerTask();
				timer.schedule(timerTask, 1000L * getScanInterval(), 1000L * getScanInterval());
			} // end if
		} // end if
	}
	
	/**
	 * Stop the scanning.
	 */
	public synchronized void stop() {
		if (running) {
			running = false;
			if (timer != null)
				timer.cancel();
			if (timerTask != null) {
				timerTask.cancel();
			}
			timerTask = null;
			timer = null;
		} // end if
	}
	
	/**
	 * Perform a scan on designated directories and compare the results
	 * of the current can with those of the previous scan which are
	 * forwarded to the listeners (added/removed/modified).
	 */
	public void scan() {
		scanDirectories();
		reportDifferences(currentScanMap, previousScanMap);
		previousScanMap.clear();
		previousScanMap.putAll(currentScanMap);
	}
	
	/**
	 * Recursively scan all files in the designated directories.
	 */
	public void scanDirectories() {
		if (this.scanDirectoryList == null) {
			return;
		}
		
		currentScanMap.clear();
		Iterator<File> iterator = scanDirectoryList.iterator();
		while (iterator.hasNext()) {
			File directory = (File) iterator.next();
			
			if ((directory != null) && (directory.exists())) {
				scanDirectoryOrFile(directory, currentScanMap);
			}
		} // end while
	}
	
	/**
	 * Report the adds/changes/removes to the registered listeners
	 * using the currently scan results and the previous (old) scan
	 * results.
	 * 
	 * @param currentScanMap The {@link Map} containing the current scan results
	 * (filenames and last modification time).
	 * @param oldScanMap The {@link Map} containing the previous scan results
	 * (filenames and last modification time).
	 */
	public void reportDifferences(Map<String, Long> currentScanMap, Map<String, Long> oldScanMap) {
		List<String> bulkChanges = new ArrayList<String>();
		
		Set<String> oldScanKeys = new HashSet<String>(oldScanMap.keySet());
		Iterator iterator = currentScanMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			if (!oldScanKeys.contains(entry.getKey())) {
				logger.debug("File added: " + entry.getKey());
				reportAddedFile((String) entry.getKey());
				bulkChanges.add((String)entry.getKey());
			} else if (!oldScanMap.get(entry.getKey()).equals(entry.getValue())) {
				logger.debug("File modfied: " + entry.getKey());
				reportModifiedFile((String) entry.getKey());
				oldScanKeys.remove(entry.getKey());
				bulkChanges.add((String)entry.getKey());
			} else {
				oldScanKeys.remove(entry.getKey());
			} // end if..else
		} // end while
		
		if (!oldScanKeys.isEmpty()) {
			Iterator<String> keyItor = oldScanKeys.iterator();
			while (keyItor.hasNext()) {
				String filename = (String) keyItor.next();
				logger.debug("File removed: " + filename);
				reportRemovedFile(filename);
				bulkChanges.add(filename);
			} // end while
		} // end if
		
		if (!bulkChanges.isEmpty()) {
			reportBulkChangesOfFiles(bulkChanges);
		}
	}
	
	/**
	 * Get last modified time on a single file or recurse if the file is a
	 * directory to see if the subdirectory contains files when enabled
	 * ({@see #recursivelyScanDirectories}).
	 * 
	 * @param fileOrDirectory The file or directory to process.
	 * @param currentScanMap The {@link Map} containing the current scan results
	 * (filenames and last modification time).
	 */
	private void scanDirectoryOrFile(File fileOrDirectory, Map<String, Long> currentScanMap) {
		try {
			if (!fileOrDirectory.exists()) {
				return;
			}
			
			if (fileOrDirectory.isFile()) {
				if ((filenameFilter == null) ||
						((filenameFilter != null) &&
						filenameFilter.accept(fileOrDirectory.getParentFile(), fileOrDirectory.getName()))) {
					
					long lastModified = fileOrDirectory.lastModified();
					
					/*
					 * Check if fileAgeLimit is set. If not continue else check
					 * if the file isn't too old.
					 */
					if ( fileAgeLimit <= 0 ||
							(fileAgeLimit > 0 && (nowTimeStamp-fileAgeLimit) < lastModified) ) {
						String absoluteFileName = fileOrDirectory.getCanonicalPath();
						currentScanMap.put(absoluteFileName, new Long(lastModified));
					}
				} // end if
			} else if (fileOrDirectory.isDirectory() &&
					(recursivelyScanDirectories || scanDirectoryList.contains(fileOrDirectory))) {
				File[] files = fileOrDirectory.listFiles();
				for (int i = 0; i < files.length; i++) {
					scanDirectoryOrFile(files[i], currentScanMap);
				} // end for
			} // end if..else
		} catch (IOException ex) {
			logger.warn("Error scanning watched files: " + GlobalTools.getExceptionTraceLog(ex), ex);
		} // end try..catch
	}
	
	/**
	 * General method writing warning messages to the log file.
	 * 
	 * @param listener The listener which failed to process the change.
	 * @param filename The filename of the file added/removed/modified.
	 * @param throwable The throwable object containing details on the problem.
	 */
	private void logWarnings(Object listener, String filename, Throwable throwable) {
		logger.warn("The listener " + listener + " failed on '" + filename + "': " + GlobalTools.getExceptionTraceLog(throwable));
	}
	
	/**
	 * This method report that a file has been added to the registered listener (fileAdded).
	 * 
	 * @param filename The filename of the file that has been added.
	 */
	private void reportAddedFile(String filename) {
		Iterator<DiscreteListener> iterator = listenerList.iterator();
		while (iterator.hasNext()) {
			Object listener = iterator.next();
			try {
				if (listener instanceof DiscreteListener) {
					((DiscreteListener) listener).fileAdded(filename);
				}
			} catch (Exception ex) {
				logWarnings(listener, filename, ex);
			} catch (Error err) {
				logWarnings(listener, filename, err);
			} // end try..catch
		} // end while
	}
	
	/**
	 * This method report that a file has been removed to the registered listener (fileRemoved).
	 * 
	 * @param filename The filename of the file that has been removed.
	 */
	private void reportRemovedFile(String filename) {
		Iterator<DiscreteListener> iterator = listenerList.iterator();
		while (iterator.hasNext()) {
			Object listener = iterator.next();
			try {
				if (listener instanceof DiscreteListener) {
					((DiscreteListener) listener).fileRemoved(filename);
				}
			} catch (Exception ex) {
				logWarnings(listener, filename, ex);
			} catch (Error err) {
				logWarnings(listener, filename, err);
			} // end try..catch
		} // end while
	}
	
	/**
	 * This method report that a file has been modified to the registered listener (fileModified).
	 * 
	 * @param filename The filename of the file that has been modified.
	 */
	private void reportModifiedFile(String filename) {
		Iterator<DiscreteListener> iterator = listenerList.iterator();
		while (iterator.hasNext()) {
			Object listener = iterator.next();
			try {
				if (listener instanceof DiscreteListener) {
					((DiscreteListener) listener).fileModified(filename);
				}
			} catch (Exception ex) {
				logWarnings(listener, filename, ex);
			} catch (Error err) {
				logWarnings(listener, filename, err);
			} // end try..catch
		} // end while
	}
	
	/**
	 * This method will report all files to the registered bulk listener
	 * ignoring the details what happened to the file.
	 * 
	 * @param filenameList A list of all files that have been added, modified or removed.
	 */
	private void reportBulkChangesOfFiles(List<String> filenameList) {
		Iterator<DiscreteListener> iterator = listenerList.iterator();
		while (iterator.hasNext()) {
			Object listener = iterator.next();
			try {
				if (listener instanceof BulkListener) {
					((BulkListener) listener).filesChanged(filenameList);
				}
			} catch (Exception ex) {
				logWarnings(listener, filenameList.toString(), ex);
			} catch (Error err) {
				logWarnings(listener, filenameList.toString(), err);
			} // end try..catch
		} // end while
	}
}