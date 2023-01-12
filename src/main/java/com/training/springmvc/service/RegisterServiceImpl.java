package com.training.springmvc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl {

	public boolean isUser_Registered(String username, String password) {

		boolean isValid1 = false;

		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/infinite";
	        String user = "root";
	        String pass = "india@123";
	        con = DriverManager.getConnection(url,user,pass);
	        PreparedStatement ps=con.prepareStatement(  
                    "insert into user1 values (?,?)");  
        ps.setString(1,username);
        ps.setString(2,password);
        ps.executeUpdate();  
	          	
	        	
	        }
	       
		
	        catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isValid1;
	}

}
