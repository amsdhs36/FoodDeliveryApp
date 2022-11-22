package com.spring.com.dto;

public class FoodItemDTO {
	private long id;
	private String name;
	private double price;
	private String url;
	private String category;
	private int quantity;
public FoodItemDTO() {
	//TODO Auto-generated constructor stub
}
public FoodItemDTO(String name, double price, String url, String category, int quantity) {
	super();
	this.name = name;
	this.price = price;
	this.url = url;
	this.setCategory(category);
	this.quantity = quantity;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}

public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public long getId() {
	return id;
	
}
public void setId(long id) {
	this.id = id;
	
}
public String getCategory() {
	return category;
	
}
public void setCategory(String category) {
	this.category = category;
	
}

}
