package com.munni.stringsSample;

import java.util.Arrays;

public class DuplicateNumbersArrays {


		
		public static void main(String[] args) {
			Integer[] series = new Integer[] { 1, 2, 3, 4, 5, 6, 7,8,2,6,4,3};
			Arrays.sort(series);

			for (int i = 0; i < series.length; i++) {
			if (series[i] == series[i + 1]) {
			System.out.println(series[i]);
			}

			}

			}


	}

