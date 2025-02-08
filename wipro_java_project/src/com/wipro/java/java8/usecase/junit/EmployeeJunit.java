/**
 * 
 */
package com.wipro.java.java8.usecase.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.wipro.java.java8.usecase.Employee;
import com.wipro.java.java8.usecase.EmployeeService;

import java.time.LocalDate;
import java.util.Optional;

public class EmployeeJunit {
	// Test case to verify that an employee is added successfully
	@Test
	public void testAddEmployee() {
		EmployeeService service = new EmployeeService();
		Employee emp = new Employee(1, "Bob", "IT", 50000, LocalDate.of(2020, 5, 10));
		service.addEmployee(emp);
		Optional<Employee> result = service.searchEmployee(1);
		assertEquals(true, result.isPresent());
	}

	// Test case to verify the removal of an employee
	@Test
	public void testRemoveEmployee() {
		EmployeeService service = new EmployeeService();
		Employee emp = new Employee(2, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
		service.addEmployee(emp);
		service.removeEmployee(1);
		Optional<Employee> result = service.searchEmployee(1);
		assertEquals(false, result.isPresent());
	}

	// Test case to verify that employee search by ID works correctly
	@Test
	public void testSearchEmployee() {
		EmployeeService service = new EmployeeService();
		Employee emp = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
		service.addEmployee(emp);
		Optional<Employee> result = service.searchEmployee(1);
		assertEquals("Bob", result.get().getName());
	}

	// Test case to verify that the employee's salary is updated correctly
	@Test
	public void testUpdateSalary() {
		EmployeeService service = new EmployeeService();
		Employee emp = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
		service.addEmployee(emp);
		service.updateSalary(1, 6000);
		Optional<Employee> result = service.searchEmployee(1);
		assertEquals(50000, result.get().getSalary(), 0.01);
	}
}