package com.app.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.StoreOTP;
import com.app.model.TempOTP;
import com.app.model.storeNumber;
import com.app.service.SmsService;

@RestController
public class OTPverification {

	@Autowired
	SmsService service;

	@PostMapping("/verify")
	public String verifyOTP(@RequestBody TempOTP otp) throws ParseException {
		if (otp.getOtp() == StoreOTP.getOtp()) {
			String number = storeNumber.getNumber();
			service.sendConfirmation(number);
			return "OTP Verification Successful";
		} else
			return "Incorrect OTP";
	}

}
