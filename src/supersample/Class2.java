package supersample;

public class Class2 extends Class1 {

	
	public void div()
	{
		int d=super.a+super.b;
		if(d%10==0)
		{
			System.out.println("divisible by 10");
		}else
		{
			System.out.println("not divisible by 10");
		}
	}
	public static void main(String[] args) {
	
		Class2 ob=new Class2();
		System.out.println(ob.add());
		ob.div();
		

	}

}
