import java.util.Scanner;
class UserMainCode
{
static String formnewword(String S,int x)
  {
int l=S.length();
    if(l>=(2*x))
	  {
	  String s1=S.substring(0,x)+S.substring(l-x,l);
	  return s1;
	  }
       else
	  {
	return null;
	  }

  }
}

class hacker
{
public static void main(String[] args)
{
    Scanner S = new Scanner(System.in); 
    System.out.println("Enter the string:");
    String S1= S.nextLine();
    System.out.println("USER INPUT IS:"+S1);

    Scanner num = new Scanner(System.in); 
    System.out.println("Enter a number:");
    int n= num.nextInt();
    System.out.println("USER INPUT IS:"+n);
    
    String S2=UserMainCode.formnewword(S1,n);
     System.out.println("OUTPUT IS:"+S2);
}
}