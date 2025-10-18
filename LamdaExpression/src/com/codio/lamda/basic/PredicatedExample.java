package com.codio.lamda.basic;

import java.util.function.Predicate;

public class PredicatedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isEven = n -> n%2==0;
		
		System.out.println(isEven.test(3));

	}

}
