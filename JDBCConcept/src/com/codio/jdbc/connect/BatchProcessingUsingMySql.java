package com.codio.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessingUsingMySql {
	static Connection connection = null;
	static Statement statement = null;
	
	static String LoadDriver = "com.mysql.cj.jdbc.Driver";
	
	static String url = "jdbc:mysql://localhost:3306/management";
	static String userName = "root";
	static String passWord = "yasinmirza222";
	
	static String query1 = "INSERT INTO patient(patient_id,patient_name,patient_age) VALUES(3,'Aman',25)";
	static String query2 = "INSERT INTO patient(patient_id,patient_name,patient_age) VALUES(4,'Sana',21)";
	static String query3 = "INSERT INTO patient(patient_id,patient_name,patient_age) VALUES(5,'Sahil',22)";
	
	
	

	public static void main(String[] args) {
		try {
		Class.forName(LoadDriver);
		
		connection = DriverManager.getConnection(url,userName,passWord);
		
		statement = connection.createStatement();
		
		statement.addBatch(query1);
		statement.addBatch(query2);
		statement.addBatch(query3);
		
		int count[] = statement.executeBatch();
		System.out.println("Record Executed"+count.length);
		System.out.println("Successfully Added");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
