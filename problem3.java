import java.util.Scanner;
class UserMainCode
{
static int sumOfSquaresOfEvenDigits(int S)
  {
int sum=0,t=0;
while(S>0)
     {
	
	int s=S%10;
        {
	if(s%2==0)
	{
	sum=sum+(s*s);
          }
	S=S/10;
        }
     }
	return sum;
  }
}

class evensum
{
public static void main(String[] args)
{
    Scanner num = new Scanner(System.in); 
    System.out.println("Enter a positive number:");
    int code = num.nextInt();
    System.out.println("USER INPUT IS:"+code);
    int i=UserMainCode.sumOfSquaresOfEvenDigits(code);
    System.out.println("The sum of square of even digits in the given number is: "+i);
}
}