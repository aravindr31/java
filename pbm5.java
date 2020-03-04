import java.util.*;  
 class pbm5
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
       String S=sc.next();
       System.out.println("sample input "+S);
     
     int R=UserMainCode.checkcharacters(S);
       System.out.println(R);
         
   }  
}  
class UserMainCode
{
static int checkcharacters(String m)
   {  
   char[] ch=m.toCharArray();  
      int l=ch.length;
      if(ch[0]==ch[l-1])
       {
        return 1;
        }
     return -1;
   }
}