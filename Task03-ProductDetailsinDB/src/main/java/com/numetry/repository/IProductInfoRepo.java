package com.numetry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.numetry.entity.Products;

public  interface IProductInfoRepo extends JpaRepository<Products, Integer> {
	
	@Query("SELECT productImagePath FROM Products WHERE productCode=:code")
	public String getProductImagePathByProductCode(Integer code);
	@Query("SELECT productDescPath FROM Products WHERE productCode=:code")
	public String getProductDescPathByProductCode(Integer code);

}
