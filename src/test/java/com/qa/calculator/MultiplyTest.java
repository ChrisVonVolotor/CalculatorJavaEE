package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		Multiply calc = new Multiply();
		double actualValue = calc.multiply(3, 2);
		Assert.assertEquals(6, actualValue,0.00001);
	}

}
