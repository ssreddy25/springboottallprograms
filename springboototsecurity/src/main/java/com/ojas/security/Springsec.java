package com.ojas.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class Springsec extends WebSecurityConfigurerAdapter {

//	private final Log logger = LogFactory.getLog(Springsec.class);

	// customized As per  Project Requirement

	public void configure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
		 .antMatchers("/balance").authenticated()
		 .antMatchers("/statement").authenticated()
		 .antMatchers("/loan").authenticated()
		.antMatchers("/home").permitAll()
		 .antMatchers("/contact").permitAll()
		.and().formLogin()
		 .and().httpBasic();
	 
  }

	@Override
     public void configure(AuthenticationManagerBuilder auth) throws Exception {
         // TODO Auto-generated method stub
		
		auth.inMemoryAuthentication()
		.withUser("Admin").password("Admin@123").authorities("admin").and()
		.withUser("rani").password("rani@123").authorities("read").and()
		.withUser("lilly").password("rani@123").authorities("read").and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
	
	 }

}
