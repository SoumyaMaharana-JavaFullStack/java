/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Employee {
	/**
	 * NO constructor Getters have return value setters have no return value
	 * properties are determined using private fileds values are behaviors are
	 * determined through setters toString will convert the entire animal class with
	 * properties and behaviors
	 */
	// fields (attributes) of the Employee Class
	private int Employee_id;// declaring a private employee id as private to maintaining the privacy
	private String name;// declaring a private name for employee
	private String emailId;// declaring a private emailId for employee
	private int salary;// declaring the salary of an employee

	// getter method for employee_id
	public int getEmployee_id() {
		return Employee_id;
	}

	// setter method for employee_id
	public void setEmployee_id(int employee_id) {
		Employee_id = 101;
	}

	// getter method for employee_name
	public String getName() {
		return name;
	}

	// setter method for employee_name
	public void setName(String name) {
		this.name = "hari";
	}

	// getter method for employee_email
	public String getEmailId() {
		return emailId;
	}

	// setter method for employee_email
	public void setEmailId(String emailId) {
		this.emailId = "abcd@gmail";
	}

	// getter method for employee_salary
	public int getSalary() {
		return salary;
	}

	// setter method for employee_salary
	public void setSalary(int salary) {
		this.salary = 2000;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// Returning all the values
	public String toString() {
		return "Employee id =" + Employee_id + " , Employee Name=" + name + "emailId" + emailId + "Salary" + salary;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
