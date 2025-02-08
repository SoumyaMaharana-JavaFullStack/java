/**
 * 
 */
package com.wipro.java.java8.usecase;

import java.time.LocalDate;

/**
 * Employee class representing an employee entity with details such as ID, name,
 * department, salary, and joining date.
 */
public class Employee {

	/**
	 * Unique identifier for the employee
	 */
	// Id of the employee
	private int id;
	// Name of the employee
	private String name;
	// Employee department
	private String department;
	// Employee Salary
	private double salary;
	// Employee JoiningDate
	private LocalDate joiningDate;

	// Constructor
	public Employee(int id, String name, String department, double salary, LocalDate joiningDate) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Method to return the String Values
	public String toString() {
		return "Employee { " + "ID=" + id + ", Name='" + name + '\'' + ", Dept='" + department + '\'' + ", Salary="
				+ salary + ", JoiningDate=" + joiningDate + " }";
	}

}
