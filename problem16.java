class joker
{
void appends(String s1,String s2)
{
int l1=s1.length();
int l2=s2.length();
if(l1==l2)
  {
   System.out.println(s1+s2);
  }
int d=l1-l2;
if(d>0)
  {
   System.out.println(s1.substring(d)+s2);
  }
  else
  {
   int s=0-d;
   System.out.println(s1+s2.substring(s));
  }
}
}


class launcherz
{
public static void main(String[] args)
{
String s1=args[0];
String s2=args[1];
joker X=new joker();
X.appends(s1,s2);
}
}