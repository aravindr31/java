import java.util.*;
public class alpha
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Alphabet");
char ch=sc.next().charAt(0);
if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
{
System.out.println("Entered alphabet is a vowel");}
else
{System.out.println("Entered alphabet is a consonent");}
}}