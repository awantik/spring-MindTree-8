package com.skillspeed.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skillspeed.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		//.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Awantik Das");
		
//		employeeService.getEmployee().throwException();
		
//		ctx.close();
	}

}
