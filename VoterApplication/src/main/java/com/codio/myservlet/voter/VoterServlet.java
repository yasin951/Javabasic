package com.codio.myservlet.voter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/VoterServlet")
public class VoterServlet extends HttpServlet {
	
	String name = null;
	int age = 0;
	String gender = null;
	String number =null;
	String dateOfBirth = null;
	PrintWriter pw = null;
	boolean saveData = false;
	String result = null;
	
	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		name = request.getParameter("name");
		age = Integer.parseInt(request.getParameter("age"));
		gender =request.getParameter("gender");
		number = request.getParameter("mobile");
		dateOfBirth = request.getParameter("dob");
		
		pw =response.getWriter();
		
		if(age >= 18) {
			     System.out.println("You Are Eligible For Voting");
			     pw.println("You Are Eligible For Voting");
			     String result = "Eligible";
		}else {
			System.out.println("You Are Not Eligible For Voting");
			pw.println("You Are Not Eligible For Voting");
			String result ="Not Eligible";
			
		}
		
		VoterPersistenceLogic vpl = new VoterPersistenceLogic();
		saveData = vpl.SaveTheData( name,age,gender,number,dateOfBirth,result);
		if(saveData == true) {
			pw.println("Data Inserted Successfully");
		}else {
			pw.println("Not Inserted ");
		}
		
				
		
	}

}
