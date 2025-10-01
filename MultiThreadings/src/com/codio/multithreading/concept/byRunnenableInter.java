package com.codio.multithreading.concept;

public class byRunnenableInter implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("Yasin");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byRunnenableInter bri = new byRunnenableInter();
		Thread t = new Thread(bri);
		Thread t1 = new Thread();
		
		t.start();
		t1.start();
		
			try {
				t.join();
				t1.join();
				t1.sleep(3000);
				
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
			for(int i=1;i<=5;i++) {
				System.out.println("Mirza");
			}
		
		

	}

	
	

}
