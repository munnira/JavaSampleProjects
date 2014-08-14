package com.munni.java2novoice;

public class RecursionStringReversal {

	public static String reverse(String str){
		String reverse;
		if(str.length()==1)
			return str;
		else
			 reverse=reverse(str.substring(1))+str.charAt(0);
			return reverse;
		
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(reverse("munni"));

	}

}
