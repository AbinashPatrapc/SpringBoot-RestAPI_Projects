package com.numetry.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numetry.Entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
