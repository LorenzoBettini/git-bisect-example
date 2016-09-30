package com.examples.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This tests long running app.
 * 
 * Assume that this test takes some time to run.
 * For this reason we don't run that on every commit.
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
