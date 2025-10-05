package com.codio.Map.concept;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new LinkedHashMap<>();//order is not fixed
		
		 map.put(3, "yasin");//one null key is allowed
		    map.put(2, "Mirza");
		    map.put(1, "Sahil");
		    map.put(5, "Ayush");
		    map.put(null, null);
		    map.put(8, "");
		    map.put(4, "Yasin");
		    map.put(6, null);//multiple null(empty) values are allowed
		    map.put(7, "");
System.out.println(map);

	}

}
