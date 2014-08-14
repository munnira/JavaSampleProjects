package com.munni.stringsSample;

import java.util.ArrayList;
import java.util.List;
 
public class DuplicateNumbers2 {
	
	//This is only possible if there is only one duplicate in list and there are continous integers in list
	
//This is similar to one bottle having heaviest one then find out(total-(n(n+1)/2))
 
    public int findDuplicateNumber(List<Integer> numbers){
         
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }
     
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(22);
        DuplicateNumbers2 dn = new DuplicateNumbers2();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}
