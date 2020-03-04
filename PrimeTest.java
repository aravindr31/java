package filehandling;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeTest {
private Integer inputNumber;
private Boolean expectedResult;
private Prime prime;
@Before
public void initialize()
{
	prime=new Prime();
}
	public PrimeTest(Integer inputNumber,Boolean expectResult)
	{
		this.inputNumber=inputNumber;
		this.expectedResult=expectedResult;
	}
	@Parameterized.Parameters
	public static Collection primeNumbers()
	{
		return Arrays.asList(new Object[][]{
			{2,true},{6,false},{19,true},{22,false},{23,true}});
		}
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("parameterized number is: "+inputNumber);
		assertEquals(expectedResult,prime.validate(inputNumber));
		
	}

}