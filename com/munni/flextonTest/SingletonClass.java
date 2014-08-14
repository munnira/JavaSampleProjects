package com.munni.flextonTest;

public class SingletonClass {
	static SingletonClass sc=null;
	
	private SingletonClass(){
		
	}
	
//	static {
//		sc=new SingletonClass();
//	}
	
	public static SingletonClass getInstance(){
		if(sc==null)
			 sc=new SingletonClass();
		return sc;
		
	}

	public static void main(String[] args) {
		SingletonClass s = getInstance();
		System.out.println("s1 hashcode:"+s.hashCode());
		SingletonClass s2 = getInstance();
		System.out.println("S2 hash code :" +s2.hashCode());
		if(s.equals(s2))
			System.out.println("EQUAL");
		
		// It means though you create n number of objects it still returns the same object.

	}

}
