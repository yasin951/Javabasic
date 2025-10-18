package com.codio.consumer.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> consume =(x) -> System.out.println("Number " +   x);
		 consume.accept(18);
		 
		 Consumer<String> name = (msg) ->  System.out.println("Message:-"+ msg.toUpperCase());
		 
		 name.accept("yasin");
			
		 List<String> names = Arrays.asList("yasin","mirza","sahil" );
		 
		 Consumer<String> printName = namess -> System.out.println("Hello:-"+namess.toUpperCase());
		 
		 names.forEach(printName);
		 

	}

}
