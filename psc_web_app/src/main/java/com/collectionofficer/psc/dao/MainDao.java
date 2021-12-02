package com.collectionofficer.psc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainDao {
	private String jdbcURL = "jdbc:mysql://localhost:3306/psc_web_app?allowPublicKeyRetrieval=true";
	private String jdbcUsername = "root";
	private String jdbcPassword = "Ruzna_421455";
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	
	//writing a method to get the connection of jdbc and inside it loading the driver also,
	//the following method will return the connection
	public Connection getConnection() {
		Connection connection = null;
		try {
			//loading the driver, jdbc driver is a variable assigned above
			Class.forName(jdbcDriver);
			//getting the connection using the driver manager class
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
}
