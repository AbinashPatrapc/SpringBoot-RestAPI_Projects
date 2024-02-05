package com.numetry.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.numetry.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	 @Query("SELECT COUNT(*) FROM Student WHERE username = :username AND password = :password")
	 public long countByEmailAndPassword(@Param("username") String email, @Param("password") String password);
}
