package com.numetry.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numetry.Entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	
}
