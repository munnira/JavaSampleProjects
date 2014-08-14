package com.munni.flextonTest;


public class SwapNumbersCallByreference {
	int x,y;
	SwapNumbersCallByreference(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public static void swapNumbers(SwapNumbersCallByreference s){
		int temp;
		temp=s.x;
		s.x=s.y;
		s.y=temp;
		
	}

	public static void main(String[] args) {
		SwapNumbersCallByreference swap = new SwapNumbersCallByreference(10,20);
		System.out.println("Before swapping :"+swap.x +" : "+swap.y);
		swapNumbers(swap);
		System.out.println("After swapping :"+swap.x +" : "+swap.y);

	}

}
