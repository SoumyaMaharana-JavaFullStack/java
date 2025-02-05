/**
 * 
 */
package com.wipro.java.interface1;

/**
 * This class implements the Animal interface
 */
public class Cow implements Animal {

	@Override
	// This method prints the sound that a cow makes
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("hamba");

	}

	public static void main(String[] args) {
		// Creating an instance of Cow
		Cow obj1 = new Cow();
		obj1.makeSound();
	}

}
