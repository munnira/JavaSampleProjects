package com.munni.HashmapExamples;

public class Test {

public static void main(String[] args) {

     String quantity = "1";
     String state = "New York";
          
     if (((quantity.equals("0")) && state.equals("New York"))) {
               
          System.out.println("inside 1st if statement");
     }
          
     state = "DC";
          
     if (!(quantity.equals("0")) && !state.equals("New York")) {
          
          System.out.println("inside 2nd if statement");
     }
}
}
