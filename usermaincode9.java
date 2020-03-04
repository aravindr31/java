package javaques;
import java.util.*;
import java.util.regex.*;
public class usermaincode9 {
 static int ret(String n)
 {
	 int i,t;
	Pattern p=Pattern.compile("[0-3][0-9](/)[0-1]([0-9](/)[0-9][0-9][0-9][0-9]");
	Matcher m=p.matcher (n);
	if (m.find()&& m.group().equals(n))
		return 1;
	else
		return -1;
 }

public static void main(String []args) throws Exception
{int i,r;
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the date");
	String num=sc.next();
	r=ret(num);
	if(r==1)
	{
		System.out.println("Valid date");
	}
	else if(r==-1)
	{
		System.out.println("invalid date");
	}
	}}