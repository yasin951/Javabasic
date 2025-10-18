package com.codio.lamda.basic;

interface myinterface {
		 void say();
	 }
public class lamdaExample {
	 



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myinterface s = () ->{ System.out.println("hello");};
		
		s.say();
		

	}

}
