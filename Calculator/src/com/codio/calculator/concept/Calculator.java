package com.codio.calculator.concept;

public class Calculator  {

	public int add(int a , int b) {
		return a+b;
	}
	public int add(int a , int b ,int c) {
		return a+b+c;
		
	}
	public double add(double a,double b) {
		return a+b;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	
	public int sub(int a , int b) {
		return a-b;
	}
	public int sub(int a , int b ,int c) {
		return a-b-c;
		
	}
	public double sub(double a,double b) {
		return a-b;
	}
	public double sub(double a,double b,double c) {
		return a-b-c;
	}
	public int mul(int a , int b) {
		return a*b;
	}
	public int mul(int a , int b ,int c) {
		return a*b*c;
		
	}
	public double mul(double a,double b) {
		return a*b;
	}
	public double mul(double a,double b,double c) {
		return a*b*c;
	}
	public double div(double a,double b) {
		if(b==0) {
			throw new ArithmeticException("cannot divide by zero");
		
		}else {
			return a/b;
		}
	}
	public double div(double a,double b,double c) {
		if(b==0) {
			throw new ArithmeticException("cannot divide by zero");
		
		}else {
			return a/b/c;
		}

		
	}


}
