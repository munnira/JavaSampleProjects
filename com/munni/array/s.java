package com.munni.array;

public class s {
	 
    int sum = 0;
     
    public int getNumberSum(int number){
         
        if(number <10){
            return number;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }
     
    public static void main(String a[]){
        s mns = new s();
       
        
        System.out.println("Sum is: "+mns.getNumberSum(000223));
    }
}
