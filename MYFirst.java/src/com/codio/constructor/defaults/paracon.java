package com.codio.constructor.defaults;

public class paracon {
	 int employee_id;
	 String employee_name;
	 double employee_salary;
	 
	 paracon(int id,String name,double  salary ){
		 
		 employee_id= id;
		 employee_name=name;
		 employee_salary=salary;
		 
		 
		 
		 
		 
	 }
	 
	 void show() {
		 System.out.println("Employee Id is:"+employee_id);
		 System.out.println("Employee Name is:"+employee_name);
		 System.out.println("Employee Salary is:"+employee_salary);

		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       paracon para = new paracon(1,"Yasin",20000);
       para.show();
 
	}

}
