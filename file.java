package filehandling;
import java.io.*;
public class file {
	public static void main(String []arg)
	{
		File f1=new File("C:\\Users\\User\\Desktop\\java\\temp.java");
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getPath());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.exists());
		System.out.println(f1.lastModified());
		System.out.println(f1.isFile());
	}

}
