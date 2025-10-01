package com.codio.calculator.concept;

public class Runner {

	public static void main(String[] args) throws  ArithmeticException {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		try {
			System.out.println(  c.add(10.12, 10.25));
			System.out.println(c.add(10, 52));
			System.out.println(c.div(10, 12));
			System.out.println(c.mul(10, 2));
			System.out.println(c.sub(10, 20.52));
			
		
		  
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
