package java_self_training;

public class SuperChild extends SuperParent{
	
	int a=22;

	public void display()
	{
		System.out.println("Child method");
		super.display();
		System.out.println(a);
		System.out.println(super.a);
		
	}
	
	public SuperChild()
	{
		super("hi");
	}
	

	
	
	public static void main(String[] args) {
		
		SuperChild ob=new SuperChild();
		ob.display();
	

	}

}
