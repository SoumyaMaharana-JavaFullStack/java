/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent Class= Employee ,Child class= Developer ,Extends = is a Keyword
 * 
 */
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Child object is instantiated from child constructor
		// Parent Class consumes the properties and behaviors of child class
		Employee dev = new Developer();
		// name of developer
		dev.setName("Ram -Java Developer");
		// id of developer
		dev.setEmployee_id(101);
		// email of developer
		dev.setEmailId("xyz@gmail");
		// salary of developer
		dev.setSalary(5000);
		System.out.println(dev.getName());
		System.out.println(dev.getEmployee_id());
		System.out.println(dev.getEmailId());
		System.out.println(dev.getSalary());
	}
}
