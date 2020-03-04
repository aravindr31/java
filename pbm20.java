import java.util.*;  
 class pbm20
 {  
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
      String S1=sc.next();
       System.out.println("string1 "+S1);
      String S2=sc.next();
       System.out.println("string2 "+S2);
     
     String R=UserMainCode.concatstring(S1,S2);
     
        System.out.println(R);
   }  
}  
class UserMainCode
{

static String concatstring(String y,String x)
  {  
    String S= y;
     String T= x; 
     String G="";
     String f="";
     int m=S.length();
     int n=T.length();
           if(m==n)
             {
              // System.out.println(S.concat(T));
               f=S.concat(T);
                 return f;
             }
              
                int k=m-n;
                if(k>0)
                  {
                   G=S.substring(k);
                  // System.out.println(G+T);
                   f=G+T;
                    return f;
                  }
                 else 
                 {
                  int s=0-k;
                   G=T.substring(s);
                  // System.out.println(S+G);
                  f=S+G;
                     return f;
                  }

  }

}