package test.java.ie.murph.modulus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.ie.murph.modulus.PrimeNumber;

public class PrimeNumberTest
{
	private PrimeNumber primeNumber;

	@Before
	public void setUp() throws Exception
	{
		primeNumber = new PrimeNumber();
	}

	@Test
	public void isIntegerAPrimeNumber()
	{
		assertEquals("Test will succeed. Two is the only even prime number, multiple of one and itself", true, primeNumber.isIntegerAPrimeNumber(2));
		
//		Boundary tests..
		assertTrue("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumber(2));
		
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumber(0));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumber(1));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumber(4));
	}
	
	@Test
	public void isIntegerAPrimeNumberFasterTest()
	{
		assertEquals("Test will succeed. Two is the only even prime number, multiple of one and itself", true, primeNumber.isIntegerAPrimeNumberFaster(2));
		
//		Boundary tests..
		assertTrue("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumberFaster(2));
		
//		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumberFaster(1));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumberFaster(0));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumberFaster(4));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumberFaster(5));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumberFaster(7));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumberFaster(11));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumberFaster(101));
	}

}
