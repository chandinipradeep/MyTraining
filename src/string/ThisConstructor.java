package string;

public class ThisConstructor {
	
	public ThisConstructor()
	{
		System.out.println("Default constructor");
	}
	
	public ThisConstructor(int a)
	{
		this();
		System.out.println(a);
		
	}
	
	public ThisConstructor(String s)
	{
		this(44);
		System.out.println(s);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisConstructor ob=new ThisConstructor("Chandini");
		

	}

}
