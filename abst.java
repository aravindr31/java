abstract class Animal
{
	abstract void eat();
}
class Tiger extends Animal
{
	 void eat()
	{
		System.out.println("i eat only non vegitrarian");
	}
}
class Goat extends Animal
{
	void eat()
	{
		System.out.println("i eat only vegitrarian");
	}
}
class abst 
{
	public static void main(String[]arg)   
	{Animal b;
	 b=new Tiger();
	 b.eat();
	 b=new Goat();
	 b.eat();
	}
}
