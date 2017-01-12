package com.journaldev.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hamcrest.object.IsCompatibleType;
import org.junit.Test;

import com.journaldev.test.Employee;
import com.journaldev.test.Person;

public class HamcrestTestCases {
	
	@Test
	public void testStartWith(){
		
		// Create Employee instance
		Employee employee = new Employee();
		
		// Using assertThat to evaluate specific matcher
		assertThat(employee.getName(), startsWith("Empty"));
	}
	
	@Test
	public void testEndsWith(){
		
		// Create Employee instance
		Employee employee = new Employee();
		
		// Using assertThat to evaluate specific matcher
		assertThat(employee.getName(), endsWith("Name"));
	}	
	
	@Test
	public void testContainsWith(){
		
		// Create Employee instance
		Employee employee = new Employee();
		
		// Using assertThat to evaluate specific matcher
		assertThat(employee.getName(), containsString("y N"));
	}	
	
	@Test
	public void testEqualToIgnoringCase(){
		// Create Employee instance
		Employee employee = new Employee();
		
		// Using assertThat to evaluate specific matcher
		assertThat(employee.getName(), equalToIgnoringCase("eMpTy NaMe"));
	}
	
	@Test
	public void testEqualToIgnoringWhiteSpace(){
		// Create Employee instance
		Employee employee = new Employee();
		
		// Using assertThat to evaluate specific matcher
		assertThat(employee.getName(), equalToIgnoringWhiteSpace("    Empty       Name       "));
	}	
	
	@Test
	public void testhasItem(){
		// Create Employee instance
		Employee employee = new Employee();
		
		// Create employees list
		List<Employee> employees = new ArrayList<Employee>();
		
		// Add employee
		employees.add(employee);
		
		// Using assertThat to evaluate specific matcher
		assertThat(employees,hasItem(employee));
	}	
	
	@Test
	public void testhasItems(){
		// Create Employee instance
		Employee employee1 = new Employee();
		
		// Create Employee instance
		Employee employee2 = new Employee();		
		
		// Create employees list
		List<Employee> employees = new ArrayList<Employee>();
		
		// Add employee
		employees.add(employee1);

		// Add employee
		employees.add(employee2);
		
		// Using assertThat to evaluate specific matcher
		assertThat(employees,hasItems(employee1,employee2));
	}	
	
	@Test
	public void testhasEntry(){
		// Create Employee instance
		Employee employee1 = new Employee();
		
		employee1.setName("Mohammad");
		
		// Create a Map
		HashMap<String,Employee> employees = new HashMap<String,Employee>();
		
		// Add employee 1
		employees.put(employee1.getName(), employee1);
		
		// Assert
		assertThat(employees, hasEntry(employee1.getName(), employee1));
	}	
	
	@Test
	public void testhasProperty(){
		// Create Employee instance
		Employee employee = new Employee();
		
		// Assert
		assertThat(employee, hasProperty("name"));
	}	
	
	@Test
	public void testNotNull(){
		// Create Employee instance
		Employee employee = new Employee();
		
		// Assert
		assertThat(employee, notNullValue());
	}	
	
	@Test
	public void testSameInstance(){
		// Create employee
		Employee employee = new Employee();
		
		// Declare another employee variable
		Employee employee2 = employee;
		
		// Assert
		assertThat(employee, sameInstance(employee2));
	}
	
	@Test
	public void testInstanceOf(){
		// Create employee
		Employee employee = new Employee();
		
		// Assert
		assertThat(employee, instanceOf(Person.class));
	}	
	
	@Test
	public void testNotInstanceOf(){
		// Create employee
		Person person = new Person();
		
		// Assert
		assertThat(person, not(instanceOf(Employee.class)));
	}
	
	@Test
	public void testIsCompatibleType(){
		
		// Create isCompatible Matcher
		IsCompatibleType<Person> isPersonCompatible = new IsCompatibleType<Person>(Person.class);

		// Create isCompatible Matcher
		IsCompatibleType<Employee> isEmployeeCompatible = new IsCompatibleType<Employee>(Employee.class);
		
		// Assert; Employee class definition is compatible (instance) with/of Person
		assertThat(Employee.class,isPersonCompatible);
		
		// Assert; Person class definition is compatible (instance) with/of Person
		assertThat(Person.class,isPersonCompatible);
		
		// Assert; Person class definition is not compatible (instance) with/of Employee
		assertThat(Person.class,not(isEmployeeCompatible));		
	}
	
	
	@Test
	public void testIsNotCompatibleType(){
		
		// Create isCompatible Matcher
		IsCompatibleType<String> isNotCompatible = new IsCompatibleType<String>(String.class);
		
		// Assert; employee class definition isn't compatible/instance with/of String
		assertThat(Employee.class,not(isNotCompatible));
	}
	
	@Test
	public void testAnyOf(){
		
		// Create isCompatible Matcher
		IsCompatibleType<Person> isPersonCompatible = new IsCompatibleType<Person>(Person.class);

		// Create isCompatible Matcher
		IsCompatibleType<Employee> isEmployeeCompatible = new IsCompatibleType<Employee>(Employee.class);
		
		// Assert; employee class is instance of Person OR employee
		assertThat(Employee.class,anyOf(isPersonCompatible,isEmployeeCompatible));
	}
	
	@Test
	public void testAllOf(){
		
		// Create isCompatible Matcher
		IsCompatibleType<Person> isPersonCompatible = new IsCompatibleType<Person>(Person.class);

		// Create isCompatible Matcher
		IsCompatibleType<Employee> isEmployeeCompatible = new IsCompatibleType<Employee>(Employee.class);
		
		// Assert; Person class is an instance of Person AND not of Employee
		assertThat(Person.class,allOf(isPersonCompatible,not(isEmployeeCompatible)));
	}					
	
}

class Person {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

class Employee extends Person{
	
	private int id = 0;
	private String name = "Empty Name";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
