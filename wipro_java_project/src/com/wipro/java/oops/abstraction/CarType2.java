/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class CarType2 extends Car {
	// Overriding the abstract method 'brand' from the abstract class Car
	@Override
	void brand() {
		// Implementation of the 'brand' method for CarType2
		System.out.println("Brand name - Tata Motors");

	}

	@Override
	void speed() {
		// Implementation of the 'speed' method for CarType2
		System.out.println("Speed of the car" + "  200km/hr");

	}

	public static void main(String[] args) {
		// Creating an instance of a class
		Car mycar1 = new CarType2();
		// Calling the methods of CarType1
		mycar1.brand();
		mycar1.speed();
	}

}
