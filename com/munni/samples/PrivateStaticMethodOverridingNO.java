package com.munni.samples;

public class PrivateStaticMethodOverridingNO{
	 
    public static void main(String args[]) {
        //shows that private method can not be overridden in Java    
        Parent parent = new Child();
    }
 
 
}

class Parent{
 
    public Parent(){
        name();
       normal();
    }
 
    private void name(){
        System.out.printf("Parent:private method inside Parent class in Java %n");
    }
 
    public void normal(){
    	
        System.out.println("Parent:non private method from Parent class can be overridden");
    }
 
}

class Child extends Parent{
 
    /*
     * Private method can not be overridden in Java, they can only be hidden
     */
    private void name(){
        System.out.printf("Child:private method inside Child class in Java %n");
    }
 
    @Override
    public void normal(){
        System.out.println("Child:non private overridden method from Child class ");
    }
 
}