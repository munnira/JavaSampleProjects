package com.munni.gaylesolutions;

import java.lang.reflect.Array;
import java.util.Arrays;

//conver string to charArray , sort ,charArray to String,check equals on both strings
//complexity more

public class StringAnagram {

	public static StringBuilder removeJunk(String str) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < (str.length()); i++) {
			if (Character.isLetter(str.charAt(i))) {
				sb.append(str.charAt(i));
			}

		}
		return sb;
	}
	
	public static String sort(StringBuilder s){
		char[] c=s.toString().toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static boolean permutation(StringBuilder s,StringBuilder t){
		return sort(s).equals(sort(t));
	}
	


	public static void main(String[] args) {
		String s1 = "parliament)", s2 = "Partial men)";
		StringBuilder s3 = removeJunk(s1.toLowerCase());
		StringBuilder s4 = removeJunk(s2.toLowerCase());
		System.out.println(permutation(s3,s4));

	}

}
