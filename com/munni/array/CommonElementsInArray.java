package com.munni.array;
public class CommonElementsInArray {
	 
    public static void main(String s[]){
        int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4,7,8,6,4,5,4};
        for(int a:arr1){
            for(int b:arr2){
                if(a==b){
                    System.out.println(a);
                    break;
                }
            }
        }
    }
}
