package com.munni.stringsSample;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] s) {
		// System.out.println("Enter a limit");
		// Scanner scanner = new Scanner(System.in);
		// int limit = scanner.nextInt();
		printPrimeNumbers(45);

	}

	public static void printPrimeNumbers(int limit) {
int count=1;
		for (int num = 2; num <= limit; num++) {
			boolean isPrime = true;
			//we need not keep i<n becz divisors will always be (less than)< n/2
			for (int i = 2; i<=(num/2); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime){
				count++;
				System.out.println(num);
			}
		}
		System.out.println("number of prime's is :"+count);

	}

}
