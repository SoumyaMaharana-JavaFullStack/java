package com.wipro.java.junit;

/*
 * JUnit test class for Calculator.
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	// Creating an instance of Calculator for testing
	private final Calculator calculator = new Calculator();

	// Tests the add method of Calculator
	@Test
	public void testAdd() {
		int result = calculator.add(3, 2);
		assertEquals(5, result);
	}

	// Tests the Substract method of Calculator
	@Test
	public void testSubstract() {
		int result = calculator.Substract(3, 2);
		assertEquals(1, result);
	}
}
