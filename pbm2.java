import java.util.*;  
 class pbm2
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
        String S=sc.next();
       System.out.println("sample input "+S);
     
     int R=UserMainCode.validatenumber(S);
      if(R==1) 
	{
        System.out.println("VALID");
	}
	else
	{
	System.out.println("INVALID");
	}
        
   }  
}  
class UserMainCode
{
static int validatenumber(String m)
          {  
            char[] c=m.toCharArray();  
                if(m.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
                  {
                   return 1;
                   }
                 else
                 {
                  return -1;
                  }  
 
         }
}