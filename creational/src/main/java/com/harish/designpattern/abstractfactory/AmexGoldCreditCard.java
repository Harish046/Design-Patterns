package com.harish.designpattern.abstractfactory;

public class AmexGoldCreditCard implements CreditCard {

	@Override
	public void displayCreditCard() {
		System.out.println("American Express Gold");
		System.out.println("Card Number: 4876 8765 1234 0098");
		System.out.println("Expiry: 02/25");
		System.out.println("CVV: 567");
		
	}

}
