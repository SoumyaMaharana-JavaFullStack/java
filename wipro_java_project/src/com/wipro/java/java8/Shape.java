package com.wipro.java.java8;

/**
 * Functional Interface representing a Shape
 */
@FunctionalInterface
interface Circle {

	// Abstract method
	public double area(double d);

	// Default method for Structure()
	default String Structure() {
		return "Circle";
	}

	// Default method Color()
	default String Color() {
		return "Black";
	}

	// Static method to display the shape properties
	static String showProperties() {
		return "Shapes properties like area";
	}

	// Static method to return the shape category
	static String ShapeCategory() {
		return "Geometric";
	}
}

/**
 * 
 */
class Shape implements Circle {
	@Override
	public double area(double r) {
		return 3.14 * r * r;
	}

	public static void main(String args[]) {
		Shape obj = new Shape();
		System.out.println("Circle Area:" + obj.area(5));

		// Calling default methods
		System.out.println("Shape Type:" + obj.Structure());
		System.out.println("Shape Color:" + obj.Color());

		// Calling static methods
		System.out.println(Circle.showProperties());
		System.out.println(Circle.ShapeCategory());
	}
}
