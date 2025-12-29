package com.codeo.saraswatikidneyapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.codeo.saraswatikidneyapp.connectionutil.ConnectionUtil;
import com.codeo.saraswatikidneyapp.model.Doctor;

public class DoctorDaoImplementation implements DoctorDao{
String insert_query = "INSERT INTO doctor(doctor_name,doctor_lastname,doctor_mobileno,doctor_email,doctor_qualification) VALUES(?,?,?,?,?)";
Connection connection =null;
PreparedStatement psmt = null;
String delete_query = "DELETE FROM doctor WHERE doctor_id =  ";

	@Override
	public boolean deleteDoctor(Doctor doctor) {
		
		try {
			connection = ConnectionUtil.getConnection();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean saveDoctor(Doctor doctor) {
		boolean flag=false;
		try {
			connection = ConnectionUtil.getConnection();
			
			psmt = connection.prepareStatement(insert_query);
			
			if(psmt != null) {
				psmt.setString(1, doctor.getDoctor_name());
				psmt.setString(2, doctor.getDoctor_lastname());
				psmt.setString(3, doctor.getMobile_no());
				psmt.setString(4, doctor.getDoctor_email());
				psmt.setString(5, doctor.getDoctor_qualification());
				
			}
			int count = psmt.executeUpdate();
			
			if(count != 0) {
				System.out.println("Data is Inserted");
			}else {
				System.out.println("Error");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;
	}

}
