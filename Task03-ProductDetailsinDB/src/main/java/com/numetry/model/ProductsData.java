package com.numetry.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
@Data
public class ProductsData implements Serializable {
	private static final long serialVersionUID = -4941250637385594510L;

	private Integer productCode;
	private Integer productId;
	private String productName;
	private MultipartFile productImage;
	private MultipartFile productDesc;
}
