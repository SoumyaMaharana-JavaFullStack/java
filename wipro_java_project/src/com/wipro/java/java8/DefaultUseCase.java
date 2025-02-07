/**
 * 
 */
package com.wipro.java.java8;

/**
 * Demonstrating multiple interfaces implementations
 */
interface TestInterface {
	// Default methods
	default void display() {
		System.out.println("First Interface");
	}
}

interface TestInterface1 {
	// Default methods
	default void display() {
		System.out.println("Second Interface1");
	}
}

class DefaultUseCase implements TestInterface, TestInterface1 {
	public void display() {
		// use super keyword to call show method of TestInterface
		TestInterface.super.display();
		// use super keyword to call show method of TestInterface1
		TestInterface1.super.display();
	}

	public static void main(String[] args) {
		DefaultUseCase obj = new DefaultUseCase();
		obj.display();
	}
}
