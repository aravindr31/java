import java.util.*;
public class reverse
{
public static void main(String[] args)
{ int a,i,n=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
a=sc.nextInt();
while(a!=0)
{i=a%10;
n=n*10+i;
a/=10;}
System.out.println("Revesed Number is "+n);
}}