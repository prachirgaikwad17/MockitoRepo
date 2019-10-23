package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorSpyTest {

	
	
	Calculator calculator=new Calculator();

	@Test
	public void addTest()
	{
		//using spy()
		//Calculator calculatorSpy=Mockito.spy(calculator);  //calculator=real obj
		Calculator calculatorSpy=Mockito.spy(Calculator.class);  //Calculator.class=Mockito obj
	
		//Mockito.when(calculatorSpy.add(100, 50)).thenReturn(100);
		Mockito.when(calculatorSpy.add(100, 50)).thenCallRealMethod();
		
		assertEquals(150,calculatorSpy.add(100, 50));  //is JUint method

	}
}
