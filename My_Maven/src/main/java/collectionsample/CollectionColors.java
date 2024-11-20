package collectionsample;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionColors {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList();
		a.add("Red");
		a.add("White");
		a.add("Blue");
		a.add("Black");
		System.out.println("Elements in arraylist :"+a);
		
		System.out.println(a.get(1));
		
		a.remove(3);
		System.out.println(a);
		
		//search any element
		System.out.println(a.contains("Red"));
		
		//iterate
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		

	}

}
