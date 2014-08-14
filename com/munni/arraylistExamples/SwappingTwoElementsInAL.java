package com.munni.arraylistExamples;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingTwoElementsInAL {

	//using Collections.swap();
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Munnira");
		al.add("Shaik");
		al.add("Sadiq");
		al.add("Hussain");
		
		

		System.out.println("Before swapping");
		for (String s : al)
			System.out.println(s);
		
		Collections.swap(al, 0, 2);
		
		System.out.println("After swapping");
		for (String s : al)
			System.out.println(s);
		
		
		

	}

}
