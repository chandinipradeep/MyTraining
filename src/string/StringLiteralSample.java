package string;

public class StringLiteralSample {

	public static void main(String[] args) {
		
		String s="Welcome";
		System.out.println(s);
		String s1=new String("Welcome");
		System.out.println(s1);
		
		//String length()
		String a="hello";
		System.out.println(a.length());
		
		//String charAt()
		String b="Welcome";
		System.out.println(a.charAt(2));
		
		//String valueOf()
		
		int c=10;
		String d=String.valueOf(c);
		System.out.println(d);
		
		//String equal()
		
		String s2="Hello";
		String s3="Hello";
		String s4="hello";
		String s5="welcome";
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s5));
		
		//String equalsIngnoreCase()
		
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s4.equalsIgnoreCase(s5));
		
		//String isEmpty()
		
		String s6="a";
		System.out.println(s6.isEmpty());
		
		
		
	}

}
