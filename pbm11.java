import java.util.*;  
 class pbm11
 {  
   public static void main(String[] args) 
   { 
       Scanner sc= new Scanner(System.in);
       System.out.println("enter time "); 
       int n=sc.next();
      

 
       int R=UserMainCode.validatedate(S);  
       if(R==1)
       {  
        System.out.println("Valid time"); 
       }
       else
       {
       System.out.println("Invalid time"); 
       }
   }  
}  
class UserMainCode
{
static int validatedate(String m)
   {  
   
         if(m.matches("[0][0-9][:]{1}[0-9]{2}[:]{1}[0-9]{2}"))
                  {
                   return 1;
                   }
                 else
                 {
                  return -1;
                  }  
   }
}