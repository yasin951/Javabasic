package com.codio.concept.arrays;

public class concept_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		int count =0;
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
			sum = sum+arr[i];
			count++;
		
		}
		System.out.println("Count of the Arrays:" + count);
		System.out.println("Sum of the Arrays is :"+sum);
		System.out.println("Average of the array is :" +(sum/count));
	}

}
