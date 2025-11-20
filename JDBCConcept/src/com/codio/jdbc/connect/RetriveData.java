package com.codio.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveData {

	public static void main(String[] args) {
	
		try {
			//1.first Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.create connection
			Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/management ","root","yasinmirza222");
			
			//3Create Statement 
			Statement statement = connection.createStatement();
			
			//4.Execute Query
			ResultSet rs = statement.executeQuery("SELECT * FROM Students");
			
			//5.Process Result
			
			while(rs.next()) {
				System.out.println(rs.getString("student_id")+ " "+ rs.getString("student_name")+" "+rs.getString("student_age"));
				
						
			}
			//6.Close Connection 
			  
			connection.close();

			
		}catch(Exception e) {
			 System.out.println(e);
		}finally {
		
			
		}
		

	}

}
