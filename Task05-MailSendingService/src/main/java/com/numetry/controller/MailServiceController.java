package com.numetry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.numetry.service.ImailMgmtService;

import jakarta.mail.MessagingException;

@Controller
public class MailServiceController {
	@Autowired
	private ImailMgmtService service;

	@GetMapping("/mail")
	public ResponseEntity<String> sendMail() throws MessagingException {
		String msg = "Good Morning,\n"
				+ "Hope You are doing well,On the auspicious occasion of PONGAL,"
				+ "i wish you HAPPY PONGAL,wish you and your family have a good health and prosperity,\n"
				+ "have a enjoyble Holiday,\n"
				+ "Thank You !";
		String mails[]= {"sachinroutray22@gmail.com","abinashpatra118@gmail.com","abinashelena@gmail.com"};

		String result = service.sendMAil(msg, mails);
		return ResponseEntity.ok(result);
	}

}
