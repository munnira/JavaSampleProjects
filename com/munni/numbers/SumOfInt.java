package com.munni.numbers;

public class SumOfInt {

	public static void main(String[] args) {

		 int b=0001;
	        int c=002;
	        //to get in 0000 format use string.format --%04d -- means 3 zeros
	        System.out.println(b+c);
	        System.out.println(String.format("%04d",(b+c)));
	}

}
