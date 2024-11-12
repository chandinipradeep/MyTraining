package superkeyword;

public class SuperParent {
	
	int a=200; //parent instance variable
	
	//parent method
	public void display()
	{
		System.out.println("Parent method");
	}
	
	//parent constructors
    public SuperParent(int a)
    {
    	this();  //invoking current class constructor
    	System.out.println(a);
    	
    }
    public SuperParent()
    {
    	System.out.println("parent constructor");
    }
}
