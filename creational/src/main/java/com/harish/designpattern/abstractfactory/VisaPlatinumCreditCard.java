package com.harish.designpattern.abstractfactory;

public class VisaPlatinumCreditCard implements CreditCard {

	@Override
	public void displayCreditCard() {
		System.out.println("Visa Platinum");
		System.out.println("Card Number: 4487 8765 1234 0098");
		System.out.println("Expiry: 02/25");
		System.out.println("CVV: 567");

	}

}
