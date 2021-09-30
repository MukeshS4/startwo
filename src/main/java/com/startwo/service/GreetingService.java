package com.startwo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class GreetingService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void greet() {
		System.out.println("Hello!!");
	}
	
	public void testDB() {
		
		List<Customer> customers= jdbcTemplate.query("select * from customers",new BeanPropertyRowMapper<Customer>(Customer.class));
		
		customers.stream().forEach(System.out::println);
		
	}
}

