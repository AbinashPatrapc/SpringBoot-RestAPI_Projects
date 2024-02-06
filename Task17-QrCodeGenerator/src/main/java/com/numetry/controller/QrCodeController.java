package com.numetry.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.service.QrCodeGeneratorService;

@RestController
public class QrCodeController {

	@Autowired
	private QrCodeGeneratorService qrCodeGeneratorService;

	@GetMapping(value = "/qrcode", produces = MediaType.IMAGE_PNG_VALUE)
	public byte[] generateQrCode(@RequestParam String content) throws IOException {
		int width = 250;
		int height = 250;
		return qrCodeGeneratorService.generateQrCode(content, width, height);
	}
}