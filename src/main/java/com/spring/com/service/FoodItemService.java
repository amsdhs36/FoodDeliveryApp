package com.spring.com.service;

import java.util.List;

import com.spring.com.dto.FoodItemDTO;
import com.spring.com.entity.FoodItem;

public interface FoodItemService {
public String addFood(FoodItemDTO foodDto);
public List<FoodItem> getAllFood();
public String updateFood(FoodItemDTO foodDto);
public String deleteFood(long id);
public FoodItem getFoodbyId(long id);
public List<FoodItem> getSortedFood();
} 
