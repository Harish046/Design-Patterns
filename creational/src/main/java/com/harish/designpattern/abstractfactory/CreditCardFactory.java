package com.harish.designpattern.abstractfactory;

public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if(creditScore > 750) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);

}
