package exceptionhandling;
import java.lang.ArithmeticException;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		System.out.println("Starting");
		
		try
		{
			int c=a/b; 
		}
		
		/*catch(ArithmeticException e)
		{
			b=5;
			int d=a/b;
			System.out.println(d);
			//System.out.println(e);
		}*/
		finally
		{
	
		System.out.println("Ending");
		}
	}


	

}
