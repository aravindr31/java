
public class execep3 {
static String s;
public static void main(String[] a)
{
	try {
		
	System.out.println(s.length());
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
}
}
