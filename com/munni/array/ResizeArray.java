package com.munni.array;

import java.util.Arrays;

public class ResizeArray {

	public static void main(String[] args) {

		String[] s = new String[2];
		s[0] = "hello";
		s[1] = "Karnataka";
		System.out.println("Size :" + s.length);
		for (String s1 : s)
			System.out.println(s1);
		
		// s=new String[20];
		// System.arraycopy(s, 0, s2, 0, s2.length); -- check sm componenttype
		
		String[] s2 = Arrays.copyOf(s, 7);
		System.out.println("Size after init :" + s2.length);
		s2[6] = "shaik";
		s2[3] = "sadiq";
		s2[4] = "sahib";

		System.out.println("Observe that its ptinting s1+s2");
		for (String s1 : s2)
			System.out.println(s1);

	}

}
