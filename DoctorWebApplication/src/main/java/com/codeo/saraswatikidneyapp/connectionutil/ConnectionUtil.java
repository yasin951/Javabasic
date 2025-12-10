package com.codeo.saraswatikidneyapp.connectionutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	private static final String driverClass = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/management";
	private static final String username = "root";
	static private final String password = "yasinmirza222";
	static Connection con = null;
	
	public static Connection getConnection() {
		try {
			Class.forName(driverClass);
			
			con = DriverManager.getConnection(url,username,password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
	

}
