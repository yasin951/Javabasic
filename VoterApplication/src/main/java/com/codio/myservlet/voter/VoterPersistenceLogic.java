package com.codio.myservlet.voter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class VoterPersistenceLogic {
	static boolean saveData = false;
	
  static	Connection connection = null;
 static	PreparedStatement psmt = null;
 static String DriverClass = "oracle:jdbc:driver:DriverManager";
 static String url = "jdbc:oracle:thin:@localhost:1521:xe";
 static String name = "system";
 static String passWord = "manager";
 static String insertQuery = "INSERT INTO voter_app(voter_name , voter_mobileno,voter_age,voter_dob,voter_gender,voter_result) VALUES(?,?,?,?,?,?)";
 
	
	
	
	
	public boolean SaveTheData(String name, int age, String gender, String number, String dateOfBirth,String result) {
		try {
			Class.forName(DriverClass);
			
			try {
				connection = DriverManager.getConnection(url,name,passWord);
				
				psmt = connection.prepareStatement(insertQuery);
				
				
				psmt.setString(1, name);
				psmt.setString(2,number);
				psmt.setInt(3,age);
				psmt.setString(4,dateOfBirth);
				psmt.setString(5,gender);
				psmt.setString(6, result);
				
				
				psmt.executeUpdate();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}

}
