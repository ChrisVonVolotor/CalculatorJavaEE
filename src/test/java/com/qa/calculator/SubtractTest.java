package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {

	@Test
	public void test() {
		Subtract calc = new Subtract();
		double actualValue = calc.subtract(3.0, 2.0);
		Assert.assertEquals(1, actualValue,0.00001);
	}

}
