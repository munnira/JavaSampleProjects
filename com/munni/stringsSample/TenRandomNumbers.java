package com.munni.stringsSample;

import java.util.Random;

public class TenRandomNumbers{
	
public static void main(String[] args) {
	Random random = new Random();
    
	 for(int i =0; i<15; i++){
	      int randomInteger = random.nextInt(10);
	      System.out.println("Random Integer in Java: "+i+" :" + randomInteger);
	 }
	 
	 for(int i =0; i<15; i++){
	      int randomInt = (int)( Math.random() * 10.0);
	      System.out.println("pseudo random int between 1 and 10 : " + randomInt );
	}




	}
}