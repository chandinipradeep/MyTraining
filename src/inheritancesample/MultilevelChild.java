package inheritancesample;

public class MultilevelChild extends MultilevelParent
{
	public void show()
	{
		System.out.println("Child class");
		System.out.println(a);
	}
	

	public static void main(String[] args) 
	{
		MultilevelChild ob=new MultilevelChild();
		ob.print();
		ob.display();
		ob.show();

	}

}
