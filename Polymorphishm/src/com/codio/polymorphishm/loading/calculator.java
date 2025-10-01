package com.codio.polymorphishm.loading;

public class calculator {
 
	 void add() {
		 int a= 2;
		 int b = 5;
		 int c =a+b;
		 
		 System.out.println(c);
	 }
	 int add(int x ,int y) {
		 int c;
		 c =x+y;
		 return c;
		 
	 }
	 
	 void add(int x) {
		 System.out.println(x);
	 }
	 double add(double x,double y) {
		 double z =x+y;
		 return z;
	 }
}
