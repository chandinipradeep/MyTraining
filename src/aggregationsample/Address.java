package aggregationsample;

public class Address {
	
	String address="Karthika,Kothamangalam,Ernakulam-686691";
	
	public void print()
	{
		System.out.println("Address :"+address);
	}

	public static void main(String[] args) {
		
		Student ob=new Student();
		ob.display();
		Address ob1=new Address();
		ob1.print();
		

	}

}
