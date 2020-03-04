import java.util.*;
public class factorial
{
public static void main(String[] args)
{
int a,b=1,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
a=sc.nextInt();
for(i=1;i<=a;++i)
{b=b*i;}
System.out.println("factorial is " +b);
}}