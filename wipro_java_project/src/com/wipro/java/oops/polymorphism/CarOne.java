/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class CarOne extends Car {

	/**
	 * 
	 */
	public CarOne() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Creating an instance of CarType1 using polymorphism
		Car obj = new CarOne();
		// setting the inputs
		obj.setBrand("Hyundai");
		obj.setName("Creta");
		obj.setSpeed(180);
		// Displaying the outputs
		System.out.println(obj.getBrand());
		System.out.println(obj.getName());
		System.out.println(obj.getSpeed());
	}

}
