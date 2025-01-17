package Review;

public class ClassSample implements InterfaceSample {
	
	public void display()
	{
		System.out.println("Interface Method Implementation");
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		//ClassSample ob=new ClassSample();
		//ob.display();
		InterfaceSample ob=new ClassSample();
		ob.display();

	}

}
