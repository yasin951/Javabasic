package com.codio.list.concept;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		 
		
		list.add("yasin");
		list.add(null);
		list.add("Mirza");
		
		for(String lists : list) {
			System.out.print(lists+"  ");
			
		}
		System.out.println(list.size());//exact size of arraylist
		list.add(1, "ayush");
		list.add(3,"zaib");//add element using specific index number
		list.remove(3);
		list.set(1, "sana");//replace the specific index value
		
		System.out.println(list.get(1));//get the specific value using index 
		System.out.println(list);
		
		System.out.println(list.isEmpty());//check the array list is empty or not
		
        System.out.println(list.contains("yasin"));//check element is exist in arraylist or not 
        
        System.out.println(list.indexOf(null));//give position of specific element
        
        System.out.println(list.lastIndexOf("Mirza"));
        
        list.clear();//remove all element of arraylist
        System.out.println(list.isEmpty());
	}

}
