package com.codeo.saraswatikidneyapp.dao;

import com.codeo.saraswatikidneyapp.model.Doctor;

public interface DoctorDao {
	public boolean saveDoctor(Doctor doctor);
	public boolean deleteDoctor();
	public void sendEmail();
	public void sendSMS();
	

}
