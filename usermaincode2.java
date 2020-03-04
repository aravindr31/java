package javaques;
import java.util.*;
import java.util.regex.*;
public class usermaincode2 {
 static int ret(String n)
 {
	 int i,t;
	Pattern p=Pattern.compile("[0-9][0-9][0-9](-)[0-9][0-9][0-9](-)[0-9][0-9][0-9][0-9]");
	Matcher m=p.matcher (n);
	if (m.find()&& m.group().equals(n))
		return 1;
	else
		return -1;
 }

public static void main(String []args)
{int i,r;
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	String num=sc.next();
	r=ret(num);
	if(r==1)
	{
		System.out.println("Valid Number");
	}
	else if(r==-1)
	{
		System.out.println("invalid number");
	}
	}}