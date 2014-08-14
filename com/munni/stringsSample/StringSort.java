package com.munni.stringsSample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringSort {

	public static void main(String[] args) {
		String s = "munnira hello how are u dear";
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		
		Set<Character> hs=new TreeSet<Character>();
		for(char c:charArray)
			hs.add(c);
		for(Character n:hs)
			System.out.print(n);

	}

}
