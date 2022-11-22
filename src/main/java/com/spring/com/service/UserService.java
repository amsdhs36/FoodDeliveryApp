package com.spring.com.service;

import java.util.List;

import com.spring.com.dto.UserDTO;
import com.spring.com.entity.User;

public interface UserService {
public String addUser(UserDTO userDto);
	
	public List<User> getAllUser();
	
	public String updateUser(UserDTO userDto);
	
	public User getUserById(long id);
	
	public String deleteUser(long id);

}
