package com.munni.stackQueueExamples;

import java.util.Stack;

public class AdditionOfNumbers {

	static Stack<Integer> st = new Stack<Integer>();
	static int n=100;
	
	public static void addNumbers(){
		int sum=0;
		for(int n=100;n>0;n--)
		st.push(n);
		
		while(st.isEmpty()==false){
			sum=sum+st.pop();
		}
		
		System.out.println("Sum is :"+sum);
		
	}
	
	public static void main(String[] args) {
		addNumbers();
		System.out.println(st);

	}

}
