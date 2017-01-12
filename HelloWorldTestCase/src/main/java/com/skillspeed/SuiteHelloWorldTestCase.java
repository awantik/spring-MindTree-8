package com.skillspeed;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.skillspeed.HelloWorldTestCase;
import com.skillspeed.ParametrizedHelloWorldTestCase;

@RunWith(Suite.class)
@SuiteClasses({ParametrizedHelloWorldTestCase.class,HelloWorldTestCase.class})
public class SuiteHelloWorldTestCase {
	@Test
	public void testSuite(){
		System.out.println("*********");
		assertEquals("Suite","Suite");
	}
}
