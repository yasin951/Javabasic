package com.codio.filehandaling.basic;
import java.io.*;


public class CompleteFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("text.txt");
		
		try {
			f.createNewFile();
			
			FileWriter fw = new FileWriter("text.txt");
			
			fw.write("Hello From Inside to a File");
			fw.close();
			
			FileReader fr =new FileReader("text.txt");
			
			int i;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
				
			}
			fr.close();
			
			
			f.delete();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
