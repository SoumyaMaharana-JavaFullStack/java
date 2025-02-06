/**
 * 
 */
package com.wipro.java.collections;

import java.util.*;
import java.util.Collections;

/**
 * Class demonstrating sorting of animals by color using Comparable interface
 */
public class ColorComparable {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList to store animal objects
		ArrayList<AnimalComparable> animals = new ArrayList<>();
		// Adding elements to the list
		animals.add(new AnimalComparable("Bark", "Brown"));
		animals.add(new AnimalComparable("Meow", "White"));
		animals.add(new AnimalComparable("Trumpet", "Gray"));

		// Sorting by color using Comparator
		Collections.sort(animals);
		System.out.println("Animals Sorted by Color:");
		for (AnimalComparable a : animals) {
			System.out.println(" " + a.getSound() + " " + a.getColor());
		}
	}

}
