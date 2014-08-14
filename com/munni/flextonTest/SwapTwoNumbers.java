package com.munni.flextonTest;


public class SwapTwoNumbers {

	public static  void swapNumber(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Inside a method : "+a+ " :" +b);
		
		
	}
	public static void main(String[] args) {
		
//		Integer a = new Integer(10);
//		Integer b= new Integer(20);
		
		int a=10,b=20;
		System.out.println("Before Swapping :"+a + " : "+b);
		swapNumber(a,b);
		System.out.println("After Swapping :"+a +" : "+b);

	}

}
