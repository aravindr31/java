import java.util.Scanner;
class UserMainCode
{
static int validateColorCode(String S)
  {
	if(S.matches("[#]{1}[A-F0-9]{6}"))
	  {
	  return 1;
	  }
	else
	  {
	  return -1;
	  }
  }
}

class coder
{
public static void main(String[] args)
{
    Scanner code = new Scanner(System.in); 
    System.out.println("Enter Color Code:");
    String colorcode = code.nextLine();
    System.out.println("USER INPUT IS:"+colorcode);
    int i=UserMainCode.validateColorCode(colorcode);
    if(i==1)
      {
      System.out.println("VALID INPUT");
      }
    else
      {
      System.out.println("INVALID INPUT");
      }
}
}