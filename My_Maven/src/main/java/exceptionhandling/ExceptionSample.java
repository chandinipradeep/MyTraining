package exceptionhandling;

public class ExceptionSample {
	
	public void test(int age) throws LicenseException
	{
		if(age<18) 
		{
			throw new LicenseException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) throws LicenseException 
	{
		ExceptionSample ob=new ExceptionSample();
		ob.test(17);
		
		
		/*try {
			ob.test(17);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
