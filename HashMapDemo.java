package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
public static void main(String args[])
{
	HashMap hm=new HashMap();
	hm.put("oop","object oriented programing");
	hm.put("object","has state and behaviour");
	hm.put("class","defines state and behaviour share by obj");
	System.out.println(hm);
	Set s=hm.entrySet();
	
		System.out.println();
		System.out.println("\n hashmap curent size: "+hm.size());
		System.out.println("elements of hashmap");
		System.out.println();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(""+ob);
		}
		TreeMap tm=new TreeMap();
		tm.put("xava is","oop");
		tm.put("java is","simple");
		tm.put("zava","robust");
		tm.put("rama","temporary");
		System.out.println();
		System.out.println(tm);
		System.out.println("\n elements by treemap iteration");
		System.out.println();
		
		Set s1=tm.entrySet();
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry)itr1.next();
			Object ob1=itr1.next();
			System.out.println(""+ob1);
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
		}
			System.out.println("\n treemap current size:"+tm.size());
			tm.putAll(hm);
			System.out.println("\n putting a map to invoke map result wil sort");
			System.out.println("\n"+tm);
			System.out.println(tm.remove("ram is")+": i am removed value");
			System.out.println("treemap current size:"+tm.size());
			System.out.println("\n checking specific key/value status:"+tm.containsKey("java is")+tm.containsValue("temporary"));
			System.out.println("retrieve value by key:"+hm.get("opp"));
			
			Collection c=tm.values();
			System.out.println("\n values of my treemap:"+c);
			System.out.println("\n keys of treemap: "+tm.keySet());
			
		
}
}