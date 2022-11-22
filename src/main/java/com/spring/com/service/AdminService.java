package com.spring.com.service;

import java.util.List;

import com.spring.com.dto.AdminDTO;
import com.spring.com.entity.Admin;

public interface AdminService {
public String addAdmin(AdminDTO adminDto);
	
	public List<Admin> getAllAdmin();

}
