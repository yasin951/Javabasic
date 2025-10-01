package com.codio.interfaces.concept;

public class Runner implements Interface3,Interface1,Interface2 {
 
	 public void crop() {
		 System.out.println("Croping.......");
	 }
	
	@Override
	public void Stop() {
		System.out.println("Starting........");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		System.out.println("Stoping..........");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner r = new Runner();
		
		r.start();
		r.Stop();
		r.crop();

	}


}
