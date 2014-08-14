package com.munni.stringsSample;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsInStringUsingSet {

	public static void main(String[] args) {

		String sen="munni,shaik,sadiq,shaik,chinni,guddu,nanna,atta,mama,shaik,munni,sadiq";
		int count=1;
		Set<String> tset=new TreeSet<String>();
		for(String word:sen.split(",")){
			if(tset.contains(word)){
				count++;
			}
			else{
				tset.add(word);
				for(String s:tset){
					
				}
			}
			
		}
		
	}

}
