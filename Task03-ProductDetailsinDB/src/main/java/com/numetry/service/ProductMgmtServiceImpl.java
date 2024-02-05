package com.numetry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.entity.Products;
import com.numetry.repository.IProductInfoRepo;

@Service
public class ProductMgmtServiceImpl implements IproductMgmtService {

	@Autowired
	private IProductInfoRepo repo;
	
	
	@Override
	public String registerProducts(Products info) {
		return "Product Details Stored in DataBase with "+repo.save(info).getProductCode()+" product Code";
	}

	@Override
	public List<Products> fetchProductDetails() {
		List<Products> list=repo.findAll();
		return list;
	}

	@Override
	public String fetchProductImageByProdCode(Integer prodCode) {
		return repo.getProductImagePathByProductCode(prodCode);
	}

	@Override
	public String fetchProductDescByProdCode(Integer prodCode) {
		return repo.getProductDescPathByProductCode(prodCode);
	}

}
