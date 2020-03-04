package javaques;

import java.util.Scanner;
 class usermaincode 
 {
	 static int checksum(int x)
	 {
		 int i,t=0;
	 while(x>0)
	 {i=x%10;
		 if(i%2!=0)
		 {
			 t=t+i;
			 
		 }
		 x=x/10;
	 }
	 if(t%2==0)
	 {
		return -1;
	 }
	 else
	 {
		 return 1;
	 }
	 
	 }

 public static void main(String[]args)
 {int n,ret;
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter the no: ");
	 n=obj.nextInt();
	 ret=checksum(n);
	 if(ret==1)
	 {
		 System.out.println("Sum of odd digit is odd");
	 }
	 else if(ret==-1)
	 {
		 System.out.println("Sum of odd digits are even");
	 }
 }
}