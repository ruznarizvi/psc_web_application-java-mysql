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
import com.collectionofficer.psc.bean.PaddyPricing;

public class PaddyPricingDao extends MainDao {
	
	private static final String SELECT_ALL_PADDY_PRICING_DETAILS = "select * from tbl_paddy";
//	private static final String SELECT_PADDY_PRICING_BY_ID = "select ";
	//generating constructor
	public PaddyPricingDao() {

	}
	
	//select all paddy pricing details 
	//storing all the paddy pricing details in the list and returning that list (Import list) (return type is the list)
	public List<PaddyPricing> selectAllPaddyPricingDetails() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		//collected paddy pricing details will be stored in the array list
		List<PaddyPricing> paddyPricings = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PADDY_PRICING_DETAILS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			
			while (rs.next()) {
				int paddy_Id = rs.getInt("paddy_Id");
				String paddy_Type = rs.getString("paddy_Type");
				double buying_price_per_Kg = rs.getDouble("buying_price_per_Kg");
				double selling_price_per_Kg = rs.getDouble("selling_price_per_Kg");
				
				PreparedStatement ps=null;
				ResultSet rq=null;							
									
				//creating the User object again and again and storing it in the user"s" array list	
					paddyPricings.add(new PaddyPricing(paddy_Id,paddy_Type, buying_price_per_Kg, selling_price_per_Kg));
				}			
		
		} catch (SQLException e) {
			printSQLException(e);
		}
		//returning the user"s" array list
		return paddyPricings;
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
					//and then running the get cause method to get the cause which is stored in 't'
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


