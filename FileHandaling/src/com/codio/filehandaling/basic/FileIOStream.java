package com.codio.filehandaling.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileIOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("text.txt");
			
			fos.write("Who Are You" .getBytes());
			fos.close();
			
				
			FileInputStream fis = new FileInputStream("text.txt");
			
			int i;
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
			
			Files.deleteIfExists(Paths.get("text.txt"));
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
