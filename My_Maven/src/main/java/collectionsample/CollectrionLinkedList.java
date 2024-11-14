package collectionsample;

import java.util.LinkedList;

public class CollectrionLinkedList {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(10);
		l.add('A');
		System.out.println(l);
		
		LinkedList<Character> l1=new LinkedList();
		l1.add('A');
		l1.add('B');
		l1.add('C');
		System.out.println(l1);
		 
		LinkedList<Character> l2=new LinkedList();
		l2.add('D');
		l2.add('E');
		System.out.println(l2);
		
		//addAll
		l1.addAll(l2);
		System.out.println(l1);
		
		//remove
		l2.remove(1);
		System.out.println(l2);
		
		//removeAll
		l2.removeAll(l2);
		System.out.println(l2);
		
		//size
		System.out.println(l1.size());
		System.out.println(l2.size());
		
		//contains
		System.out.println(l1.contains('A'));
		System.out.println(l1.contains('a'));
		
		

	}

}
