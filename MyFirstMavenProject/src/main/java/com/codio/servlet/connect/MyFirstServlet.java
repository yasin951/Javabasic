package com.codio.servlet.connect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      PrintWriter print = null;
      String username = null;
      String password = null;
      



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		print = response.getWriter();

		
		username = request.getParameter(username);
		password = request.getParameter(password);
		
				
		// Print to Eclipse CONSOLE (this is what you want)
	    System.out.println("============ DATA RECEIVED ============");
	    System.out.println("Username: " + username);
	    System.out.println("Password: " + password);
	    System.out.println("========================================");
		
	}

}
