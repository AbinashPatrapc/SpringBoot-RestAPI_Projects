package com.numetry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numetry.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
}
