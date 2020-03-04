import java.util.Scanner;
public class findlno
{
public static void main(String[] args)
{int n1,n2,n3,result,temp;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter first number:");
n1=scanner.nextInt();
System.out.println("Enter second Number");
n2=scanner.nextInt();
System.out.println("Enter third Number");
n3=scanner.nextInt();
scanner.close();

temp=n1>n2?n1:n2;
result=n3>temp?n3:temp;
System.out.println("Largest number is"+result);
}}