/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * SoundComaparatorSort class implements Comparator to sort AnimalComparison
 * objects by their sound.
 */
public class SoundComaparatorSort implements Comparator<AnimalComparison> {
	public int compare(AnimalComparison a1, AnimalComparison a2) {
		return a1.getSound().compareTo(a2.getSound());
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// Create an ArrayList to store movie objects
		ArrayList<AnimalComparison> animals = new ArrayList<>();
		// Adding Movie1 objects to the list with name,sound, and color
		animals.add(new AnimalComparison("Dog", "Bark", "Brown"));
		animals.add(new AnimalComparison("Cat", "Meow", "White"));
		animals.add(new AnimalComparison("Elephant", "Trumpet", "Gray"));

		// Sorting by sound
		Collections.sort(animals, new SoundComaparatorSort());
		System.out.println("Animals Sorted by Sound:");
		for (AnimalComparison a : animals) {
			// Printing the movie's name, rating, and year
			System.out.println(a.getName() + " " + a.getSound() + " " + a.getColor());
		}
	}

}
