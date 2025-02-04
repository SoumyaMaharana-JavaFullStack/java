package com.wipro.java;

//SuperClass for the below subclass1 and subclass 2
class Animal {
	// Method to be overridden
	public void sound() {
		System.out.println("Animal makes a sound");
	}

	// Overloading
	public void sleep() {
		System.out.println("Animal is sleeping");
	}

	// Overloaded method
	public void sleep(int hours) {
		System.out.println("Animal is sleeping for " + hours + " hours");
	}
}

// Subclass 1
class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

// Subclass 2
class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Cat meows");
	}
}

public class PolymorphismOne {
	public static void main(String[] args) {

		Animal myAnimal = new Animal(); // Animal object
		Animal myDog = new Dog(); // Dog object
		Animal myCat = new Cat(); // Cat object
		myDog.sound();
		myCat.sound();
		myAnimal.sleep();
		myAnimal.sleep(5);
	}
}
