package com.munni.sortingAlgos;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr){
		int len=arr.length,temp;
		double start=System.currentTimeMillis()*10;
		for(int i=0;i<len-1;i++){
			int flag=0;
			for(int j=0;j<len-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=1;
				}
			}
			if(flag==0)break;
			
//			System.out.println("For pass "+(i+1));
//			for(int a :arr){
//				System.out.print(a+" ");
//			}
//			System.out.println();
			
		}
		double end=System.currentTimeMillis()*10;
		System.out.println((end-start));
		return arr;
	}

	public static void main(String[] args) {
		
//		char[] sorted=bubbleSort(new char[]{'S','A','c','s','w'});
//		for(char s:sorted)System.out.println(s);
		
		int[] sorted=bubbleSort(new int[]{15,14,15,14,13,12,11,10,9,8,7,6,5});
		for(int s:sorted)
			System.out.print(s+" ");

	}

}
