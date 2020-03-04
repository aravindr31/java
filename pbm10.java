import java.util.*;  
 class pbm10
 {  
   public static void main(String[] args) 
   { 
       Scanner sc= new Scanner(System.in);
       System.out.println("enter time "); 
       String S=sc.next();
     
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
   {           if(m.matches ("(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)"))
        
           
                 {
                   return 1;
                   }
                 else
                 {
                  return -1;
                  }  
       
    }
}