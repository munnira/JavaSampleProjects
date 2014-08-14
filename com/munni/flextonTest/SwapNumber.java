package com.munni.flextonTest;

public class SwapNumber {

	protected static void swap(Integer a, Integer b) {

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping :" + a + " : " + b);
	}

	public static void main(String[] s) {

		Integer x = new Integer(35);
		Integer y = new Integer(45);
		System.out.println("Before Swapping :" + x + " : " + y);
		swap(x, y);
	}
}
