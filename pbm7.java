import java.util.*;  
 class pbm7
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("Enter a Positive integer"+n);
     
     int R=UserMainCode.reverseNumber(n);
     
        System.out.println(R);
   }  
}  
class UserMainCode
{
static int reverseNumber(int m)
          {  
            int d=0;
            int rev=0;
            while(m!=0)
               {
                d=m%10;
                rev=rev*10+d;
                m=m/10;
                }
                  return rev;
                
 
          }
}