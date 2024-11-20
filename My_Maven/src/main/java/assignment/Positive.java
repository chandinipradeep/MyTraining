package assignment;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :"); 
		int number=s.nextInt();
		if(number>0)
		{
			System.out.println(number+" is a positive number");
		}
		else
		{
			System.out.println(number+" is a negative number");
		}
		

	}

}
