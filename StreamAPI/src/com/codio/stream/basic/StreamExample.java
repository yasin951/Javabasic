package com.codio.stream.basic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamExample {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1);
		
		List<Integer> myStream = list.stream()//collection is converted into stream
				.filter(x -> x%2==0)//Filter the list using Stream
				.distinct()//distinct not repeat the element
				.map(n -> n/2)//map give output
				.sorted()//in Sorted Form
				.skip(1)//Using Skip (Skip the element)
				.limit(10)//Add limitation
				.collect(Collectors.toList());//Converted In to List 
		
		System.out.println(myStream);
		
		
	}

}
