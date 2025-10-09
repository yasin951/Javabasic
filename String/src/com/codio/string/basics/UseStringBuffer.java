package com.codio.string.basics;

public class UseStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer sbf = new StringBuffer("Hello");//StringBuffer is ThreadSafe but slower and Mostly Used in MultiThreading 

	  System.out.println(sbf);
	  
	  sbf.append("World");//add text
	  sbf.insert(5, ",");//insert comma or many things
	  sbf.replace(0, 5, "Heyy");//replace the string
	  sbf.delete(0, 5);//delete string 
	  sbf.reverse();//reverse the String
	  
	  System.out.println(sbf);
	
	
	}

}
