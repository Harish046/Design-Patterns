package com.harish.designpattern.factory;

public class PaymentGatewayFactory {
	
	public static PaymentGateway getInstance(PaymentGatewayType type) {
		PaymentGateway gateway = null;
		switch(type) {
			case RAZORPAY:	gateway = new Razorpay(); 
				break;
			case STRIPE:	gateway = new Stirpe();
				break;
			default:
				break;
		}
		return gateway;
	}
	
	

}