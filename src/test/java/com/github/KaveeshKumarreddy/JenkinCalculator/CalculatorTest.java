package com.github.KaveeshKumarreddy.JenkinCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void addtest()
	{
		Calculator cal = new Calculator(); 
		assertEquals(30, cal.add(10, 20));
	}
	
	@Test
	public void subtest()
	{
		Calculator cal = new Calculator(); 
		assertEquals(10, cal.sub(30, 20));
	}
}
