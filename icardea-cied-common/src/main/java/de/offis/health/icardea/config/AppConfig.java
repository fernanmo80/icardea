/**
 * 
 */
package de.offis.health.icardea.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * <p>
 * Singleton class to represent the configuration data used by the software
 * architecture implemented for the project. The singleton instance is
 * instantiated by the application right after launch. While being
 * instantiated, it loads a set of properties from a file located in the
 * <code>resources</code> directory of the application called
 * <code>AppConfig.properties</code>.
 * </p>
 * <p>
 * It's possible to access the properties of the configuration by a static
 * call:<br>
 * <code>AppConfig.getProperty(String key)</code>.<br>
 * It is also possible to set a configuration property by calling:<br>
 * <code>AppConfig.setProperty(String key, String value);</code>
 * </p>
 * 
 *
 */
public class AppConfig {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(AppConfig.class);
	
	/**
	 * Name of the system property where the configuration file can be found.
	 */
	private final String APPCONFIG_FILEPATH = "APPCONFIG_FILEPATH";
	
	/**
	 * The name of the AppConfig properties file!
	 */
	private final String APPCONFIG_PROPERTIES_FILENAME = "AppConfig.properties";
	
	/**
	 * Instance object for singleton behaviour.
	 */
	private volatile static AppConfig instance;
	
	/**
	 * Global properties object.
	 */
	private static Properties mainConfig = new Properties();
	
	/**
	 * Method to get the singleton instance of this class.
	 * 
	 * @return singleton object instance of this class.
	 * @throws PropertyFileNotFoundException 
	 */
	public static synchronized void createInstance() throws PropertyFileNotFoundException {
		// if this is the first call, create an instance
		if (instance == null) {
			instance = new AppConfig();
		}
		// return either newly created or existing instance.
	}
	
	/**
	 * Constructor of this class. Reads properties from application properties
	 * file to be placed under root directory of this application (normally in the
	 * <code>resources</code> subdirectory).
	 * @throws PropertyFileNotFoundException 
	 */
	private AppConfig() throws PropertyFileNotFoundException {
		// Read configuration properties file
		try {
			/*
			 * If the property 'APPCONFIG_FILEPATH' is not set try to find the
			 * file on the path.
			 */
			try {
				if (System.getProperty(APPCONFIG_FILEPATH) == null) {
					// First try to load the file from the main directory...
					java.net.URL tempUrl = AppConfig.class.getClassLoader().getResource(APPCONFIG_PROPERTIES_FILENAME);
					
					// ...if 'null' try again with the 'config' directory
					if (tempUrl == null) {
						tempUrl = AppConfig.class.getClassLoader().getResource("config/" + APPCONFIG_PROPERTIES_FILENAME);
					}
					
					if (tempUrl != null) {
						logger.trace("Url object is not null.\n" +
								"Details: ...toURI() returns '" + tempUrl.toURI()+"'");
						
						/*
						 * If the file is found in the *.jar file we skip
						 * further attempts.
						 */
						if ((tempUrl.toURI()).toString().toLowerCase().startsWith("file:")) {
							File tempFile = new File(tempUrl.toURI());
							logger.trace("Created fileUrl object is not null...");
							if (tempFile.isFile() && tempFile.exists()) {
								logger.info("Found config file ('" + APPCONFIG_PROPERTIES_FILENAME + "') in: " + tempFile.getParent());
								System.setProperty(APPCONFIG_FILEPATH, tempFile.getParent());
							}
						}
					}
				}
			} catch (URISyntaxException ex) {
				// We ignore this error as the code below should fix it.
				logger.error(ex + ":" + GlobalTools.getExceptionTraceLog(ex));
			} catch (IllegalArgumentException ex) {
				logger.error(ex + ":" + GlobalTools.getExceptionTraceLog(ex));
			}
			
			/*
			 * Re-check the property 'APPCONFIG_FILEPATH' parameter.
			 * If it could be set with the code above load the file using
			 * the parameter otherwise try loading the file using the
			 * getResourceAsStream(...) call.
			 */
			if (System.getProperty(APPCONFIG_FILEPATH) == null) {
				logger.warn("The system property '" + APPCONFIG_FILEPATH + "' is not set (null)! " +
						"Normally it is set on the java command line by '-DAPPCONFIG_FILEPATH=\".\\config\"'. " +
						"The application is now trying to find the file somewhere " +
						"on the classpath (including the JAR file of the application).");
				
				try {
					AppConfig.mainConfig.load(getClass().getResourceAsStream("/config/" + APPCONFIG_PROPERTIES_FILENAME));
				} catch (NullPointerException ex) {
					throw new PropertyFileNotFoundException("Couldn't find '" + 
							APPCONFIG_PROPERTIES_FILENAME + "'.", ex);
				}
			} else {
				logger.info("Configurating AppConfig using file " +
					GlobalTools.checkDirectoryPath(System.getProperty(APPCONFIG_FILEPATH)) +
					APPCONFIG_PROPERTIES_FILENAME);
				AppConfig.mainConfig.load(new FileInputStream(
					GlobalTools.checkDirectoryPath(System.getProperty(APPCONFIG_FILEPATH)) +
					APPCONFIG_PROPERTIES_FILENAME) );
			}
		} catch (IOException ex) {
			logger.error("Error reading configuration property file. Please " +
					"make sure that a System property called " +
					"'APPCONFIG_FILEPATH' exists and that it " +
					"points to a file called " +
					"'" + APPCONFIG_PROPERTIES_FILENAME + "'. Current content: " +
					(System.getProperty(APPCONFIG_FILEPATH) == null ? "NOT SET":"'" +
					System.getProperty(APPCONFIG_FILEPATH)+ "'.") + " -- " + 
					GlobalTools.getExceptionTraceLog(ex));
		} catch (IllegalArgumentException ex) {
			logger.error("A error occurred processing the config file. " +
					"If the Exception message complains about about " +
					"'Malformed \\uxxx encoding.' " +
					"Check if the path value for a property key e.g. " +
					"'MYAPPDIR=C:\\\\Tools\\\\MyApp\\\\' " +
					"contains the double backslash -- " + 
					GlobalTools.getExceptionTraceLog(ex));
		} // end try..catch
	}
	
