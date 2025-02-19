package com.wipro.java.collections.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap;
import java.util.Map;

public class StudentList {
	public static void main(String[] args) {
		// Creating a list to store duplicate roll numbers and names
		List<Map.Entry<Integer, String>> students = new ArrayList<>();

		// Adding 10 students with duplicate names and duplicate roll numbers
		students.add(new AbstractMap.SimpleEntry<>(101, "Alice"));
		students.add(new AbstractMap.SimpleEntry<>(102, "Bob"));
		students.add(new AbstractMap.SimpleEntry<>(101, "Alice")); // Duplicate name and roll number
		students.add(new AbstractMap.SimpleEntry<>(104, "Charlie"));
		students.add(new AbstractMap.SimpleEntry<>(105, "David"));
		students.add(new AbstractMap.SimpleEntry<>(106, "Eve"));
		students.add(new AbstractMap.SimpleEntry<>(107, "Frank"));
		students.add(new AbstractMap.SimpleEntry<>(108, "Bob")); // Duplicate name
		students.add(new AbstractMap.SimpleEntry<>(101, "Grace")); // Duplicate roll number
		students.add(new AbstractMap.SimpleEntry<>(102, "Hank")); // Duplicate roll number

		// Displaying the student records
		for (Map.Entry<Integer, String> entry : students) {
			System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
		}
	}
}
