package com.numetry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.model.Admin;
import com.numetry.model.Student;
import com.numetry.repo.AdminRepo;
import com.numetry.repo.StudentRepo;

@Service
public class AdminService {

	@Autowired
	private AdminRepo repo;
	
	@Autowired
	private StudentRepo studRepo;
	
	//Admin Operation
	
	public String login(String username,String password) {
		Long count=repo.countByEmailAndPassword(username, password);
		if(count==0) {
			return "Invalid Credential";
		}else {
			return "Logged In Successfully";
		}
	}
	
	public String addAdmin(Admin ad) {
		int id=repo.save(ad).getAdminId();
		return "Admin Registered with Admin Id::"+id;
	}
	public List<Admin> showAdminList() {
		return repo.findAll();
	}
	
//Student Operation
//==========================================================================
	public String addStudent(Student stud) {
		int id=studRepo.save(stud).getStudentId();
		return "Student is Registered with Student Id::"+id;
	}
	
	public List<Student> showStudentList() {
		return studRepo.findAll();
	}
	
	public String deleteStudent(int id) {
		studRepo.deleteById(id);
		return "Student with Id::"+id+" has been deleted Successfully";
	}
	
	public String updateStudent(Student stud) {
		int id=studRepo.save(stud).getStudentId();
		return "Student is Updated having id::"+id;
	}
}
