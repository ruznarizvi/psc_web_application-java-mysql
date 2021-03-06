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


//using inheritance to pull database connection from mysql db
public class CollectPaddyDao extends MainDao{	
	
	private static final String INSERT_COLLECTED_PADDY_SQL = "INSERT INTO tbl_collected_paddy_details" + "(farmer_Id, paddy_Id, total_weight,total_amount,"
			+ " purchase_date, collection_officer_Id, regional_center_Id) VALUES " + " (?, ?, ?, ?, ?, ?, ?);";
	private static final String SELECT_COLLECTED_PADDY_BY_ID = "select collected_paddy_details_Id, farmer_Id, paddy_Id, total_weight from tbl_collected_paddy_details where collected_paddy_details_Id =?";
	private static final String SELECT_ALL_COLLECTED_PADDY = "select * from tbl_collected_paddy_details";
	private static final String DELETE_COLLECTED_PADDY_SQL = "delete from tbl_collected_paddy_details where collected_paddy_details_Id = ?;";
	private static final String UPDATE_COLLECTED_PADDY_SQL = "update tbl_collected_paddy_details set farmer_Id = ?,paddy_Id= ?, total_weight =? , total_amount = ? where collected_paddy_details_Id = ?;";

	
	//generating constructor
	public CollectPaddyDao() {

	}

