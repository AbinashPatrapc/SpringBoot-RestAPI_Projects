package com.numetry.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class LibraryData implements Serializable {
	private static final long serialVersionUID = -4941250637385594510L;

	private Integer libraryCode;
	private Integer ISBN;
	private String bookName;
	private MultipartFile bookImage;
	private MultipartFile bookDesc;
}
