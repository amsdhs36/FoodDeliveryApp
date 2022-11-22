package com.spring.com.controller;

import java.util.List;

import com.spring.com.entity.Cart;
import com.spring.com.entity.FoodItem;
import com.spring.com.entity.User;
import com.spring.com.service.CartService;
import com.spring.com.service.FoodItemService;
import com.spring.com.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/cart")

public class CartController {
@Autowired
private CartService service;
@Autowired
private UserService userService;
@Autowired 
private FoodItemService foodService;
@GetMapping("getall/{userId}")
public List<Cart> getCart(@PathVariable long userId) {
	return service.getAllByUserCart(userId);
}
@GetMapping("/add/{foodId}/{userId}")
public ResponseEntity<Cart> addCart(@PathVariable long foodId,@PathVariable long userId) {

	FoodItem food = foodService.getFoodbyId(foodId);
	User user = userService.getUserById(userId);
	Cart cart = new Cart(user, food);
	cart.setUnit(1);
	cart.setTotalPrice(cart.getUnit()*food.getPrice());
	Cart addCart = service.addToCart(cart);
	return new ResponseEntity<Cart>(addCart, HttpStatus.CREATED);

}
@DeleteMapping("/delete/{cartId}")
public ResponseEntity<?> deletCart(@PathVariable long cartId) {

	service.deleteCart(cartId);
	return new ResponseEntity<>(HttpStatus.OK);
}
@PutMapping("/update-cart/{cid}")
public void updateCart(@RequestBody Cart cart, @PathVariable long cid) {
	service.updateCart(cart, cid);
	
}



}
