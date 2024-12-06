package com.harish.designpattern.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		
		Registry registry = new Registry();
		Phone phone1=null;
		try {
			phone1 = (Phone) registry.createProduct("phone");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		phone1.setName("Samsung S24");
		
		System.out.println(phone1);
		System.out.println(phone1.getName());
		System.out.println(phone1.getPrice());
		System.out.println(phone1.getRating());
		System.out.println(phone1.getBattery());
		
		Phone phone2=null;
		try {
			phone2 = (Phone) registry.createProduct("phone");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		phone2.setName("Nothing 1");
		
		System.out.println(phone2);
		System.out.println(phone2.getName());
		System.out.println(phone2.getPrice());
		System.out.println(phone2.getRating());
		System.out.println(phone2.getBattery());
		

	}

}
