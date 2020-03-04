import java.util.*;  
 class pbm13
 {  
   public static void main(String[] args) 
   { 
       Scanner sc= new Scanner(System.in);
       System.out.println("enter string"); 
       String n = sc.next();
  
        String R=UserMainCode.removeevenvowels(n);  
        System.out.println(R); 
   }  
}  
class UserMainCode
{
static String removeevenvowels(String s1)
   {  
   StringBuffer sb=new StringBuffer();
   for(int i=0;i<s1.length();i++)
           {
            if((i%2)==0)
                 {
                  sb.append(s1.charAt(i));
                 }
           else if((i%2)!=0)
                {
                if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u')
                  if(s1.charAt(i)!='A' && s1.charAt(i)!='E' && s1.charAt(i)!='I' && s1.charAt(i)!='O' && s1.charAt(i)!='U')
                     sb.append(s1.charAt(i));
                     return sb.toString();
               }
           }
return null;
    }
}