/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
//Concept of ExceptionGandling
public class ExceptionHandling {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c=0;
		//It's throws an exception called ArithmeticException
		try {
			c=a/b;
		}
		//Catch the exception
		catch(Exception e){
			System.out.println(e.toString());
		}
	     
	     System.out.println("Program Excuted Succesfully" );
		

	}

}
