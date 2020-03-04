class A
{
	int x=1000;
	A(){
		System.out.println("A");
	}
}
	class B extends A
	{
		B()
		{
			System.out.println("B");
			
		}
	}
	
public class e1 {
	public  static void  main(String[] args)
	{
		B obj=new B();
	}
}


