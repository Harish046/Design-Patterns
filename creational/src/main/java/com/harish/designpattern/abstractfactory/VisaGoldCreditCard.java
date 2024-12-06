package com.harish.designpattern.abstractfactory;

public class VisaGoldCreditCard implements CreditCard {

	@Override
	public void displayCreditCard() {
		System.out.println("Visa Gold");
		System.out.println("Card Number: 4487 1134 4456 7798");
		System.out.println("Expiry: 03/26");
		System.out.println("CVV: 124");

	}

}
