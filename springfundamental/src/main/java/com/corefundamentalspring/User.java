package com.corefundamentalspring;

public class User {
	
	private String userId;
	private String userFname;
	private String userLname;
	
	public User() {
		
	}

	public User(String userId, String userFname, String userLname) {
		super();
		this.userId = userId;
		this.userFname = userFname;
		this.userLname = userLname;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserFname() {
		return userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	public String getUserLname() {
		return userLname;
	}

	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFname=" + userFname + ", userLname=" + userLname + "]";
	}
	
	
	

}
