package com.spring.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cart_id")
	private long id;
	
	@OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "user_id")
	private User user;

	@ManyToOne()
	@JoinColumn(name = "food_id")
	private FoodItem food;
	
	public Cart(User user, FoodItem food) {
		this.user = user;
		this.food = food;
	}
	public Integer getUnit() {
		return unit;
		
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
		
	}
	public double getTotalPrice() {
		return totalPrice;
		
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
		
	}
	private  Integer unit;
	
	private double totalPrice;
	
	public Cart() {
		//TODO Auto-generated constructor stub
	}
	public Cart(long id, User user, FoodItem food, Integer unit, double totalPrice) {
		super();
		this.id = id;
		this.user = user;
		this.food = food;
		this.unit = unit;
		this.totalPrice = totalPrice;
	}
	public Cart(User user, FoodItem food, Integer unit, double totalPrice) {
		super();
		this.user = user;
		this.food = food;
		this.unit = unit;
		this.totalPrice = totalPrice;
	}
	

}
