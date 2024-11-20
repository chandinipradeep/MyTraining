package assignment;


public class Contractor extends Employee {
	
	int workinghours=12;
	

	@Override
	public void calculateSalary() {
		
		int totalpay=workinghours*pay;
		System.out.println("Total Payment of Contract Employee : "+totalpay);
		
	}
	
	public static void main(String[] args) {

		Contractor ob=new Contractor();
		ob.calculateSalary();

	}

	

}
