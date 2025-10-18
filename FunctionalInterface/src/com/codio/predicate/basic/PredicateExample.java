package com.codio.predicate.basic;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> isOdd = (x) -> x%2 != 0;
		Predicate<Integer> isEven =(x) -> x%2 ==0;
		Predicate<Integer> isGreaterThen = (x) -> x>= 10;
		
		
		System.out.println(isOdd.test(3));
		System.out.println(isEven.test(2));
		
		Predicate<Integer> combined = isOdd.and(isGreaterThen);
		
		
		System.out.println(combined.test(17));//AND Operation
		
		Predicate<Integer> oroperation = isEven.or(isGreaterThen);//OR Operation
		
		System.out.println(oroperation.test(17));
		
		Predicate<Integer> NegateOperation = isEven.negate();//negate is basically reverse the condition;
		
		System.out.println(NegateOperation.test(4));//convert true into false

	}

}
