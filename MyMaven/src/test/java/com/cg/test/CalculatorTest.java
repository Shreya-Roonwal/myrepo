package com.cg.test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import com.cg.bean.Calculator;



public class CalculatorTest {

	private Calculator cal;
	
	@Before
	public void cinit() {
		cal = new Calculator();
	}
	@Test
	public void cc() {
		assertEquals(10.0, cal.add(8.0,2.0),0.0);
	}
}
