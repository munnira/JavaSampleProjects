package com.munni.HashmapExamples;

public class HelloWorld {
	
	private static  void joinWords(String[] words) {
		
		StringBuffer sen= new StringBuffer("Munnira");
		for(String w: words)
			sen.append(w);
		System.out.println(sen.toString());
		
	}
	

	public static void main(String[] args) {

		String[] name= {"Sadiq","Shaik"};
		System.out.println("Hello world,say Hi to ");
		joinWords(name);
	}

}
