package com.codio.execption.concept1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class stateBankOfIndia {
	
	 int month, year,date;
	 int day,minutes,seconds;
	 Scanner scanner = null;
	 
	 static double bankbalance = 10000;
	 double amountremaining,withdrawl;
	 boolean successRate;
	 
	 static {
		 System.out.println("Welcome To SBI ATM Machine");
	 }
	 {
		 System.out.println("Enter the Card");
	 }
	 
	 
	 private void transactionMethod() {
		 scanner = new Scanner(System.in);
		 if(scanner != null) {
			 System.out.println("Enter ATM the pin ");
			 int atmpin = scanner.nextInt();
			 try {
                 if(atmpin != 0) {
                	 if(atmpin == 1234) {
                		 System.out.println("Welcome To Account Yasin");
                	 }else {
                		   throw new incorrectPinExecption();
                	 }
                 }
                 
                 System.out.println("Enter the amount You Want to Withdrawl");
                 
                 withdrawl = scanner.nextInt();
                 amountremaining = bankbalance - withdrawl;
                 
                 if(bankbalance >= withdrawl) {
                	 System.out.println("Current Balance is " +amountremaining);
                 }else {
                	throw new insufficientbalanceexecption();
                 }
                 
                 successRate = Math.random() > 0.05;
                 if(!successRate) throw new paymentFailureException() ; 
                 
			 }catch(incorrectPinExecption e) {
				 e.printStackTrace();
				 e.getMessage();
			 }catch(insufficientbalanceexecption e) {
				 e.printStackTrace();
				 e.getMessage();
			 }catch(paymentFailureException e) {
				 e.printStackTrace();
				 e.getMessage();
			 }
			 finally {
				 System.out.println("Thanks For Use This ATM ");
				 scanner.close();
			 }
			 
			 GregorianCalendar gc = new GregorianCalendar();
			 date = gc.get(gc.DATE);
			 month = gc.get(gc.MONTH)+1;
			 year = gc.get(gc.YEAR);
			 day =gc.get(gc.HOUR);
			 minutes = gc.get(gc.MINUTE);
			 seconds = gc.get(gc.SECOND);
			 System.out.println(date+"/" +month+"/"+year);
			 System.out.println(day+"/"+minutes+"/"+seconds);

			 
		 }
			 }
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
	
		stateBankOfIndia bank = new stateBankOfIndia();
		
		bank.transactionMethod();
		

	}

}
