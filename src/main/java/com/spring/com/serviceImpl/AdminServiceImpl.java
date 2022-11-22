package com.spring.com.serviceImpl;

import java.util.List;

import com.spring.com.dto.AdminDTO;
import com.spring.com.entity.Admin;
import com.spring.com.repository.AdminRepository;
import com.spring.com.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AdminServiceImpl implements AdminService {
@Autowired
private AdminRepository repo;
@Override
public String addAdmin(AdminDTO adminDto) {
	// TODO Auto-generated method stub
	Admin admin=new Admin();
	admin.setEmail(adminDto.getEmail());
	admin.setPassword(adminDto.getPassword());
		repo.save(admin);
		return "New Admin data saved";
	}
@Override
public List<Admin> getAllAdmin() {
	// TODO Auto-generated method stub
	return repo.findAll();
	}

}
