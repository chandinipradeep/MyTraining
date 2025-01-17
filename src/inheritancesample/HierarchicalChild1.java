package inheritancesample;

public class HierarchicalChild1 extends HierarchicalParent
{

	public void display()
	{
		System.out.println("HierarchicalChild1");
		System.out.println(s);
	}
	public static void main(String[] args) {
		

		HierarchicalChild1 ob=new HierarchicalChild1();
		ob.display();
		ob.print();
		
	}

}
