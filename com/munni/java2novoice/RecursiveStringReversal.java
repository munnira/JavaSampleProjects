package com.munni.java2novoice;

public class RecursiveStringReversal {
	
	public static String reverse(String str){
		String rev="";
		if(str.length()==1)
			return str;
		else{
			rev=rev+str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
		}
		
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("Result: "+ reverse("munni"));

	}

}
