package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		Multiply calc = new Multiply();
		int actualValue = calc.multiply(3, 2);
		Assert.assertEquals(6, actualValue);
	}

}
