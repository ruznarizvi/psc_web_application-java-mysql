package com.collectionofficer.psc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.collectionofficer.psc.bean.*;

public class LoginDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/psc_web_app?allowPublicKeyRetrieval=true";
	private String dbUname = "root";
	private String dbPassword = "Ruzna_421455";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public String validate(Login login) {
		loadDriver(dbDriver);
		Connection con = getConnection();

		boolean status = false;
		String statusNumber = "";
	
		String sqlCollectionOfficer = "select * from tbl_collection_officer where collection_officer_Email = ? and collection_officer_Password = ?";
		

		String[] sqlQueries = { sqlCollectionOfficer };

		PreparedStatement ps;
		for (int i = 0; i < sqlQueries.length; i++) {

			try {
				ps = con.prepareStatement(sqlQueries[i]);
				ps.setString(1, login.getCollection_officer_Email());
				ps.setString(2, login.getCollection_officer_Password());

				ResultSet rs = ps.executeQuery();
				status = rs.next();
				if (status) {
					statusNumber = i + "";
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		;

		return statusNumber;

	}

}
