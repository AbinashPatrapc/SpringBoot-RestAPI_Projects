package com.numetry.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Numetry_Products")
public class Products {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "product_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer productCode;
	private Integer productId;
	@Column(length = 20)
	private String productName;
	@Column(length = 200)
	private String productImagePath;
	@Column(length = 200)
	private String productDescPath;

}
