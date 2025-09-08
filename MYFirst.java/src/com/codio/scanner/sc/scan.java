package com.codio.scanner.sc;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter The Number 1:");
		 int num1 = sc.nextInt();
		 System.out.print("Enter The Number 2:");
		 int num2 = sc.nextInt();
		 
		 int c = num1 + num2;
		 
		 System.out.println("Sum of Two number = "+c);
		 
		 if(num1 >= num2) {
			 System.out.println("Number1 is Greater:"+num1);
		 }else {
			 System.out.println("Number 2 is Greater:"+num2);
		 }
	}

}
