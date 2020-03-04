package javaques;

import java.util.*;

public class usemaincode4 {
	static String  getMiddleCharspresent(String a)
	{
	int l1 = (a.length())/2;
		return a.substring((l1-1),(l1+1));
		
	
	}
public static void main(String [] args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word ");
	String s=sc.next();
	int l=s.length();
	if(l%2==0)
	{
	String r=getMiddleCharspresent(s);
	System.out.println(r);
	}
	
	
	
}
}
