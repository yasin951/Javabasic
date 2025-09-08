package com.codio.constructor.defaults;

import java.util.Scanner;

public class defaults {
	Scanner sc = new Scanner(System.in);
	
	
	int a;
	int b;
	int c;
	
	
				
	
	 
   
	
	void show() {
		System.out.print("Enter the number A:" );
		a= sc.nextInt();
		System.out.print("Enter the number B:");
		b = sc.nextInt();
		c = a+b;

		System.out.println("Sum of the A and B :" + c);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaults df = new defaults();
		df.show();

	}

}
