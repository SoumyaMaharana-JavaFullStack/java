package com.wipro.java.collections;

import java.util.*;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}

class AgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.age, p2.age);
	}
}

public class LinkedListSort {
	public static void main(String[] args) {
		LinkedList<Person> list = new LinkedList<>();
		list.add(new Person("Alice", 30));
		list.add(new Person("Bob", 25));
		list.add(new Person("Charlie", 35));

		System.out.println("Before sorting: " + list);

		list.sort(new AgeComparator());

		System.out.println("After sorting by age: " + list);
	}
}