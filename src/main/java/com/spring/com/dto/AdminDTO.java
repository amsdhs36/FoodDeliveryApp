package com.spring.com.dto;

public class AdminDTO {
	private long id;
	private String email;
	private String password;
public AdminDTO() {
	//TODO Auto-generated constructor stub
}
public AdminDTO(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getId() {
	return id;
	
}
public void setId(long id) {
	this.id = id;
	
}

}
