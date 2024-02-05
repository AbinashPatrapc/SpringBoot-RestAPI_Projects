package com.numetry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service("mailservice")
public class mailMgmtServiceImpl implements ImailMgmtService {

	@Autowired
	private JavaMailSender sender;
	@Value("${spring.mail.username}")
	private String fromEmail;
	
	
	@Override
	public String sendMAil(String message,String[]email) throws MessagingException {
	String status=mailService(message,email);
		return "Successfully "+status;
	}
	
	private String mailService(String msg,String[]toEmails) throws MessagingException {
	MimeMessage message=sender.createMimeMessage();
	MimeMessageHelper helper=new MimeMessageHelper(message,true);
	helper.setFrom(fromEmail);
	helper.setCc(toEmails);
	helper.setSubject("Numetry Technologies");
	helper.setText(msg);
	helper.addAttachment("pongal.jpg", new ClassPathResource("pongal.jpg"));
	sender.send(message);
	return "Mail Sent";
	
	}

}
