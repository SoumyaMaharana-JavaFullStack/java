/**
 * 
 */
package com.wipro.java.collections;

/**
 * AnimalComparable class implements Comparable<AnimalComparable> to compare
 * AnimalComparable objects.
 */
public class AnimalComparable implements Comparable<AnimalComparable> {
	// Instance variables to store the sound and color of the animal
	private String sound;
	private String color;

	/**
	 * Constructor to initialize sound and color of the animal
	 */
	public AnimalComparable(String sound, String color) {
		this.sound = sound;
		this.color = color;
	}

	// Getter methods to retrieve the sound and color of the animal
	public String getSound() {
		return sound;
	}

	public String getColor() {
		return color;
	}

	public int compareTo(AnimalComparable a) {
		return this.color.compareTo(a.color);/// Compare colors lexicographically
	}
}
