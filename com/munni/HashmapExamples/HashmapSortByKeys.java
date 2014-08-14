package com.munni.HashmapExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashmapSortByKeys {
	// we can sort either by passing hmap to newly created treemap
	// or
	// using collections.sort() by converting hmap to list so that sort allows
	// list

	public static void main(String[] args) {

		HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
		hmap1.put("austia", 1);
		hmap1.put("canada", 2);
		hmap1.put("uSA", 4);
		hmap1.put("fddg", 5);

		System.out.println("Sorting keys by using treemap");
		// /VERY VERY IMPORTANT --- PASSING HMAP AS PARAMETER
		Map<String, Integer> tmap = new TreeMap<String, Integer>(hmap1);

		System.out.println("After sorting by  keys");

		System.out.println("Iterating using for loop entrySet");
		for (Entry entry : tmap.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());

		// taking other map and sorting using map---list--sort list
		HashMap<String, Integer> hmap2 = new HashMap<String, Integer>();
		hmap2.put("Hello", 12);
		hmap2.put("Adsdgh", 42);
		hmap2.put("Marotage", 54);
		hmap2.put("Bidding", 75);

		System.out
				.println("Sorting keys by using collection.sort() ,you can either directly print it  "
						+ "or take linkedhashmap and insert sorted list and get value from hmap2");
		List<String> countries = new ArrayList<String>(hmap2.keySet());
		Collections.sort(countries);
		for (String country : countries)
			System.out.println(country + ":" + hmap2.get(country));

	}
}
