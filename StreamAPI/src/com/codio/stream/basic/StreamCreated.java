package com.codio.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamCreated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> numbers = Arrays.asList(1,2,3,4,5,67,988,8);
		
		Stream<Integer> myStream1 = numbers.stream();//First Way To Create Stream
		
		Double[] array = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,2.0};
		
	Stream<Double> myStream2 = Arrays.stream(array);//Second Way To Create Stream
	
	Stream<Double> myStream3 = Stream.of(array);
	
	Stream<String> myStream4 = Stream.of("Yasin","Mirza","Atush");//Third Way To Create Stream
	
	Stream<Integer> myStream5 =  Stream.iterate(0,n -> n+1 ).limit(100).skip(1);//Fourth Way to Create Stream
	
	Stream<String> myStream6 =  Stream.generate(() -> "Hello");//Fifth Way To Create Stream
		
		

	}

}
