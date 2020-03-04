import java.util.*;  
 class pbm12
 {  
   public static void main(String[] args) 
   { 
       Scanner sc= new Scanner(System.in);
       System.out.println("enter password"); 
       String n = sc.next();
  
        int R=UserMainCode.vaidatepassword(n);  
        System.out.println(R); 
        if(R==1)
         {
         System.out.println("Valid password");
         }
         else
         {
         System.out.println("Invalid password");
         }
   }  
}  
class UserMainCode
{
static int vaidatepassword(String n)
   {  
   if(n.matches(".*[0-9]{1,}.*") && n.matches(".*[@#$]{1,}.*") && n.length()>=6 && n.length()<=20)
                    {
                                    return 1;
                    }
                    else
                    {
                                    return -1;
                    }
    }
}