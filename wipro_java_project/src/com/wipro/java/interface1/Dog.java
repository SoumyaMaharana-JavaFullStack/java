/**
 * 
 */
package com.wipro.java.interface1;

/**
 * This class implements the Animal interface
 */
public class Dog implements Animal {

	@Override
	// This method prints the sound that a Dog makes
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("bark");

	}

	public static void main(String[] args) {
		// Creating an instance of Dog
		Dog obj = new Dog();
		obj.makeSound();
	}

}
