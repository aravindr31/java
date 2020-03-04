import java.util.*;  
 class pbm19
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
      String S=sc.next();
       System.out.println("sample input "+S);
     
     int R=UserMainCode.sumofdigits(S);
     
        System.out.println(R);
   }  
}  
class UserMainCode
{

static int sumofdigits(String m)
  {  
    int sum = 0;
    for (int i = 0; i < m.length(); i++) 
       {
      char a = m.charAt(i);
      if (Character.isDigit(a)) 
        {
        int b = Integer.parseInt(String.valueOf(a));
        sum = sum + b;
        }
      }
     if (sum == 0) 
    {
      System.out.println(-1);
    } else
      System.out.println(sum);
    return sum;
  }

}