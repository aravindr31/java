import java.util.*; 
 
 class Main1

 {  
   public static void main(String[] args) 
   { 
    Scanner X= new Scanner(System.in);
       String s= X.nextLine();
       System.out.println("sample input "+s);

     
     int R=UserMainCode.validateColorCode(s);
     if(R==1)
      {
        System.out.println("valid ");
      }
      else
      {
       System.out.println("Invalid ");
      }

   }  
}  
class UserMainCode
{
static int validateColorCode(String m)

  {    
       char[] c=m.toCharArray();  
       if((m.startsWith("#"))&&(c.length==7))
           {
                if(m.matches("[#]{1}[A-F0-9]{6}"))
                  {
                   return 1;
                   }
                 else
                 {
                  return -1;
                  }   
           }
      return -1;
 
  }
}