	/**
	 * Method to set a new property during runtime, e.g. a password that is
	 * entered into a console.
	 * 
	 * @param key The key to be used for the property.
	 * @param value The value of the property to be set.
	 * @throws PropertyFileNotFoundException 
	 */
	public static void setProperty(String key, String value) throws PropertyFileNotFoundException {
		createInstance();
		AppConfig.mainConfig.setProperty(key, value);
	}
	
	/**
	 * <p>
	 * Method to get a property from the main configuration object.
	 * </p>
	 * <p>
	 * The returned String is trimmed (removing spaces) to
	 * prevent errors if the property stores numbers and it needs
	 * to be converted to a string (e.g. '10 ' would raise a
	 * {@link NumberFormatException} because the blank is not removed). 
	 * </p>
	 * <p>
	 * An exception is thrown if the key doesn't exist.
	 * </p>
	 * 
	 * @param key The key of the property value to be returned.
	 * @return The value corresponding to the given key.
	 * @throws PropertyNotFoundException
	 */
	public static String getProperty(String key) throws PropertyNotFoundException {
		String value = null;
		try {
			createInstance();
			value = AppConfig.mainConfig.getProperty(key);
		} catch (PropertyFileNotFoundException ex) {
			// Ignore this error as it is handled by the following code
			logger.warn(ex.getMessage() + " This will lead to additional error " +
					"messages like 'PropertyNotFoundException' exceptions: " + 
					GlobalTools.getExceptionTraceLog(ex));
		}
		
		if (value == null) {
			throw new PropertyNotFoundException(
					"Property key '" + key + "' not found. Please " +
					"make sure that this key exists in configuration file (*.properties).");
		} // end if
		return value.trim();
	}
	
	/**
	 * This method will dispose the DBTools object.
	 * First all connections will be closed and then
	 * the instance is set to null to be fetched by
	 * the garbage collector.
	 */
	public static void dispose() {
		if (mainConfig != null) mainConfig = new Properties();
		System.gc();
		instance = null;
		System.gc();
	}
}