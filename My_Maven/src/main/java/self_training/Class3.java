package self_training;

import java_self_training.Class1;

public class Class3 {

	public static void main(String[] args) {
		Class1 ob=new Class1();
		System.out.println(ob.a);
		//System.out.println(ob.c); // no visibility for protected ,since its not a sub class

		//System.out.println(ob.d); // no visibility for default variable outside package
	}

}
