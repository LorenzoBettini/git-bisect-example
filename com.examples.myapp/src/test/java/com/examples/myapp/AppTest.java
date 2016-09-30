package com.examples.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Simple unit test for simple App.
 */
public class AppTest {
	private App app;

	@Before
	public void setup() {
		app = new App();
	}

	@Test
	public void testMyMethod() {
		assertEquals("Hello World", app.myMethod());
	}
}
