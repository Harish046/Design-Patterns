package com.harish.designpattern.builder;

import java.util.Optional;

public class Bike {
	
	private Brand brand;
	private String chassisNo;
	private String engineNo;
	private Fuel fuel;
	private short fuelCapacity;
	private Transmission transmission;
	
	private Bike(BikeBuilder bikeBuilder) {
		this.brand = bikeBuilder.brand;
		this.chassisNo = bikeBuilder.chassisNo;
		this.engineNo = bikeBuilder.engineNo;
		Optional<Fuel> optionalFuel = Optional.ofNullable(bikeBuilder.fuel);
		this.fuel = optionalFuel.orElse(Fuel.NA);
		this.fuelCapacity = bikeBuilder.fuelCapacity;
		Optional<Transmission> optionalTrans = Optional.ofNullable(bikeBuilder.transmission);
		this.transmission = optionalTrans.orElse(Transmission.NA);
	}
	
	public Brand getBrand() {
		return brand;
	}
	
	public String getChassisNo() {
		return chassisNo;
	}
	
	public String getEngineNo() {
		return engineNo;
	}
	
	public Fuel getFuel() {
		return fuel;
	}
	
	public short getFuelCapacity() {
		return fuelCapacity;
	}
	
	public Transmission getTransmission() {
		return transmission;
	}
	
	
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", chassisNo=" + chassisNo + ", engineNo=" + engineNo + ", fuel=" + fuel
				+ ", fuelCapacity=" + fuelCapacity + ", transmission=" + transmission + "]";
	}


	public static class BikeBuilder {
		private Brand brand;
		private String chassisNo;
		private String engineNo;
		private Fuel fuel;
		private short fuelCapacity;
		private Transmission transmission;
		
		public BikeBuilder(Brand brand, String chassisNo, String engineNo) {
			this.brand = brand;
			this.chassisNo = chassisNo;
			this.engineNo = engineNo;
		}
		
		public BikeBuilder fuel(Fuel fuel) {
			Optional<Fuel> optional = Optional.ofNullable(fuel);
			this.fuel = optional.orElse(Fuel.NA);
			return this;
		}
		public BikeBuilder fuelCapacity(short fuelCapacity) {
			this.fuelCapacity = fuelCapacity;
			return this;
		}
		
		public BikeBuilder transmission(Transmission transmission) {
			Optional<Transmission> optional = Optional.ofNullable(transmission);
			this.transmission = optional.orElse(Transmission.NA);
			return this;
		}
		
		public Bike build() {
			Bike bike = new Bike(this);
			return bike;
		}
	}

}
