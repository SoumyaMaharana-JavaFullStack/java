/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * MovieSort class to demonstrate sorting a list of movies based on ratings.
 */
public class MovieSort {

	// Main Method
	public static void main(String[] args) {
		// Create an ArrayList to store the movies
		ArrayList<Movie> list = new ArrayList<>();
		// Adding Movie objects to the list
		list.add(new Movie("Star Wars", 8.7, 1997));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		// Sorting the list of movies based on their rating using the compareTo method
		// in Movie class
		Collections.sort(list);
		// Printing the sorted list of movies
		System.out.println("Movie after soritng by ratings");
		// Looping through the list and printing each movie's details
		for (Movie m : list) {
			System.out.println(m.getN() + " " + m.getR() + " " + m.getY());
		}
	}
}
