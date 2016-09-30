package com.examples.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This tests long running app.
 */
public class LongRunningAppTest {
	private LongRunningApp app;

	@Before
	public void setup() {
		app = new LongRunningApp();
	}

	@Test
	public void testMyMethod() {
		assertEquals("Hello World", app.myLongRunningMethod());
	}
}
