package com.git.main;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
	
	Application sut;
	String test = "this is master branch";
	
	public void mainTest() {
		assertEquals(test,sut.method());
	}

}
