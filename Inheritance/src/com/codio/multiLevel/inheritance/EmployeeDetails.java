package com.codio.multiLevel.inheritance;

import java.util.Scanner;

public class EmployeeDetails extends personDetails {
 Scanner sc = new Scanner(System.in);
 
	void EmployeeInfo() {
		 System.out.println("Enter the Salary");
			 double Salary = sc.nextDouble();
		System.out.println(Salary);
	}
	
	}
