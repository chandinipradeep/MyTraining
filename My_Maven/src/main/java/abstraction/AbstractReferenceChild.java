package abstraction;

public class AbstractReferenceChild extends AbstractReferenceParent {

	public void abstractName()
	{
		System.out.println("Abstract Method");
	}
	
	public static void main(String[] args) {
		
		AbstractReferenceParent ob=new AbstractReferenceChild();
		ob.display();
		ob.abstractName();

	}

}


//to call/get only parent class method, we create reference for parent class