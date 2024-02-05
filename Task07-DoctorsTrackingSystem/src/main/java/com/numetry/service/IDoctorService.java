package com.numetry.service;

import java.util.List;

import com.numetry.Entity.Appointment;
import com.numetry.Entity.Doctor;
import com.numetry.Entity.Hospital;

public interface IDoctorService {

	public Doctor registerDoctor(Doctor doctor);

	public Hospital registerHospital(Hospital hospital);

	public List<Appointment> getDoctorAppointments(Integer doctorId);

	public Appointment setAppointment(Appointment appointment);

	public Doctor getDoctorById(Integer docID);

	public Hospital getHospitalById(Integer hospitalId);
	
	public List<Doctor> getDoctorList();
	
	public List<Hospital> getHospitalList();
}
