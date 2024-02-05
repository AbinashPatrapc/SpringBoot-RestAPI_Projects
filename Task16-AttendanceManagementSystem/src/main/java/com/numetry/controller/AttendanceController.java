package com.numetry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.model.Admin;
import com.numetry.model.Student;
import com.numetry.request.LoginRequest;
import com.numetry.service.AdminService;
import com.numetry.service.StudentService;

@RestController
public class AttendanceController {
	
	@Autowired
	private StudentService userService;
	
	@Autowired
	private AdminService adminService;

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginRequest request){
		if(request.getLoginType().equalsIgnoreCase("Admin")) {
			return new ResponseEntity<>(adminService.login(request.getAdmin().getUsername(), request.getAdmin().getPassword()),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(userService.login(request.getStudent().getUsername(), request.getStudent().getPassword()),HttpStatus.OK);
		}
	}
	
	@PostMapping("/addAdmin")
	public ResponseEntity<String> registerAdmin(@RequestBody Admin ad){
		return new ResponseEntity<>(adminService.addAdmin(ad),HttpStatus.CREATED) ;
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<String> registerAdmin(@RequestBody Student stud){
		return new ResponseEntity<>(adminService.addStudent(stud),HttpStatus.CREATED) ;
	}
}
