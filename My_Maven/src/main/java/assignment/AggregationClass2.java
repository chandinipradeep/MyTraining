package assignment;

public class AggregationClass2 {
	
	public void display(float f,String s)
	{
		System.out.println("Float value :"+f);
		System.out.println("String value :"+s);
	}

	public static void main(String[] args) {
		AggregationClass1 ob=new AggregationClass1();
		ob.add(20,30);
		AggregationClass2 ob1=new AggregationClass2();
		ob1.display(1.20f, "hi");

	}

}
