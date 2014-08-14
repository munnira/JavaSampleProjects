package com.munni.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesAndUniqueInArray {

	public static void main(String[] args) {
		int[] a = {3,5,5,8,9,9,9};

		  Set<Integer> encounteredNumbers = new HashSet<Integer>();
		  Set<Integer> duplicateNumbers = new LinkedHashSet<Integer>(); 
		  int count=0;
		  for (int i : a) {
		    if (encounteredNumbers.contains(i)) {
		    	count++;
		      duplicateNumbers.add(i);
		    }
		    encounteredNumbers.add(i);
		  }

		  System.out.println("Number of duplicates+ocuurences: "+count);
		  System.out.println("Unique elements: "+encounteredNumbers);
		  System.out.println("Duplicate elements :"+duplicateNumbers);
	}

}
