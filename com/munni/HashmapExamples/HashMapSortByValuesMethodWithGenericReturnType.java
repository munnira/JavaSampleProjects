package com.munni.HashmapExamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class HashMapSortByValuesMethodWithGenericReturnType {
 
	public static void main(String[] args) {
 
		Map<String, String> unsortMap = new HashMap<String, String>();
		unsortMap.put("2", "B");
		unsortMap.put("1", "A");
		unsortMap.put("4", "D");
		unsortMap.put("3", "B");
		unsortMap.put("7", "C");
		unsortMap.put("5", "z");
		unsortMap.put("6", "b");
		unsortMap.put("8", "a");
 
		System.out.println("Unsort Map......");
		printMap(unsortMap);
 
		System.out.println("Sorted Map......");
		Map<String, String> sortedMap = sortByComparator(unsortMap);
		printMap(sortedMap);
 
	}
	//another way of sorting values
	// map(entryset) yo Set --- list --sort list --- list to map
	
	public static List<Entry<String, Integer>> sortByValues(Map<String, Integer> wordMap){
        
        Set<Entry<String, Integer>> set = wordMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        return list;
    }
 
	private static Map sortByComparator(Map unsortMap) {
 
		List list = new LinkedList(unsortMap.entrySet());
 
		// sort list based on comparator
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
                                       .compareTo(((Map.Entry) (o2)).getValue());
			}
		});
 
		// put sorted list into map again
                //LinkedHashMap make sure order in which keys were inserted
		Map sortedMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
 
	public static void printMap(Map<String, String> map){
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() 
                                   + " Value : " + entry.getValue());
		}
	}
}