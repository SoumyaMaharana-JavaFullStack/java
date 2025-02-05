/**
 * 
 */
package com.wipro.java.collections;

import java.util.*;

/**
 * 
 */
public class Collections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array
		System.out.println("Displaying  Array");
		int arr[] = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + " ");
		}
		System.out.println();
		System.out.println("Displaying ArrayList");

		// ArrayList
		List<Integer> list = new ArrayList<>();
		// Adding elements to the list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		// Printing the list
		System.out.println(list);

		// LinkedList
		System.out.println("Displaying LinkedList");
		int n = 5;
		// Creating a LinkedList of Integer type
		List<Integer> list1 = new LinkedList<Integer>();
		// Adding elements from 0 to n in the LinkedList
		for (int i = 0; i <= n; i++) {
			list1.add(i);
		}
		// Printing the LinkedList after adding elements
		System.out.println(list1);

		// HashMap
		System.out.println("Displaying Map Elements");
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

	}

}
