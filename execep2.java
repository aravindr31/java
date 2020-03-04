
public class execep2 {

	public static void main (String[] args)
	{
		int a=10,b=0;
		int c[]=new int [5];
		try
		{
		
			c[2]=100;
			//System.out.println(c[2]);
			System.out.println(a/b);
			
		}
		
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		//catch(ArithmeticException e)
		//{
			//System.out.println(e);
		//}
	}
}
