/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent Class= Employee ,Child class= ProjectLead ,Extends = is a Keyword
 * 
 */
public class ProjectLead extends Employee {

	/**
	 * 
	 */
	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Child object is instantiated from child constructor
		// Parent Class consumes the properties and behaviors of child class
		Employee emp = new ProjectLead();
		// ProjectLeader Email_id
		emp.setEmailId("abc@gmail");
		// ProjectLeader employee_id
		emp.setEmployee_id(100);
		// ProjectLeader employee_name
		emp.setName("hari");
		// ProjectLeader salary
		emp.setSalary(2000);
		// Printing the values of the given properties
		System.out.println(emp.getName());
		System.out.println(emp.getEmployee_id());
		System.out.println(emp.getEmailId());
		System.out.println(emp.getSalary());
	}

}
