package filehandling;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
public class AllAnnotEx {
 private ArrayList<String>list;
 @BeforeClass
 public static void m1() {
	 System.out.println("using @BeforeClass.,executed before all test cases");
 }
 @Before
 public void m2() {
 list=new ArrayList<String>();
    System.out.println("Using @Before annotations,executed before each test case");
}
 @AfterClass
 public static void m3()
 {
	 System.out.println("Using @AfterClass,executed after all test case");
 }
 @After
 public void m4() {
	 
 }
}