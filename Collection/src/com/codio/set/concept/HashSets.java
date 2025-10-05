package com.codio.set.concept;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {//list interface methods are used also in set interface like add remove contain size
		// TODO Auto-generated method stub
		Set set = new HashSet();//duplicates are not allowed in set interface
		                        //not index based access
		
		set.add("yasin");
		set.add(null);//only one null value is allowed 
		set.add("mirza");
		set.add("hello");
		set.add(10);
		set.add(null);
		set.add("yasin");//duplicates are not allowed 
		
		System.out.println(set);
		
		
		

	}

}
