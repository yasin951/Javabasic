package com.codio.function.basic;
import java.util.function.Function;
public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Function<Integer , Integer> AgeIsGreater = (x) -> x*2;
		Function<Double,Double> radius = (r) -> r*r*Math.PI;
		
		
		System.out.println(radius.apply(5.5));
		System.out.println(AgeIsGreater.apply(5));
	}

}
