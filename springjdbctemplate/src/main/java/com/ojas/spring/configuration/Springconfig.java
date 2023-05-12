package com.ojas.spring.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages ="com.ojas.spring")
@PropertySource("classpath:database.properties")
public class Springconfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		dataSource.setDriverClassName(environment.getProperty("driver"));
		
		dataSource.setUrl(environment.getProperty("url"));
		
		dataSource.setUsername(environment.getProperty("user"));
		dataSource.setPassword(environment.getProperty("pwd"));
		
		return dataSource;
		
	}
	
	

}
