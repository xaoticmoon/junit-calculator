package test;

import main.Calculator;

import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

	private Calculator classUnderTest;

	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator(); // tworz¹c za ka¿dym razem nowy
											// obiekt zerujemy warunki
											// pocz¹tkowe
	}

	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}

	@Test
	public void testSumMethod() throws Exception {
		double a = 4.0;
		double b = 7.0;

		double result = classUnderTest.sum(a, b);

		assertEquals(11.0, result, 0.001); // trzecia pozycja -
											// delta=tolerancja. 11+-0.001
	}
	
	@Test
	public void testSubtractMethodA() throws Exception {
		double a = 2.0;
		double b = 1.0;
		
		double result = classUnderTest.subtract(a, b);
		
		assertEquals(1.0, result, 0.001);
	}

	@Test
	public void testSubtractMethodB() throws Exception {
		double a = 1.0;
		double b = 2.0;
		
		double result = classUnderTest.subtract(a, b);
		
		assertEquals(-1.0, result, 0.001);
	}
		
	@Test 
	public void testMultiplyMethod() throws Exception {
		double a = 4.0;
		double b = 2.0;
		
		double result = classUnderTest.multiply(a, b);
		
		assertEquals(8.0, result, 0.001);
	}
	
	@Test
	public void testDivideMethodA() throws Exception {
		double a = 4.0;
		double b = 2.0;
		
		double result = classUnderTest.divide(a, b);
		
		assertEquals(4.0/2.0, result, 0.001);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testDivideMethodB() throws Exception {
		double a = 4.0;
		double b = 0.0;
		
		double result = classUnderTest.divide(a, b);
		
		assertTrue(true);
	}
		
}
	
