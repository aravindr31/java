
public class statexample {
	static 
	{
	    System.out.println("the first static block");
	}
	public statexample() 
	{
		System.out.println("this is constructor");
	}
	public static String staticString="Static variable";
	static
	{
		System.out.println("this is second static block and"+staticString);
		
	}
	public static void main(String []args)
	
	{
	 statexample statEx=new statexample();
	 statexample.staticMethod2();
	 
	}
	static {
		staticMethod();
		System.out.println("this is the third static block");
	}
	public static void staticMethod() {
		System.out.println("this is static method");
	}
	public static void staticMethod2() {
		System.out.println("this is staticMethod2");
	}

}
