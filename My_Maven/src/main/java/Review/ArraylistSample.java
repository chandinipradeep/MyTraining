package Review;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistSample {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add(10);
		l.add("hi");
		l.add(22);
		l.add("hello");
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println("ArrayList Elements");
			System.out.println(it.next());
		}
		

	}

}
