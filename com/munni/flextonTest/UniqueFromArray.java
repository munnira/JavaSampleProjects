package com.munni.flextonTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueFromArray {

	public static Set<Integer> unique(int[] arr) {

		Set<Integer> lset = new LinkedHashSet<Integer>();
		Set<Integer> hset = new HashSet<Integer>();

		for (int element : arr) {
			if (hset.contains(element)) {
				lset.add(element);
			} else {
				hset.add(element);
			}
		}
		return hset;
	}

	public static void main(String[] arg) {
		int[] array = { 1, 2, 1, 2, 1 };
		Set<Integer> unique = unique(array);
		System.out.println("Unique elements are");
		for (Integer num : unique)
			System.out.println(num);
	}
}
