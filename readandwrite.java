package filehandling;

import java.io.*;

public class readandwrite {
public static void main(String st[])throws Exception
{
String s="pw2.java";
String s1="pw1.java";
int i;
FileInputStream f=new FileInputStream(s1);
FileOutputStream g=new FileOutputStream(s,false);
f.skip(10);
while((i=f.read())!=-1)
{
	g.flush();
	g.write(i);
}
g.close();
f.close();
}
}
