package com.munni.flextonTest;

import java.util.Scanner;

public class PrintPrimeNumbers {

	protected static void printPrimeNumber(int limit) {
		int num, div;
		boolean isPrime;
		for (num = 2; num <= limit; num++) {
			isPrime = true;
			for (div = 2; div < num; div++) {

				if (num % div == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(num);
		}
	}

	public static void main(String[] s) {
		System.out.println("Enter a limit to print prime number");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		printPrimeNumber(limit);
	}
}
