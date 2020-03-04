import java.util.*;
public class student
{
public static void main(String[] args)
{
double b,c,d,e,f;
Scanner sc=new Scanner(System.in);
System.out.println("Enter students name:");
String name=sc.nextLine();
System.out.println("Enter student marks for subject 1");
b=sc.nextDouble();
System.out.println("Enter student marks for subject 1");
c=sc.nextDouble();
System.out.println("Enter student marks for subject 1");
d=sc.nextDouble();
e=b+c+d;
f=e/3;
System.out.println("Total marks is "+e);
System.out.println("Avarage marks is "+f);

if(e>80)
{System.out.println("student has passed with first class");}
else if(79>=e&&e>=60)
{System.out.println("student has passed with Second class");}
else if(59>=e&&e>=40)
{System.out.println("student has passed with pass class");}
else if(e<40)
{System.out.println("student has failed");}
}}