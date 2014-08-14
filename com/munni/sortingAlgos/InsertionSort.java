package com.munni.sortingAlgos;

public class InsertionSort {
	
	
	public static int[] insertionSort(int[] arr){
		int len=arr.length;
		for(int i=0;i<len-1;i++){
			
			int next=arr[i+1],j;
			for(j=i+1;j>0 && (next<arr[j-1]);j--){
				
				arr[j]=arr[j-1];
			}
			arr[j]=next;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] sorted = insertionSort(new int[]{10,9,8,7,6,5});
		for(int s:sorted)
			System.out.print(s+" ");
	}

}
