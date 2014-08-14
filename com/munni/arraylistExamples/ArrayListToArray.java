package com.munni.arraylistExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("String1");
		al.add("String2");
		al.add("String3");
		al.add("String4");
		
		//using predefine method toArray()
		System.out.println("Converting using predefined method called toArray()");
		String arrayName[] = al.toArray((new String[al.size()]));
		for(String name : arrayName)
			System.out.println(name);
		
		// converting manually
		System.out.println("Converting without predefined method by copying one by one");
		String stringArray[] = new String[al.size()];
		for(int j=0;j<al.size();j++){
		stringArray[j]=al.get(j);
		System.out.println(stringArray[j]);
		}
		
		
		
		
		

	}

}
