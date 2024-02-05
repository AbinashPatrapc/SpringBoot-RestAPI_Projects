package com.numetry;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task09DoctorsTrackingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task09DoctorsTrackingSystemApplication.class, args);
		System.out.println(new Date());
	}

}
