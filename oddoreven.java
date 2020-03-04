import java.util.Scanner;
public class oddoreven
{
public static void main(String[]arg)
{
int n,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
a=n%2;
if(a==0)
{System.out.println(n+" is an even number");}
else
{System.out.println(n+" is an odd number");}
}}