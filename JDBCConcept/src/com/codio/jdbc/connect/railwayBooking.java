package com.codio.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class railwayBooking {

	static String loadDriver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/management";
	static String userName = "root";
	static String passWord = "yasinmirza222";
	
	static Connection connection = null;
   static	PreparedStatement psmt = null;
	
	static String Query =" INSERT INTO railway_booking(pass_name,pass_gender,pass_seatno,source,destination,pass_age) VALUES(?,?,?,?,?,?)";
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		
		try {
			
			
			Class.forName(loadDriver);
			
			connection = DriverManager.getConnection(url,userName,passWord);
			System.out.println("Connected Successfully");
			
			 System.out.println("Enter The Number Of Passenger");
			 int groupSize = sc.nextInt();
			 
			 System.out.println("Enter The Source");
			 String source = sc.next();
			 
			 System.out.println("Enter The Destination");
			 String destination = sc.next();
			 
			 
			psmt = connection.prepareStatement(Query);
			
			//loop 
			for(int i=1;i<=groupSize;i++) {
				System.out.println("Enter Passenger Name:");
				String name = sc.next();
				
				System.out.println("Enter Passenger Age:");
				int age = sc.nextInt();
				
				System.out.println("Enter Passenger Gender");
				String gender = sc.next();
				
				psmt.setString(1, name);
				psmt.setString(2,gender);
				psmt.setInt(3, i);
				psmt.setString(4, source);
				psmt.setString(5, destination);
                psmt.setInt(6, age);
                
                psmt.addBatch();
			}
			int result[] = psmt.executeBatch();
			
			if(result.length == groupSize) {
				System.out.println("Group Booking Successfully");
			}else {
				System.out.println("Some Issue In Booking");
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {if(psmt != null) psmt.close();}catch(SQLException e) {}
			try {if(connection != null)connection.close();}catch(SQLException e) {};
			
		
			System.out.println("Thanks For Booking ");
		}
	  
	  
	  
	  
		

	}

}
