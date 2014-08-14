package com.munni.gaylesolutions;

public class StringRotation {

	public static boolean isRotation(String s, String rot) {
		String concat = null;
		if (s.length() == rot.length()&& s.length()>0) {
			concat = s + s;
		} else {
			return false;
		}
		//concat.contains(rot) -- also works but indexOf returns the index where substring is found
		if (concat.indexOf(rot)>=0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Is string rotated :" + isRotation("abc", "cab"));

	}

}
