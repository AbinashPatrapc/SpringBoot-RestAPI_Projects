package com.numetry.Entity;

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
public class Appointment {
	
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "appointment_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer id;

	@ManyToOne
    @JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	@ManyToOne
    @JoinColumn(name = "hospital_id")
	private Hospital hospital;
	
	private String visitFrequency;
}
