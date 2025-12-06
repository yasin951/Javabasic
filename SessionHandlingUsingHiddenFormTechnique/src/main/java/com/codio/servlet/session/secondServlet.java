package com.codio.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondurl")
public class secondServlet extends HttpServlet{
	String name1 = null;
	String mobileno1 = null;
	String email1 = null;
	String gender1 = null;
	int age1 =0;
	String degree1 = null;
	String subject1 = null;
	String subject2 = null;
	String subject3 = null;
	PrintWriter pw= null;
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response ) {
		name1 = request.getParameter("name1");
		mobileno1 = request.getParameter("mobileno1");
		email1 = request.getParameter("email1");
		gender1 = request.getParameter("gender1");
		age1 = Integer.parseInt(request.getParameter("age1"));
		degree1 = request.getParameter("degree1");
		subject1 = request.getParameter("subject1");
		subject2 =request.getParameter("subject2");
		subject3 = request.getParameter("subject3");
		
		System.out.println(name1+" "+mobileno1+" "+email1+" "+gender1+" "+age1+" " +degree1+" "+subject1+" "+subject2+" "+subject3 );
		try {
			pw = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<html>");
		pw.println("<head><title>Upload Photo</title></head>");
		pw.println("<body>");
		pw.println("<h2>Upload Your Photo</h2>");
		
		pw.println("<form action='thirdurl' method='post' enctype='multipart/form-data'>");
		
		pw.println("<label>Select Your Photo </label>");
		pw.println("<input type ='file' name='image' required ><br><br>");
		
		pw.println("    <input type='hidden' name='name2' value=" + name1 + ">");
		pw.println("    <input type='hidden' name='gender2' value=" + gender1 + ">");
		pw.println("    <input type='hidden' name='email2' value=" + email1 + ">");
		pw.println("    <input type='hidden' name='mobileno2' value=" + mobileno1 + ">");
		pw.println("    <input type='hidden' name='age2' value=" + age1 + ">");
		pw.println("    <input type='hidden' name='degree2' value=" + degree1 + ">");
		pw.println("    <input type='hidden' name='subject1_2' value=" + subject1 + ">");
		pw.println("    <input type='hidden' name='subject2_2' value=" + subject2 + ">");
		pw.println("    <input type='hidden' name='subject3_2' value=" + subject3 + ">");

		pw.println("    <br>");
		pw.println("    <input type='submit' value='Upload Photo & Submit'>");
		pw.println("</form>");

		pw.println("</body>");
		pw.println("</html>");
		
	}

}
