package com.collectionofficer.psc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.collectionofficer.psc.bean.CollectPaddy;
import com.collectionofficer.psc.bean.IssuedPayment;



public class IssuedPaymentDao extends MainDao {	
	
	private static final String INSERT_ISSUED_PAYMENT_DETAILS_SQL = "INSERT INTO tbl_issued_payment_details" + "(issued_status, farmer_Id, paddy_Id, total_weight,total_amount, purchase_date, regional_center_Id) VALUES " + " (?, ?, ?, ?, ?, ?, ?);";
//	private static final String DELETE_ISSUED_PADDY_SQL = "delete from tbl_issued_payment_details where issued_Id = ?;";
	
	//generating constructor
	public IssuedPaymentDao() {

	}
	
	public void insertIssuedPaymentDetails(IssuedPayment issuedPayment) throws SQLException {
		//show in the console
		System.out.println(INSERT_ISSUED_PAYMENT_DETAILS_SQL);
		// try-with-resource statement will auto close the connection.
		// calling the getconnection method to get the connection of the jdbc and assigning it to the connection object
		try (Connection connection = getConnection();
			//with the help of the connection object, we are creating the preparestatement inside that we have passed the insert query
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ISSUED_PAYMENT_DETAILS_SQL)) {
				
			//after that we are calling the set string method to set the name, email, and country
//			preparedStatement.setInt(1, collectPaddy.getCollection_officer_Id());
			preparedStatement.setString(1, issuedPayment.getIssued_status());
			preparedStatement.setInt(2, issuedPayment.getFarmer_Id());
			preparedStatement.setInt(3, issuedPayment.getPaddy_Id());
			preparedStatement.setInt(4, issuedPayment.getTotal_weight());
			preparedStatement.setInt(5, issuedPayment.getTotal_amount());
			preparedStatement.setDate(6, issuedPayment.getPurchase_date());
			preparedStatement.setInt(7, issuedPayment.getRegional_center_Id());
			
			System.out.println(preparedStatement);
			//finally we are calling the executeupdate method to run the query with the database to insert data
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			//we are calling a print sqlexception method to handle all the exceptions below we are writing the method
			printSQLException(e);
		}
	}
	


	
	
	private void printSQLException(SQLException ex) {
		// ex is the object of the sql exception
		for (Throwable e : ex) {
			//if the instance is of the sql exception then;
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				//print all sql error;
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				//and then running the getcause method to get the cause which is stored in 't'
				Throwable t = ex.getCause();
				//then we run a while loop to show the cause of the exception
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}


}