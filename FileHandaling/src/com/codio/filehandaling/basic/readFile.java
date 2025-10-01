package com.codio.filehandaling.basic;

import java.io.FileReader;
import java.io.IOException;

public class readFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 try {
			 int i;
			 FileReader fr = new FileReader("text.txt");
			 try {
			 while((i=fr.read())!= -1) {
				 System.out.print((char)i);
				 
			 }
			 }finally {
				 fr.close();
			 }
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	}

}
