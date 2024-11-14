package java_self_training;

public class BankAccount {

	private int accountnumber;
	private int balance;
	
	public void setter(int accountnumber,int balance)
	{
		this.accountnumber=accountnumber;
		this.balance=balance;
	}
	
	public void getter()
	{
		System.out.println("Bank acc no : "+accountnumber);
		System.out.println("Account balance :"+balance);
	}
}
