package com.codio.concept.arrays;

import java.util.Scanner;

public class searching_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the Number You Want To Search It :-");
     int num = sc.nextInt();
     
     int arr[] = {12,13,14,5,6,7,8,55,66,44,15};
     
     for(int i=0;i<=arr.length-1;i++) {
    	 if(num == arr[i]) {
    		 System.out.println("Your Number is :-" +i);
    		 
    	 }else {
    		 System.out.println("You Enter Wrong Number out of the Array");
    		 
    	 }
     }
	}

}
