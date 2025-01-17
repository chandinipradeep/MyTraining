package assignment;

public class Residential extends Building{
	
	int no_of_apartments;
	int rent;
	public Residential(int no_of_apartments,int rent)
	{
		super("Prestige Appartments, Kakkanad",12,5000);
		this.no_of_apartments=no_of_apartments;
		this.rent=rent;
	}
	
	public int calculateTotalRent()
	{
		int totalrent=no_of_apartments*rent;
		return totalrent;
		
	}
	public void information2(int totalrent)
	{
		System.out.println("Number of apartments  :  "+no_of_apartments);
		System.out.println("Rent per apartment    :  "+rent);
		System.out.println("Total rent recieved   :  "+totalrent);
	}
	
	

	public static void main(String[] args) {
		

		Residential ob=new Residential(20,20000);
		ob.information();
		int totalrent=ob.calculateTotalRent();
		ob.information2(totalrent);
		
	}

}
