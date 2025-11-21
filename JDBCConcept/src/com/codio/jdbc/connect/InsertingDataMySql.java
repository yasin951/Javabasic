package com.codio.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertingDataMySql {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Patient ID ");
		int id = sc.nextInt();
		
		System.out.println("Enter Patient Name");
		String name = sc.next();
		
		System.out.println("Enter Patient Age");
		int age = sc.nextInt();
		
		
		
		
				try {
					//Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","yasinmirza222");
			
			System.out.println("You Connect With The Database");
			
			//Query
			String query = "INSERT INTO patient(patient_id , patient_name,patient_age) VALUES(?,?,?)";
			
			//Create PREPAREDSTATEMENT
			PreparedStatement psmt = connection.prepareStatement(query);
			
			//Set Values
			psmt.setInt(1, id);
			psmt.setString(2,name);
			psmt.setInt(3, age);
			
			int rows = psmt.executeUpdate();
			
			System.out.println(rows+"row(S) inserted Succefully ");
			
			connection.close();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

		

	}

}
