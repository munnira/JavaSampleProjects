package com.munni.stringsSample;

public class SearchWordInString {

	public static void searchForString(String[] str, String search,String actual) {
		int occurences = 0;
		for (String num:str) {
			if (num.equals(search)) {
				System.out.println(search +" is found at "+actual.indexOf(search));
				occurences++;

			}
		}
		System.out.println("Number of occurrences are :"+occurences);

	}

	public static void main(String[] args) {

		String s = "StringBuilder is mutable ,that is the reason StringBuilder is no overriding equals method from object class-- that's why its mutable";
		String[] split = s.split(" ");
		searchForString(split, "mutable",s);

	}

}
