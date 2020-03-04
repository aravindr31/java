import java.util.*;  
 class pbm14
 {  
   public static void main(String[] args) 
   { 
       Scanner sc= new Scanner(System.in);
       System.out.println("enter no: array where first no: corresponds to no: of elements"); 
       int n = sc.nextInt();
       int[] a = new int[n];
           for (int i = 0; i<n; i++) 
             {
                 a[i] = sc.nextInt();
             }
       // System.out.println(n);
       // System.out.println(a);
        int R=UserMainCode.getsumofpower(n,a);  
        System.out.println(R); 
   }  
}  
class UserMainCode
{
static int getsumofpower(int m,int[] a)
   {           

      int sum = 0;
      for (int j=0;j<m;j++)
          {
            sum = (int)(sum + Math.pow(a[j],j));
          }
      return sum;
    }
}