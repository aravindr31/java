
public class stat {
	static int a;
	stat(){}
	 void disp()
	 {
		 a++;System.out.println(a);
	}
 public static void main(String args[])
 {
	 for(int i=0;i<5;i++)
	 {
		 stat se=new stat();
		 se.disp();
	 }
 }
}
