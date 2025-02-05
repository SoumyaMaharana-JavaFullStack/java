/**
 * 
 */
package com.wipro.java.collections;

import java.util.*;

/**
 * Java program demonstrating HashMap operations such as put, get,iteration, and
 * remove.
 */
public class MapImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating a HashMap with Integer keys and String values
		HashMap<Integer, String> map = new HashMap<>();
		// Adding key-value pairs to the HashMap
		map.put(1, "Dog");
		map.put(2, "Cat");
		map.put(3, "Cow");
		map.put(4, "birds");
		// Retrieving and printing values using keys
		System.out.print(" " + map.get(1) + " ");
		System.out.print(" " + map.get(2) + " ");
		System.out.print(" " + map.get(3) + " ");
		System.out.println(" " + map.get(4));
		// Iterating over the HashMap and printing key-value pairs
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.print(" " + entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
		// Removing the key-value pair where key = 4
		map.remove(4);
		// Printing the HashMap after removal
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.print(" " + entry.getKey() + ": " + entry.getValue());
		}

	}

}
