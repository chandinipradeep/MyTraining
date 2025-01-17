package java_self_training;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public interface CollectionSetSample {
	
	public static void main(String args[])
	{

	Set s=new HashSet();
	s.add(10);
	s.add("hi");
	s.add(22);
	
	System.out.println(s);
	
	Set<String> s1=new HashSet();
	s1.add("Hi");
	s1.add("HELLO");
	System.out.println(s1);
	
	Set<String> s2=new HashSet();
	s2.add("Hru");
	s2.add("Welcome");
	System.out.println(s2);
	
	s1.addAll(s2);
	System.out.println(s1);
	
	s.remove(22);
	System.out.println(s);
	
	s2.removeAll(s2);
	System.out.println(s2);
	
	System.out.println(s1.contains("Hi"));
	
	System.out.println(s2.isEmpty());
	
	System.out.println(s.size());
	
	Iterator it=s1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	}
	
}
