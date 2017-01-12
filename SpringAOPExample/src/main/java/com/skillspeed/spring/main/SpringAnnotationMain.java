package com.skillspeed.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skillspeed.spring.model.Employee;
import com.skillspeed.spring.service.EmployeeService;



public class SpringAnnotationMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		//Employee e = employeeService.getEmployee();
		//employeeService.setEmployee(e);
		Employee e= ctx.getBean("employee",Employee.class );
		//e.getName();
		//employeeService.setEmployee(e);
		//System.out.println(employeeService.getEmployee().getName());
		
		//System.out.println("*************");
		//e.getName();
		e.setName("Awantik Das");
		//e.getName();
//		employeeService.getEmployee().throwException();
//		
//		((AbstractApplicationContext) ctx).close();

	}

}
