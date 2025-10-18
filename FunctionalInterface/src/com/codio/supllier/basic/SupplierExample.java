package com.codio.supllier.basic;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> msg =() -> "Hello Supplier";
		
		System.out.println(msg.get());

	}

}
