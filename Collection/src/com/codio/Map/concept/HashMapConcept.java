package com.codio.Map.concept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map map = new HashMap();//order is not fixed //In this Map Interface we can used list methods like remove, contain,size,isEmpty,replace
    
    
    map.put(1, "yasin");//one null key is allowed
    map.put(2, "Mirza");
    map.put(3, "Sahil");
    map.put(4, "Ayush");
    map.put(null, "");
    map.put(5, "Yasin");
    map.put(6, "");//multiple null(empty) values are allowed
    map.put(7, "");
 
    map.remove(4);
    System.out.println(map.get(3));//accessing the specific value
    System.out.println(map.keySet());//Get all  the keys
    System.out.println(map.values());//Get all the Values
    
    System.out.println(map);
    map.clear();//clear the map (remove everythings) 
	}

}
