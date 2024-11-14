package java_self_training;

public class Class2 {

	public static void main(String[] args) {
		Class1 ob=new Class1();
		System.out.println(ob.a); //public variable
		
		//System.out.println(ob.b); private variable doesnt have visibility
		
		System.out.println(ob.c); //protected variable
		
		System.out.println(ob.d);

	}

}
