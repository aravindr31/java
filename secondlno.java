import java.util.Scanner;
public class secondlno
{
public static void main(String[] args)
{int n1,n2,n3;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter first number:");
n1=scanner.nextInt();
n2=scanner.nextInt();
n3=scanner.nextInt();

if(n1>=n2&&n1>=n3)
{System.out.println("Largest number is"+n1);
if(n2>n3){
System.out.println("Second largest number is "+n3);}
else 
{System.out.println("Second largest number is "+n3);}}

if(n2>=n1&&n2>=n3)
{System.out.println("Largest number is"+n2);
if(n1>n3){
System.out.println("Second largest number is "+n1);}
else 
{System.out.println("Second largest number is "+n3);}}

if(n3>=n1&&n3>=n2)
{System.out.println("Largest number is"+n2);
if(n1>n2){
System.out.println("Second largest number is "+n1);}
else 
{System.out.println("Second largest number is "+n2);}}


}}