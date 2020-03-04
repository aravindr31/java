import java.util.*;  
 class pbm4
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
       String S=sc.next();
       System.out.println("sample input "+S);
     
     UserMainCode.getmiddlechars(S);
         
   }  
}  
class UserMainCode
{
static void getmiddlechars(String m)
   {  
   char a=0,b=0;
   char[] ch=m.toCharArray();  
      int l=ch.length;
       if(l%2==0)
        {
       
          int n=l/2;
           a=m.charAt(n-1);
           b=m.charAt(n);    
        }              
 System.out.print(a);
  System.out.print(b);
 
   }
}