
package com.spring.com.controller;

import java.util.List;

import com.spring.com.dto.AdminDTO;
import com.spring.com.entity.Admin;
import com.spring.com.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200/")

public class AdminController {
@Autowired
private AdminService service;
@PostMapping("/add-admin")
public String addAdmin(@RequestBody AdminDTO dto) {
	return service.addAdmin(dto);
}

@GetMapping("/getAll")
public List<Admin> getAllAdmins(){
	return service.getAllAdmin();
}


}
