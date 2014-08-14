package com.munni.stackQueueExamples;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] s){
		Stack<Integer> st = new Stack<Integer>();
		st.push(45);
		st.push(23);
		st.push(67);
		st.push(12);
		st.push(65);
		System.out.println(st);
		
		st.pop();
		System.out.println("After Pop :"+st);
		System.out.println("Top Most element is :"+st.peek());
	}

}
