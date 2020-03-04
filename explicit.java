
public class explicit {
public static void main(String a[])
{
	try
	{
		explicit met=new explicit();
		System.out.println("lrngth of junk is "+met.getStringSize("Junk"));
		System.out.println("length of wrong is "+met.getStringSize("Wrong"));
		System.out.println("length of null String is "+met.getStringSize(null));
	}
	catch(Exception ex)
	{
		System.out.println("Exception message "+ex.getMessage());
	}
}
public int getStringSize(String str) throws Exception 
 {
	 if(str==null)
	 {
		 throw new Exception("null is passed");
		 
	 }
	 return str.length();
		 
 }
	
}
