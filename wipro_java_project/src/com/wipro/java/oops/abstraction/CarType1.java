package com.wipro.java.oops.abstraction;

public class CarType1 extends Car {

	// Overriding the abstract method 'brand' from the abstract class Car
	@Override
	void brand() {
		// Implementation of the 'brand' method for CarType1
		System.out.println("Maruti Suzuki");

	}

	// Overriding the abstract method 'speed' from the abstract class Car
	@Override
	void speed() {
		// Implementation of the 'speed' method for CarType1
		System.out.println("150" + "Km/hr");

	}

	public static void main(String[] args) {
		// Creating an instance of a class
		Car mycar = new CarType1();
		// Calling the methods of CarType1
		mycar.brand();
		mycar.speed();
	}

}
