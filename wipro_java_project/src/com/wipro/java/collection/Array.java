/**
 * 
 */
package com.wipro.java.collection;

/**
 * 
 */
public class Array {

	/**
	 * This program demonstrates the use of an array in Java. It initializes an
	 * array, assigns values, and prints them with their indices.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		for (int i = 0; i < arr.length; i++) {
			// Loop through the array and print each element with its index
			System.out.println("Elements index no." + i + ":" + arr[i]);
		}

	}

}
