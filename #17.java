import java.util.*;
class Main
{
public static void main(String[] args)
{
System.out.println("Enter an odd positive integer");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=UserMainCode.addSeries(n);
System.out.println("Sum of the series is:"+s);
}
}

class UserMainCode
{
static int addSeries(int n)
{
ArrayList<Integer> m=new ArrayList<Integer>();
for(int i=1;i<=n;i++)
{
if(i%2!=0)
m.add(i);
}
System.out.println("Arraylist is:"+m);
int n1=m.get(0);
for(int j=1;j<m.size();j++)
if(j%2!=0)
n1=n1+m.get(j);
else
n1=n1-m.get(j);
return n1;
}
}