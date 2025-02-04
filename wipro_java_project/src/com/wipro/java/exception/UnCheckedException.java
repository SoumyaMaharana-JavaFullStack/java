/**
 * 
 */
package com.wipro.java.exception;

/**
 * This program demonstrates an Unchecked Exception in Java. It attempts to
 * divide a number by zero, which leads to an ArithmeticException.
 */
public class UnCheckedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Attempting to divide by zero
			int result = 10 / 0;
		} catch (Exception e) {// Catching the exception
			System.out.println("Exception Occured" + e.toString());
		}

	}

}
