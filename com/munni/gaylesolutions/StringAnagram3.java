package com.munni.gaylesolutions;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram3 {

	public static boolean checkAnagram(String s, String t) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		char[] charArray1 = s.toCharArray();
		for (char c : charArray1) {
			if(map1.containsKey(c))
			map1.put(c, map1.get(c)+1);
			else{
				map1.put(c, 1);
			}
		}

		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		char[] charArray2 = t.toCharArray();
		for (char c : charArray2) {
			if(map2.containsKey(c))
			map2.put(c, map2.get(c)+1);
			else{
				map2.put(c, 1);
			}
		}
		System.out.println(map1 +":"+map2);
		 return map1.equals(map2);
	}

	public static void main(String[] args) {

		System.out.println("Both the strings are :"+checkAnagram("paliama", "ma ilap"));

	}

}
