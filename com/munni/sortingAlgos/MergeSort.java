package com.munni.sortingAlgos;

public class MergeSort {
	public static void main(String[] args) {
		int[] sorted = mergeSort(new int[]{10,9,8,7,6,5,4,3,2});
		for(int s :sorted)
			System.out.print(s+" ");
	}
	
	public static int[] mergeSort(int[] arr){
		int len=arr.length,mid;
		if(len<2) return arr;
		mid=len/2;
		int[] la =new int[mid];
		int[] ra=new int[len-mid];
		for(int i=0;i<mid;i++)
			la[i]=arr[i];
		for(int i=mid;i<len;i++)
			ra[i-mid]=arr[i];
		mergeSort(la);
		mergeSort(ra);//till now we divided list to sublists of one element
		merge(la,ra,arr);
		return arr;
			
	}

	private static void merge(int[] la, int[] ra, int[] arr) {
		int lLen=la.length;
		int rLen=ra.length;
		int i=0,j=0,k=0;
		
		while(i<lLen&& j<rLen)
		{
			if(la[i]<=ra[j]){
				arr[k]=la[i];
				i++;
			}
			else{
				arr[k]=ra[j];
				j++;
			}
			k++;
		}
		while(i<lLen){
			arr[k]=la[i];i++;k++;
		}
		while(j<rLen){
			arr[k]=ra[j];j++;k++;
		}
	}

}
