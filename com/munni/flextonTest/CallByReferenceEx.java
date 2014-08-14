package com.munni.flextonTest;

class Number{
	
	int x;
	
}


public class CallByReferenceEx {

	public static void main(String[] args) {
		Number n = new Number();
		n.x=3;
		System.out.println("Before "+n.x);
		inc(n);
		System.out.println("After :"+n.x);

	}
	
	public static void inc(Number a){
		a.x=a.x+1;
		System.out.println("In Method  :"+a.x);
	}

}
