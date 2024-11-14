package collectionsample;

import java.util.ArrayList;

public class CollectionClass { 

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList(); //non generic arraylist
		
		//add
		a.add("hello");
		a.add(12);
		a.add('A');
		a.add(1.01f);
		System.out.println(a);
		
		ArrayList<String> a1=new ArrayList<String>(); //generic arraylist1
		a1.add("Hi");
		a1.add("welcome");
		//a1.add(1);
		System.out.println(a1);
		
		ArrayList<String> a2=new ArrayList(); //generic arraylist2
		a2.add("hiii");
		a2.add("helloo");
		
		//addAll
		a2.addAll(a1);
		System.out.println(a2);
		
		//remove
		a2.remove(2);
		System.out.println(a2);
		
		a2.remove("hiii");
		System.out.println(a2);
		
		//removeAll
		a1.removeAll(a1);
		System.out.println(a1);
		
		//size
		System.out.println(a2.size());
		
		//contains
		System.out.println(a2.contains("Hiii"));
		
		//isEmpty
		
		System.out.println(a2.isEmpty());
		System.out.println(a1.isEmpty());
		
		
	
	}

}
