/**
 * 
 */
package com.wipro.java.collection;

import java.util.*;

/**
 * Java program demonstrating List operations such as add, addAll, remove, and
 * set.
 */
//Main class
public class ListOperations {

	/**
	 * Main driver method
	 */
	public static void main(String[] args) {
		// Creating an ArrayList of Integer type
		List<Integer> list = new ArrayList<>();
		// Adding elements to the list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		// Printing the list
		System.out.println(list);
		// Creating another list
		List<Integer> list1 = new ArrayList<>();
		// Adding elements to the list
		list1.add(6);
		list1.add(7);
		list1.add(8);
		// Printing the list1
		System.out.println(list1);
		// Adding all elements from list1 at index 5 in list
		list.addAll(5, list1);
		// Printing the list after addAll operation
		System.out.println(list);
		// Removing the element at index 2
		list.remove(2);
		// Printing the list after removing the element at index 2
		System.out.println(list);
		// Updating the first element (index 0) with value 5
		list.set(2, 10);
		// Printing the final list
		System.out.println(list);

	}

}
