package com.wipro.java.exception;

/**
 * 
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * This program demonstrates a Checked Exception in Java. It tries to open a
 * file that does not exist, which is refers to IOException.
 */
public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Creating a File which path does not exit
			File file = new File("Path Does Not Exit");
			// Attempting to read the file, which does not exist
			FileReader reader = new FileReader(file);
		} catch (IOException e) {// Catching the IOException
			System.out.println(e.getStackTrace());
		}

	}

}
