package com.ojas.securityconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true) INSTEAD OF WE USING DOWN ANOTATIONS
@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	//authentication
	public UserDetailsService userDetailsServices() {
	//in memory authentications 	
//		UserDetails  admin =User.withUsername("siva")
//				            .password(encoder.encode("siva"))
//				            .roles("ADMIN")
//				            .build();
//		
//		UserDetails  user =User.withUsername("siva1")
//	            .password(encoder.encode("siva1"))
//	            .roles("USER")
//	            .build();
//		
//		return new InMemoryUserDetailsManager(admin,user);
		
		//here we are using orm based authentication
		return new UserInfoUserDetailsServices();
		
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain securityfliterChain(HttpSecurity http) throws Exception {
		
		return http.csrf().disable()
				.authorizeHttpRequests()
				.antMatchers("/product/wel" ,"/product/user").permitAll()
				.and()
				.authorizeHttpRequests()
				.antMatchers("/product/**")
				.authenticated()
				.and()
				.formLogin()
				.and().build();
				
	}
	
	@Bean
	public AuthenticationProvider authenticaionProvider() {
		DaoAuthenticationProvider  authenticationProvider =new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsServices());
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		
		return authenticationProvider;
		
	}
	
	

}
