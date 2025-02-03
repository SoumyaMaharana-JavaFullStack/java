/**
 * 
 */
package com.wipro.java.oops.encapsulation;

/**
 * Here we can use Animal class to demonstrates encapsulation by keeping its
 * data private and providing public getter and setter methods to control
 * access.
 */
public class Animal {
	// Private fields to declaring the animal properties
	private String Animalname;
	private int age;

	public Animal(String animalname, int age) {
		Animalname = animalname;
		this.age = age;
	}

	// Getter method to retrieve the animal's name
	public String getAnimalname() {
		return Animalname;
	}

	// Setter method to update the animal's name.
	public void setAnimalname(String animalname) {
		Animalname = animalname;
	}

	// Getter method to retrieve the animal's age
	public int getAge() {
		return age;
	}

	// Setter method to update the animal's age
	public void setAge(int age) {
		// Ensures only positive values are assigned
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Age must be positive");
		}
	}

	/**
	 * 
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating an Animal object using the constructor
		Animal animal = new Animal("Lion", 25);
		// Displaying the initial values of the object
		System.out.println(animal.getAnimalname());
		System.out.println(animal.getAge());
		// Modifying the animal's age using the setter method
		animal.setAge(24);
		System.out.println(animal.getAge());
		// Trying to set an negative value in age
		animal.setAge(-1);

	}

}
