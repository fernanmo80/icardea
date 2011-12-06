package org.hl7;

import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;

public class DBConnection {
	public static Properties properties = new Properties();	
	private static Connection con = null;
	public static Connection getDBConnection() {
		if(con != null){
			return con;
		}
		try {
			properties.load(DBConnection.class.getClassLoader().getResourceAsStream("icardea.properties"));
			
			String dbServer = properties.getProperty("umls.mysql.host");
			String dbName = "metathesaurus";
			String dbUsername = properties.getProperty("umls.mysql.username");
			String dbPassword = properties.getProperty("umls.mysql.password");
			String driver = properties.getProperty("jdbc.driverClassName");
			Class.forName(driver).newInstance();

			System.out.println("DB Server:"+dbServer+" Username:"+ dbUsername + " Password:"+ dbPassword);

			con = DriverManager.getConnection("jdbc:mysql://" + dbServer + "/"
					+ dbName, dbUsername, dbPassword);

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return con;
	}
}