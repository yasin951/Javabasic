package com.codio.string.basics;

public class StrMethods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Yasin";//String is Immutable
		                     //Once created ,can't not be changed That why string is immutable
		
		//methods of string like length,charAt,toUpperCase/toLowerCase,subString,equals,contains,indexOf/lastIndexOf,replace,trim

		
		System.out.println(str.length());//Returns length of String
		System.out.println(str.charAt(2));//Return character at given index
		System.out.println(str.substring(0,3));//Return part of the String
		System.out.println(str.equals("Yasin"));//content comparison and returns true or false
		System.out.println(str.contains("in"));//check substring is exist
		
		
		System.out.println(str.indexOf("a"));//find position of character
		System.out.println(str.trim());//remove the spaces between string
		System.out.println(str.replace("Yasin","YasinMirza"));//Replace the string using replace
		
		str.split(" ");//split the string 
		System.out.println(str);
		
		String str2 = "Mirza";
		
		
		System.out.println(str.concat(str2));//combine the string str + str2 
	}

}
