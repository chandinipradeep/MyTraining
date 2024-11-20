package collectionsample;

import java.util.HashSet;
import java.util.Set;

public interface CollectionSetInterface {

	
	public static void main(String args[])
	{
		Set s=new HashSet(); //non generic
		s.add(1);
		s.add("hi");
		System.out.println(s);
		
		Set<Character> s1=new HashSet();
		s1.add('a');
		s1.add('b');
		System.out.println(s1);
		
		Set<Character> s2=new HashSet();
		s2.add('c');
		System.out.println(s2);
		
//addAll
		s2.addAll(s1);
		System.out.println(s2);
		

		
//remove

//		s2.remove(1);
//    	System.out.println(s2);		

//removeAll
    	s1.removeAll(s1);
		System.out.println(s1);
		
//size
		System.out.println(s1.size());
		
//contains
		System.out.println(s2.contains(1));
		
//isEmpty
		System.out.println(s1.isEmpty());
		
		Set<Integer> s3=new HashSet();
		s3.add(1);
		s3.add(2);
		System.out.println(s3);
		s3.remove(0); 
		System.out.println(s3);
		
	}
}
