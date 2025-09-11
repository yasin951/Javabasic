package com.codio.encapsulation.concept1;

public class setter_and_getter {
	 
	private int value;
	
	public void setValue(int x) {
		value = x;
	}
	public int getValue() {
		return value; 
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setter_and_getter val = new setter_and_getter();
		val.setValue(27);
		
       System.out.println(val.getValue());
	}

}
