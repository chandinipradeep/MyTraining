package java_self_training;

public class CustomException {

	public void nullPointer(String s) throws StringNullException
	{
		if(s==null)
		{
			throw new StringNullException("Null");
			
		}
		else
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) throws StringNullException {
		
		CustomException ob=new CustomException();
		ob.nullPointer(null);

	}

}
