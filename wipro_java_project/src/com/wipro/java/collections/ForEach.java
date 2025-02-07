/**
 * 
 */
package com.wipro.java.collections;

/**
 * A program to demonstrate iterating an integer array using a for-each loop.
 */
public class ForEach {

	/**
	 * Main method
	 * 
	 */
	public static void main(String[] args) {
		// Defining an integer array
		int[] numbers = { 10, 20, 30, 40, 50 };

		// Iterating through the array using a for-each loop and printing each element
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}
