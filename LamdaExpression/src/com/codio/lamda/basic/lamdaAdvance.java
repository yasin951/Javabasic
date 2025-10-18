package com.codio.lamda.basic;

interface Add{
	int add(int a,int b);
}
public class lamdaAdvance {
	 
	public static void main(String args[]) {
		
		Add add = (a,b) -> a+b;
		System.out.println("Sum of A and B=="+add.add(5, 8));
	}
     
}
