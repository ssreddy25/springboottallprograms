
package com.ojas.reactive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "USER_TABLE")
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	@NotNull(message = "user shouldnot be a null")
	private String name;
	@Email(message = "invalid emaild ")
	private String email;
	@NotNull
	//@Pattern(regexp = "^\\d{10}$" ,message = "it is invlaid mobile number")
	private long Mobile;
	private Gender gender;
	@Min(18)
	@Max(65)
	private int age;
	@NotNull(message = "user shouldnot be a null")
	private String nationality;
	
	public User() {}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		Mobile = mobile;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	

}
