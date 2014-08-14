package com.munni.flextonTest;

public class ReverseNumber {

	public static int reverse(int n) {
		int rem, rev = 0;
		while (n > 0) {
			rev = (n % 10) + (rev * 10);
			n /= 10;
		}
		return rev;
	}

	public static void main(String[] arg) {
		int num = 531;
		System.out.println("Reverse of a number is :" + reverse(num));
	}
}
