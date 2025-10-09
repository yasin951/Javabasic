package com.codio.string.basics;

public class UseStringBuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");//StringBuilder is Not ThreadSafe but Faster		
		System.out.println(sb);
		
		sb.append("World");//add Text
		sb.insert(5, ",");//insert anything like comma
		sb.replace(0, 5, "Hey");//Replace part of string
		sb.delete(0, 4);//delete a Character
		sb.reverse();//Reverse the String
		
		System.out.println(sb);
		
		
		

	}

}
