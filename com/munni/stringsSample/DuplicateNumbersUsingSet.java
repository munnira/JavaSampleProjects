//package com.munni.stringsSample;
//
//import java.util.Arrays;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class DuplicateNumbersUsingSet {
//
//	public static void main(String[] args) {
//
//		int[] intArray={2,2,2,2,3,3};
//		Arrays.sort(intArray);
//		int count=1;
//		Set<Integer> tset=new TreeSet<Integer>();
//		tset.add(intArray[0]);
//		
//		for(int i=0;i<intArray.length;i++){
//			if(intArray[i]==intArray[i+1]){
//				count++;
//			}
//			else{
//				count=1;
//				
//			}
//			
//			
//			
//		}
//		
//		
//		
//		
//		for(int j=0;j<i.length;j++){
//			if(tset.contains(i[j])){
//				count++;
//				if(((j+1)<i.length)&&(i[j]==i[j+1])){
//				count++;
//				}
//				else{
//					count=1;
//					break;
//				}
//			}
//			else{
//				tset.add(i[j]);
//			}
//			System.out.println(tset +":"+count);
//		}
//		
//		
//	}
//
//}
