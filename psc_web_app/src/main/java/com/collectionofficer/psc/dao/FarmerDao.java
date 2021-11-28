package com.collectionofficer.psc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.collectionofficer.psc.bean.Farmer;


public class FarmerDao extends MainDao {

	
	private static final String SELECT_ALL_FARMER_DETAILS = "select * from tbl_farmer";
//	private static final String SELECT_PADDY_PRICING_BY_ID = "select ";
	//generating constructor
	public FarmerDao() {

	}
	
	//select all farmers method
	//storing all the farmers in the list and returning that list (Import list) (return type is the list)
	public List<Farmer> selectAllFarmers() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		//farmers list will be stored in the array list
		List<Farmer> farmers = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FARMER_DETAILS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			
			while (rs.next()) {
				int farmer_Id = rs.getInt("farmer_Id");
				String farmer_Name = rs.getString("farmer_Name");
				String farmer_Address = rs.getString("farmer_Address");
				int farmer_Contact = rs.getInt("farmer_Contact");
				Date registration_Date = rs.getDate("registration_Date");
				
				PreparedStatement ps=null;
				ResultSet rq=null;							
									
				//creating the User object again and again and storing it in the user"s" array list	
					farmers.add(new Farmer(farmer_Id,farmer_Name, farmer_Address, farmer_Contact,registration_Date));
				}			
		
		} catch (SQLException e) {
			printSQLException(e);
		}
		//returning the user"s" array list
		return farmers;
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


