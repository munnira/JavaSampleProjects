package com.munni.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class NumberOfDuplicates {

	public static void main(String[] args) {
		int[] array={1,2,1,2};
		int count=0;
		Set<Integer> lset= new LinkedHashSet<Integer>();
		for(int i:array){
			if(lset.contains(i)){
				count++;
			}else{
				lset.add(i);
			}
		}
		System.out.println(count);

	}

}
