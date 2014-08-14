package com.munni.gaylesolutions;

public class UniqueCharInString {
	
	public static boolean isUniqueChars(String str) {
		if (str.length() > 256) {
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	

	public static boolean uniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}

		boolean[] bSet = new boolean[128];

		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i)-'a';
			if (bSet[val]) {
				return false;
			}
			bSet[val] = true;

		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println(isUniqueChars("aBCDIOPU*()&"));

	}

}
