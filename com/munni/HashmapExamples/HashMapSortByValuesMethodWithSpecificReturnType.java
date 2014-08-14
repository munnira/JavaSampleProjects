package com.munni.HashmapExamples;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSortByValuesMethodWithSpecificReturnType{
	
//	map(entryset)--list--sort by comparator--put back in linkedHashMap
	@SuppressWarnings("rawtypes")
	public static <K extends Comparable,V extends Comparable> Map<K,V> sortByValues(Map<K,V> map){
        List<Map.Entry<K,V>> entries = new LinkedList<Map.Entry<K,V>>(map.entrySet());
     
        Collections.sort(entries, new Comparator<Map.Entry<K,V>>() {

            @SuppressWarnings("unchecked")
			@Override
            public int compare(Entry<K, V> o1, Entry<K, V> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
     
        //LinkedHashMap will keep the keys in the order they are inserted
        //which is currently sorted on natural ordering
        Map<K,V> sortedMap = new LinkedHashMap<K,V>();
     
        for(Map.Entry<K,V> entry: entries){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
     
        return sortedMap;
    }
	
	public static void main(String[] s){
		
		Map<String, String> unsortMap = new HashMap<String, String>();
		unsortMap.put("2", "B");
		unsortMap.put("1", "A");
		unsortMap.put("4", "D");
		unsortMap.put("3", "B");
		unsortMap.put("7", "C");
		unsortMap.put("5", "z");
		unsortMap.put("6", "b");
		unsortMap.put("8", "a");
		Map<String, String> sortByValues = sortByValues(unsortMap);
		for(Entry entry:sortByValues.entrySet()){
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
	}
}