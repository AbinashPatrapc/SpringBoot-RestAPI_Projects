package com.numetry.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Component
@Entity
@Data
@Table(name="numetry_voter")
public class Voter {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "voter_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer voterId;
	@Column(length=20)
	private String voterName;
	private LocalDate Dob;
	private Integer age;
	@Column(length=30)
	private String voterCity;
	@Column
	private String Nationality;
	@Column
	private String state;
}
