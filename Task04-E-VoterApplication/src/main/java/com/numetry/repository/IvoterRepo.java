package com.numetry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numetry.model.Voter;

public interface IvoterRepo extends JpaRepository<Voter, Integer> {

}
