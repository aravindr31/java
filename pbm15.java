import java.util.*;  
 class pbm15
 {  
   public static void main(String[] args) 
   { 
       Scanner sc= new Scanner(System.in);
       System.out.println("enter no of elements "); 
       int n=sc.nextInt();
       System.out.println("enter array of numbers ");
       ArrayList<Integer> AL=new ArrayList<Integer>(); 
       for(int i=0;i<n;i++)
          {
             AL.add(sc.nextInt());
          }
       System.out.println("array entered"+AL);
        ArrayList<Integer> AL1=new ArrayList<Integer>(); 
       int R=UserMainCode.getbigdiff(AL,n);  
       
        System.out.println(R); 
   }  
}  
class UserMainCode
{
static int getbigdiff(ArrayList<Integer>AL,int n)
   {           
             
                 if(n==1)
                 {
                  return AL.get(1);
                 }
        
           Collections.sort(AL); 
          System.out.println("sorted array"+AL);

          
           int s=AL.get(0);
          System.out.println("smallest no"+s);
         int l=AL.get(n-1);
         System.out.println("largest no"+l);
          int dif=l-s;
           return dif;
       
    }
}