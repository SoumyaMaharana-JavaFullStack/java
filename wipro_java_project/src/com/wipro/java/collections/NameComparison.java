/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Name ameComparison class implements Comparator to sort Movie1 objects by their name.
*/
public class NameComparison implements Comparator<Movie1> {
	@Override
	public int compare(Movie1 m1, Movie1 m2) {
		return m1.getName().compareTo(m2.getName()); // Sorting alphabetically
	}

	// Main Method
	public static void main(String[] args) {
		// Create an ArrayList to store movie objects
		ArrayList<Movie1> m1 = new ArrayList<>();
		// Adding Movie1 objects to the list with name, rating, and year
		m1.add(new Movie1("Force Awakens", 8.3, 2015));
		m1.add(new Movie1("Star Wars", 8.7, 1997));
		m1.add(new Movie1("FEmpire Strike Back", 8.8, 1980));
		// Sorting the movies list by their names using the NameComparison comparator
		Collections.sort(m1, new NameComparison());
		// Printing the sorted list of movies by name
		System.out.println("Movie Sorted by name");
		for (Movie1 m : m1) {
			// Printing the movie's name, rating, and year
			System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
		}
	}
}
