package com.munni.arraylistExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {

		Integer intArray[] = {10,20,30,40};
		
		System.out.println("Converting using predefined method Arrays.asList()");
		ArrayList<Integer> al1= new ArrayList<Integer>(Arrays.asList(intArray));
		for(Integer i : al1)
			System.out.println(i);
		
		System.out.println("Converting manually");
		List<Integer> al2= new ArrayList<Integer>();
		for(int i=0;i<intArray.length;i++)
			al2.add(intArray[i]);
		for(int k : al2)
			System.out.println(k);
		
		System.out.println("Converting by using Collections.addAll()");
		List<Integer> al3 = new ArrayList<Integer>();
		Collections.addAll(al3, intArray);
		for(Integer i : al3)
			System.out.println(i);
		
	}
}
