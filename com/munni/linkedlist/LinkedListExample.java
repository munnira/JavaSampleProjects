package com.munni.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] s){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("Third");
		ll.add("fourth");
		
		System.out.println("Elements in ll:");
		for(String element:ll)
			System.out.println(element);
		
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(ll);
		System.out.println("Elements in AL: ");
		for(String element1:al)
		System.out.println(element1);
	}

}
