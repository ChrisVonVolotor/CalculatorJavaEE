package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {

	@Test
	public void test() {
		Subtract calc = new Subtract();
		int actualValue = calc.subtract(3, 2);
		Assert.assertEquals(1, actualValue);
	}

}
