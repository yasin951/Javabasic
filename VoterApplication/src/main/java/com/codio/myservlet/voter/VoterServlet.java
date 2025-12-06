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

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        String number = request.getParameter("mobile");
        String dateOfBirth = request.getParameter("dob");

        PrintWriter pw = response.getWriter();
        String result;
        boolean saveData = false;

        if (age >= 18) {
            pw.println("You Are Eligible For Voting");
            result = "Eligible";
        } else {
            pw.println("You Are Not Eligible For Voting");
            result = "Not Eligible";
        }

        VoterPersistenceLogic vpl = new VoterPersistenceLogic();
        saveData = vpl.SaveTheData(name, age, gender, number, dateOfBirth, result);

        if (saveData) {
            pw.println("Data Inserted Successfully");
        } else {
            pw.println("Data Not Inserted!");
        }
    }
}
