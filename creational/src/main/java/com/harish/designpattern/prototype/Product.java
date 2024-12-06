package com.harish.designpattern.prototype;

public abstract class Product implements Cloneable{
	
	private String name;
	private double price;
	private int rating;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
