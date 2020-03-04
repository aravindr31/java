import java.util.*;  
 class pbm34
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
      String S=sc.next();
       System.out.println("sample input "+S);
     
     String R=UserMainCode.sumofdigits(S);
     
        System.out.println(R);
   }  
}  
class UserMainCode
{

static String sumofdigits(String m)
  {  
    char[] c= m.toCharArray();
String k=" ";
     int l=c.length;
      for(int i=c.length-1;i>=0;i--)
      {
         
         if(c[i]=='.')
         {
         break;
         }
         else
         {
         k=c[i]+k;
         }
         
      }
     
     return k;
  }

}