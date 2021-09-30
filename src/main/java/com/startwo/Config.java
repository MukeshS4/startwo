package com.startwo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.startwo.service.GreetingService;


@Configurable
@ComponentScan(basePackages = {"com.startwo.service"})
public class Config {

	
@Bean
public GreetingService greetingService() {
	return new GreetingService();
	
}

@Bean
public DriverManagerDataSource driverManagerDataSource() {
	DriverManagerDataSource ds = new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/citius");
	ds.setUsername("root");
	ds.setPassword("root");
	return ds;
}

@Bean
public JdbcTemplate jdbcTemplate() {
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	jdbcTemplate.setDataSource(driverManagerDataSource());
	return jdbcTemplate;

}


}
