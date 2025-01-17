package string;

public class ThisMethod {
	
	int a=20;
	int b=10;

	public void add()
	{
		this.mul();
		System.out.println(a+b);
	}
	
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public void mul()
	{
		this.sub();
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisMethod ob=new ThisMethod();
		ob.add();

	}

}
