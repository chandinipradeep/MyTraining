package inheritancesample;

public class SingleChild extends SingleParent {
	
	
	public void sub()
	{
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		
		SingleChild ob=new SingleChild();
		ob.add();
		ob.sub();
		

	}

}
