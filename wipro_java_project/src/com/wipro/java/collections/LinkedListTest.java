/**
 * 
 */
package com.wipro.java.collections;

import java.util.*;

/**
 * Java program demonstrating LinkedList operations such as add, remove, and
 * get.
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Defining the number of elements to be added
		int n = 5;
		// Creating a LinkedList of Integer type
		List<Integer> list1 = new LinkedList<Integer>();
		// Adding elements from 0 to n in the LinkedList
		for (int i = 0; i <= n; i++) {
			list1.add(i);
		}
		// Printing the LinkedList after adding elements
		System.out.println(list1);
		// Removing the element at index 3
		list1.remove(3);
		// Printing the LinkedList after removal
		System.out.println(list1);
		// Modifying the list
		list1.set(2, 12);
		System.out.println(list1);
		// Iterating and printing elements using get() method
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}

	}

}
