package com.harish.designpattern.factory;

public class Razorpay implements PaymentGateway{

	@Override
	public boolean validate() {
		System.out.println("RazorPay details validated");
		return true;
	}

	@Override
	public void createOrder() {
		System.out.println("RazorPay order created");
	}

	@Override
	public void makePayment() {
		System.out.println("RazorPay payment done");
	}
	
	

}
