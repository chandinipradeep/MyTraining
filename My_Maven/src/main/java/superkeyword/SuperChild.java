package superkeyword;

public class SuperChild extends SuperParent {
	
	int a=20;   //child instance variable
	
	//child method
	public void display()
	{
		System.out.println(a);
		System.out.println("Child class method");
		System.out.println(super.a);  //invoking parent instance variable using super
		super.display(); //invoking parent method using super
	}
	
	//child constructor
	public SuperChild()
	{
		super(10);  ///invoking parent constructor using super
	}
	

	public static void main(String[] args) 
	{
		SuperChild ob=new SuperChild();
		ob.display();
	}

}
