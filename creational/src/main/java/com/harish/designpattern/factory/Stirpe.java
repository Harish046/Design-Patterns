package com.harish.designpattern.factory;

public class Stirpe implements PaymentGateway{

	@Override
	public boolean validate() {
		System.out.println("Stripe deatils validated");
		return true;
	}

	@Override
	public void createOrder() {
		System.out.println("Stripe order created");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Stripe payment done");
		
	}
	
	

}
