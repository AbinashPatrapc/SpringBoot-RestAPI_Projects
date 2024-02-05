package com.numetry.service;

import java.util.List;

import com.numetry.entity.Products;

public interface IproductMgmtService {
	public String registerProducts(Products info);

	public List<Products> fetchProductDetails();

	public String fetchProductImageByProdCode(Integer prodCode);

	public String fetchProductDescByProdCode(Integer prodCode);

}
