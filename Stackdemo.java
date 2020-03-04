package collection;
import java.util.*;
public class Stackdemo 
{
public static void main (String [] args)
{
	Stack s=new Stack();
	s.push("Aravind");
	s.push("amal");
	s.push("jackson");
	s.push("akshay");
	s.push("deepak");
	
	System.out.println("stack elements: "+s);
	System.out.println("First Element "+s.peek());
	System.out.println("stack element: "+s);
	System.out.println("Pooping Out "+s.pop());
	System.out.println("stack elements: "+s);
	s.push("java");
	System.out.println("after adding: "+s);
	System.out.println("Popping out "+s.pop());
	
	System.out.println("stack elements: "+s);
	System.out.println("First Element "+s.peek());
	
	Enumeration e =s.elements();
	System.out.println("elements are");
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
}
}
