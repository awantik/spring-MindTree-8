package com.skillspeed.jsf.helloworld;

import java.io.Serializable;

public class HelloWorld implements Serializable {

	private static final long serialVersionUID = -6913972022251814607L;

	private String s1 = "Hello World!!";

	public String getS1() {
		System.out.println(s1);
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}
	
	public String getHello(){
		return s1;
	}
	
	public void setHello(String st){
		s1 = st;
	}

}
