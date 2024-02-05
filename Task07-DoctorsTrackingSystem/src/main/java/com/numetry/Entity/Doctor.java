package com.numetry.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Doctor {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "account_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer docId;
	private String docName;
	private String docSpecialization;
	private String docAddrs;
	
}
