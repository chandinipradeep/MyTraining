package assignment;

public class Building {
	
	String address;
	int no_of_floors;
	int total_area;
	
	public Building(String address,int no_of_floors,int total_area)
	{
		this.address=address;
		this.no_of_floors=no_of_floors;
		this.total_area=total_area;
	}
	
	public void information()
	{
		System.out.println("Building Informtion");
		System.out.println("--------------------");
		System.out.println("Address               :  "+address);
		System.out.println("Number of floors      :  "+no_of_floors);
		System.out.println("Total area            :  "+total_area);
	}
	
	
	

}
