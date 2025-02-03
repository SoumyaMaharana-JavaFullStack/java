/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class CarTwo extends Car {

	/**
	 * 
	 */
	public CarTwo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Creating an instance of CarType1 using polymorphism
		Car obj = new CarTwo();
		// setting the inputs
		obj.setBrand("hyndai");
		obj.setName("I20");
		obj.setSpeed(200);
		// Displaying the outputs
		System.out.println(obj.getBrand());
		System.out.println(obj.getName());
		System.out.println(obj.getSpeed());

	}

}
