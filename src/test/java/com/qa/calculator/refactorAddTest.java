package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class refactorAddTest {

	@Test
	public void test() {
		Add calc = new Add();
		double actualValue = calc.add(2.0, 2.0);
		Assert.assertEquals(4, actualValue,0.00001);
	}

}
