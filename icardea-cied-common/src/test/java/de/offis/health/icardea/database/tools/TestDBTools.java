/**
 * 
 */
package de.offis.health.icardea.database.tools;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.offis.health.icardea.InitJUnitTestSuite;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * <p>
 * This class will test the common DBTools module used to access the database.
 * </p>
 * <p>
 * Before the test can be used the database settings have to be set, which is
 * done by the {@link #setUp()} and {@link #tearDown()} methods.
 * </p>
 * 
 *
 */
public class TestDBTools {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(TestDBTools.class);
	
	/**
	 * The H2 database server for the tests.
	 */
	private Server h2DbServer = null;
	
	/**
	 * H2 data directory to be used;
	 */
	private final String h2DataDir = GlobalTools.USERDIR + GlobalTools.FILESEPARATOR + "h2data";
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Call general initialization class (required for log4j initialisation)
		InitJUnitTestSuite.setUpBeforeClass();
		
		// Logger
		logger.trace("setUp() called in " + getClass());
		
		// Start the H2 TCP Server
		logger.info("Using the following path to store the H2 database data: " + h2DataDir);
		h2DbServer = Server.createTcpServer(new String[] {"-web", "-tcp", "-tcpDaemon", "-baseDir", h2DataDir}).start();
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		logger.info("tearDown() called in " + getClass());
		
		// Remove current DBTools settings
		DBTools.getInstance().dispose();
		
		// Shutdown the H2 database server
		if (h2DbServer != null) {
			h2DbServer.stop();
		}
	}
	
	/**
	 * Testing if the DB connection can be established.
	 * 
	 * @throws IOException
	 * @throws Exception
	 */
	@Test
	public void createDBConnection() throws IOException, Exception {
		boolean isSuccessful = false;
		Connection connection = null;
		PreparedStatement prepStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = DBTools.getInstance().getConnection();
			prepStatement = connection.prepareStatement("SELECT SUM(2+2)");
			resultSet = prepStatement.executeQuery();
			if (resultSet.next()) {
				logger.info(resultSet.getString(1));
				isSuccessful = resultSet.getString(1).equalsIgnoreCase("4");
			}
		} catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
			throw ex;
		} finally {
			// Closing ResultSet
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the ResultSet. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing PreparedStatement
			if (prepStatement != null) {
				try {
					prepStatement.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the PreparedStatement. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing Connection (returning it to the Connection Pool
			if (connection != null && !connection.isClosed()) {
				try {
					connection.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the Connection. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			assertTrue(isSuccessful);
		} // end try..catch..finally
	}
	
	/**
	 * Testing if multiple database connections can be established.
	 * 
	 * @throws IOException
	 * @throws Exception
	 */
	@Test
	public void createMultipleDBConnections() throws IOException, Exception {
		boolean isSuccessful = false;
		
		Connection connection1 = null;
		PreparedStatement prepStatement1 = null;
		ResultSet resultSet1 = null;
		
		Connection connection2 = null;
		PreparedStatement prepStatement2 = null;
		ResultSet resultSet2 = null;
		
		Connection connection3 = null;
		PreparedStatement prepStatement3 = null;
		ResultSet resultSet3 = null;
		
		Connection connection4 = null;
		PreparedStatement prepStatement4 = null;
		ResultSet resultSet4 = null;
		
		try {
			connection1 = DBTools.getInstance().getConnection();
			prepStatement1 = connection1.prepareStatement("SELECT SUM(1+1)");
			resultSet1 = prepStatement1.executeQuery();
			if (resultSet1.next()) {
				logger.info(resultSet1.getString(1));
				isSuccessful = resultSet1.getString(1).equalsIgnoreCase("2");
			}
			
			connection2 = DBTools.getInstance().getConnection();
			prepStatement2 = connection2.prepareStatement("SELECT SUM(2+2)");
			resultSet2 = prepStatement2.executeQuery();
			if (resultSet2.next()) {
				logger.info(resultSet2.getString(1));
				isSuccessful = isSuccessful && resultSet2.getString(1).equalsIgnoreCase("4");
			}
			
			connection3 = DBTools.getInstance().getConnection();
			prepStatement3 = connection3.prepareStatement("SELECT SUM(3+3)");
			resultSet3 = prepStatement3.executeQuery();
			if (resultSet3.next()) {
				logger.info(resultSet3.getString(1));
				isSuccessful = isSuccessful && resultSet3.getString(1).equalsIgnoreCase("6");
			}
			
			connection4 = DBTools.getInstance().getConnection();
			prepStatement4 = connection4.prepareStatement("SELECT SUM(4+4)");
			resultSet4 = prepStatement4.executeQuery();
			if (resultSet4.next()) {
				logger.info(resultSet4.getString(1));
				isSuccessful = isSuccessful && resultSet4.getString(1).equalsIgnoreCase("8");
			}
		} catch (Exception ex) {
			logger.error(ex);
			logger.error(GlobalTools.getExceptionTraceLog(ex));
			throw ex;
		} finally {
			// Closing 1st ResultSet
			if (resultSet1 != null) {
				try {
					resultSet1.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the ResultSet. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing 2nd ResultSet
			if (resultSet2 != null) {
				try {
					resultSet2.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the ResultSet. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing 3rd ResultSet
			if (resultSet3 != null) {
				try {
					resultSet3.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the ResultSet. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing 4th ResultSet
			if (resultSet4 != null) {
				try {
					resultSet4.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the ResultSet. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			
			// Closing 1st PreparedStatement
			if (prepStatement1 != null) {
				try {
					prepStatement1.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the PreparedStatement. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing 2nd PreparedStatement
			if (prepStatement2 != null) {
				try {
					prepStatement2.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the PreparedStatement. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing 3rd PreparedStatement
			if (prepStatement3 != null) {
				try {
					prepStatement3.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the PreparedStatement. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing 4th PreparedStatement
			if (prepStatement4 != null) {
				try {
					prepStatement4.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the PreparedStatement. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			
			// Closing 1st Connection (returning it to the Connection Pool)
			if (connection1 != null && !connection1.isClosed()) {
				try {
					connection1.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the 1st Connection. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing 2nd Connection (returning it to the Connection Pool)
			if (connection2 != null && !connection2.isClosed()) {
				try {
					connection2.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the 2nd Connection. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing 3rd Connection (returning it to the Connection Pool)
			if (connection3 != null && !connection3.isClosed()) {
				try {
					connection3.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the 3rd Connection. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing 4th Connection (returning it to the Connection Pool)
			if (connection4 != null && !connection4.isClosed()) {
				try {
					connection4.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the 4th Connection. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			assertTrue(isSuccessful);
		} // end try..catch..finally
	}
	
	/**
	 * Testing if the transaction of the DB connection is working.
	 * 
	 * @throws IOException
	 * @throws Exception
	 */
	@Test
	public void transactionalDBConnection() throws IOException, Exception {
		boolean isSuccessful = false;
		Connection connection1 = null;
		PreparedStatement prepStatement1 = null;
		
		Connection connection2 = null;
		PreparedStatement prepStatement2 = null;
		ResultSet resultSet2 = null;
		
		try {
			connection1 = DBTools.getInstance().getConnection();
			
			// Turn off transactions and drop table if it exists
			connection1.setAutoCommit(true);
			prepStatement1 = connection1.prepareStatement("DROP TABLE IF EXISTS testsum;");
			prepStatement1.execute();
			
			// Enable transaction and create new table
			connection1.setAutoCommit(false);
			prepStatement1 = connection1.prepareStatement("CREATE TABLE testsum (sumresult integer NOT NULL);");
			prepStatement1.execute();
			
			// Fill new table with one row
			prepStatement1 = connection1.prepareStatement("INSERT INTO testsum (sumresult) SELECT SUM(2+2);");
			prepStatement1.executeUpdate();
			
			
			/* 
			 * Now we open a second database connection and try to
			 * get the data before a commit has been executed on the
			 * 1st connection! This should fail!
			 */
			connection2 = DBTools.getInstance().getConnection();
			connection2.setAutoCommit(true);
			prepStatement2 = connection2.prepareStatement("SELECT sumresult FROM testsum WHERE sumresult=4;");
			resultSet2 = prepStatement2.executeQuery();
			
			if (resultSet2.next()) {
				// Something is wrong if we get here....
				assertFalse(true);
			}
			
			/*
			 * Now we commit the changes on the 1st connection.
			 * The new query on the 2nd connection should get the correct result.
			 */
			connection1.commit();
			
			resultSet2 = prepStatement2.executeQuery();
			if (resultSet2.next()) {
				logger.info(resultSet2.getString(1));
				isSuccessful = resultSet2.getString(1).equalsIgnoreCase("4");
			}
			
		} catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
			throw ex;
		} finally {
			// Closing ResultSet
			if (resultSet2 != null) {
				try {
					resultSet2.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the ResultSet. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing PreparedStatement
			if (prepStatement1 != null) {
				try {
					prepStatement1.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the PreparedStatement. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			if (prepStatement2 != null) {
				try {
					prepStatement2.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the PreparedStatement. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			// Closing Connection (returning it to the Connection Pool
			if (connection1 != null && !connection1.isClosed()) {
				try {
					connection1.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the Connection. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			if (connection2 != null && !connection2.isClosed()) {
				try {
					connection2.close();
				} catch (SQLException ex) {
					logger.error("An error occurred while closing the Connection. " + GlobalTools.getExceptionTraceLog(ex));
				}
			}
			
			assertTrue(isSuccessful);
		} // end try..catch..finally
	}
}