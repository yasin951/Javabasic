package com.codio.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondurl")
public class secondServlet extends HttpServlet {

	double salary =0;
	String specification = null;
	String shift = null;
	PrintWriter pw = null;
	String name = null;
	String email = null;
	String mobileNo = null;
	String  department = null;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		salary = Double.parseDouble(request.getParameter("salary"));
        specification = request.getParameter("specification");
        shift = request.getParameter("shift");
        pw = response.getWriter();
       Cookie cks[] = null;
       
       cks = request.getCookies();
       if(cks != null) {
    	   for(Cookie ck :cks) {
    		   switch(ck.getName()) {
    		   case "cName":
    			   name = ck.getValue();
    			   break;
    			   
    		   case "cEmail" : 
    			   email = ck.getValue();
    			   break;
    		   case "cMobile":
    			   mobileNo = ck.getValue();
    			   break;
    			   
    		   case "cDepartment":
    			   department = ck.getValue();
    			   break;
    		   }
    	   }
       }
       System.out.println("Cookies Value "+name+" " +email+" "+mobileNo+" "+department);
       System.out.println(salary+ " " +specification+" "+ shift+"second Servlet ");
       employeePersistenceLogic epl = new employeePersistenceLogic();
   	boolean saveData1 =  epl.saveTheData(name,email,mobileNo,department,salary,specification,shift);
		
	};

	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
