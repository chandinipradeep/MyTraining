package scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=ob.nextInt();
		System.out.println("Enter the second number: ");
		int b=ob.nextInt();
		int c=a+b;
		System.out.println("a+b ="+c);

	}

}
