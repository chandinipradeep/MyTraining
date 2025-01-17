package java_self_training;

public class Palindrome {

	public static void main(String[] args) {
		
		String s="ohoo";
		StringBuilder s1=new StringBuilder(s);
		s1.reverse();
		if(s.equals(s1.toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	
		
	}

}
