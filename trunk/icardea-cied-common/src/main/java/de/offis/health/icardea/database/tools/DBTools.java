/**
 * 
 */
package de.offis.health.icardea.database.tools;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.PooledConnection;

import org.apache.log4j.Logger;

import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * <p>
 * This class implements a singleton pattern which is responsible managing the
 * database access using a connection pool based on
 * {@link javax.sql.ConnectionPoolDataSource}.
 * </p>
 * <p>
 * This is much faster compared to creating a new connection every time one
 * is needed.
 * </p>
 * <b><u>Requirements:</u></b>
 * <ul>
 *   <li>The JDBC database driver has to be available via the classpath.</li>
 *   <li>The JDBC database driver needs to implement <code>ConnectionPoolDataSource</code> interface.</li>
 * </ul>
 * <b><u>Supported (tested) RDBMS:</u></b>
 * <ul>
 *   <li>PostgreSQL</li>
 *   <li>MySQL</li>
 *   <li>Hypersonic 2 (H2)</li>
 *   <li>DB2</li>
 *   <li>SQL-Server</li>
 *   <li>Oracle</li>
 * </ul>
 * <p>
 * This class uses the the Java Reflection API to load the database driver
 * on the fly. The application (or in the end this class) knows the database to
 * use. Using the full class name of the concrete database driver implementation
 * of {@link javax.sql.DataSource} or even better the
 * {@link javax.sql.ConnectionPoolDataSource} this class will initialize a
 * <code>DataSource</code> object.
 * </p>
 * <p>
 * Using the concrete implementation of the database driver this class
 * will setup the connection to the database by calling methods of the 
 * <code>DataSource</code> implementation. Because this class has no knowledge
 * about the methods supported by this <code>DataSource</code> implementation
 * of the database driver it uses the Java Reflection API once again.
 * Using the Java Reflection API the methods supported by the
 * <code>DataSource</code> implementation can be identified to call them as
 * needed.
 * </p>
 *
 */
public class DBTools {
	/**
	 * Internal singleton self reference.
	 */
	private volatile static DBTools instance;
	
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(DBTools.class);
	
	
	/**
	 * Connection pool
	 */
	private DataSource dbConnPoolDataSource = null;
	
	
	/**
	 * Database driver class for the pooled DataSource
	 */
	private static String dbDriverDataSourceClassName = null;
	
	/**
	 * Database DataSource name
	 */
	private static String dbDataSourceName = null;
	
	/**
	 * Database Url
	 */
	private static String dbUrl = null;
	
	/**
	 * Database driver type (only Oracle - 'thin')
	 */
	private static String dbDriverType = null;
	
	/**
	 * Database server name
	 */
	private static String dbServerName = null;
	
	/**
	 * Database port number
	 */
	private static int dbPortNumber = 0;
	
	/**
	 * Database name
	 */
	private static String dbName = null;
	
	/**
	 * Database user
	 */
	private static String dbUser = null;
	
	/**
	 * Database password
	 */
	private static String dbPassword = null;
	
	/**
	 * Database minimum connections in the connection pool
	 */
	private static int dbMinConnections = 5;
	
	/**
	 * Database maximum connections in the connection pool
	 */
	private static int dbMaxConnections = 10;
	
	/**
	 * RegEx Pattern object
	 */
	private Pattern pattern = null;
	
	/**
	 * RegEx Matcher object
	 */
	private Matcher matcher = null;
	
	/**
	 * Generic RegEx to separate the JDBC URL into the following
	 * groups:
	 * <ul>
	 * <li>dbType: 'mysql', 'postgresql', 'oracle:thin', etc. (matcher.group(1));
	 * <li>dbServerName: hostname or IP address (matcher.group(2))
	 * <li>dbPortNumber: port number - optional (matcher.group(3))
	 * <li>dbName: database name (matcher.group(4))
	 * <li>dbParameterList: parameters for the database - optional (matcher.group(5))</li>
	 * </ul>
	 */
	public final static String jdbcUrlRegExPattern = "^jdbc:   # has to start with 'jdbc'\n" +
	"(postgresql|mysql|oracle:thin|h2:   # group 1 start - database type\n" + 
	"  (?:ssl|tcp|                       # start of additional H2 parameters\n" +
	"    (?:file:)?                      # not fetched 'file:' - optional\n"+
	"    (?:~/)?                         # not fetched '~/' - optional\n" +
	"  )                                 # end of additional H2 db driver settings\n" +
	")                                   # group 1 end\n" +
	"(?:://|:@)?                         # not fetched '://' or ':@' - optional\n" +
	"((?:(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))  # IP\n" +
	"|                                   # or\n" +
	"(?:(?:(?:(?:[A-Z|a-z])(?:[\\w|-]){0,61}(?:[\\w]?[.]))*)(?:(?:[A-Z|a-z])(?:[\\w|-]){0,61}(?:[\\w]?))))  # Hostname\n" +
	"(?::([0-9]{1,5}))?                  # group 3 - a not fetched ':' follows the port number with 1..5 digits - optional\n" +
	"(?:/|:)                             # not fetched '/' or ':'\n" +
	"([A-Z|a-z|0-9|_|$]{1,32})         # group 4 - max 32 chars for the database name\n" +
	"([/?;].*)?$                         # group 5 - starting with the char group '/', '?' or ';' or nothing at all\n";
	
