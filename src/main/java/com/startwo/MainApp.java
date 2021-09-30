package com.startwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.startwo.service.GreetingService;
import com.startwo.service.SMSService;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		GreetingService gs = ctx.getBean("greetingService", GreetingService.class);
		SMSService smsService = ctx.getBean("smsService", SMSService.class);
		smsService.send();
		gs.greet();
		ctx.close();
		ctx.registerShutdownHook();
	}

}
