package com.munni.stackQueueExamples;

import java.util.*;

public class balancedBraces {
	
	public static boolean balancedBracesMethod(String s) {
		
		int myLength = s.length();
		Stack<Character> st = new Stack<Character>();
		char d;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			//checks (,)
			
			if (c == '(') {
				st.push(c);
			}
			else if (c == ')') {
				if (st.isEmpty()) {
					return false;
				} else if (st.empty() == false) {
					d =  st.pop();
					if (d != '(') {
						return false;
					}
				}
			} 
			
			//end of checking (,)
			
			else if (c == '[') {
				st.push(new Character(c));
			} 
			
			else if (c == ']') {
				if (st.empty() == true) {
					return false;
				} else if (st.empty() == false) {
					d = (Character) st.pop();
					if (d != '[') {
						return false;
					}
				} else if (s.charAt((s.length() - 1)) == '[') {
					return false;

				}
			}
			
		}

		return true;
	}

	public static void main(String[] s) {
		System.out.println(balancedBracesMethod(")"));

	}
}
