package com.startwo.service;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SMSService {

	public void send() {
		System.out.println("sending sms....");
	}
}
