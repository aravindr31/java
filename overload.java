package jclass;

class overload {
		void disp(int a)
		{
			System.out.println("hello");
		}
		void disp(float a)
		{
			System.out.println("hello");
		}
		class exec
		{
			public static void main (String []args)
			{ 
				overload obj1=new overload();
				obj1.disp(4);
			}
		}
}
