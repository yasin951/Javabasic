package com.codeo.saraswatikidneyapp.model;

public class Doctor {
   // temporary variable create 1 time and uses multiple times 
	private int doctor_id;
	private String doctor_name = null;
	private String doctor_lastname = null;
	private String mobile_no = null;
	private String doctor_email = null;
	private String  doctor_qualification = null;
	
		
	public Doctor(int doctor_id, String doctor_name, String doctor_lastname, String mobile_no, String doctor_email,
			String doctor_qualification) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.doctor_lastname = doctor_lastname;
		this.mobile_no = mobile_no;
		this.doctor_email = doctor_email;
		this.doctor_qualification = doctor_qualification;
	}

	public Doctor(String doctor_name, String doctor_lastname, String mobile_no, String doctor_email,
			String doctor_qualification) {
		super();
		this.doctor_name = doctor_name;
		this.doctor_lastname = doctor_lastname;
		this.mobile_no = mobile_no;
		this.doctor_email = doctor_email;
		this.doctor_qualification = doctor_qualification;
	}

	

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getDoctor_lastname() {
		return doctor_lastname;
	}

	public void setDoctor_lastname(String doctor_lastname) {
		this.doctor_lastname = doctor_lastname;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getDoctor_email() {
		return doctor_email;
	}

	public void setDoctor_email(String doctor_email) {
		this.doctor_email = doctor_email;
	}

	public String getDoctor_qualification() {
		return doctor_qualification;
	}

	public void setDoctor_qualification(String doctor_qualification) {
		this.doctor_qualification = doctor_qualification;
	}


	
	

}
