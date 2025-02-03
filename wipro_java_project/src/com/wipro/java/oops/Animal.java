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

	// this method used to get the name
	public String getName() {
		return name;
	}

	// this method used to set the name
	public void setName(String name) {
		this.name = "Lion";
	}

	// this method used to get the species
	public String getSpecies() {
		return species;
	}

	// this method used to set the species
	public void setSpecies(String species) {
		this.species = "P.Leo";
	}

	// this method used to get the age
	public int getAge() {
		return age;
	}

	// this method used to set the age
	public void setAge(int age) {
		this.age = 25;
	}

	// this method used to get the color
	public String getColor() {
		return Color;
	}

	// this method used to set the color
	public void setColor(String color) {
		Color = "golden brown";
	}

	// returning all the values
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
