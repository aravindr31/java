import java.util.*;  
 class pbm8
 {  
   public static void main(String[] args) 
   { 
    System.out.println("Enter a arraylist1");
    Scanner sc= new Scanner(System.in);
    ArrayList<Integer>AL1=new   ArrayList<Integer>();
    for(int i=0;i<5;i++)
      AL1.add(sc.nextInt());
   
    System.out.println("Enter a arraylist2");
    
    ArrayList<Integer>AL2=new   ArrayList<Integer>();
     for(int i=0;i<5;i++)
      AL2.add(sc.nextInt());
       
     ArrayList<Integer>AL3=new   ArrayList<Integer>();   
     
     AL3=UserMainCode.sortmergedarraylist(AL1,AL2);
     System.out.println(AL3);
   }  
}  
class UserMainCode
{
static ArrayList<Integer> sortmergedarraylist(ArrayList<Integer>AL1,ArrayList<Integer>AL2)
          {  
            AL1.addAll(AL2);
            System.out.println(AL1);
           Collections.sort(AL1);
            System.out.println(AL1);
ArrayList<Integer>AL3=new   ArrayList<Integer>();   
AL3.add(AL1.get(2));
AL3.add(AL1.get(6));
AL3.add(AL1.get(8));
return AL3;
 
          }
}