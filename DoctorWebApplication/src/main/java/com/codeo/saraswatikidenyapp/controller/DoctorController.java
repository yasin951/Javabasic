package com.codeo.saraswatikidenyapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.saraswatikidneyapp.dao.DoctorDao;
import com.codeo.saraswatikidneyapp.dao.DoctorDaoImplementation;
import com.codeo.saraswatikidneyapp.model.Doctor;

@WebServlet("/saveDoctor")
public class DoctorController extends HttpServlet {
	String doctor_name = null;
	String doctor_lastname = null;
	String doctor_mobileno = null;
	String doctor_email = null;
	String doctor_qualification = null;
	boolean result = false;
	PrintWriter pw = null;
	
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doctor_name = request.getParameter("firstName");
	    doctor_lastname = request.getParameter("lastName");
	    doctor_mobileno = request.getParameter("mobileNo" );
	    doctor_email = request.getParameter("email");
	    doctor_qualification = request.getParameter("qualification" );
	    
	    Doctor doctor = new Doctor( doctor_name,doctor_lastname,doctor_mobileno,doctor_email,doctor_qualification);
	    
	    DoctorDao daoimpl = new DoctorDaoImplementation();
	    
	    pw = response.getWriter();

	   result =   daoimpl.saveDoctor(doctor);
	    if(result == true) {
	    	pw.println("Data Insert Succefully");
	    }else {
	    	pw.println("Data is not inserted");
	    }
	    boolean count = false;
	    
	    count = daoimpl.deleteDoctor(doctor);
	    
	    
	   
	    
	    
	}

}
