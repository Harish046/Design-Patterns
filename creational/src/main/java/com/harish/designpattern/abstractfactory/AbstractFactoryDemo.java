package com.harish.designpattern.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		CreditCardFactory cardFactory = CreditCardFactory.getCreditCardFactory(880);
		
		CreditCard creditCard = cardFactory.getCreditCard(CardType.PLATINUM);
		
		creditCard.displayCreditCard();
		
		System.out.println("#####################################");
		cardFactory = CreditCardFactory.getCreditCardFactory(680);
		
		creditCard = cardFactory.getCreditCard(CardType.PLATINUM);
		
		creditCard.displayCreditCard();
		

	}

}
