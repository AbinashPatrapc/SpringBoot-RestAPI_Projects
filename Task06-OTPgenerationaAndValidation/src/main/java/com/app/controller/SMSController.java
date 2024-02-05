package com.app.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.mobileSMS;
import com.app.service.SmsService;

@RestController
public class SMSController {
	
	@Autowired
    SmsService service;

    @Autowired
    private SimpMessagingTemplate webSocket;

   private final String  TOPIC_DESTINATION = "/lesson/sms";
  //You can send SMS in verified Number
    @PostMapping("/number")
    public ResponseEntity<String> smsSubmit(@RequestBody mobileSMS sms) {
        try{
               service.sendOTP(sms);
        }
        catch(Exception e){

        	 return new ResponseEntity<String>("Error Occured while Sending otp",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        webSocket.convertAndSend(TOPIC_DESTINATION, getTimeStamp() + ": SMS has been sent!: "+sms.getMobileNo());
        return new ResponseEntity<String>("OTP Sent Successfully",HttpStatus.OK);
    }
    private String getTimeStamp() {
       return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
    }

}
