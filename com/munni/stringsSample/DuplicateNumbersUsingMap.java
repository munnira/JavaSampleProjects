package com.munni.stringsSample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateNumbersUsingMap {
	
	//we can achieve this by set as well

	public static void main(String[] args) {
		
		int[] num={1,2,3,4,1,2,3,5,6,7,5,6,5,4};
		Map<Integer,Integer> map1= new HashMap<Integer,Integer>();
		for(int n:num){
			if(map1.containsKey(n)){
				map1.put(n, map1.get(n)+1);
			}
			else
				map1.put(n, 1);
		}
		
		for(Entry<Integer, Integer> entry:map1.entrySet()){
			if(entry.getValue()>1){
				System.out.println("Duplicate Number : "+entry.getKey()+" and its occurences : "+entry.getValue());
			}
		}
			
		

	}

}
