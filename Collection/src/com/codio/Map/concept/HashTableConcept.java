package com.codio.Map.concept;

import java.util.Hashtable;
import java.util.Map;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new Hashtable<>();
		
		 map.put(3, "yasin");//null key is allowed
		    map.put(2, "Mirza");
		    map.put(1, "Sahil");
		    map.put(5, "Ayush");
		    map.put(9, "");
		    map.put(null,"");
		    map.put(4, "Yasin");
		    map.put(6, null);//null values are also not allowed
		    map.put(7, "");
System.out.println(map.size());

for(Map.Entry<Integer,String> entry :map.entrySet()) {
	System.out.println("Key is "+entry.getKey()+" "+"Value is "+entry.getValue());
}
 
		

	}

}
