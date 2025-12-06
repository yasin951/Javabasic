package com.codio.servlet.session;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/thirdurl")
@MultipartConfig
public class ThirdServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String name1=request.getParameter("name2");
		String gender1=request.getParameter("gender2");
		String emailid1=request.getParameter("emailid2");
		String mobileno1=request.getParameter("mobileno2");
		int age1=Integer.parseInt(request.getParameter("age2"));
		String degree1=request.getParameter("degree2");
		String subject1=request.getParameter("subject1_2");
		String  subject2=request.getParameter("subject2_2");
		String subject3=request.getParameter("subject3_2");
		boolean saveData = false;
		
		try {
			Part filePart=request.getPart("image");
			InputStream is =filePart.getInputStream();
			PersistanceLogic pl = new PersistanceLogic();
			
			saveData = pl.saveTheData(name1,gender1,emailid1,mobileno1,age1,degree1,subject1,subject2,subject3,is);
			System.out.println(name1+" "+gender1+" "+emailid1+" "+mobileno1+" "+age1+" "+degree1+" "+subject1+" "+subject2+" "+subject3+" "+filePart);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
