/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * NameAnimalSort class implements Comparator to sort AnimalComparison objects
 * by their name.
 */
public class NameAnimalSort implements Comparator<AnimalComparison> {

	@Override
	// compare method to compare two animals based on their names in alphabetical
	// order.

	public int compare(AnimalComparison a1, AnimalComparison a2) {
		return a1.getName().compareTo(a2.getName());
	}

	// Main Method
	public static void main(String[] args) {
		// Create an ArrayList to store animal objects
		ArrayList<AnimalComparison> animals = new ArrayList<>();
		// Adding AnimalComparison objects to the list with name, sound, and color
		animals.add(new AnimalComparison("Dog", "Bark", "Brown"));
		animals.add(new AnimalComparison("Cat", "Meow", "White"));
		animals.add(new AnimalComparison("Elephant", "Trumpet", "Gray"));
		// Sorting the animals list by their names using the NameAnimalSort comparator
		Collections.sort(animals, new NameAnimalSort());
		// Printing the sorted list of animals by name
		System.out.println("Animals Sorted by Name:");
		for (AnimalComparison a : animals) {
			System.out.println(a.getName() + " " + a.getSound() + " " + a.getColor());
		}

	}

}
