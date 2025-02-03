/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car {

	/**
	 * 
	 */
	private String brand;
	private String name;
	private int speed;

	// Get the brandname
	public String getBrand() {
		return brand;
	}

	// set the brandname
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// get the name of the car
	public String getName() {
		return name;
	}

	// set the name of a car
	public void setName(String name) {
		this.name = name;
	}

	// get the speed of the car
	public int getSpeed() {
		return speed;
	}

	// set the speed of the car
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * toString()-used to return the values
	 */
	public String toString() {
		return "Car brand=" + brand + " , Car name=" + name + "speed" + speed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
