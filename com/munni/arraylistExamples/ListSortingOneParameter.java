package com.munni.arraylistExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingOneParameter {

	// using collections.sort(list)
	public static void main(String[] args) {
		List<String> places = new ArrayList<String>();
		places.add("Bay Beach");
		places.add("Monetary Acquarium");
		places.add("Lake tauhoe");
		places.add("SFO ZOO");

		Collections.sort(places);
		System.out.println("Sorting in ascending order");
		for (String place : places)
			System.out.println(place);
		
		System.out.println("sorting in descending order");
		
		Collections.sort(places,Collections.reverseOrder());
		for (String place : places)
			System.out.println(place);
		//or
		
//		Collections.reverse(places);
//		for (String place : places)
//			System.out.println(place);
		

	}

}
