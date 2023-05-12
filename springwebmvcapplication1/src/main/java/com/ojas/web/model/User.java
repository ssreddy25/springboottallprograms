package com.ojas.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private String newPassword;
	private String conformpassword;
	private String moiblenumber;
	private String gender;
	private String address;
	
	

}
