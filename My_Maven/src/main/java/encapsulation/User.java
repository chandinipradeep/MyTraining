package encapsulation;

public class User {

	public static void main(String[] args) {
		
		Bank ob=new Bank();
		ob.setData(1212);
		System.out.println("Pin :"+ob.getData());

	}

}
