import java.util.*;
public class linearsearch
{
public static void main(String[] args)
{ int a[],i,n,b,s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of array elements");
n=sc.nextInt();
a=new int[n];
System.out.println("Enter the array elements");
for(b=0;b<n;b++)
{a[b]=sc.nextInt();}
System.out.println("Enter the element to be searched");
s=sc.nextInt();
for(b=0;b<n;b++)
{if(a[b]==s)
{System.out.println("element is present in array");
break;}}
if(b==n)
{System.out.println("element is not present in array");}
}}