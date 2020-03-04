package javaques;
import java.util.*;
public class usemaincode3 {
static int sumOfSquaresOfEvenDigits(int y)
{int a,b=0;
	while(y>0)
	{a=y%10;
		if(a%2==0)
		{
			b=b+(a*a);
			
		}
	y=y/10;
	}
	return b;
		
}
public static void main(String[] args)
{
	int i,x;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. :");
	x=sc.nextInt();
	i=sumOfSquaresOfEvenDigits(x);
	System.out.println("sum of squares of the even digits is "+i);
	
	
}
}
