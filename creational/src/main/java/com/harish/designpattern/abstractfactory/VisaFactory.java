package com.harish.designpattern.abstractfactory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch(cardType) {
			case GOLD: return new VisaGoldCreditCard();
			case PLATINUM: return new VisaPlatinumCreditCard();
			default: throw new IllegalArgumentException("Invalid card type:"+cardType);
		}
	}

}
