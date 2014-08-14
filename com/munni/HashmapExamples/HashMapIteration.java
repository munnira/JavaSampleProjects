package com.munni.HashmapExamples;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapIteration {

	public static void main(String[] args) {
		
		//using keyset and using entry set
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("austia", 1);
		hmap.put("canada", 2);
		hmap.put("uSA", 4);
		hmap.put("qatar", 5);
		
		System.out.println("Iterating using for loop on keyset");
		for(String key:hmap.keySet())
			System.out.println(key+":"+hmap.get(key));
		
		System.out.println("Iterating using keyset iterator");
		Iterator<String> keyIterator = hmap.keySet().iterator();
		while(keyIterator.hasNext())
		{
			System.out.println(keyIterator.next());
		}
		
		System.out.println("Iterating using for loop entrySet");
		for(Entry entry:hmap.entrySet())
			System.out.println(entry.getKey() +":"+entry.getValue());
		
		System.out.println("Iterating using entry set Iterator");
		 Iterator<Entry<String, Integer>> entryIterator = hmap.entrySet().iterator();
		while(entryIterator.hasNext())
		{
			Entry entry=  entryIterator.next();
			System.out.println(entry.getKey() +":" + entry.getValue());
		}
		
		
		
		
		

	}

}
