package com.harish.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Product> products = new HashMap<>();
	
	public Registry() {
		loadProducts();
	}
	
	public Product createProduct(String type) throws CloneNotSupportedException {
		Product product=null;
		product = (Product) products.get(type).clone();
		return product;
	}
	
	private void loadProducts() {
		Phone phone = new Phone();
		phone.setName("Iphone 15");
		phone.setPrice(79999.99);
		phone.setRating(5);
		phone.setBattery(5000);
		products.put("phone", phone);
		
		Waterpurifier waterpurifier = new Waterpurifier();
		waterpurifier.setName("Ao Smith");
		waterpurifier.setPrice(24999.99);
		waterpurifier.setRating(4);
		waterpurifier.setCapacity(10);
		products.put("waterpurifier", waterpurifier);
		
	}

}
