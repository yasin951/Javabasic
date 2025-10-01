package com.codio.filehandaling.basic;
import java.io.File;
import java.io.IOException;
public class createFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("text.txt");
		
		try {
			
			if(f.createNewFile()) {
				System.out.println("File is Created");
			}else{
				System.out.println("File is not Create");
			}
				}
			
 
						
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
