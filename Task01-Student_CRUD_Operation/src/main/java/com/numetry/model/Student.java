package com.numetry.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Numetry_student")
@Data
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "student_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Column(name = "STUD_ROLL_NO")
	private Integer studRollNo;
	@Column(name = "STUD_NAME", length = 50)
	private String studName;
	@Column(name = "SCHOOL_NAME", length = 50)
	private String schoolName;
	@Column(name = "STUD_ADDRS", length = 50)
	private String studAddrs;
	@Column(name = "PARENTS_NAME", length = 50)
	private String parentsName;
	@Column(name = "LAST_YEAR_PERCENTAGE")
	private Float lastYearPercentage;
}
