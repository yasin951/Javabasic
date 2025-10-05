package com.codio.list.concept;


import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {//stack is Worked on LIFO
		// TODO Auto-generated method stub
		Stack<Integer> list = new Stack<>();
		
		list.push(2);//add element in stack
		list.push(5);
		list.add(2);
		list.add(5);
		list.pop();//remove the element in stack
		
		for(int num : list) {
			System.out.print(num+" ");
		}
		System.out.println(list.peek());//showing the next element in stack 
		
	

	}

}
