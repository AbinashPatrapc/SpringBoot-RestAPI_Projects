package com.numetry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public String login(String username,String password) {
		Long count=repo.countByEmailAndPassword(username, password);
		if(count==0) {
			return "Invalid Credential";
		}else {
			return "Logged In Successfully";
		}
	}
}
