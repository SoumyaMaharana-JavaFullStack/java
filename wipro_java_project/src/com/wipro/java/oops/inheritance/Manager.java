/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent Class= Employee ,Child class= Manager ,Extends = is a Keyword
 * 
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Child object is instantiated from child constructor
		// Parent Class consumes the properties and behaviors of child class
		Employee man = new Manager();
		// Name of manager
		man.setName("Sam-Project Manager");
		// id for manager
		man.setEmployee_id(111);
		// email_id for manager
		man.setEmailId("xdx@gmail");
		// salary for manager
		man.setSalary(10000);
		// Printing the values of the given properties
		System.out.println(man.getName());
		System.out.println(man.getEmployee_id());
		System.out.println(man.getEmailId());
		System.out.println(man.getSalary());
	}

}
