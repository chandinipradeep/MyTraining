package accessmodifier1;

import accessmodifier.Sample1;

public class Sample3 {

	public static void main(String[] args) {
		
		Sample1 s=new Sample1();
		System.out.println(s.m);
		//System.out.println(s.a); --> outside package no accessability for protected variable 'a'

		//System.out.println(s.b); -->default variable doesnt have accessability ooutside packg
	}

}
