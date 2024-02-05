package com.numetry.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.numetry.entity.Library;
import com.numetry.model.LibraryData;
import com.numetry.service.IlibraryMgmtService;

@RestController
public class LibraryController {

	@Autowired
	private IlibraryMgmtService service;

	@PostMapping("/register")
	public ResponseEntity<String> registerProductByUploadingFiles(@RequestBody LibraryData data)
			throws Exception {
		// get Upload folder location from properties file
		String storedLocation = "D:\\Numetry_Library_Data";
		// if folder is not available then create a folder
		File file = new File(storedLocation);
		if (!file.exists())
			file.mkdir();

		// getting input Streams which representing upload file content
		MultipartFile imagefile = data.getBookImage();
		MultipartFile descfile = data.getBookDesc();

		InputStream imageStream = imagefile.getInputStream();
		InputStream descStream = descfile.getInputStream();

		// Getting the uploaded file name
		String imageFilename = imagefile.getOriginalFilename();
		String descFilename = descfile.getOriginalFilename();

		// Creating Output Streams representing empty destination file
		OutputStream osImage = new FileOutputStream(file.getAbsolutePath() + "\\" + imageFilename);
		OutputStream osDesc = new FileOutputStream(file.getAbsolutePath() + "\\" + descFilename);

		// Copy input stream data to output stream destination
		IOUtils.copy(imageStream, osImage);// (source,destination)
		IOUtils.copy(descStream, osDesc);

		// close all streams
		imageStream.close();
		descStream.close();
		osImage.close();
		osDesc.close();

		// prepare entity class object by setting data from model class
		Library info = new Library();
		info.setBookName(data.getBookName());
		info.setISBN(data.getISBN());
		info.setBookImagePath(file.getAbsolutePath() + "\\" + imageFilename);
		info.setBookDescPath(file.getAbsolutePath() + "\\" + descFilename);
		String msg =service.registerProducts(info);

		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}

}
