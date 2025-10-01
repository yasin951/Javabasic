package com.codio.filehandaling.basic;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   try {
	   BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
	   
	  bw.write("Hello Big Boss");
	  bw.close();
	  
	  BufferedReader br = new BufferedReader (new FileReader("text.txt"));
	  
	  String line;
	  while((line = br.readLine() )!= null) {
		  System.out.println(line);
	  }
	   br.close();
	   Files.delete(Paths.get("text.txt"));   
	   
   }catch(IOException e) {
	   e.printStackTrace();
   }
	}

}
