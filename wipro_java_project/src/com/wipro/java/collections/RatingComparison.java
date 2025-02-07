package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparator for sorting movies by rating
public class RatingComparison implements Comparator<Movie1> {
	@Override
	public int compare(Movie1 m1, Movie1 m2) {
		return Double.compare(m1.getRating(), m2.getRating()); // Sorting by rating (ascending)
	}

	// Main Methods
	public static void main(String[] args) {
		// Create an ArrayList to store movie objects
		ArrayList<Movie1> movies = new ArrayList<>();
		// Adding Movie1 objects to the list with name, rating, and year
		movies.add(new Movie1("Force Awakens", 8.3, 2015));
		movies.add(new Movie1("Star Wars", 8.7, 1997));
		movies.add(new Movie1("Empire Strikes Back", 8.8, 1980));

		// Sorting by rating
		Collections.sort(movies, new RatingComparison());
		System.out.println("Movies Sorted by Rating:");
		for (Movie1 m : movies) {
			// Printing the movie's name, rating, and year
			System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
		}
	}
}
