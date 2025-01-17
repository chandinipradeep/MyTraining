package exceptionhandling;
import java.lang.ArithmeticException;

public class ThrowException {
	
	
	public static void testThrow(int age)
	{
		if(age<18)
		{
		throw new ArithmeticException("Not eligible");	
		
		//System.out.println("Not eligible");
		}
		else	
		{ 
			System.out.println("Eligible");
		} 
	}

	public static void main(String[] args) {
		
		ThrowException.testThrow(17);
		System.out.println("End of statement"); 

	}

}
