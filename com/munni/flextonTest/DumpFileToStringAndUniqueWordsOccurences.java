package com.munni.flextonTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class DumpFileToStringAndUniqueWordsOccurences {
	
	public static String dumpFileString(){
		String content = null;
		try {
			 content = new Scanner(new File("/users/munnira/xyzt.txt")).useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found at specified location");
		}
		System.out.println("The content is : "+content);
		return content;
	}
	
	public static Map<String,Integer> occurences(String contents){
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String content : contents.split(",")){
			if(map.containsKey(content)){
				map.put(content, map.get(content)+1);
			}
			else{
				map.put(content, 1);
			}
		}
		
		return map;		
	}
	

	public static void main(String[] args) {
		Map<String,Integer> map=occurences(dumpFileString());
		System.out.println("Unique Occurences are :");
		for(Entry<String,Integer> entry:map.entrySet()){
			if(entry.getValue()==1)
			System.out.println(entry.getKey() +"              :OCUURENCES :"+entry.getValue());
		}
	}
}
