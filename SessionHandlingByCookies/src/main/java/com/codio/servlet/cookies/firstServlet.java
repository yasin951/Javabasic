package com.codio.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {

   
	String name = null;
	String email = null;
	String mobileNo =null;
	String department = null;
	Cookie ckname , ckemail , ckmobile,ckdepartment = null;
	PrintWriter pw= null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    name =  request.getParameter("fullName");
		email = request.getParameter("email");
		mobileNo = request.getParameter("phone");
		department = request.getParameter("department");
		
		System.out.println(name + " " +email+" "+mobileNo+" "+department + "First Servlet");
		pw = response.getWriter();
		
		//set content type
		response.setContentType("text/html");
		ckname = new Cookie("cName",name);
		ckemail = new Cookie("cEmail",email);
		ckmobile = new Cookie("cMobile",mobileNo);
		ckdepartment = new Cookie("cDepartment", department);
		
		response.addCookie(ckname);
		response.addCookie(ckemail);
		response.addCookie(ckdepartment);
		response.addCookie(ckmobile);
		

	    pw.println("<!DOCTYPE html>");
        pw.println("<html lang='en'>");
        pw.println("<head>");
      
        pw.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        pw.println("    <title>Employee Form</title>");
        pw.println("    <style>");
        pw.println("        body {font-family: 'Segoe UI', sans-serif; background: #f4f6f9; padding: 40px;}");
        pw.println("        .container {max-width: 600px; margin: 0 auto; background: white; padding: 40px; border-radius: 12px; box-shadow: 0 10px 30px rgba(0,0,0,0.1);}");
        pw.println("        h2 {text-align: center; color: #2c3e50; margin-bottom: 30px;}");
        pw.println("        label {display: block; margin: 15px 0 8px; font-weight: 600; color: #34495e;}");
        pw.println("        input[type='number'], input[type='text'], select {");
        pw.println("            width: 100%; padding: 12px; border: 2px solid #ddd; border-radius: 8px; font-size: 16px;");
        pw.println("            transition: border 0.3s;}");
        pw.println("        input:focus, select:focus {border-color: #3498db; outline: none;}");
        pw.println("        input[type='submit'] {");
        pw.println("            margin-top: 30px; padding: 14px; width: 100%; background: #3498db; color: white;");
        pw.println("            border: none; border-radius: 8px; font-size: 18px; cursor: pointer;}");
        pw.println("        input[type='submit']:hover {background: #2980b9;}");
        pw.println("    </style>");
        pw.println("</head>");
        pw.println("<body>");

        pw.println("<div class='container'>");
        pw.println("    <h2>Employee Details Form</h2>");

        pw.println("    <form action='secondurl' method='post'>");

        pw.println("        <label for='salary'>Salary (Monthly in ₹)</label>");
        pw.println("        <input type='number' id='salary' name='salary' min='0' step='500' placeholder='45000' required>");

        pw.println("        <label for='specification'>Employee Specification / Designation</label>");
        pw.println("        <input type='text' id='specification' name='specification' placeholder='e.g., Senior Java Developer, HR Executive' required>");

        pw.println("        <label for='shift'>Shift</label>");
        pw.println("        <select id='shift' name='shift' required>");
        pw.println("            <option value=''>Select Shift</option>");
        pw.println("            <option value='Morning'>Morning (9 AM - 5 PM</option>");
        pw.println("            <option value='Evening'>Evening (2 PM - 10 PM)</option>");
        pw.println("            <option value='Night'>Night (10 PM - 6 AM)</option>");
        pw.println("            <option value='General'>General / Flexible</option>");
        pw.println("        </select>");

        pw.println("        <input type='submit' value='Submit Details'>");
        pw.println("    </form>");
        pw.println("</div>");

        pw.println("</body>");
        pw.println("</html>");
        pw.close();
		
		
		
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