	/**
	 * Default hidden (private) constructor.
	 */	
	private DBTools() {
		pattern = Pattern.compile(DBTools.jdbcUrlRegExPattern, java.util.regex.Pattern.COMMENTS);
		
		try {
			readDBProperties();
		} catch (Exception ex) {
			logger.error("Error reading properties " +
					"DB_CONNECTION_STRING, " +
					"DB_CONNECTION_USER, " +
					"DB_CONNECTION_PW, " +
					"DB_CONNECTIONPOOL_DRIVERCLASS, " +
					"DB_CONNECTIONPOOL_MINCONNECTIONS, " +
					"DB_CONNECTIONPOOL_MAXCONNECTIONS from main " +
					"configuration. Please make sure that all " +
					"properties exist in 'AppConfig.properties' file.");
			ex.printStackTrace();
		}
		
		// Create a DataSource connection pool for the database. 
		createDBDataSource();
	}
	
	/**
	 * This method will create the DBTools singleton if it doesn't exist
	 * and return the DBTools instance.
	 * 
	 * @return DBTools singleton object
	 */
	public static DBTools getInstance() {
		if (instance == null) {
			synchronized(DBTools.class) {
				if (instance == null) {
					instance = new DBTools();
				} // end if
			} // end synchronized
		} // end if
		return instance;
	}
	
