/**
 * 
 */
package com.wipro.java.java8;

/**
 * A class to demonstrate String operations such as length, character retrieval,
 * substring extraction, searching, and splitting.
 */
public class StringApi {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		// Creating a string variable
		String str = "Soumya String";
		// Printing the length of the string
		System.out.println(str.length());
		// Retrieving and printing the character at index 2
		System.out.println(str.charAt(2));
		// Extracting and printing the substring from index 1 to 3 (excluding index 3)
		System.out.println(str.substring(1, 3));
		// Checking if the string contains the character 'a' and printing the result
		System.out.println(str.contains("a"));
		// Splitting the string into an array based on spaces
		String arr[] = str.split(" ");
		// Iterating over and printing each split substring
		for (String str1 : arr) {
			System.out.println(str1);
		}

	}

}
