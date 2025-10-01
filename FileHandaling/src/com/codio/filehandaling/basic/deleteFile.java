package com.codio.filehandaling.basic;

import java.io.File;

public class deleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("text.txt");
		
  if(f.delete()) {
	  System.out.println("Delete Successfully");
  }else {
	  System.out.println("Not Deleted");
  }
	}

}
