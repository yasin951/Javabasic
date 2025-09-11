package com.codio.students.marks;

public class student {
	
	private int student_id;
	private int student_marks;
	private String student_name;
	
	
	public void setstudent_id(int id) {
		 student_id =id;
	}
	public int getstudent_id() {
		return student_id;
		
	}

	
	
	public void setstudent_marks(int m) {
		student_marks = m;
	}
	public int getstudent_marks() {
		return student_marks;
		
	}
	
	public void setstudent_name(String name) {
		student_name = name;
	}
	public String getstudent_name() {
		return student_name;
		
	}
}
