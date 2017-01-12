package com.skillspeed;

import net.sourceforge.jwebunit.junit.JWebUnit;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class HelloWorldPortletTestCase {
	
	@Before
	public void prepareBaseURL(){
		// Set base URL that JWebUnit will start from
		JWebUnit.setBaseUrl("http://localhost:8080/spring-mvc-demo/");
	} 
	
	@Test
	public void testBaseUrl(){
		// Begin a conversation
		JWebUnit.beginAt("/student/");
	}
	
	@Test
	public void testShowingAndPopulatingLoginScreen(){
		
		// Assert if login screen is displayed, so that username and password field would be shown
		
		JWebUnit.assertTextFieldEquals("j_username", "");
		JWebUnit.assertTextFieldEquals("j_password", "");		
		
		// Populating login screen with the required values
		JWebUnit.setTextField("j_username", "tomcat");
		JWebUnit.setTextField("j_password", "tomcat");
		
		// Assert populating is done properly
		JWebUnit.assertTextFieldEquals("j_username", "tomcat");
		JWebUnit.assertTextFieldEquals("j_password", "tomcat");
		
		// Login Into Portal
		JWebUnit.clickButtonWithText("Login");
	}
	
//	@Test
//	public void testNavigateIntoHelloWorldPortalPage(){
//		// Check if HelloWorld Portal page is exist or not
//		JWebUnit.assertLinkPresentWithText("HelloWorld");
//	}
//	
//	@Test
//	public void testDoActualNavigationIntoHelloWorldPortalPage(){
//		// Navigate into HelloWorld Portal page
//		JWebUnit.clickLinkWithExactText("HelloWorld");
//		
//		// Check of the Render has executed message
//		JWebUnit.assertTextPresent("Render has executed 1");
//	}	
//	
//	@Test
//	public void testInitiateActionRequestUponHelloWorldPortlet(){
//		// Check if the submit button is exist
//		JWebUnit.assertButtonPresent("submit");
//		
//		// Click submit against HelloWorld Portlet
//		JWebUnit.clickButton("submit");
//	}
//
//	
//	@Test
//	public void testMessagesAfterActionRequestUponHelloWorldPortlet(){
//		// Check of the Render has executed message
//		JWebUnit.assertTextPresent("Render has executed 2");
//		
//		// Check of the Action has executed message
//		JWebUnit.assertTextPresent("Action has executed 1");
//	}
}
