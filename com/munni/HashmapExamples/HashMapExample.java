package com.munni.HashmapExamples;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class HashMapExample{
	public static void main(String[] s){
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(12, "munnira");
		hmap.put(2, "sadik");
		hmap.put(1, "shaik");
		hmap.put(1, "kill");//-- vth same key it overrides
		

		System.out.println("Iterating or looping map using java5 foreach loop ");
for (Integer key : hmap.keySet()) {
   System.out.println("key: " + key + " value: " + hmap.get(key));
}


		
		System.out.println("Using for loop");
		for(Entry<Integer, String> entry : hmap.entrySet()){
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}
		
		System.out.println("Key set :"+hmap.keySet());
		System.out.println("value set :"+hmap.values());
		System.out.println("Entry set--key and value  :"+hmap.entrySet());
		
		System.out.println("using iterator");
		Set set=hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, String> next = (Map.Entry<Integer, String>)iterator.next();
			System.out.println(next.getKey() +":" + next.getValue());
		}
		
		System.out.println("removing an element");
		hmap.remove(1);
		
		System.out.println("After removing");
		for(Entry<Integer, String> e:hmap.entrySet())
			System.out.println(e.getKey() +":" + e.getValue());
		
		System.out.println("Get a value based on key :"+hmap.get(12));
		
		
	}
}