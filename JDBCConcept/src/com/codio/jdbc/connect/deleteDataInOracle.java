package com.codio.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class deleteDataInOracle {
	
	static Connection connection = null;
static	Statement statement = null;
	
	static String url= "jdbc:oracle:thin:@localhost:1521:xe";
	static String name="C##Yasin";
	static String pass = "manager";
	
	static String loadDriver = "oracle.jdbc.driver.OracleDriver";
	static int count = 0;
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Records");
		int studentRecords = sc.nextInt();
		
		
		
		try {
		     Class.forName(loadDriver);
		     
		     connection = DriverManager.getConnection(url,name,pass);
		     
		     if(connection != null) {
		    	 statement = connection.createStatement();

		     }
             String deleteQuery = "delete from students where student_id="+	studentRecords;	    		     
		     System.out.println(deleteQuery);
		     
		     if(statement != null) {
		    	 count = statement.executeUpdate(deleteQuery);
		    	 System.out.println(count);
		    	 
		    	 
		     }
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		

	}

}
