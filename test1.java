
 class emp
{
	final int eno=101;
	void display()
	{
		System.out.println(eno);
	}
}
class manager extends emp
{
	void display()
	{
		System.out.println("manager class");
	}
}
class test1
{
	public static void main(String [] args)
	{
		manager obj1=new manager();
		obj1.display();
	}
}
