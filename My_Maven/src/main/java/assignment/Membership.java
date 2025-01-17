package assignment;

public class Membership {
	
	String member_name;
	int membership_duration;
	
	public Membership(String member_name,int membership_duration)
	{
		this.member_name=member_name;
		this.membership_duration=membership_duration;
		
	}
	
	public int calculateFees()
	{
		int fees=500;
		int totalfees=membership_duration*fees;
		return totalfees;
	}
	
	public double specialOffer(int totalfees)
	{
		if(totalfees>1000)
		{
		
			double offer=totalfees*0.1;
			double offerfees=totalfees-offer;
			return offerfees;
		}
		else
		{
			
			return totalfees;
		}
	}
	
	public void print(int totalfees,double offerfees)
	{
		System.out.println("Membership Details");
		System.out.println("-------------------");
		System.out.println("Member Name          :  "+member_name);
		System.out.println("Membership duration  :  "+membership_duration);
		System.out.println("Total fees           :  "+totalfees);
		if(totalfees>1000)
		{
			System.out.println("Congrats!! you got 10% discount on total fees..");
			System.out.println("Total fees after discount :  "+offerfees);
		}
		else
		{
			System.out.println("Sorry :( No discount..");
			System.out.println("Total fees to pay :  "+totalfees);
		}
		
	}
	
	public static void main(String args[])
	{
		Membership ob=new Membership("Saanvika",10 );
		int totalfees=ob.calculateFees();
		double offerfees=ob.specialOffer(totalfees);
		ob.print(totalfees,offerfees);
		
	}

}
