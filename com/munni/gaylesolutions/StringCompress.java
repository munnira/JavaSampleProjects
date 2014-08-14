package com.munni.gaylesolutions;

public class StringCompress {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abbbbbfffdddeee;;;");
		StringBuilder sb2 = new StringBuilder();
		char[] charArray = sb.toString().toCharArray();
		sb2.append(charArray[0]);
		int count = 1;
		for (int i = 0; (i < charArray.length) && ((i + 1) < charArray.length); i++) {
			if (charArray[i] == charArray[i + 1]) {
				count++;
			}

			else {
				sb2.append(count);
				if ((i + 1) <= charArray.length)
					sb2.append(charArray[i + 1]);
				count = 1;
			}
		}
		sb2.append(count);
		if (sb2.length() > sb.length())
			System.out.println("Looks like Compressed String is larger ,so returning the actual string : " + sb);
		else
			System.out.println("Compressed String is : " +sb2);

	}

}