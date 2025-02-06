/**
 * 
 */
package com.wipro.java.collections;

/**
 * AnimalComparison class represents an animal with a name, sound, and color.
 */
public class AnimalComparison {
	// Variables to store the name, sound, and color of the animal
	private String name;
	private String sound;
	private String color;

	// Constructor to initialize the name, sound, and color of the animal
	public AnimalComparison(String name, String sound, String color) {
		this.name = name;
		this.sound = sound;
		this.color = color;
	}

	// Getter methods to retrieve the name,sound and color of the animal.
	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

	public String getColor() {
		return color;
	}

	/**
	 * @param args
	 */

}
