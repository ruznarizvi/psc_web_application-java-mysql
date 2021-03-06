package com.collectionofficer.psc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.collectionofficer.psc.bean.CollectPaddy;
import com.collectionofficer.psc.bean.RegionalCenter;

public class RegionalCenterDao extends MainDao{
	
	private static final String UPDATE_CURRENT_CAPACITY_SQL = "update tbl_regional_center set current_capacity = ? where regional_center_Id = ?;";
	
	//generating constructor
	public RegionalCenterDao() {

	}
	
	public boolean updateCurrentCapacity(RegionalCenter regionalCenter) throws SQLException {
		//rowUpdated variable of a boolean type 
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_CURRENT_CAPACITY_SQL);) {
			System.out.println("updated paddy:"+statement);
			//Calling the set string to set the name, email, and country
			statement.setInt(1, regionalCenter.getCurrent_capacity());
			statement.setInt(2, regionalCenter.getRegional_center_Id());
			
			//calling the executeUpdate method, here is where boolean comes
			//if its greater than 0 then only carry out the executeUpdate method
			//if its greater than 0 then rowUpdated will be true
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
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
