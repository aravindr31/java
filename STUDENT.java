package jclass;
import java.util.Scanner;
public class STUDENT {
	public static void main(String[] args)
	{
		double b,c,d,e,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter students name:");
		String name=sc.nextLine();
		System.out.println("Enter student marks for subject 1");
		b=sc.nextDouble();
		System.out.println("Enter student marks for subject 2");
		c=sc.nextDouble();
		System.out.println("Enter student marks for subject 3");
		d=sc.nextDouble();
		System.out.println("Enter student marks for subject 4");
		e=sc.nextDouble();
		System.out.println("Enter student marks for subject 5");
		f=sc.nextDouble();
		System.out.println("mark of subject 1 is "+b);
		System.out.println("mark of subject 2 is "+c);
		System.out.println("mark of subject 3 is "+d);
		System.out.println("mark of subject 4 is "+e);
		System.out.println("mark of subject 5 is "+f);
	}

}
