package com.app.service;

import java.text.ParseException;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.app.model.StoreOTP;
import com.app.model.mobileSMS;
import com.app.model.storeNumber;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component
public class SmsService {

	private final String ACCOUNT_SID = "AC9f9c2bcd2bd6bfb529d359b5dd12476e";

	private final String AUTH_TOKEN = "eb6a2827c67470f516ac43725627e2f2";

	private final String FROM_NUMBER = "+14844517088";

	public void sendOTP(mobileSMS sms) throws ParseException {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		int min = 100000;
		int max = 999999;
		int number = (int) (Math.random() * (max - min + 1) + min);

		String msg = "Your OTP - " + number + " please verify this OTP";

		Message message = Message.creator(new PhoneNumber(sms.getMobileNo()), new PhoneNumber(FROM_NUMBER), msg)
				.create();

		StoreOTP.setOtp(number);
		storeNumber.setNumber(sms.getMobileNo());
	}

	public void sendConfirmation(String number) throws ParseException {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		String msg = "You have been logged in Successfully";

		Message message = Message.creator(new PhoneNumber(number), new PhoneNumber(FROM_NUMBER), msg).create();
	}
}
