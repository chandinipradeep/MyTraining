package javainterface;

public class SampleClass implements TestInterface {

	public void print()
	{
		System.out.println("Class Method");
	}
	
	public void display()
	{
		System.out.println("First Method of Interface");
	}
	
	public void show()
	{
		System.out.println("Second method of interface");
	}
	
	public static void main(String[] args) {
		
		SampleClass ob=new SampleClass();
		ob.print();
		ob.display();
		ob.show();
		TestInterface obj=new SampleClass();
		//obj.print(); //when we create object for interface, we cannot invoke class methods
		obj.display();
		obj.show();
		
	}

}
