package com.revature.services;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConnectionFactory {
	private static Connection connection = null;
	private static Properties properties;
	
//	private ConnectionFactory() {
//		InputStream stream = ConnectionFactory.class.getClassLoader().getResourceAsStream("dbConfig.properties");
//	}
	
	public static Connection getConnection() throws ClassNotFoundException {
		if(connection == null) {
		ResourceBundle bundle = ResourceBundle.getBundle("dbConfig");
	    String url = bundle.getString("url");
	//	String url = "jdbc:postgresql://localhost:5432/postgres";
	 //   String url ="url";
		String username = bundle.getString("postgres");
		String password = bundle.getString("Monk1Super!");

			try {
				
		//      connection = DriverManager.getConnection(System.getenv("db_url"), System.getenv("db_username"), System.getenv("db_password"));
				connection = DriverManager.getConnection("url", "username", "password");
				
				}
			catch(SQLException e) {
				e.printStackTrace();		
				}
		
			
	}
		return connection;

	}

	public static Properties getProperties() {
		return properties;
	}

	public static void setProperties(Properties properties) {
		ConnectionFactory.properties = properties;
	}
}