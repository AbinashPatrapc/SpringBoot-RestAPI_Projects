package com.numetry.service;

import java.util.List;

import com.numetry.entity.Library;

public interface IlibraryMgmtService {
	public String registerProducts(Library info);

	public List<Library> fetchbookDetails();

	public String fetchBookImageByISBN(Integer isbn);

	public String fetchBookDescByISBN(Integer isbn);

}
