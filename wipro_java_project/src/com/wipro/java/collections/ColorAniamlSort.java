/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * ColorAniamlSort class is a custom Comparator implementation that sorts
 */
public class ColorAniamlSort implements Comparator<AnimalComparison> {

	/**
	 * Compares two AnimalComparison objects based on their color attribute.
	 */
	public int compare(AnimalComparison a1, AnimalComparison a2) {
		return a1.getColor().compareTo(a2.getColor());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<AnimalComparison> animals = new ArrayList<>();
		animals.add(new AnimalComparison("Dog", "Bark", "Brown"));
		animals.add(new AnimalComparison("Cat", "Meow", "White"));
		animals.add(new AnimalComparison("Elephant", "Trumpet", "Gray"));

		// Sorting by color
		Collections.sort(animals, new ColorAniamlSort());
		System.out.println("Animals Sorted by Color:");
		for (AnimalComparison a : animals) {
			System.out.println(a.getName() + " " + a.getSound() + " " + a.getColor());
		}

	}

}
