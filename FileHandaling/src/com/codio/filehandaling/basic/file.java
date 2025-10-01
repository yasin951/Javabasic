package com.codio.filehandaling.basic;

import java.io.FileWriter;
import java.io.IOException;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
       
       try {
    	   FileWriter fw = new FileWriter("text.txt");
    	   
    	   
    		   fw.write("Hello From India .......");
    		   
    		   fw.close();

    	   
    	         }catch(IOException e) {
    	   e.printStackTrace();
       }
       
	}

}
	