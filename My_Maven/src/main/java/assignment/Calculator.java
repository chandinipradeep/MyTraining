package assignment;

public class Calculator {

	public void add(int a,int b)
	{
		System.out.println(a+b);
	} 
	
	public void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,float b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,float c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		Calculator ob=new Calculator();
		ob.add(1.2f, 1.5f);
		ob.add(10, 20.1f);
		ob.add(30, 40);
		ob.add(22, 10, 10.1f);

	}

}
