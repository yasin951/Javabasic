package com.codio.execption.concept1;

public class catch_the_execption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a =10 ;
     int b = 0;
     
     int c;
  
     try {
    	c =a/b ;
    	System.out.println("Result:- " + c);
     }catch( ArithmeticException e) {
    	 e.printStackTrace();
     }finally {
    	 System.out.println("Thanks for Informing");
     }
    
	}

}
