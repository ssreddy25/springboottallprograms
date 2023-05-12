package com.ojas.dao;

import java.util.List;

import com.ojas.entity.Doctor;

public interface DoctorDAO {
	
	public boolean createDoctor(Doctor doctor);
	
	public List<Doctor> viewAllDoctor();
	

}
