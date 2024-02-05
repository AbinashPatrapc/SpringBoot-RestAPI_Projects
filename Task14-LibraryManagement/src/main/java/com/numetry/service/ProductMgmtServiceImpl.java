package com.numetry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.entity.Library;
import com.numetry.repository.ILibraryInfoRepo;

@Service
public class ProductMgmtServiceImpl implements IlibraryMgmtService {

	@Autowired
	private ILibraryInfoRepo repo;

	@Override
	public String registerProducts(Library info) {
		return "Book Details Stored in DataBase with " + repo.save(info).getISBN() + " ISBN number";
	}

	@Override
	public List<Library> fetchbookDetails() {
		return repo.findAll();
	}

	@Override
	public String fetchBookImageByISBN(Integer isbn) {
		return repo.getBookImagePathByISBN(isbn);
	}

	@Override
	public String fetchBookDescByISBN(Integer isbn) {
		return repo.getBookDescPathByISBN(isbn);
	}

}
