import java.util.*;  
 class pbm9
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
       String S=sc.next();
       System.out.println("sample input "+S);  
       int R=UserMainCode.validatedate(S);  
       if(R==1)
       {  
        System.out.println("Valid date format"); 
       }
       else
       {
       System.out.println("Invalid date format"); 
       }
   }  
}  
class UserMainCode
{
static int validatedate(String m)
   {  
   
         if(m.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
                  {
                   return 1;
                   }
                 else
                 {
                  return -1;
                  }  
   }
}