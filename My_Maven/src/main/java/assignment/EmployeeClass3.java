package assignment;

public class EmployeeClass3 extends EmployeeClass2{
	
	double totalSalary;
	
	public void totalSalary()
	{
		totalSalary=basicpay+hra-pf-deduction+bonus;
	}
	
	public void salaryslip()
	{
		System.out.println("EMPLOYEE SALARY SLIP");
		System.out.println("---------------------");
		System.out.println("Basic Pay    :  "+basicpay);
		System.out.println("Deduction    :  "+deduction);
		System.out.println("HRA          :  "+hra);
		System.out.println("PF           :  "+pf);
		System.out.println("Bonus        :  "+bonus);
		System.out.println("Total Salary :  "+totalSalary);
	}

	public static void main(String[] args) {
	
		EmployeeClass3 ob=new EmployeeClass3();
		//ob.getDetail(5000, 500, 1000);
		ob.getDetails();
		ob.totalSalary();
		ob.calculateHraPf();
		ob.salaryslip();
		

	}

}
