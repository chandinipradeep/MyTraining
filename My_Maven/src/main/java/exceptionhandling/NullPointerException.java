package exceptionhandling;

public class NullPointerException {

	public static void main(String[] args) {
		
		try
		{
		String value=null;
		System.out.println(value.length());
		}
		/*catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e); 
		}*/
		finally
		{
			System.out.println("Finally block");
			
		}

	}

}
