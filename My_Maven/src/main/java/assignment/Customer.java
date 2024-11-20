package assignment;


public class Customer {
	
	int totalamount;
	
	public static int totalAmount(int shirtprice,int jeansprice,int frockprice)
	{
		int totalamount=shirtprice+jeansprice+frockprice;
		System.out.println("Total amount : "+totalamount);
		return totalamount;
	}
	
	public static double discount(int total)
	{
		
		if(total>5000)
		{
		  System.out.println("Congrats, you got 20% discount !!!");
		  double discount= total*0.2;
		  System.out.println("Discount : "+discount);
		  return discount;
		 
		}
		else
		{
			System.out.println("Sorry !! No discount..");
			System.out.println("Total amount : "+total);
			return total;
			
		}
		
		
	}

	public static void main(String[] args) {
		
	 System.out.println("Customer Bill");
	 System.out.println("--------------");
	 int total=Customer.totalAmount(500, 400, 1500);
	
	 double discount=Customer.discount(total);
	 double finalamount=total-discount;
	 if(total>5000)
	 {
	 System.out.println("Final amount after discount : "+finalamount);
	 }
	 else
	 {
		 System.out.println("Final amount after discount : "+total);
	 }
	 

	}

}
