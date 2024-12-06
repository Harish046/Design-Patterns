package com.harish.designpattern.factory;

public interface PaymentGateway {
	
	public boolean validate();
	
	public void createOrder();
	
	public void makePayment();

}
