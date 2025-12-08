package com.codio.servlet.cookies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class employeePersistenceLogic {
	Connection connection = null;
	PreparedStatement psmt = null;
	String DriverClass = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/management";
	String userName = "root";
	String passWord = "yasinmirza222";
	
	String insert_query =" INSERT INTO employee_details(full_name, email, mobile_no, department, salary, specification, shift) VALUES(?,?,?,?,?,?,?)";
int count = 0;

	
	
public boolean saveTheData(String name, String email, String mobileNo, String department, 
        double salary, String specification, String shift) {
try {
Class.forName(DriverClass);
connection = DriverManager.getConnection(url, userName, passWord);

psmt = connection.prepareStatement(insert_query);
psmt.setString(1, name);
psmt.setString(2, email);
psmt.setString(3, mobileNo);
psmt.setString(4, department);
psmt.setDouble(5, salary);
psmt.setString(6, specification);
psmt.setString(7, shift);

int count = psmt.executeUpdate();

if (count > 0) {
System.out.println("Data inserted successfully");
return true;  
} else {
System.out.println("Data not inserted");
return false;
}

} catch (Exception e) {
e.printStackTrace();
return false;
}
}





}