	/**
	 * This method will get a {@link Connection} from the
	 * {@link PooledConnection} of the {@link ConnectionPoolDataSource}
	 * object created for the database.
	 * 
	 * @return {@link PooledConnection} from the database.
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		logger.trace("Getting database connection from pool...");
		return dbConnPoolDataSource.getConnection();
	}
	
	/**
	 * This method is reading all required database parameters from the
	 * configuration file.
	 * 
	 * @throws Exception
	 */
	private void readDBProperties() throws Exception {
		String helperParam = null;
		dbDriverDataSourceClassName = AppConfig.getProperty("DB_CONNECTIONPOOL_DRIVERCLASS");
		
		dbUrl = AppConfig.getProperty("DB_CONNECTION_STRING");
		
		matcher = pattern.matcher(dbUrl);
		
		String extractedDbType = null;
		String extractedDbServerHostnameOrIP = null;
		String extractedDbPortNumber = null;
		String extractedDbName = null;
		String extractedDbParameterList = null;
		
		/*
		 * Use RegEx to break the JDBC URL down to relevant details.
		 */
		if (matcher.matches()) {
			/*
			 * Get the database type ('mysql', 'postgresql', 'oracle:thin', etc.)
			 */
			extractedDbType = matcher.group(1);
			if (extractedDbType != null) {
				extractedDbType = extractedDbType.trim();
			}
			
			/*
			 * Get the database hostname or IP address
			 */
			extractedDbServerHostnameOrIP = matcher.group(2);
			if (extractedDbServerHostnameOrIP != null) {
				extractedDbServerHostnameOrIP = extractedDbServerHostnameOrIP.trim();
			}
			
			/*
			 * Get the optional database port number
			 */
			extractedDbPortNumber = matcher.group(3);
			if (extractedDbPortNumber != null) {
				extractedDbPortNumber = extractedDbPortNumber.trim();
			}
			
			/*
			 * Get the database name
			 */
			extractedDbName = matcher.group(4);
			if (extractedDbName != null) {
				extractedDbName = extractedDbName.trim();
			}
			
			/*
			 * Get the database parameter list
			 */
			extractedDbParameterList = matcher.group(5);
			if (extractedDbParameterList != null) {
				extractedDbParameterList = extractedDbParameterList.trim();
			}
		} else {
			logger.error("Could not match the given URL (" + dbUrl + ") using" +
					"the existing RegEx:\n" + 
					DBTools.jdbcUrlRegExPattern);
		}
		
		/*
		 * Set the database name
		 */
		if (extractedDbName != null && extractedDbName.length() > 0) {
			dbName = extractedDbName;
		} else {
			throw new PropertyFileNotFoundException("Could not extract the name of the database from the JDBC URL.");
		}
		
		/*
		 * Set the data source name by using the original database
		 * name and append 'ds'.
		 */
		dbDataSourceName = dbName + "ds";
		
		/*
		 * Only used by Oracle ('thin') which needs a configuration setting.
		 */
		dbDriverType = (extractedDbType.toLowerCase().contains("oracle:thin")?"thin":null);
		
		/*
		 * Set the database server name setting
		 */
		if (extractedDbServerHostnameOrIP == null) {
			dbServerName = "127.0.0.1";
		} else {
			dbServerName = extractedDbServerHostnameOrIP;
		}
		
		/*
		 * Set the database port number if set (optional)
		 */
		dbPortNumber = 0;
		try {
			if (extractedDbPortNumber != null && extractedDbPortNumber.length() > 0) {
				dbPortNumber = GlobalTools.getIntValue(extractedDbPortNumber);
			} else {
				// extractedDbPortNumber is null
				logger.warn("The database port number for the database is not set in the property file (the driver should fall back to the default value for this database).");
			}
		} catch (NumberFormatException ex) {
			logger.error("The database port number for the database could not be converted to a number: " + ex);
		}
		
		/*
		 * Set the database user and password
		 */
		dbUser = AppConfig.getProperty("DB_CONNECTION_USER");
		dbPassword = AppConfig.getProperty("DB_CONNECTION_PW");
		
		try {
			helperParam = AppConfig.getProperty("DB_CONNECTIONPOOL_MINCONNECTIONS");
			if (helperParam != null && helperParam.length() > 0) {
				dbMinConnections = GlobalTools.getIntValue(helperParam);
			} else {
				// helperParam is null or empty
				logger.error("The database minimum connections is not set in the property file (using Default of " + dbMinConnections + ").");
			}
		} catch (NumberFormatException ex) {
			logger.error("The database minimum connections could not be converted to a number (using Default of " + dbMinConnections + "): " + ex);
		}
		
		try {
			helperParam = AppConfig.getProperty("DB_CONNECTIONPOOL_MAXCONNECTIONS");
			if (helperParam != null && helperParam.length() > 0) {
				dbMaxConnections = GlobalTools.getIntValue(helperParam);
			} else {
				// helperParam is null or empty
				logger.error("The database maximum connections is not set in the property file (using Default of " + dbMaxConnections + ").");
			}
		} catch (NumberFormatException ex) {
			logger.error("The database maximum connections could not be converted to a number (using Default of " + dbMaxConnections + "): " + ex);
		}
	}
	
