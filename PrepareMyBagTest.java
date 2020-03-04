
package filehandling;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class PrepareMyBagTest {

	FirstDayAtSchool school;
	String[]bag= {"Books","Notebooks","pens"};	
	
	@Before
	public void setUp()throws Exception
	{
		System.out.println("Initilizing");
		school=new FirstDayAtSchool();
	}
	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag,school.prepareMybag());
	}
	@Test
	public void testCheckMyName() {
		System.out.println("Inside test check name()");
		school.checkmyName("Aravind");
		assertTrue(school.res);
	}
	
	

}
