package com.munni.samples;

public class OverloadingDatatype {
	
	
	public void printSomething(Double i){
		System.out.println("Double "+i);
	}
	public void printSomething(Integer i){
		System.out.println("Integer "+i);
	}
	
	

	public static void main(String[] args) {
		OverloadingDatatype o = new OverloadingDatatype();
//		o.printSomething(null);---amiguous
		
		

	}

}
