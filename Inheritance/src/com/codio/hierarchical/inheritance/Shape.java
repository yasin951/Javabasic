package com.codio.hierarchical.inheritance;

import java.util.Scanner;

public class Shape {
   
	Scanner sc = new Scanner(System.in);
	void shape() {
		System.out.println("We are Tell about Shapes");
	}
	void Circle() {
		  
		int radius = 4;
		
	System.out.println(Math.PI*radius*radius);
	
		
	}
	void Square() {
		  
		int A  = 4;
		int B = 5;
		
		
	System.out.println(A*B);
	
		
	}
	void Rectangle() {
		  
		int length = 5;
		int width = 10;
		
	System.out.println(length * width);
	
		
	}
}
