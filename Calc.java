package filehandling;

import filehandling.Calc;

public class Calc {

	public Calc() {
		super();
	}
	public int factorial(int a)
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
			
		}
		return f;
	}
	public static void main(String[] args)
	{
		int a=5;
		Calc cc=new Calc();
		System.out.println(cc.factorial(a));
		
	}
}

