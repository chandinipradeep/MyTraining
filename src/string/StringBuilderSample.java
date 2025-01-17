package string;

public class StringBuilderSample {

	public static void main(String[] args) {
		
		StringBuilder ob=new StringBuilder("hello");
		System.out.println(ob);
		
		//append()
		
		ob.append("hi");
		System.out.println(ob);
		
		//insert()
		
		ob.insert(5,"and");
		System.out.println(ob);
		
		//replace()
		
		ob.replace(5,8,"or");
		System.out.println(ob);
		
		//delete()
		
		ob.delete(5,7);
		System.out.println(ob);
		
		//reverse()
		
		ob.reverse();
		System.out.println(ob);
		

	}

}
