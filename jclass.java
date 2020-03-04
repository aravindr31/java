import java.util.*;
public class 
{	
	public static void main (String args[])
	{
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		
		int gr=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if (arr[i]>gr)
				{
					gr=arr[i];
				}
			}
			System.out.println(gr);
	}
}
