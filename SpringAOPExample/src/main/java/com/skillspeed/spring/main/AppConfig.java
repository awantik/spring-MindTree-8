package com.skillspeed.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.skillspeed.spring.aspect.EmployeeAfterAspect;
import com.skillspeed.spring.aspect.EmployeeAroundAspect;
import com.skillspeed.spring.aspect.EmployeeAspect;
import com.skillspeed.spring.aspect.EmployeeAspectJoinPoint;
import com.skillspeed.spring.aspect.EmployeeAspectPointcut;
import com.skillspeed.spring.model.Employee;
import com.skillspeed.spring.service.EmployeeService;


@Configuration
@EnableAspectJAutoProxy // Class eligible to create AspectJ Objects
public class AppConfig {
	
	/*Start: Business beans getting created */
	@Bean(name="employee")
	public Employee getEmployee(){
		return new Employee("No Name");
	}
	
	@Bean(name="employeeService")
	public EmployeeService getEmployeeService(){
		return new EmployeeService();
	}
	/*End : Business Beans getting created */
	
	/*Start: Aspect Beans getting created*/ 
	@Bean
	public EmployeeAspect getEmployeeAspect(){
		return new EmployeeAspect();
	}
	
	@Bean
	public EmployeeAspectPointcut getEmployeeAspectPointcut(){
		return new EmployeeAspectPointcut();
	}
	
	@Bean(name="employeeAspectJoinPoint")
	public EmployeeAspectJoinPoint getEmployeeAspectJoinPoint(){
		return new EmployeeAspectJoinPoint();
	}
	
	@Bean(name="employeeAfterAspect")
	public EmployeeAfterAspect getEmployeeAfterAspect(){
		return new EmployeeAfterAspect();
	}
	
	@Bean(name="employeeAroundAspect")
	public EmployeeAroundAspect getEmployeeAroundAspect(){
		return new EmployeeAroundAspect();
	}
	/*End: Aspect Beans getting created*/ 
}
