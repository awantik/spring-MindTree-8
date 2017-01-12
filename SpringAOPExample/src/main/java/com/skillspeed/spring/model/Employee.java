package com.skillspeed.spring.model;

import com.skillspeed.spring.aspect.Loggable;

public class Employee {

	private String name;
	
	public Employee(){
		
	}
	public Employee(String name){
		this.name = name;
	}

	public String getName() {
		System.out.println("@@@@@@@@");
		return name;
	}
	
	//@Loggable
	public void setName(String nm) {
		this.name=nm;
		
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
}
