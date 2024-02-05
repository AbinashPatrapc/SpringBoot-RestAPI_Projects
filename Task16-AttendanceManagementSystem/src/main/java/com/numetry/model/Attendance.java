package com.numetry.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Attendance {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "account_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer attendanceId;
	private boolean attendance;
	
	@ManyToOne
    @JoinColumn(name = "studentId")
	Student student;
}
