package inheritancesample;

public class ChildClass extends Sample implements Interface1,Interface2 {

	
	public void print()
	{
		System.out.println("Method in Child");
	}
	
	public void show()
	{
		System.out.println("Methods in Interface1 and Interface2");
	}
	
	public static void main(String[] args) {
		
		ChildClass ob=new ChildClass();
		ob.display();
		ob.print();
		ob.show();

	}

}
