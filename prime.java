import java.util.*;
public class prime
{
public static void main(String[] args)
{ int a,b,i,j,flag,m=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First  limit");
a=sc.nextInt();
System.out.println("Enter Second limit");
b=sc.nextInt();
for(i=a;i<=b;i++)
{
	flag=0;
	for(j=2;j<i;j++)
	{	if(i%j==0)
			
			flag=1;
			
					
	}
		if(flag==0)
			{System.out.println(i);
			 m=m+i;
			}		
}
	System.out.println("sum of the numbers is "+m);
}
}