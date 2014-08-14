package com.munni.sortingAlgos;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr){
		
		int n=arr.length,min;
		
		for(int i=0;i<n-1;i++){
			min=arr[i];
			for(int j=i+1;j<n;j++){
				if(min>arr[j])
					min=arr[j];
			}
			swap(min,arr[i]);
		}
		return arr;
	}

	private static void swap(int min, int i) {
		min=min+i;
		i=min-i;
		min=min-i;
		
	}

	public static void main(String[] args) {
	int[] sorted=selectionSort(new int[]{10,9,8,7,5,4,3,2,1});

	for(int s:sorted)
		System.out.print(s+" ");

	}

}
