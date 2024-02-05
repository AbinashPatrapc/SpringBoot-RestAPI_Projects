package com.numetry.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numetry.Entity.Appointment;
import com.numetry.Entity.Doctor;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

	 List<Appointment> findByDoctor(Doctor doctor);
}
