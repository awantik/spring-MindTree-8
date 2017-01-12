package com.skillspeed;

import org.junit.Test;

public class AssertionTypesTestCases {
	@Test
	public void assertEqualArrays(){
		
		// Declare first array
		int [] arr1 = {1,2,3,4};
		
		// Declare second array
		int [] arr2 = {1,2,3,4};
		
		// Assert
		org.junit.Assert.assertArrayEquals("Arrays Aren't Equal ::", arr1, arr2);
	}
	
	@Test
	public void assertNoEqualArrays(){
		// Declare first array
		int [] arr1 = {1,2,3,4};
		
		// Declare second array
		int [] arr2 = {1,2,3,5};
		
		// Assert
		org.junit.Assert.assertArrayEquals("Arrays Aren't Equal ::", arr1, arr2);
	}	
	
	@Test
	public void assertEquals(){
		// Declare first object
		String message1 = "Hi World";
		
		// Declare second object
		String message2 = "Hi World";
		
		// Assert
		org.junit.Assert.assertEquals("Objects Aren't Equal ::", message1, message2);
	}
	
	@Test
	public void assertNotEquals(){
		// Declare first object
		String message1 = "Hi World";
		
		// Declare second object
		String message2 = "HI World";
		
		// Assert
		org.junit.Assert.assertEquals("Objects Aren't Equal ::", message1, message2);
	}	

	//True when both the objects are refering to same memory
	@Test
	public void assertSame(){
		// Declare first object
		String message1 = "Hi World";
		
		// Declare second object
		String message2 = message1;
		
		// Assert
		org.junit.Assert.assertSame("Objects Aren't Same ::", message1, message2);
	}
	
	@Test
	public void assertNotSame(){
		// Declare first object
		String message1 = "Hi World";
		
		// Declare second object
		String message2 = "HI World"; // if you make it Hi World, this assertion would pass
		
		// Assert
		org.junit.Assert.assertSame("Objects Aren't Same ::", message1, message2);
	}
	
	@Test
	public void assertTrue(){
		// Declare first object
		String message1 = "Hi World";
		
		// Declare second object
		String message2 = message1;
		
		// Assert
		org.junit.Assert.assertTrue("Result Isn't True ::", message1.equals(message2));
	}
	
	@Test
	public void assertNotTrue(){
		// Declare first object
		String message1 = "Hi World";
		
		// Declare second object
		String message2 = "Hi World";
		
		// Assert
		org.junit.Assert.assertSame("Result Isn't True ::", message1.equals(message2));
	}	
	
	@Test
	public void assertNull(){
		// Declare first object
		String message1 = null;
		
		// Assert
		org.junit.Assert.assertNull("Result Is Null ::", message1);
	}
	
	@Test
	public void assertNotNull(){
		// Declare first object
		String message1 = "Hi World";
		
		// Assert
		org.junit.Assert.assertNull("Result Isn't True ::", message1);
	}		
	
}
