package assignment;

import java.util.Scanner;

public class EmployeeClass1 {
	
	int basicpay;
	int deduction;
	int bonus;
	Scanner s=new Scanner(System.in);
	
	/*public void getDetail(int basicpay,int deduction, int bonus)
	{
		this.basicpay=basicpay;
		this.deduction=deduction;
		this.bonus=bonus;
	}*/
	
	public void getDetails()
	{
		System.out.println("Enter basic pay :");
		basicpay=s.nextInt();
		System.out.println("Enter deduction :");
		deduction=s.nextInt();
		System.out.println("Enter bonus     :");
		bonus=s.nextInt();
	}

	
}
