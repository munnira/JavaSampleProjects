package com.munni.arraylistExamples;

import java.util.ArrayList;
import java.util.List;

public class SubListAndCloneOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Munnira");
		al.add("How");
		al.add("are");
		al.add("you");
		
		System.out.println("Getting clone of AL");
		List<String> al2 =  (ArrayList<String>)al.clone();
		for(String s:al2)
			System.out.println(s);

		System.out.println("Getting sublist of AL");
		List<String> subList = new ArrayList<String>(al.subList(0, 2));
		//other way
//		List<String> s2=al.subList(0, 2);
		for(String s:subList)
			System.out.println(s);
		

	}

}
