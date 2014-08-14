package com.munni.java2novoice;

public class PerfectNumber {
	
//	perfect number is (number =(sum of divisors)/2)
	 
    public boolean isPerfectNumber(int number){
         
        int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
        System.out.println("Sum is :"+temp);
        if(temp == number){
//            System.out.println("It is a perfect number");
            return true;
        } else {
//            System.out.println("It is not a perfect number");
            return false;
        }
    }
     
    public static void main(String a[]){
        PerfectNumber ipn = new PerfectNumber();
        System.out.println("Is perfect number: "+ipn.isPerfectNumber(28));
    }
}