/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
//Concept of ExceptionHandling
public class ExceptionHandling {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		float result = 0;
		// It's throws an exception called ArithmeticException
		try {
			result = num1 / num2;
		}
		// Catch the exception
		catch (Exception e) {
			System.out.println(e.toString());
		} finally {//it will execute at anymore whether the exceptions occurred or not
			System.out.println("Code will excute");
		}

		System.out.println("Program Executed Succesfully");

	}

}
