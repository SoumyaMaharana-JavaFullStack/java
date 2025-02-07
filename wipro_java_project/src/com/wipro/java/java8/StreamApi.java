/**
 * Java program demonstrating the usage of Java 8 Stream API.
 */
package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A class to demonstrate various Stream API operations such as filtering,
 * mapping, sorting, and finding min/max values.
 */
public class StreamApi {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		// Creating a list of strings
		List<String> list = Arrays.asList("Hello", "I", "Soumya");
		// Filtering elements that start with "S"
		List<String> stream = list.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
		System.out.println(stream);
		// Converting all elements in the list to uppercase
		List<String> stream1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stream1);
		// Creating a list of integers
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		// Sorting the list in ascending order using Stream API
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
		// Creating another list of integers
		List<Integer> numbers1 = Arrays.asList(10, 20, 5, 25, 30);
		// Finding the minimum value in the list
		int min = numbers1.stream().min(Integer::compare).get();
		// Finding the maximum value in the list
		int max = numbers1.stream().max(Integer::compare).get();
		// Prinitng the minimum and maximum value
		System.out.println(min);
		System.out.println(max);
	}

}
