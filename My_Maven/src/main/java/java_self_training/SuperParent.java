package java_self_training;

public class SuperParent {
	
	int a=10;
	
	public void display()
	{
		System.out.println("Parent method");
	}
	
	public void print()
	{
		System.out.println("Parent method2");
	}
	
	public SuperParent(String a)
	{
		this();
		System.out.println("Parent constructor");
		System.out.println(a);
	}
	
	public SuperParent()
	{
		System.out.println("default constructor");
	}

}
