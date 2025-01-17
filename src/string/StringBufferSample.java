package string;

public class StringBufferSample {

	public static void main(String[] args) {
		
		StringBuffer ob=new StringBuffer("hi");
		System.out.println(ob);
		
		//append()
		
		ob.append("false");
		System.out.println(ob);
		
		//insert()
		
		ob.insert(2,"hello");
		System.out.println(ob);
		
		//replace()
		ob.replace(0,7,"true");
		System.out.println(ob);
		
		//delete
		
		ob.delete(0,5);
		System.out.println(ob);
		
		//reverse
		
		ob.reverse();
		System.out.println(ob);
		
		

	}

}
