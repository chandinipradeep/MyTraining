package accessmodifier;

public class Sample1 {
	
	public int m=10;
	protected int a=33;
	int b=29;  //default variable  , no need to give default keyword
	

	public static void main(String[] args) {
		
		Sample1 ob=new Sample1();
		System.out.println(ob.m);
		System.out.println(ob.a);
		System.out.println(ob.b);

	}

}
