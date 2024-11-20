package assignment;

public class FullTimeEmployee extends Employee {
	
	@Override
	public void calculateSalary() {
		
		int totalpay=pay*8; 
		System.out.println("Total Payment of Fulltime Employee :"+totalpay);
		
	}

	public static void main(String[] args) {
		
		FullTimeEmployee ob=new FullTimeEmployee();
		ob.calculateSalary();
	}

	

}
