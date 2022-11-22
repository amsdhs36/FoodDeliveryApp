package com.spring.com.dto;

public class UserDTO {
	private long id;
	private String name;
	private String email;
	private String password;
	private long phone;
	
public UserDTO() {
	//TODO Auto-generated constructor stub
}

public UserDTO(String name, String email, String password, long phone) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.phone = phone;
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

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public long getPhone() {
	return phone;
}

public void setPhone(long phone) {
	this.phone = phone;
}

public long getId() {
	return id;
	
}

public void setId(long id) {
	this.id = id;
	
}

}
