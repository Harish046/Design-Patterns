package com.harish.designpattern.factory;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		
		PaymentGateway paymentGateway = PaymentGatewayFactory.getInstance(PaymentGatewayType.RAZORPAY);
		
		paymentGateway.validate();
		paymentGateway.createOrder();
		paymentGateway.makePayment();
		
		paymentGateway = PaymentGatewayFactory.getInstance(PaymentGatewayType.STRIPE);
		
		paymentGateway.validate();
		paymentGateway.createOrder();
		paymentGateway.makePayment();
		

	}

}
