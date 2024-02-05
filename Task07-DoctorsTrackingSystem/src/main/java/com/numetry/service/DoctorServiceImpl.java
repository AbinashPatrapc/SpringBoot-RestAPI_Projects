package com.numetry.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.Entity.Appointment;
import com.numetry.Entity.Doctor;
import com.numetry.Entity.Hospital;
import com.numetry.repo.AppointmentRepository;
import com.numetry.repo.DoctorRepository;
import com.numetry.repo.HospitalRepository;

@Service
public class DoctorServiceImpl implements IDoctorService  {
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;
    
    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public Doctor registerDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    @Override
    public Hospital registerHospital(Hospital hospital) {
    	return hospitalRepository.save(hospital);
    }

    @Override
    public List<Appointment> getDoctorAppointments(Integer doctorId) {
        Optional<Doctor> optionalDoctor = doctorRepository.findById(doctorId);

        if (optionalDoctor.isPresent()) {
            Doctor doctor = optionalDoctor.get();
            return appointmentRepository.findByDoctor(doctor);
        } else {
            return Collections.emptyList();
        }
    }
    
    @Override
    public Appointment setAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

	@Override
	public Doctor getDoctorById(Integer docID) {
		Optional<Doctor> optionalDoctor = doctorRepository.findById(docID);

        if (optionalDoctor.isPresent()) {
            Doctor doctor = optionalDoctor.get();
            return doctor;
        } else {
            return null;
        }
	}
	
	@Override
	public Hospital getHospitalById(Integer id) {
		Optional<Hospital> optionalHospital = hospitalRepository.findById(id);

        if (optionalHospital.isPresent()) {
            Hospital hospital = optionalHospital.get();
            return hospital;
        } else {
            return null;
        }
	}
	@Override
	public List<Doctor> getDoctorList() {
		return doctorRepository.findAll();
	}
	@Override
	public List<Hospital> getHospitalList() {
		return hospitalRepository.findAll();
	}
}
