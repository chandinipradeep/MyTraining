package abstraction;

public class AbstractChild extends AbstractParent {

	
	public void abstractName()
	{
		System.out.println("Abstract Method");
	}
	public static void main(String[] args) {
		
		AbstractChild ob=new AbstractChild();
		ob.abstractName();

	}

}
