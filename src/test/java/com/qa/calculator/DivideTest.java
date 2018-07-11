package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivideTest {

	@Test
	public void test() {
		Divide calc = new Divide();
		double actualValue = calc.divide(9, 3);
		Assert.assertEquals(3, actualValue,0.00001);
	}

}
