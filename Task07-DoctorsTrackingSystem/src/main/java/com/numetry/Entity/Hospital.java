package com.numetry.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Hospital {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer hospitalID;
	private String hospitalName;
	private String address;
}
