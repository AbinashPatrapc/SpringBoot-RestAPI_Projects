package com.numetry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.numetry.entity.Library;

public  interface ILibraryInfoRepo extends JpaRepository<Library, Integer> {
	
	@Query("SELECT bookImagePath FROM Library WHERE ISBN=:isbn")
	public String getBookImagePathByISBN(Integer isbn);
	@Query("SELECT bookDescPath FROM Library WHERE ISBN=:isbn")
	public String getBookDescPathByISBN(Integer isbn);

}
