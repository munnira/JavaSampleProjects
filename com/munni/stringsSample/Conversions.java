package com.munni.stringsSample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public class Conversions {

	public static void main(String[] args)  {
		String s = "hello";
		byte b;
		int i = 399;
		double d = 424.142;
		
		String substring = s.substring(0, 2);
		String d1=s.substring(0, 3)+" ";
		System.out.println(d1 + substring);
		String[] s5=new String[] {"goodh","hi","hello"};
		
		// string string array
		String[] sarray = new String[] { s };

		// string to charArray
		char[] carray = s.toCharArray();

		// string to integer
		String i1 = "12345";
		System.out.println(Integer.parseInt(i1));

		// int to string
		String s3 = i1.toString();
		System.out.println(s3);
		
		//repeat a string
		System.out.println(StringUtils.repeat(s,4));
		//count matches
		System.out.println(StringUtils.countMatches("iiiiiyyyyffgggccdddee", "yf"));
		
		//string to date
		String s8=" Sep 18, 2013 ";
			Date d3 = null;
			try {
				d3 = new SimpleDateFormat("MM DD,yyyy",Locale.ENGLISH).parse(s8);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("error happened "+e.getMessage());
			}
			System.out.println(d3);
		
		
		
		

		System.out.println("\nConversion of int to byte.");
		b = (byte) i;
		System.out.println("i and b " + i + " " + b);

		System.out.println("\nConversion of double to int.");
		i = (int) d;
		System.out.println("d and i " + d + " " + i);

		System.out.println("\nConversion of double to byte.");
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);

	}

}
