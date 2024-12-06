package com.harish.designpattern.abstractfactory;

public class AmexPlatinumCreditCard implements CreditCard {

	@Override
	public void displayCreditCard() {
		System.out.println("American Express Platinum");
		System.out.println("Card Number: 4876 2345 1234 8865");
		System.out.println("Expiry: 03/26");
		System.out.println("CVV: 236");
	}

}
