package com.codio.exception.concept1;

public class ExceptionhandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int a= 10;
		int b = 1;
		try {
			int divide = a/b;
			System.out.println(divide);
		}catch(ArithmeticException e) {
			throw e;
		}finally {
			System.out.println("Thanks for Give Me Exception");
		}
		
		
	}

}
