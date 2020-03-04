package filehandling;
import java.util.Arrays;

public class FirstDayAtSchool {

		public boolean res;
		public void checkmyName(String myname)
		{
			if(myname.compareTo("Aravind")==0)
				res=true;
			else
				res=false;
		}
		public String[]prepareMybag()
		{
			String[]schoolbag={
					"Books","Notebooks","pens"};
			System.out.println("My school bag contains:"+Arrays.toString(schoolbag));
			return schoolbag;  
			}
		public String []addPencils()
		{
			String[]schoolbag= {"books","notebooks","pens","pencils"};
			System.out.println("now my school bag contains"+Arrays.toString(schoolbag));
		return schoolbag;
		}
		public static void main(String[]args)
		{
			FirstDayAtSchool fds=new FirstDayAtSchool();
					String[]sb=fds.prepareMybag();
			System.out.println(sb);
			
			for(String s:sb)
				System.out.println("Bag contains: "+s);
			
			String[]pencil=fds.addPencils();
			
			for(String s:pencil)
				System.out.println("pencil box contains "+s);
		}
		
		
}
