/**
 * 
 */
package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class CheckUncheck {

	/**
	 * 
	 */
	public CheckUncheck() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Checking the checked Exception");
			File file = new File("Path Does Not Exist");
			FileReader reader = new FileReader(file);
		} catch (IOException e) {
			System.out.println("Exception Occurred:" + e.toString());
		}
		try {
			System.out.println("Checking the Unchecked Exception");
			int result = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception Occurred: " + e.toString());
		}

	}

}
