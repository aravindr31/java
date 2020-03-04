package jclass;
import java.util.Scanner;
public class stuarray 
{
	public static void main(String [] args)
{
		Scanner sc=new Scanner(System.in);
int tot=0;
int a[];
String name;
System.out.println("enter name");
name=sc.next();

System.out.println("enter the no.of subjects");
a = new int[sc.nextInt()];
for(int i=0;i<a.length;i++) {
	{System.out.println("enter mark in subjects"+(i+1)+":");
	a[i]=sc.nextInt();
	tot=tot+a[i];
	}
	System.out.println("student name\t"+name);
	for( i=0;i<a.length;i++)
	{System.out.println("mark in sub"+(i+1)+"ara"+a[i]);
	
	}
	System.out.println("total\t"+tot);
}}}
