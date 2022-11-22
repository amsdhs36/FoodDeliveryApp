package com.spring.com.serviceImpl;

import java.util.List;

import com.spring.com.dto.FoodItemDTO;
import com.spring.com.entity.FoodItem;
import com.spring.com.repository.FoodRepository;
import com.spring.com.service.FoodItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class FoodItemServiceImpl implements FoodItemService {
@Autowired
private FoodRepository repo;
public String addFood(FoodItemDTO foodDto) {
	FoodItem food=new FoodItem();
	food.setName(foodDto.getName());
	food.setPrice(foodDto.getPrice());
	food.setUrl(foodDto.getUrl());
	food.setQuantity(foodDto.getQuantity());
	food.setCatagory(foodDto.getCategory());
	repo.save(food);
	return "New FoodItem is Saved";
}
@Override
public List<FoodItem> getSortedFood(){
	return repo.findAll(Sort.by("Category"));
}
@Override
public String updateFood
(FoodItemDTO foodDto) {
	// TODO Auto-generated method stub
	FoodItem food=new FoodItem();
	food.setName(foodDto.getName());
	food.setPrice(foodDto.getPrice());
	food.setUrl(foodDto.getUrl());
	food.setQuantity(foodDto.getQuantity());
	food.setCatagory(foodDto.getCategory());
	repo.save(food);
	return "FoodItem is Updated";
}
@Override
public String deleteFood(long id) {
	// TODO Auto-generated method stub
	repo.deleteById(id);
	return "FoodItem is Deleted";
}

@Override
public FoodItem getFoodbyId(long id) {
	return repo.findById(id).get();
	
}
@Override
public List<FoodItem> getAllFood() {
	// TODO Auto-generated method stub
	return repo.findAll();
}

}
