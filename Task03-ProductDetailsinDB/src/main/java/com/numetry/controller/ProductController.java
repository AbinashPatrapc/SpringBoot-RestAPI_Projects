package com.numetry.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.numetry.entity.Products;
import com.numetry.model.ProductsData;
import com.numetry.service.IproductMgmtService;

@Controller
public class ProductController {

	@Autowired
	private IproductMgmtService service;

	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}

	@GetMapping("/register")
	public String showRegisterForm(@ModelAttribute("prod") ProductsData data) {
		return "registerForm";
	}

	@PostMapping("/register")
	public String registerProductByUploadingFiles(@ModelAttribute("prod") ProductsData data, Map<String, Object> map)
			throws Exception {
		// get Upload folder location from properties file
		String storedLocation = "D:\\Numetry_Product_Data";
		// if folder is not available then create a folder
		File file = new File(storedLocation);
		if (!file.exists())
			file.mkdir();

		// getting input Streams which representing upload file content
		MultipartFile imagefile = data.getProductImage();
		MultipartFile descfile = data.getProductDesc();

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
		Products info = new Products();
		info.setProductName(data.getProductName());
		info.setProductId(data.getProductId());
		info.setProductImagePath(file.getAbsolutePath() + "\\" + imageFilename);
		info.setProductDescPath(file.getAbsolutePath() + "\\" + descFilename);

		String msg = service.registerProducts(info);
		map.put("file1", imageFilename);
		map.put("file2", descFilename);
		map.put("resultMsg", msg);

		return "show_result";
	}

}
