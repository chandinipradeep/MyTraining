package inheritancesample;

public class HierarchicalChild2 extends HierarchicalParent 
{
	
	public void display()
	{
		System.out.println("HierarchicalChild2");
		System.out.println(s);
		
	}

	public static void main(String[] args) 
	{
		HierarchicalChild2 ob=new HierarchicalChild2();
		ob.display();
		ob.print();
		

	}

}
