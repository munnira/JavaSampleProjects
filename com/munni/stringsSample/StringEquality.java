package com.munni.stringsSample;

public class StringEquality {

	public static void main(String[] args) {

		String s1="hi";
		String s2= "hello";
		if(s1.equals(s2)) System.out.println("Equal");
		else{
			System.out.println("Not equal");
		}
		System.out.println(s1.hashCode() +" : "+s2.hashCode());
	}

}
