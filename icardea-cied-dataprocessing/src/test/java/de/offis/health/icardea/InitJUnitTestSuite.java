package de.offis.health.icardea;

import static org.junit.Assert.assertNull;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;

import de.offis.health.icardea.config.AppConfig;

/**
 * As JUnit4 is poorly documented and there seems
 * to be no easy way to setup a TestSuite this
 * class is used to setup different things like
 * e.g. log4j.
 * 
 *
 */
public class InitJUnitTestSuite {
	/**
	 * Logger config file
	 */
	private static final String LOG4J_CONFIGFILE = "config/logger/JUnitTests_log4j.properties";
	
	/**
	 * The name of the AppConfig properties file for the unit tests!
	 */
	private final static String APPCONFIG_PROPERTIES_FILENAME = "AppConfig.properties";
	
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(InitJUnitTestSuite.class);
	
	/**
	 * Setup the required environment for all tests.
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setting up test suite in InitJUnitTestSuite...");
		
		// Read log4j configuration file (has to be in the path)
		PropertyConfigurator.configure(InitJUnitTestSuite.class.getClassLoader().getResource(LOG4J_CONFIGFILE));
		
		// Setup AppConfig singleton for configuration files.
		System.setProperty("APPCONFIG_PROPERTIES_FILENAME", APPCONFIG_PROPERTIES_FILENAME);
		
		// Load configuration file for this test
		AppConfig.createInstance();
		
		// Show that the application is alive
		logger.info("Setup of JUnit test suite completed.");
	}
	
	/**
	 * Dummy test always completing successfully, so this class can
	 * be added as first test to the Test suite and also initialize
	 * it.
	 */
	@Test
	public void dummyTest() {
		assertNull(null);
	}
}