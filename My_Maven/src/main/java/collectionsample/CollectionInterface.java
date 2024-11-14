package collectionsample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface CollectionInterface {

	public static void main(String args[])
	{ 
		
		List l=new ArrayList();  
		l.add("Hello");
		l.add(122);
		System.out.println(l);
		
		List<Integer> l1=new ArrayList();    //list 1
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		
		List<Integer> l2=new ArrayList();   //list 2
		l2.add(10);
		l2.add(20);
		l2.add(30);
		System.out.println(l2);
		
		
		//addAll
		l2.addAll(l1);
		System.out.println(l2);
		
		//remove
		l2.remove(4);
		System.out.println(l2);
		
		//removeAll
		l.removeAll(l);
		System.out.println(l);
		
		//size
		System.out.println(l2.size());
		
		//contains
		System.out.println(l2.contains(10));
		System.out.println(l2.contains(50));
		
		//isEmpty
		System.out.println(l1.isEmpty());
		System.out.println(l.isEmpty());
		
		
		
	}
}
