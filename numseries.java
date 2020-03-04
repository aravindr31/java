 import java.util.*;
public class numseries
{
public static void main(String[] args)
{
int a,b,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Limit");
a=sc.nextInt();
for(i=1;i<=a;i++)
{
if(i%2!=0)
{System.out.print(i+",");}
else 
{System.out.print("-"+i+",");}
}}}