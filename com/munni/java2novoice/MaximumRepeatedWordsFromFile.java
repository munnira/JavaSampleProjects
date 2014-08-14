package com.munni.java2novoice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MaximumRepeatedWordsFromFile {

	public static void main(String[] args) {
		String content = dumpFileToString();
		Map<String, Integer> wordCount = getWordCount(content);
		List<Entry<String, Integer>> sorted = sortByValues(wordCount);
		System.out.println("SORTED By Values");
		for(Entry<String,Integer> entry:sorted)
			System.out.println(entry.getKey() +"=========> Its Count "+entry.getValue());

	}

	public static String dumpFileToString() {

		String content = null;
		try {
			content = new Scanner(new File("/users/munnira/xyzt.txt"))
					.useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(content);
		return content;
	}

	public static Map<String, Integer> getWordCount(String content) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = content.split(" ");
		for (String word : words)
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		return map;
	}
	
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
     

//	public static <K extends Comparable, V extends Comparable> Map<K, V> sortByValues(
//			Map<K, V> unsortedMap) {
//		
//		List<Map.Entry<K,V>> ll = new LinkedList<Map.Entry<K,V>>(unsortedMap.entrySet());
//		Collections.sort(ll,new Comparator<Map.Entry<K,V>>(){
//
//			@Override
//            public int compare(Entry<K, V> o1, Entry<K, V> o2) {
//                return o1.getValue()-(o2.getValue());
//            }
//			
//		});
//		Map<K,V> sortedMap=new HashMap<K,V>();
//		for(Map.Entry<K,V> entry:ll){
//			sortedMap.put(entry.getKey(), entry.getValue());
//		}
//		return sortedMap;
//
//	}

}
