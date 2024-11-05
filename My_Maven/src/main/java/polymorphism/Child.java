package polymorphism;

public class Child extends Parent {
	
	@Override   //annotation for showing method overriding
	public void display()
	{
		//super.display(); one way to print parent class method
		System.out.println("Method in child class");
	}

	public static void main(String[] args) {
		
		Child ob=new Child();
		ob.display();
		Parent ob1=new Parent(); //2nd way to print parent class method
		ob1.display();
				
	}
	

}
