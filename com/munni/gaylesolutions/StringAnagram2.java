package com.munni.gaylesolutions;

public class StringAnagram2 {
	
	//without using sort of arrays
	
	public static boolean anagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] letters = new int[256];
		int num_unique_chars = 0;
		int num_completed_t = 0;
		char[] s_array = s.toCharArray();
		for (int c : s_array) { // count number of each char in s.
			if (letters[c] == 0)
				++num_unique_chars;
			++letters[c];
		}
		for (int i = 0; i < t.length(); ++i) {
			int c = (int) t.charAt(i);
			if (letters[c] == 0) { // Found more of char c in t than in s.
				return false;
			}
			--letters[c];
			if (letters[c] == 0) {
				++num_completed_t;
				if (num_completed_t == num_unique_chars) {
					// itÍs a match if t has been processed completely
					return true;
					//return i == t.length() - 1;
				}
			}
		}
		return false;
	}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anagram("parlia","alirap"));

	}

}
