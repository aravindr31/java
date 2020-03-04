package filehandling;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalcTest extends TestCase {
public CalcTest(String name)
{
	super(name);
	
}
public void testCalc()
{
	int a=5;
	Calc cc=new Calc();
	assertEquals(120,cc.factorial(a));
}
}

