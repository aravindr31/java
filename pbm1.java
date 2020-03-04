import java.util.*;  
 class pbm1
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("sample input "+n);
     
     int R=UserMainCode.checksum(n);
    if(R==1) 
	{
        System.out.println("SUM OF ODD DIGITS IS EVEN");
	}
	else
	{
	System.out.println("SUM OF ODD DIGITS IS ODD");
	}
   }  
}  
class UserMainCode
{
static int checksum(int m)
\
          {  
     int sum=0;  
            while(m>0)
                   {
                       int l=m % 10;  
                         {  
                          if(l%2!=0)
                             {
                              sum=sum+l;
                             }  
                         }
                     m=m/10;
                  }
                  System.out.println("sum is :" +sum);
                    if(sum%2==0)
                          {
                         return 1;
                           } 
                        else
                         {
                          return -1;  
                         }
 
         }
}