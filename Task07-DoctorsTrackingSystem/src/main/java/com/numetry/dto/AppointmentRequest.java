package com.numetry.dto;

import lombok.Data;

@Data
public class AppointmentRequest {
	private Integer doctorId;
	private Integer hospitalId;
	private String visitFrequency;
}