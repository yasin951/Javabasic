package com.codio.execption.concept1;

public class basic_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		
		String str ="null";
		
		try {
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 5;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Error");
		}
		
		
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thanks");
		}
		
	}

}
