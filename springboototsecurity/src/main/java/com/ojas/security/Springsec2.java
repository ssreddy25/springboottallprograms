//package com.ojas.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class Springsec2 extends WebSecurityConfigurerAdapter {
//
//	public void configure(HttpSecurity htt) throws Exception {
//
//		htt.authorizeHttpRequests().antMatchers("/balance").authenticated().antMatchers("/loan").authenticated().and()
//				.formLogin().and().httpBasic();
//
//	}
//
//	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		auth.inMemoryAuthentication()
//		.withUser("Admin").password("Admin@123").authorities("admin").and()
//		.withUser("rani").password("rani@123").authorities("read").and()
//		.withUser("lilly").password("rani@123").authorities("read").and()
//		.passwordEncoder(NoOpPasswordEncoder.getInstance());
//
//	}
//
//}
