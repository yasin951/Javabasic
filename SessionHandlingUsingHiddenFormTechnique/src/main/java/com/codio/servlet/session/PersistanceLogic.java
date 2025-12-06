package com.codio.servlet.session;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersistanceLogic {
	Connection connection = null;
	PreparedStatement psmt = null;
    String DriverClass = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/management";
    String name = "root";
    String pass = "yasinmirza222";
    
    static String insertQuery = "INSERT INTO student(student_name, student_emailId,student_mobileno,student_age,student_gender,student_degree,subject1,subject2,subject3,student_profilePic) VALUES(?,?,?,?,?,?,?,?,?,?)";
    static int count = 0 ;
    boolean result =false;
    
 	
	
	
	public boolean saveTheData(String name1,String gender1 ,String emailid1, String mobileno1, int age1, String degree1, String subject1, String subject2, String subject3, InputStream is){
		
		try {
			Class.forName(DriverClass);
			
			connection = DriverManager.getConnection(url,name,pass);
			
			psmt = connection.prepareStatement(insertQuery);
			
			psmt.setString(1, name1);
			psmt.setString(2, emailid1);
			psmt.setString(3,mobileno1);
			psmt.setInt(4,age1);
			psmt.setString(5,gender1);
			psmt.setString(6,degree1);
			psmt.setString(7,subject1);
			psmt.setString(8,subject2);
			psmt.setString(9,subject3);
			psmt.setBlob(10,is);
			
			if(psmt != null) {
				count = psmt.executeUpdate();
				
			}
			if(count == 1) {
				System.out.println("Data Inserted Succefully");
			}else {
				System.out.println("Data is not Inserted");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {

		      try { if (psmt != null) psmt.close(); } catch (SQLException e) {}
		      try { if (connection != null) connection.close(); } catch (SQLException e) {}
		      try {if(is!=null) is.close();} catch(IOException e) {e.printStackTrace();}
		}
		
		
		return true;
		
	}

}
