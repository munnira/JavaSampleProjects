package com.munni.java2novoice;

public class DecToBin {
//	reminder and then num/2

	public static void main(String[] args) {
		int dec=32,index=0;
		int[] bin=new int[20];
		while(dec>0){
			bin[index]=dec%2;
			dec=dec/2;
			if(dec==0)break;
			index++;
		}
		for(int i=index;i>=0;i--)
			System.out.print(bin[i]);
		

	}

}
