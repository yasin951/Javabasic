package com.codio.students.marks;

import java.util.Scanner;

public class student_detail {
  
	  
	  	  
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student students =new student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student id");
		int id = sc.nextInt();
		
				
		
		System.out.println("Enter student name");
        String name = sc.next();
        
              
        System.out.println("Enter student marks");
        int mark = sc.nextInt();
        
        students.setstudent_id(id);
		System.out.println(students.getstudent_id());

        
        students.setstudent_name(name);
        System.out.println(students.getstudent_name());

        
        students.setstudent_marks(mark);
        System.out.println(students.getstudent_marks());
        
        
	}

}
