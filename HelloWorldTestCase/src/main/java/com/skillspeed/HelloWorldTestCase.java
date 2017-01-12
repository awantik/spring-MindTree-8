package com.skillspeed;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.skillspeed.categories.Optional;
import com.skillspeed.jsf.helloworld.HelloWorld;

@Category(Optional.class)
public class HelloWorldTestCase {
	//The function that gets executed before any test function of the class
	HelloWorld he = new HelloWorld();
	
	@BeforeClass
	public static void beforeExecutingHelloWorldTestCases(){
		System.out.println("Before Executing HelloWorldTestCases :: ");
	}

	@AfterClass
	public static void afterExecutingHelloWorldTestCases(){
		System.out.println("\n\nAfter Executing all Test Cases HelloWorldTestCases :: ");
	}
	
	// Executed before every test case
	@Before
	public void beforeExecutingTestCase(){
		System.out.println("\n\nBefore Executing Test Case :: ");
		this.he.setHello("This is good");
	}
	
	@After
	public void afterExecutingTestCase(){
		System.out.println("After Executing Test Case :: ");
	}

	@Test
	public void testHelloWorldOne(){
		// Print a message before assertion
		System.out.println("Before Getting Test #1 Started ::");
		
		// If assertion goes wrong, the execution of Test would fail
		assertEquals("Would Say Hello","Hello",this.he.getHello());
		
		// Print a message after execution of Test; if assertion goes well, this message would be shown
		System.out.println("After Test #1 Execution ::");
	}
	
	
	@Test
	public void testHelloWorldTwo(){
		// Print a message before assertion
		System.out.println("Before Getting Test #2 Started ::");
		
		// If assertion goes wrong, the execution of Test would fail
		assertEquals("Would Say Hello","Hello","Hello");
		
		
		// Print a message after execution of Test; if assertion goes well, this message would be shown
		System.out.println("After Test #2 Execution ::");
	}	
	
	//Performance Test
	@Test(timeout=35)
	public void testWaitForATime(){
		// Print statement
		System.out.println("@Test Will Be Waiting For 100 Milliseconds :: Supposed Task Should Be Done Before Timeout");
		
		// Some adhoc processing
		for(int i = 0 ; i < 100000 ; i++){
			Math.random();
		}
		// Print statement
		System.out.println("Task Done Before Timeout :: This Test Has Finished Sucessfully ::");
	}
	
	//Test case will be regarded as pass if it throws NullPointerExcception
	@Test(expected=NullPointerException.class)
	public void testNullPointerExceptionShouldBeRaised() throws UnsupportedEncodingException{
		// Define variable
		String variable = null;
		// Get random number
		double value = Math.random() * 100;
		//value = 101.0;
		
		//assertEquals("Would Say Hello","Hello","Hello6");
		
		// Print out value
		System.out.println("Value :: "+(int)value);
		
		if((int)value % 2 == 0){
			// Specify variable value
			variable = "Even Number";
			//variable = null;
		}
		// Print out variable content with UTF-8 encoding
		System.out.println("This number is :: "+ variable.length());
		System.out.println("Here it goes");
	}

}