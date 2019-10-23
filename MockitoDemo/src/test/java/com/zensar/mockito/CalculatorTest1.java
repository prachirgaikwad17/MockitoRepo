package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest1 {
	
	Calculator calculator;

	@Test
	public void addTest1()
	{
		//using mock() instead of @Mock
		calculator=Mockito.mock(Calculator.class);
	
		Mockito.when(calculator.add(100, 50)).thenReturn(100);
		
		assertEquals(150,calculator.add(100, 50));  //is JUint method

	}
	
}