	/**
	 * <p>
	 * This method will create a pooled {@link DataSource} for the database
	 * by using reflection to load classes by name. After the instance
	 * of the class has been created methods are searched and called with
	 * the correct parameters to setup the connection pool.
	 * </p>
	 * <p>
	 * The parameters needed to setup have been read from the global
	 * configuration and are stored in variables. 
	 * </p>
	 * <p>Below common classes and parameters are listed for some databases:</p>
	 * <b>PostgreSQL</b><br>
	 * <pre>
	 * dataSourceClassName=org.postgresql.jdbc3.Jdbc3ConnectionPool
	 * or eventually dataSourceClassName=org.postgresql.ds.PGConnectionPoolDataSource
	 * servername=localhost
	 * serverportnumber=5432
	 * </pre>
	 * </p>
	 *
	 * <p>
	 * <b>Oracle</b><br>
	 * </b>
	 * <pre>
	 * dataSourceClassName=oracle.jdbc.pool.OracleConnectionPoolDataSource
	 * servername=localhost
	 * serverportnumber=1521
	 * </pre>
	 * </p>
	 *
	 * <p>
	 * <b>MySQL</b><br>
	 * <pre>
	 * dataSourceClassName=com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource
	 * servername=localhost
	 * serverportnumber=3306
	 * </pre>
	 * </p>
	 * 
	 * <p>
	 * <b>H2/Hypersonic 2</b><br>
	 * <pre>
	 * dataSourceClassName=org.h2.jdbcx.JdbcDataSource (or eventually 
	 * org.h2.jdbcx.JdbcConnectionPool)
	 * servername=localhost
	 * serverportnumber=9092 (or 8084 or 8085 for SSL/TLS - the documentation
	 * may list other ports as well but some are used to the web frontend)
	 * </pre>
	 * </p>
	 * 
	 * <b>MS SQL Server</b><br>
	 * <pre>
	 * for the jTDS driver:
	 * dataSourceClassName=net.sourceforge.jtds.jdbcx.JtdsDataSource
	 * or for the original Microsoft driver:
	 * dataSourceClassName=com.microsoft.sqlserver.jdbc.SQLServerXADataSource
	 * servername=localhost
	 * serverportnumber=1433 (eventually UDP port 1434)
	 * </pre>
	 * </p>
	 * 
	 * <b>Apache Derby (aka Java DB)</b><br>
	 * <pre>
	 * dataSourceClassName=org.apache.derby.jdbc.ClientConnectionPoolDataSource
	 * or dataSourceClassName=org.apache.derby.jdbc.EmbeddedConnectionPoolDataSource
	 * servername=localhost
	 * serverportnumber=1527
	 * </pre>
	 * </p>
	 */
	private void createDBDataSource() {
		logger.info("Creating DB DataSource...");
		
		/*
		 * Do some basic checks on the int values given as
		 * parameter and log any errors
		 */
		if (dbPortNumber < 0) {
			logger.warn("Database port number parameter is negative.");
		}
		
		/*
		 * Switch number of connections values when 'min > max'...
		 */
		if (dbMinConnections > dbMaxConnections) {
			int tmpIntValue = dbMinConnections;
			dbMinConnections = dbMaxConnections;
			dbMaxConnections = tmpIntValue;
		}
		
		/*
		 * Check min connections
		 */
		if (dbMinConnections < 0) {
			logger.warn("Database minimum connections parameter is 0 or negative. Setting default of 5 connections.");
			dbMinConnections = 5;
		}
		
		/*
		 * Check max connections
		 */
		if (dbMaxConnections <= 0) {
			logger.warn("Database maximum connections parameter is 0 or negative. Setting default of 10 connections.");
			dbMaxConnections = 10;
		}
		
		/*
		 * Try to initiate the driver class and call methods to configure
		 * the class.
		 */
		try {
			logger.trace("Right before Class.forName(..) call.");
			Class<?> myDriverClass = Class.forName(dbDriverDataSourceClassName);
			logger.trace("Directly after Class.forName(..) call has been executed...up next is calling myDriverClass.newInstance()");
			Object myDriverObject = myDriverClass.newInstance();
			logger.trace("Directly after myDriverClass.newInstance() call has been executed.");
			
			// =================== DEBUG - START ===================
			StringBuffer supportedMethodsStringBuffer = new StringBuffer();
			java.lang.reflect.Method myDriverClassMethods[] = myDriverClass.getMethods();
			
			for (Method method : myDriverClassMethods) {
				supportedMethodsStringBuffer.append(method.getName());
				supportedMethodsStringBuffer.append(", ");
			}
			
			logger.trace("The " + dbDriverDataSourceClassName + " supports the methods " + (supportedMethodsStringBuffer.toString().length() > 2?(supportedMethodsStringBuffer.toString().substring(0, supportedMethodsStringBuffer.toString().length()-3)):supportedMethodsStringBuffer.toString()) );
			myDriverClassMethods = null;
			// =================== DEBUG - STOP ====================
			
			// Initialize variable to store a method name 
			java.lang.reflect.Method myDriverClassMethod = null;
			
			/*
			 * Variables used to check if:
			 * 'setUrl' (setUrlSupported = true)
			 * or 
			 * 'setURL' (setUrlUpperCaseSupported = true)
			 * is supported.
			 */
			boolean setUrlSupported = false;
			boolean setUrlUpperCaseSupported = false;
			
			// Test if 'setUrl' is supported (Oracle/MySQL)!
			try {
				myDriverClassMethod = myDriverClass.getMethod("setUrl", String.class);
				setUrlSupported = true;
			} catch (NoSuchMethodException ex) {}
			
			// Test if 'setURL' is supported (only H2)!
			try {
				myDriverClassMethod = myDriverClass.getMethod("setURL", String.class);
				setUrlUpperCaseSupported = true;
			} catch (NoSuchMethodException ex) {}
			
			/*
			 * In the following lines the class is asked for the supported
			 * methods. Each method is called if available with the correct
			 * parameter type. If a method doesn't exist it is written
			 * to the log as INFO.
			 * 
			 * Special parameters should be setUrl (Oracle/MySQL but not e.g.
			 * PostgreSQL), setURL (H2 - with upper case 'URL'), setDriverType (Oracle only),
			 * setInitialConnections (PostgreSQL only), setMinConnections (MySQL),
			 * setMinLimit (Oracle) and so on.
			 */
			
			// Find out if the method "setDataSourceName" is available and call it.
			try {
				myDriverClassMethod = myDriverClass.getMethod("setDataSourceName", String.class);
				myDriverClassMethod.invoke(myDriverObject, dbDataSourceName);
			} catch (NoSuchMethodException ex) {
				logger.trace("Method is not supported by DBDriver: " + ex);
			} catch (InvocationTargetException ex) {
				logger.error("Error calling method: " + ex);
			}
			
			if ((setUrlSupported || setUrlUpperCaseSupported) && dbUrl != null && dbUrl.trim().length() > 0) {
				try {
					logger.trace("Setting URL: " + dbUrl);
					if (setUrlSupported) {
						myDriverClassMethod = myDriverClass.getMethod("setUrl", String.class);
					} else if (setUrlUpperCaseSupported) {
						myDriverClassMethod = myDriverClass.getMethod("setURL", String.class);
					}
					myDriverClassMethod.invoke(myDriverObject, dbUrl);
				} catch (NoSuchMethodException ex) {
					logger.trace("Method is not supported by DBDriver (only Oracle): " + ex);
				} catch (InvocationTargetException ex) {
					logger.error("Error calling method: " + ex);
				}
			} else {
				// Find out if the method "setDriverType" is available and call it.
				// Note: The setDriverType method is only available in Oracle (for 'thin')!
				try {
					myDriverClassMethod = myDriverClass.getMethod("setDriverType", String.class);
					if (dbDriverType != null) {
						myDriverClassMethod.invoke(myDriverObject, dbDriverType);
					}
				} catch (NoSuchMethodException ex) {
					logger.trace("Method is not supported by DBDriver (only Oracle): " + ex);
				} catch (InvocationTargetException ex) {
					logger.error("Error calling method: " + ex);
				}
				
				
				// Find out if the method "setServerName" is available and call it.
				try {
					myDriverClassMethod = myDriverClass.getMethod("setServerName", String.class);
					myDriverClassMethod.invoke(myDriverObject, dbServerName);
				} catch (NoSuchMethodException ex) {
					logger.trace("Method is not supported by DBDriver: " + ex);
				} catch (InvocationTargetException ex) {
					logger.error("Error calling method: " + ex);
				}
				
				
				// Find out if the method "setPortNumber" available and call it.
				try {
					myDriverClassMethod = myDriverClass.getMethod("setPortNumber", int.class);
					if (dbPortNumber > 0) {
						myDriverClassMethod.invoke(myDriverObject, dbPortNumber);
					} else {
						logger.warn("Database port number has not been set (is currently " + dbPortNumber + ")");
					}
				} catch (NoSuchMethodException ex) {
					logger.trace("Method is not supported by DBDriver: " + ex);
				} catch (InvocationTargetException ex) {
					logger.error("Error calling method: " + ex);
				}
				
				
				// Find out if the method "setDatabaseName" is available and call it.
				try {
					myDriverClassMethod = myDriverClass.getMethod("setDatabaseName", String.class);
					myDriverClassMethod.invoke(myDriverObject, dbName);
				} catch (NoSuchMethodException ex) {
					logger.trace("Method is not supported by DBDriver: " + ex);
				} catch (InvocationTargetException ex) {
					logger.error("Error calling method: " + ex);
				}
			} // end if (setUrlSupported && ..) [...] else [...]
			
			
			// Find out if the method "setUser" is available and call it.
			try {
				myDriverClassMethod = myDriverClass.getMethod("setUser", String.class);
				myDriverClassMethod.invoke(myDriverObject, dbUser);
			} catch (NoSuchMethodException ex) {
				logger.trace("Method is not supported by DBDriver: " + ex);
			} catch (InvocationTargetException ex) {
				logger.error("Error calling method: " + ex);
			}
			
			
			// Find out if the method "setPassword" is available and call it.
			try {
				myDriverClassMethod = myDriverClass.getMethod("setPassword", String.class);
				myDriverClassMethod.invoke(myDriverObject, dbPassword);
			} catch (NoSuchMethodException ex) {
				logger.trace("Method is not supported by DBDriver: " + ex);
			} catch (InvocationTargetException ex) {
				logger.error("Error calling method: " + ex);
			}
			
			
			// Find out if the method "setInitialConnections" is available and call it.
			// Note: The setInitialConnections is only available in PostgreSQL!
			try {
				myDriverClassMethod = myDriverClass.getMethod("setInitialConnections", int.class);
				myDriverClassMethod.invoke(myDriverObject, dbMinConnections);
			} catch (NoSuchMethodException ex) {
				logger.trace("Method is not supported by DBDriver (only PostgreSQL): " + ex);
			} catch (InvocationTargetException ex) {
				logger.error("Error calling method: " + ex);
			}
			
			
			// Find out if the method "setMinConnections" is available and call it.
			// Note: The setMinConnections is only available in MySQL!
			try {
				myDriverClassMethod = myDriverClass.getMethod("setMinConnections", int.class);
				myDriverClassMethod.invoke(myDriverObject, dbMinConnections);
			} catch (NoSuchMethodException ex) {
				logger.trace("Method is not supported by DBDriver (only MySQL): " + ex);
			} catch (InvocationTargetException ex) {
				logger.error("Error calling method: " + ex);
			}
			
			
			// Find out if the method "setMinLimit" is available and call it.
			// Note: The setMinLimit method is only available in Oracle!
			try {
				myDriverClassMethod = myDriverClass.getMethod("setMinLimit", int.class);
				myDriverClassMethod.invoke(myDriverObject, dbMinConnections);
			} catch (NoSuchMethodException ex) {
				logger.trace("Method is not supported by DBDriver (only Oracle): " + ex);
			} catch (InvocationTargetException ex) {
				logger.error("Error calling method: " + ex);
			}
			
			
			// Find out if the method "setMaxConnections" is available and call it.
			// Note: The setMaxConnections is available in PostgreSQL/MySQL/H2!
			try {
				myDriverClassMethod = myDriverClass.getMethod("setMaxConnections", int.class);
				myDriverClassMethod.invoke(myDriverObject, dbMaxConnections);
			} catch (NoSuchMethodException ex) {
				logger.trace("Method is not supported by DBDriver (only PostgreSQL/MySQL): " + ex);
			} catch (InvocationTargetException ex) {
				logger.error("Error calling method: " + ex);
			}
			
			
			// Find out if the method "setMaxLimit" is available and call it.
			// Note: The setMaxLimit method is only available in Oracle!
			try {
				myDriverClassMethod = myDriverClass.getMethod("setMaxLimit", int.class);
				myDriverClassMethod.invoke(myDriverObject, dbMaxConnections);
			} catch (NoSuchMethodException ex) {
				logger.trace("Method is not supported by DBDriver (only Oracle): " + ex);
			} catch (InvocationTargetException ex) {
				logger.error("Error calling method: " + ex);
			}
			
			
			// Find out if the method "setDefaultAutoCommit" is available and call it.
			// Note: The setDefaultAutoCommit method is only available in MySQL!
			try {
				myDriverClassMethod = myDriverClass.getMethod("setDefaultAutoCommit", boolean.class);
				myDriverClassMethod.invoke(myDriverObject, true);
			} catch (NoSuchMethodException ex) {
				logger.trace("Method is not supported by DBDriver (only MySQL): " + ex);
			} catch (InvocationTargetException ex) {
				logger.error("Error calling method: " + ex);
			}
			
			dbConnPoolDataSource = (DataSource) myDriverObject;
			
		} catch (ClassNotFoundException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} catch (IllegalAccessException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		} catch (InstantiationException ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
		}
	}
	
	/**
	 * This method will dispose the DBTools object.
	 * First all connections will be closed and then
	 * the instance is set to null to be fetched by
	 * the garbage collector.
	 */
	public void dispose() {
		if (dbConnPoolDataSource != null) {
			// TODO: Check if there is a dispose() method available in the current implementation and call it before setting to null.
			dbConnPoolDataSource = null;
		}
		System.gc();
		instance = null;
		System.gc();
	}
}