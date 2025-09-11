package com.codio.multiLevel.inheritance;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mana = new Manager();
		
		mana.person();
		mana.EmployeeInfo();
		mana.team();
		 
		personDetails per = new personDetails();
		per.person();
	
		EmployeeDetails emp = new EmployeeDetails();
		emp.person();
		emp.EmployeeInfo();
		
		

	}

}
