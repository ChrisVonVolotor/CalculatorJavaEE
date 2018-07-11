package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class refactorAddTest {

	@Test
	public void test() {
		Add calc = new Add();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}

}
