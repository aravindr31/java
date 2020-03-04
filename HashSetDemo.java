package collection;
import java.util.*;
public class HashSetDemo {
public static void main(String a[])
{
	LinkedHashSet hs=new LinkedHashSet();
	
	hs.add("aravind ");
	hs.add("amal");
	hs.add("jackson");
	hs.add("shivadeep");
	hs.add("jackson");
	hs.add("shivadeep");
	//n hs.add(null);
	System.out.println(hs);
	
}
}
