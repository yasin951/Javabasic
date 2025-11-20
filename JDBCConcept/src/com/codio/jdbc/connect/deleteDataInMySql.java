package com.codio.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class deleteDataInMySql {
	
	static  Connection connection = null;
	static Statement statement = null;
	
	static String url = "jdbc:mysql://localhost:3306/management";
	static String userName ="root";
	static String passWord="yasinmirza222";
	
	static int count = 0;
	
	static String loadDriver="com.mysql.cj.jdbc.Driver";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Records Please ");
		int studentRecord = sc.nextInt();
		
		
		
		
		try {
			Class.forName(loadDriver);
			
			connection = DriverManager.getConnection(url,userName,passWord);
			
			statement = connection.createStatement();
			
		  String deleteQuery = "delete from library where student_id="+studentRecord;
		  
		  if(statement != null) {
			  count = statement.executeUpdate(deleteQuery);
			  System.out.println("Successfully Deleted"+count);
			  
		  }
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
    
    
    
		
		
	}

}
