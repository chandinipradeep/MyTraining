package assignment;

public class SwapNumber2 {

	public static void main(String[] args) {

		System.out.println("Before Swap");
		System.out.println("------------");
		int a=20;
		int b=10;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		System.out.println("After Swap");
		System.out.println("------------");
		a=a+b; //30
		b=a-b; //20
		a=a-b; //10
		System.out.println("a="+a);
		System.out.println("b="+b);
		

 	}

}
