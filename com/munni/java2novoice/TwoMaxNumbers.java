package com.munni.java2novoice;

import java.util.Arrays;

public class TwoMaxNumbers {

	public static void usingBuiltIn(int[] num) {
		// this uses built in sort and does linear search
		Arrays.sort(num);
		int max1 = num[num.length - 1];
		int max2 = 0;
		for (int i = num.length - 2; i >= 0; i--) {
			if (num[i] == max1) {
				max2 = num[i];

			} else {
				max2 = num[i];
				break;
			}
		}
		System.out.println("Highest two numbers are :" + max1 + " : " + max2);
	}

	public static void printTwoMaxNumbers(int[] nums) {
		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}
			System.out.println("First Max Number: " + maxOne);
			System.out.println("Second Max Number: " + maxTwo);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 70,69,65,78,65,78,70 };
		printTwoMaxNumbers(numbers);
		usingBuiltIn(numbers);

	}

}
