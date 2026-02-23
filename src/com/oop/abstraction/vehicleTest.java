package com.oop.abstraction;

public class vehicleTest {
	public static void main(String [] args) {
		vehicle car = new Car();
		car.starts();
		car.startswith();
		car.stops();
		
		System.out.println();
		
		vehicle bike = new Bike();
		bike.starts();
		bike.startswith();
		bike.stops();
		
	}

}
