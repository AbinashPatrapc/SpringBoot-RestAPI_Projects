package com.numetry.service;

import jakarta.mail.MessagingException;

public interface ImailMgmtService {
	public String sendMAil(String message,String[]email) throws MessagingException;

}
