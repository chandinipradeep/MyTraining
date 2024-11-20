package assignment;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a=s.nextInt();
		System.out.println("Enter the second number :");
		int b=s.nextInt();
		System.out.println("Enter the third number :");
		int c=s.nextInt();
		
		
		if(a>b&&a>c) 
		{
			System.out.println(a+" is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+" is greater");
		}
		else
		{
			System.out.println(c+" is greater");
		}
	}

}
