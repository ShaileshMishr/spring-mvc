package com.training.springmvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.springmvc.model.User;

@Repository
public class InsertData implements RegisterDao{
	public List<User> setUsers(String userN,String pasw){
		List<User> userList = new ArrayList<>();
		
		try {
		
		 
		 Connection con = DatabaseConnection.initializeDatabase();
	  
	             PreparedStatement ps = con
	                   .prepareStatement("insert into user1 values(?,?)");
	  
	             
	             
	             ps.setString(1,userN);
	             ps.setString(2,pasw);
	             ps.executeUpdate(); 
	  
	          }
     catch (Exception e) {
         e.printStackTrace();
     }
//		finally {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	//	}
		
	return userList;
}
}

