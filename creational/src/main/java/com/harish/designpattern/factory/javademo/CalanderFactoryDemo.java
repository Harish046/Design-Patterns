package com.harish.designpattern.factory.javademo;

import java.util.Calendar;

public class CalanderFactoryDemo {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

	}

}
