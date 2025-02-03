/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Animal {

	/**
	 * NO constructor Getters have return value setters have no return value
	 * properties are determined using private fileds values are behaviors are
	 * determined through setters toString will convert the entire animal class with
	 * properties and behaviors
	 */

	// private properties=structure
	// fields (attributes) of the Animal Class
	private String name;// name of the animal
	private String species;// name of species
	private int age;// age of animal
	private String Color;// Color of the animal

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Lion";
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = "P.Leo";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = 25;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = "golden brown";
	}

	public String toString() {
		return "Animal name =" + name + " ,  Species" + species + "age " + age + "color" + Color;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
