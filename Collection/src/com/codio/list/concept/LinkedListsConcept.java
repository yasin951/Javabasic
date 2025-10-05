package com.codio.list.concept;

import java.util.List;

import java.util.LinkedList;

public class LinkedListsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer>  list = new LinkedList<>();
     
     list.add(10);
     list.add(2);
     list.add(4);
     list.add(1);
     list.add(5);
     list.add(8);
     list.remove(2);
     
     for(int num : list) {
    	 System.out.print(num+"  ");
     }
     System.out.println();
     System.out.println(list);
		

	}

}
