package com.codio.pattern.star;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=n-1;i>=1;i--) {
			
			for(int j=1;j<=3-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
