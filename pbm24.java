import java.util.*;  
 class pbm24
 {  
   public static void main(String[] args) 
   { 
       Scanner sc= new Scanner(System.in);
       System.out.println("enter no of elements in integer array "); 
       int n=sc.nextInt();
       System.out.println("enter array of numbers ");
       ArrayList<Integer> AL=new ArrayList<Integer>(); 
       for(int i=0;i<n;i++)
          {
             AL.add(sc.nextInt());
          }
       System.out.println("array entered"+AL);
        ArrayList<Integer> AL1=new ArrayList<Integer>(); 
       int R=UserMainCode.checkLargestAmongCorner(AL,n);  
       
        System.out.println(R); 
   }  
}  
class UserMainCode
{
static int checkLargestAmongCorner(ArrayList<Integer>AL,int n)
   {           
             
                 if(n==1)
                 {
                  return AL.get(1);
                 }
        if(n%2!=0)
        {
           ArrayList<Integer> AL1=new ArrayList<Integer>(); 
            AL1.add(AL.get(0));  
            AL1.add(AL.get(n-1));  
            AL1.add(AL.get((n-1)/2));  
            Collections.sort(AL1); 
          System.out.println("sorted array"+AL1);
           return AL1.get(2);
       }
return 0;
    }
}