package com.munni.gaylesolutions;


public class ReplaceSpaces {
	
	
	public static int spaceCount(char[] ch,int length){
		int spaceCount = 0, i;
		for (i = 0; i < length; i++) {
			if (ch[i] == ' ') {
				spaceCount++;
			}
		}
		return spaceCount;
		
	}
	
	// Assume string has sufficient free space at the end
	public static String replaceSpaces(char[] ch, int length,int spaceCount) {
		int index,i;
		index = ch.length-1;
		ch[index] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				ch[index ] = '0';
				ch[index-1] = '2';
				ch[index - 2] = '%';
				index = index - 3;
			} else {
				ch[index] = ch[i];
				index--;
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String str = "ab d";
		char[] charArray = str.toCharArray();
		int spaceCount = spaceCount(charArray, str.length());
		char[] ch = new char[str.length()+spaceCount*3-1];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		System.out.println(replaceSpaces(ch, str.length(),spaceCount));
	}
}