package com.munni.gaylesolutions;

import java.util.Scanner;

public class FibanacciTwoWays {

	public static void main(String[] args) {
		System.out.println("Enter a limit");
		Scanner s= new Scanner(System.in);
		int limit=s.nextInt();
		int[] fibanacciWithoutRec = fibanacciWithoutRec(limit);
		for(int n:fibanacciWithoutRec)
			System.out.print(" "+n);
		System.out.println("With recursion");
		for(int i=2;i<limit;i++)
			System.out.print(fibanncciWithRec(i)+" ");
			

	}

	private static int[] fibanacciWithoutRec(int limit) {
		int[] fi = new int[limit];
		 fi[0]=0;
		 fi[1]=1;
		 // basically a=0,b=1,
		 //c=a+b;
		 //a=b;
		 //b=c;
		 
		 //just use -- f(n)=f(n-1)+f(n-2) for array +recursive
		 if(limit==0)System.out.println(limit);
		 if(limit==1) System.out.println(limit);
		for(int i=2;i<limit;i++){
			fi[i]=fi[i-2]+fi[i-1];
		}
		return fi;
		
	}
	
	public static int fibanncciWithRec(int n){
		if(n==0)return 0;
		else if(n==1) return 1;
		else{
		return fibanncciWithRec(n-1)+fibanncciWithRec(n-2);
		}
	}

}
