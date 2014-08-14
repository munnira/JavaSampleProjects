package com.munni.careercup;

import java.util.*;
import java.util.StringTokenizer.*;

public class StringReplace {

	String cat;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out
				.println("enter string which is repeating in sentence quite often.");
		Scanner s = new Scanner(System.in);
		String bumblebee = s.nextLine();
		String cat = new String();
		
		System.out.println("\nenter word which you want to replace \n");
		String higuen = s.nextLine();
		
		System.out
				.println("\nenter word with which you want to replace your text\n");
		String robben = s.nextLine();
		
		StringTokenizer st = new StringTokenizer(bumblebee, " ");
		while (st.hasMoreTokens()) {
			String van = st.nextToken();
			if (van.equals(higuen)) {
				cat = cat + robben + " ";

			} else {
				cat = cat + van + " ";

			}

		}

		System.out.println(cat);

	}

}

 
