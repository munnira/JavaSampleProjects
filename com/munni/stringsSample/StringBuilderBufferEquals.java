package com.munni.stringsSample;

import org.apache.commons.lang3.StringUtils;

public class StringBuilderBufferEquals {

	public static void main(String[] args) {
		
		StringBuilder sbul1=new StringBuilder("java");
		StringBuilder sbul2=new StringBuilder("java hello");
		
		StringBuffer sbuf1=new StringBuffer("java");
		StringBuffer sbuf2=new StringBuffer("java");
		
		System.out.println(sbul1==sbul2);
		
		System.out.println(sbuf1.equals(sbuf2));
		
		System.out.println(sbul1.equals(sbuf1));
		
		String difference = StringUtils.difference(sbul1.toString(), sbul2.toString());
		System.out.println(difference);
		
		

	}

}
