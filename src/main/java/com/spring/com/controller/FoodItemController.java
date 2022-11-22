package com.spring.com.controller;

import java.util.List;

import com.spring.com.dto.FoodItemDTO;
import com.spring.com.entity.FoodItem;
import com.spring.com.service.FoodItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
@CrossOrigin("http://localhost:4200/")

public class FoodItemController {
	@Autowired
	private FoodItemService service;
	
	@PostMapping("/add-food")
	public String addProduct(@RequestBody FoodItemDTO dto) {
		return service.addFood(dto);
		
	}
	
	@GetMapping("/getAll")
	public List<FoodItem> getAllFood(){
		return service.getAllFood();
	}
	
	@PutMapping("/updateFood")
	public String updateFood(@RequestBody FoodItemDTO dto) {
		return service.updateFood(dto);
	}
	
	@DeleteMapping("/deletefood/{id}")
	public String deleteFood(@PathVariable long id) {
		return service.deleteFood(id);
	}
	
	@GetMapping("get-food/{id}")
	public FoodItem getFoodById(@PathVariable long id) {
		return service.getFoodbyId(id);

}
	@GetMapping("/get-sorted-food")
	public List<FoodItem> getSortedFood(){
		return service.getSortedFood();
	}
}


