package com.startwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.startwo.service.GreetingService;

public class MainJDBC  {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		GreetingService gs = ctx.getBean("greetingService", GreetingService.class);
		gs.testDB();
	}


}
