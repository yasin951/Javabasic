package com.codio.Map.concept;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map  map = new TreeMap();//order is sorted 
		
		 map.put(3, "yasin");//null key is allowed
		    map.put(2, "Mirza");
		    map.put(1, "Sahil");
		    map.put(5, "Ayush");
		    map.put(9, null);
		    map.put(8, null);
		    map.put(4, "Yasin");
		    map.put(6, "");//multiple null(empty) values are allowed
		    map.put(7, "");
System.out.println(map);
		

	}

}
