package accessmodifier1;

import accessmodifier.Sample1;

public class Sample4 extends Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample4 s1 =new Sample4();
		System.out.println(s1.m);
		System.out.println(s1.a);
		//System.out.println(s1.b); //no accessability for default variable
	}

}
