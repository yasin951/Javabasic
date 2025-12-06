package com.codio.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet( "/MyFirstServlet" )
public class MyFirstServlet extends HttpServlet {
	
	String name = null;
	String mobileno = null;
	String email = null;
	String gender = null;
	int age = 0;
	String degree = null;
	PrintWriter pw = null;
	
	
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   name = request.getParameter("name");
	   mobileno = request.getParameter("mobileno");
	   email = request.getParameter("emailid");
	   gender = request.getParameter("gender");
	   age = Integer.parseInt(request.getParameter("age"));
	   degree = request.getParameter("degree");
	   
	   System.out.println("Parameters Are "+name+" "+mobileno+ " "+email+" " +gender+ " "+age+ " "+degree+" ");
	   pw = response.getWriter();
	   
	   
	   
	   
	   
	   pw.println("<h1>Welcome to Registration Page 2 </h1>");
	   if(degree.equals("BE")) {
		   pw.println("<html>");
		   pw.println("<head>");
		   pw.println("<title> Enter Subjects for Engineering  </title>");
		   pw.println("</head>");
		   pw.println("<body>");
		   
		   
		   pw.println("<h2><Enter Your Subjects/h2>");
		   pw.println("<form action='secondurl' method='post'>");
		   
		   pw.println(" Maths 1  for Engineering:");
		   pw.println("<input type='text' name='subject1' required><br><br>");
		   
		   pw.println(" Maths 2  for Engineering:");
		   pw.println("<input type='text' name='subject2' required><br><br>");
		   
		   pw.println(" Maths 3  for Engineering:");
		   pw.println("<input type='text' name='subject3' required><br><br>");

		   pw.println("<input type='hidden' name='mobileno1' value="+mobileno+" required><br><br>");
		   pw.println("<input type='hidden' name='name1' value="+name+" required > <br><br>");
		   pw.println("<input type='hidden' name'emailid1' value="+email+" required > <br><br>");
		   pw.println("<input type='hidden' name='age1' value="+age+" required ><br><br>");
		   pw.println("<input type='hidden' name='gender1' value="+gender+" required ><br><br>");
		   pw.println("<input type='hidden' name='degree1' value="+degree+" required ><br><br>");
		   
		   pw.println("<input type='submit' value='Next Page'>");
		   pw.println("</form>");
		   
		   pw.println("</body");
		   pw.println("</html>");   
		   
	   }else if(degree.equals("BSC")) {
		   
		   pw.println("<html>");
		   pw.println("<head>");
		   pw.println("<title> Enter Subjects for BSC </title>");
		   pw.println("</head>");
		   pw.println("<body>");
		   
		   
		   pw.println("<h2><Enter Your Subjects/h2>");
		   pw.println("<form action='secondurl' method='post'>");
		   
		   pw.println(" Maths 1  for BSC:");
		   pw.println("<input type='text' name='subject1' required><br><br>");
		   
		   pw.println(" Maths 2  for BSC:");
		   pw.println("<input type='text' name='subject2' required><br><br>");
		   
		   pw.println(" Maths 3  for BSC:");
		   pw.println("<input type='text' name='subject3' required><br><br>");

		   pw.println("<input type='hidden' name='mobileno1' value="+mobileno+" required><br><br>");
		   pw.println("<input type='hidden' name='name1' value="+name+" required > <br><br>");
		   pw.println("<input type='hidden' name'emailid1' value="+email+" required > <br><br>");
		   pw.println("<input type='hidden' name='age1' value="+age+" required ><br><br>");
		   pw.println("<input type='hidden' name='gender1' value="+gender+" required ><br><br>");
		   pw.println("<input type='hidden' name='degree1' value="+degree+" required ><br><br>");
		   
		   pw.println("<input type='submit' value='Next Page'>");
		   pw.println("</form>");
		   
		   pw.println("</body");
		   pw.println("</html>");   

		   
	   }else if(degree.equals("BCOM")) {
		   pw.println("<html>");
		   pw.println("<head>");
		   pw.println("<title> Enter Subjects for BCOM </title>");
		   pw.println("</head>");
		   pw.println("<body>");
		   
		   
		   pw.println("<h2><Enter Your Subjects/h2>");
		   pw.println("<form action='secondurl' method='post'>");
		   
		   pw.println(" Maths 1  for BCOM:");
		   pw.println("<input type='text' name='subject1' required><br><br>");
		   
		   pw.println(" Maths 2  for BCOM:");
		   pw.println("<input type='text' name='subject2' required><br><br>");
		   
		   pw.println(" Maths 3  for BCOM:");
		   pw.println("<input type='text' name='subject3' required><br><br>");

		   pw.println("<input type='hidden' name='mobileno1' value="+mobileno+" required><br><br>");
		   pw.println("<input type='hidden' name='name1' value="+name+" required > <br><br>");
		   pw.println("<input type='hidden' name'emailid1' value="+email+" required > <br><br>");
		   pw.println("<input type='hidden' name='age1' value="+age+" required ><br><br>");
		   pw.println("<input type='hidden' name='gender1' value="+gender+" required ><br><br>");
		   pw.println("<input type='hidden' name='degree1' value="+degree+" required ><br><br>");
		   
		   pw.println("<input type='submit' value='Next Page'>");
		   pw.println("</form>");
		   
		   pw.println("</body");
		   pw.println("</html>");   

	   }else {
		   System.out.println("Proper Field Not Selected");
		   
	   }
	   
	   
	}

}
