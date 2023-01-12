package com.training.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	protected static Connection initializeDatabase()
	        throws SQLException, ClassNotFoundException
	    {
	       
	        String dbDriver = "com.mysql.cj.jdbc.Driver";
	        String dbURL = "jdbc:mysql:// localhost:3306/";
	       
	        String dbName = "infinite";
	        String dbUsername = "root";
	        String dbPassword = "india@123";
	  
	        Class.forName(dbDriver);
	        Connection con = DriverManager.getConnection(dbURL + dbName,
	                                                     dbUsername, 
	                                                     dbPassword);
	        return con;
	    }

}
