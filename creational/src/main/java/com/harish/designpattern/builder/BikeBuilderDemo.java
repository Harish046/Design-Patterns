package com.harish.designpattern.builder;

import com.harish.designpattern.builder.Bike.BikeBuilder;

public class BikeBuilderDemo {

	public static void main(String[] args) {
		
		Bike bike1 = new BikeBuilder(Brand.YAMAHA, "XRS124CF43", "XSDE6768BH6478")
							.fuel(Fuel.DIESEL)
							.fuelCapacity((short) 10)
							.transmission(Transmission.FOUR)
							.build();
		
		System.out.println(bike1);
		
		Bike bike2 = new BikeBuilder(Brand.TVS, "FDN124KJN3", "BDLS4382KSD2342")
				.fuel(Fuel.PETROL)
				//.fuelCapacity((short) 10)
				//.transmission(Transmission.FOUR)
				.build();
		
		System.out.println(bike2);
		
		Bike bike3 = new BikeBuilder(Brand.HONDA, "NWE124CF43", "NESJ2234NE9475")
				//.fuel(Fuel.PETROL)
				//.fuelCapacity((short) 10)
				//.transmission(Transmission.FOUR)
				.build();
		
		System.out.println(bike3);

	}

}
