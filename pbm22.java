import java.util.*;  
 class pbm22
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
      System.out.println("sample string "); 
       String S=sc.next();
        
       int R=UserMainCode.validatestrings(S);  
       if(R==1)
       {  
        System.out.println("Valid string"); 
       }
       else
       {
       System.out.println("Invalid string"); 
       }
   }  
}  
class UserMainCode
{
static int validatestrings(String m)
   {  
   
         if(m.matches("[C][T][S][-]{1}[0-9]{3}"))
                  {
                   return 1;
                   }
                 else
                 {
                  return -1;
                  }  
   }
}