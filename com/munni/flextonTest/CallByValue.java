package com.munni.flextonTest;




public class CallByValue {

	public static void main(String[] args) {
		System.out.println("Hello");
		int x=3;
//		Integer x=new Integer(3);
		inc(x);
		System.out.println("after "+x);

	}
	
	public static int inc(int x){
		x++;
		System.out.println("In inc :"+x);
		return x;
	}

}
