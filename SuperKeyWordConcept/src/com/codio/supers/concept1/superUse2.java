package com.codio.supers.concept1;

public class superUse2 extends superUse {
  void show() {
	 
	  super.show();
	  System.out.println("Second class");
	  System.out.println(super.num);
	 
  }
  superUse2(){
	  super();
	  System.out.println("Child Constructor");
  }
}
