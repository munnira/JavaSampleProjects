package com.munni.gaylesolutions;

public class NthHighestInArray {
	
	public static void main(String args[])  
	{  
	int A[] = new int[]{1,89,78,65};  
	int n=3;//This is the supposed nth largest number,here it is third  
	int res = 0;  
	for(int i=0;i<A.length;i++)  
	{  
	int k = 0;  
	for(int j=0;j<A.length;j++)  
	{  
	if(A[i]<A[j])  
	 ++k;  
	if((k==(n-1))&&(j==A.length-1))  
	{  
	res = A[i];  
	break;  
	}  
	}  
	}  
	System.out.println("Required number is "+res);  
	}

}
