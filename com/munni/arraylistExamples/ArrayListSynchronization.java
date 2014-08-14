package com.munni.arraylistExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSynchronization {

	public static void main(String[] args) {
		
		//usual way
//		List<String> al1 = new ArrayList<String>();
		
		//synchronized list
		List<String> syncal = Collections.synchronizedList(new ArrayList<String>());
		syncal.add("Hello");
		syncal.add("Hi");
		syncal.add("How are");
		syncal.add("you");
		
		synchronized(syncal){
			
			for(String s:syncal)
				System.out.println(s);
			
		}
		
		//u can either use CopyOnWriteArrayList<String> syncal= new CopyOnWriteArrayList<String>();
		

	}

}
