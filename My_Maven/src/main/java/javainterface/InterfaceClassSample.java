package javainterface;

public class InterfaceClassSample implements InterfaceSample {
	
	
	public static void main(String[] args) {
		
		InterfaceClassSample ob=new InterfaceClassSample();
		ob.example();
		InterfaceSample obj=new InterfaceClassSample(); //object created using by creating reference for Interface/parent class
		obj.display();
		

	}
	
	public void example()
	{ 
		System.out.println("Interface method");
		System.out.println(InterfaceSample.a);
	}
	
	@Override
	public void display() {
		System.out.println("Interface method2");
		
	}

}