	public void insertPaddy(CollectPaddy collectPaddy) throws SQLException {
		//show in the console
		System.out.println(INSERT_COLLECTED_PADDY_SQL);
		// try-with-resource statement will auto close the connection.
		// calling the getconnection method to get the connection of the jdbc and assigning it to the connection object
		try (Connection connection = getConnection();
			//with the help of the connection object, we are creating the prepared statement. Inside that we have passed the insert query
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_COLLECTED_PADDY_SQL)) {
				
			//after that we are calling the setInt and setDouble java method to set the values
			preparedStatement.setInt(1, collectPaddy.getFarmer_Id());
			preparedStatement.setInt(2, collectPaddy.getPaddy_Id());
			preparedStatement.setDouble(3, collectPaddy.getTotal_weight());
			preparedStatement.setDouble(4, collectPaddy.getTotal_amount());
			preparedStatement.setDate(5, collectPaddy.getPurchase_date());
			preparedStatement.setInt(6, collectPaddy.getCollection_officer_Id());
			preparedStatement.setInt(7, collectPaddy.getRegional_center_Id());
	
			System.out.println(preparedStatement);
			//finally we are calling the executeUpdate() method to run the query with the database to insert data
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			//we are calling a printSQLException method to handle all the exceptions below we are writing the method
			printSQLException(e);
		}
	}
	
	
	//select paddy by id method
	public CollectPaddy selectPaddy(int collected_paddy_details_Id) {
		//creating a collectPaddy object and assigning it null
		CollectPaddy collectPaddy = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_COLLECTED_PADDY_BY_ID);) {
			//setting the prepared method, the number '1' below is the index number of the above query (first question mark)
			preparedStatement.setInt(1, collected_paddy_details_Id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			//below the reason we are using executequery method instead of execute update method is because its going to return a result
			//storing the output of the method in the Resultset (we should import this)
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				//store the results into a variable
				int farmer_Id = rs.getInt("farmer_Id");
				int paddy_Id = rs.getInt("paddy_Id");
				int total_weight = rs.getInt("total_weight");
//				int collection_officer_Id = rs.getInt("collection_officer_Id");
				//passing it to the constructor, and passing it to the CollectedPaddy class in bean package
				collectPaddy = new CollectPaddy(collected_paddy_details_Id, farmer_Id, paddy_Id, total_weight);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return collectPaddy;
	}
	
	
	//select all users method
	//storing all the users in the list and returning that list (Import list) (return type is the list)
	public List<CollectPaddy> selectAllPaddy() {
		// using try-with-resources to avoid closing resources (boiler plate code)
		//collected paddies will be stored in the array list
		List<CollectPaddy> collectPaddies = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_COLLECTED_PADDY);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object.
			
			while (rs.next()) {
				int collected_paddy_details_Id = rs.getInt("collected_paddy_details_Id");
				int farmer_Id = rs.getInt("farmer_Id");
				int paddy_Id = rs.getInt("paddy_Id");
				int total_weight = rs.getInt("total_weight");
				
				PreparedStatement ps=null;
				ResultSet rq=null;				
				
				//String query = "select * from users";
				String query = "select paddy_Id,paddy_Type,selling_price_per_Kg,buying_price_per_Kg,head_office_Id from tbl_paddy where paddy_Id ='"+paddy_Id+"'";
				ps = connection.prepareStatement (query);
				rq = ps.executeQuery();
				
				while(rq.next()) {
					
					String paddy_Type = rq.getString("paddy_Type");				
					double buying_price_per_Kg = rq.getDouble("buying_price_per_Kg");
					int buying_price_per_Kg_int = rq.getInt("buying_price_per_Kg");
					int total_amount = buying_price_per_Kg_int*total_weight;  
				    long millis=System.currentTimeMillis();  
				    java.sql.Date date=new java.sql.Date(millis);
					Date purchase_date;			
					purchase_date = date;
				    
					
					PreparedStatement pt=null;
					ResultSet rz=null;				
					
					//String query = "select * from users";
					String queryz = "select farmer_Id,farmer_Name,farmer_Address,farmer_Contact,registration_Date, regional_center_Id from tbl_farmer where farmer_Id ='"+farmer_Id+"'";				
					pt = connection.prepareStatement (queryz);
					rz = pt.executeQuery();	
				
				while(rz.next()) {
									
				//creating the User object again and again and storing it in the user"s" array list
					String farmer_Name = rz.getString("farmer_Name");
					
				collectPaddies.add(new CollectPaddy(collected_paddy_details_Id,farmer_Id, paddy_Id,total_weight, paddy_Type, buying_price_per_Kg, farmer_Name, total_amount, purchase_date));
				}
				}
		}
		} catch (SQLException e) {
			printSQLException(e);
		}
		//returning the user"s" array list
		return collectPaddies;
	}
	
	
	//select all users method
	//storing all the users in the list and returning that list (Import list) (return type is the list)
	public List<CollectPaddy> selectRecentPaddy() {
		// using try-with-resources to avoid closing resources (boiler plate code)
		//collected paddies will be stored in the array list
		List<CollectPaddy> collectRecentPaddies = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_COLLECTED_PADDY);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object.
			
			while (rs.next()) {
				int collected_paddy_details_Id = rs.getInt("collected_paddy_details_Id");
				int farmer_Id = rs.getInt("farmer_Id");
				int paddy_Id = rs.getInt("paddy_Id");
				int total_weight = rs.getInt("total_weight");
				
				PreparedStatement ps=null;
				ResultSet rq=null;				
				
				//String query = "select * from users";
				String query = "select paddy_Id,paddy_Type,selling_price_per_Kg,buying_price_per_Kg,head_office_Id from tbl_paddy where paddy_Id ='"+paddy_Id+"'";
				ps = connection.prepareStatement (query);
				rq = ps.executeQuery();
				
				while(rq.next()) {
					
					String paddy_Type = rq.getString("paddy_Type");				
					double buying_price_per_Kg = rq.getDouble("buying_price_per_Kg");
					int buying_price_per_Kg_int = rq.getInt("buying_price_per_Kg");
					int total_amount = buying_price_per_Kg_int*total_weight;  
				    long millis=System.currentTimeMillis();  
				    java.sql.Date date=new java.sql.Date(millis);
					Date purchase_date;			
					purchase_date = date;
				    
					
					PreparedStatement pt=null;
					ResultSet rz=null;				
					
					//String query = "select * from users";
					String queryz = "select farmer_Id,farmer_Name,farmer_Address,farmer_Contact,registration_Date, regional_center_Id from tbl_farmer where farmer_Id ='"+farmer_Id+"'";				
					pt = connection.prepareStatement (queryz);
					rz = pt.executeQuery();	
				
				while(rz.next()) {
									
				//creating the User object again and again and storing it in the user"s" array list
					String farmer_Name = rz.getString("farmer_Name");
					
					collectRecentPaddies.add(new CollectPaddy(collected_paddy_details_Id,farmer_Id, paddy_Id,total_weight, paddy_Type, buying_price_per_Kg, farmer_Name, total_amount, purchase_date));
				}
				}
		}
		} catch (SQLException e) {
			printSQLException(e);
		}
		//returning the user"s" array list
		return collectRecentPaddies;
	}
	
	
	//update user method
	//boolean to check whether the update method is executed or not
	//updating the user by passing the object of the user
	public boolean updatePaddy(CollectPaddy collectPaddy) throws SQLException {
		//rowUpdated variable of a boolean type 
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_COLLECTED_PADDY_SQL);) {
			System.out.println("updated paddy:"+statement);
			//Calling the set string to set the name, email, and country
			statement.setLong(1, collectPaddy.getFarmer_Id());
			statement.setInt(2, collectPaddy.getPaddy_Id());
			statement.setDouble(3, collectPaddy.getTotal_weight());
			statement.setInt(4, collectPaddy.getTotal_amount());
			statement.setInt(5, collectPaddy.getCollected_paddy_details_Id());
			
			
			//calling the executeUpdate method, here is where boolean comes
			//if its greater than 0 then only carry out the executeUpdate method
			//if its greater than 0 then rowUpdated will be true
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
	
	//delete user method
	//deleting user according to the id
	public boolean deletePaddy(int collected_paddy_details_Id) throws SQLException {
		//rowDeleted variable of a boolean type 
		boolean rowDeleted;
		try (Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(DELETE_COLLECTED_PADDY_SQL);) {
			//setting the id
			statement.setInt(1, collected_paddy_details_Id);
			//calling the executeUpdate query
			//if its greater than 0 then rowDeleted will be true
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
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



