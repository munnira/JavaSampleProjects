package com.munni.flextonTest;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] arg) {
		Random random = new Random();
		int index;
		for (index = 0; index < 15; index++) {
			System.out.println("Random number is :"
					+ (int) ((Math.random()) * 10.0));

		}
	}
}
