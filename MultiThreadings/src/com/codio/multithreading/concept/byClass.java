package com.codio.multithreading.concept;

public class byClass extends Thread {
 public void run() {
	 for(int i=1;i<=5;i++) {
		 System.err.println("Yasin");
	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byClass bc = new byClass();
		bc.start();
		try {
		
			bc.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=5;i++) {
			System.out.println("Mirza");
		}

	}

}
