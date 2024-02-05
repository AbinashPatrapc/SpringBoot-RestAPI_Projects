package com.numetry.request;

import com.numetry.model.Admin;
import com.numetry.model.Student;

import lombok.Data;

@Data
public class LoginRequest {

	private Student student;
	private Admin admin;
	private String loginType;
}
