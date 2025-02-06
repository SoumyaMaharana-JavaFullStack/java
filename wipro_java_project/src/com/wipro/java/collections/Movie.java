/**
 * 
 */
package com.wipro.java.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Movie class that implements Comparable to compare and sort movies based on
 * ratings.
 */
public class Movie implements Comparable<Movie> {
	// Attributes for the Movie class: name, rating, and year
	private String n;
	private double r;
	private int y;

	// Constructor to initialize movie attributes
	public Movie(String n, double r, int y) {
		this.n = n;
		this.r = r;
		this.y = y;
	}

	// compareTo method to compare movies by their rating
	public int compareTo(Movie m) {
		/**
		 * 1 - if this movie's rating is greater than the other movie -1 - if this
		 * movie's rating is less than the other movie 0 - if both movies have the same
		 * rating
		 */
		return (this.r > m.r) ? 1 : (this.r < m.r) ? -1 : 0;
	}

	// Getter methods to retrieve the name ,ratings ,year of the movie
	public String getN() {
		return n;
	}

	public double getR() {
		return r;
	}

	public int getY() {
		return y;
	}

}
