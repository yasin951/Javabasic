package com.codio.concept.arrays;

public class sorting_of_arrays {

	public static void main(String[] args) {
		int arr[] = {2,4,6,5,7,3,8,9,10};
		System.out.print("Sorted Array is:- ");
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[j];
					arr[j] = arr[i];
					
					arr[i] = temp;
					
				}else {
					
				}
				
			}
			
			System.out.print( arr[i]);
            
			
			
		}
		
		System.out.println();
		 System.out.println("Minimum Number Of Array is:-"+arr[0]);
         System.out.println("Maximum Number Of Array is:-"+arr[arr.length-1]);

			}

}
